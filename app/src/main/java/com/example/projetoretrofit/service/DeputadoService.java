package com.example.projetoretrofit.service;

import com.example.projetoretrofit.dto.DadosDeputadoDTO;
import com.example.projetoretrofit.dto.DespesasDTO;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface DeputadoService {

    //end-point
    @GET("deputados")
    Call<DadosDeputadoDTO> buscarDadosDeputado(@Query("nome") String nome);

    //end-point
    @GET("deputados/{id}/despesas")
    Call<DespesasDTO> buscarDespesasDeputado(@Query("id") int id);
}
