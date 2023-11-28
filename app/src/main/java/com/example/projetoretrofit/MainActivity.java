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
    private TextView tvDeputados;
    private EditText edNome;

    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvDeputados = findViewById(R.id.lvDeputados);
        tvDeputados = findViewById(R.id.tvDeputados);
        edNome = findViewById(R.id.edNome);

        DadosDTO dados = new DadosDTO();

        DeputadosListAdapter adapter =
                new DeputadosListAdapter(this,
                        (ArrayList<DadosDTO>) dados.getDados());

        lvDeputados.setAdapter(adapter);

        DeputadosController.buscarDadosDeputado("Paulo", tvDeputados);


        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Carregando....");
        progressDialog.setTitle("Sincronizar Dados");
        progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        progressDialog.show();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000); // Tempo de espera em milissegundos
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            progressDialog.dismiss();
                        }
                    });
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();

//        DeputadosController.executarAPI(edNome.toString(), this, tvDeputados);
//        DadosDTO dadosDTO = new DadosDTO();
//        DespesasController.executarAPI(dadosDTO.getId(), this, tvDeputados);

//        DeputadosController.executarAPI(edNome.toString(), this);
//        DespesasController.executarAPI(lvDeputados.getId(), this);
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
//        DespesasController.executarAPI(dados.getDados(id));

    }

        @Override
    public void atualizaDespesas(DespesasDTO dados) {
            DespesasListAdapter adapter =
                new DespesasListAdapter(this, (ArrayList<DadosDespesaDTO>) dados.getDados());

//        lvDeputados.setAdapter(adapter);
//            DadosDespesaDTO dadosDTO = new DadosDespesaDTO();
//            DespesasController.executarAPI(dadosDTO.getId(), this, tvDeputados);
////        DespesasController.executarAPI(dados.getId(), this);
    }

//    @Override
//    public void atualizaDespesas(DespesasDTO despesas) {
//        DespesasListAdapter adapter =
//                new DespesasListAdapter(this,
//                        (ArrayList<DespesasDTO>) despesas.getDespesas());
//
//        lvDeputados.setAdapter(adapter);
//    }
}