package com.example.projetoretrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.example.projetoretrofit.adapter.DeputadosListAdapter;
import com.example.projetoretrofit.adapter.DespesasListAdapter;
import com.example.projetoretrofit.controller.DeputadosController;
import com.example.projetoretrofit.controller.DespesasController;
import com.example.projetoretrofit.dto.DadosDTO;
import com.example.projetoretrofit.dto.DadosDeputadoDTO;
import com.example.projetoretrofit.dto.DadosDespesaDTO;
import com.example.projetoretrofit.dto.DespesasDTO;
import com.example.projetoretrofit.listeners.AtualizaListaListener;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
        implements AtualizaListaListener {

    private ExecutaAPI executaAPI;
    private ListView lvDeputados;
    private ListView lvDespesas;
    private EditText edNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvDeputados = findViewById(R.id.lvDeputados);
        lvDespesas = findViewById(R.id.lvDespesas);
        edNome = findViewById(R.id.edNome);

        DadosDTO dados = new DadosDTO();

        DeputadosListAdapter adapter =
                new DeputadosListAdapter(this,
                        (ArrayList<DadosDTO>) dados.getDados());

        lvDeputados.setAdapter(adapter);

    }

    public void getDeputados(View view) {
        new ExecutaAPI(this, this).execute(edNome.getText().toString());
//        DeputadosController.buscarDadosDeputado(edNome.getText().toString(), tvDeputados);
//        DadosDTO dadosDTO = new DadosDTO();
//        DespesasController.executarAPI(dadosDTO.getId(), this, tvDeputados);
    }

    @Override
    public void atualizaLista(DadosDeputadoDTO dados) {
        DeputadosListAdapter adapter =
                new DeputadosListAdapter(this,
                        (ArrayList<DadosDTO>) dados.getDados());

        lvDeputados.setAdapter(adapter);
    }

    @Override
    public void atualizaListaDespesas(DadosDespesaDTO dadosDespesas) {
        DespesasListAdapter adapterDespesas =
                new DespesasListAdapter(this,
                        (ArrayList<DadosDespesaDTO>) dadosDespesas.getDadosDespesas());

        lvDespesas.setAdapter(adapterDespesas);
    }

    @Override
    public void atualizaDespesas(DespesasDTO dados) {

        DespesasListAdapter adapterDespesas =
                new DespesasListAdapter(this,
                        (ArrayList<DadosDespesaDTO>) dados.getDados());

        lvDespesas.setAdapter(adapterDespesas);
//            DespesasListAdapter adapter =
//                new DespesasListAdapter(this, (ArrayList<DadosDespesaDTO>) dados.getDados());

//        lvDeputados.setAdapter(adapter);
//            DadosDespesaDTO dadosDTO = new DadosDespesaDTO();
//            DespesasController.executarAPI(dadosDTO.getId(), this, tvDeputados);
////        DespesasController.executarAPI(dados.getId(), this);
    }
}