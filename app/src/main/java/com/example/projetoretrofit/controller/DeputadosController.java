package com.example.projetoretrofit.controller;

import android.content.Context;
import android.util.Log;
import android.widget.TextView;

import com.example.projetoretrofit.dto.DadosDTO;
import com.example.projetoretrofit.dto.DadosDeputadoDTO;
import com.example.projetoretrofit.dto.DespesasDTO;
import com.example.projetoretrofit.retrofit.RetrofitConfig;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DeputadosController {

    public static void buscarDadosDeputado(String nome, TextView tvNome){
    try{
        Call<DadosDeputadoDTO> call = new RetrofitConfig()
                .deputadoService().buscarDadosDeputado(nome);

        call.enqueue(new Callback<DadosDeputadoDTO>() {
            @Override
            public void onResponse(Call<DadosDeputadoDTO> call,
                                   Response<DadosDeputadoDTO> response) {
                DadosDeputadoDTO dto = response.body();
                tvNome.setText(dto.toString());
            }

            @Override
            public void onFailure(Call<DadosDeputadoDTO> call, Throwable t) {
                Log.e("TESTE",
                        "Erro ao comunicar com a API: "+t.getMessage());
            }
        });


    }catch (Exception ex){
        String erro = ex.getMessage();
    }
}
}