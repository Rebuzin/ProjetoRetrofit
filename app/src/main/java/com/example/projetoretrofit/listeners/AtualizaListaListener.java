package com.example.projetoretrofit.listeners;

import android.view.View;

import com.example.projetoretrofit.dto.DadosDTO;
import com.example.projetoretrofit.dto.DadosDeputadoDTO;
import com.example.projetoretrofit.dto.DespesasDTO;

public interface AtualizaListaListener {

    void atualizaLista(DadosDeputadoDTO dados);

    void getDeputados(View view);

    void atualizaDespesas(DadosDTO dados);
//
//    void atualizaLista(DadosDeputadoDTO dados, DespesasDTO despesas);
}
