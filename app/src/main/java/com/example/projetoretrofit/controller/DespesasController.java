package com.example.projetoretrofit.controller;

import android.content.Context;
import android.util.Log;
import android.widget.ListView;
import android.widget.TextView;

import com.example.projetoretrofit.dto.DespesasDTO;
import com.example.projetoretrofit.retrofit.RetrofitConfig;

import org.w3c.dom.Text;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DespesasController {


    public static void executarAPI(Integer id, Context ctx, TextView tvDespesas){
        try{
            Call<DespesasDTO> call = new RetrofitConfig()
                    .deputadoService().buscarDespesasDeputado(id);

            call.enqueue(new Callback<DespesasDTO>() {
                @Override
                public void onResponse(Call<DespesasDTO> call,
                                       Response<DespesasDTO> response) {
                    DespesasDTO dto = response.body();
                    tvDespesas.setText(dto.toString());
                }

                @Override
                public void onFailure(Call<DespesasDTO> call, Throwable t) {
                    Log.e("TESTE",
                            "Erro ao comunicar com a API: "+t.getMessage());
                }
            });


        }catch (Exception ex){
            String erro = ex.getMessage();
        }
    }
}
