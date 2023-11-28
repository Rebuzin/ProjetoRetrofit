package com.example.projetoretrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;

import com.example.exemploretrofit.R;
import com.example.projetoretrofit.adapter.DeputadosListAdapter;
import com.example.projetoretrofit.adapter.DespesasListAdapter;
import com.example.projetoretrofit.dto.DadosDTO;
import com.example.projetoretrofit.dto.DadosDeputadoDTO;
import com.example.projetoretrofit.dto.DespesasDTO;
import com.example.projetoretrofit.listeners.AtualizaListaListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
        implements AtualizaListaListener {

    private ExecutaAPI executaAPI;
    private ListView lvDeputados;
    private EditText edNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lvDeputados = findViewById(R.id.lvDeputados);
        edNome = findViewById(R.id.edNome);


    }

    public void getDeputados(View view) {
        new ExecutaAPI(this, this).execute(edNome.getText().toString());
    }


    @Override
    public void atualizaLista(DadosDeputadoDTO dados) {

    }

    @Override
    public void atualizaDespesas(DespesasDTO despesasDTO) {

    }

    @Override
    public void atualizaLista(DadosDeputadoDTO dados, DespesasDTO despesas) {
        DeputadosListAdapter adapter =
                new DeputadosListAdapter(this,
                        (ArrayList<DadosDTO>) dados.getDados());

        lvDeputados.setAdapter(adapter);

        DespesasListAdapter adapterD =
                new DespesasListAdapter(this,
                        (ArrayList<DespesasDTO>) despesas.getDespesas());

        lvDeputados.setAdapter(adapterD);
    }
}