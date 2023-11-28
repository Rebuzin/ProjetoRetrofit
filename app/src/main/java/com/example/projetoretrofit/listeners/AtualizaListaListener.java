package com.example.projetoretrofit.listeners;

import android.view.View;

import com.example.projetoretrofit.dto.DadosDTO;
import com.example.projetoretrofit.dto.DadosDeputadoDTO;
import com.example.projetoretrofit.dto.DadosDespesaDTO;
import com.example.projetoretrofit.dto.DespesasDTO;

public interface AtualizaListaListener {

    void atualizaLista(DadosDeputadoDTO dados);

    void getDeputados(View view);

    void atualizaDespesas(DespesasDTO dados);

    void atualizaListaDespesas(DadosDespesaDTO dadosDespesas);
//
//    void atualizaLista(DadosDeputadoDTO dados, DespesasDTO despesas);
}
