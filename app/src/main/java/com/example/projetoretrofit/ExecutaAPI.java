package com.example.projetoretrofit;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

import com.example.projetoretrofit.dto.DadosDTO;
import com.example.projetoretrofit.dto.DadosDeputadoDTO;
import com.example.projetoretrofit.dto.DespesasDTO;
import com.example.projetoretrofit.listeners.AtualizaListaListener;
import com.example.projetoretrofit.retrofit.RetrofitConfig;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ExecutaAPI extends AsyncTask<String, Void, Void> {

    private String nome;
    private final Context ctx;
    private ProgressDialog progressBar;
    private final AtualizaListaListener listener;

    public ExecutaAPI(Context ctx, AtualizaListaListener listener) {
        this.ctx = ctx;
        this.listener = listener;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        progressBar = ProgressDialog.show(ctx, null, "Aguarde...");
    }

    @Override
    protected Void doInBackground(String... strings) {
        executarAPI(strings[0]);
        return null;
    }


    public void executarAPI(String nome){
        try{
            Call<DadosDeputadoDTO> call = new RetrofitConfig()
                    .deputadoService().buscarDadosDeputado(nome);
//            Call<DadosDTO> callS = new RetrofitConfig()
//                    .deputadoService().buscarDespesasDeputado();


            //ESTUDAR
            call.enqueue(new Callback<DadosDeputadoDTO>() {
                @Override
                public void onResponse(Call<DadosDeputadoDTO> call, Response<DadosDeputadoDTO> response) {
                    DadosDeputadoDTO dadosDeputadoDTO = response.body();
//                    DadosDTO dadosDTO = response.body();

                    //Se retornou dados busca as despesas do primeiro deputado encontrado
                    if(dadosDeputadoDTO != null && !dadosDeputadoDTO.getDados().isEmpty()){
                        executarAPIDespesas(dadosDeputadoDTO.getDados().get(0).getId());

                        listener.atualizaLista(dadosDeputadoDTO);
//                    listener.atualizaDespesas(DadosDTO);

                        progressBar.dismiss();
                        Toast.makeText(ctx, "Execução finalizada!",
                                Toast.LENGTH_LONG).show();
                    }


                }

                @Override
                public void onFailure(Call<DadosDeputadoDTO> call, Throwable t) {
                    Log.e("PHS", "ERRO CHAMAR API: "+t.getMessage());
                }
            });
        }catch (Exception ex){
            Log.e("PHS", "Erro: "+ex.getMessage());
        }
    }
    public void executarAPIDespesas(int id){
        try{
            Call<DespesasDTO> callDespesas = new RetrofitConfig()
                    .deputadoService().buscarDespesasDeputado(id);

            callDespesas.enqueue(new Callback<DespesasDTO>() {
                @Override
                public void onResponse(Call<DespesasDTO> callDespesas, Response<DespesasDTO> response) {
                    DespesasDTO despesasDTO = response.body();

                    listener.atualizaDespesas(despesasDTO);

                    progressBar.dismiss();
                    Toast.makeText(ctx, "Execução finalizada! " + (despesasDTO.getDados() != null ? despesasDTO.getDados().size() : 0)  + " Despesa(s) encontrada(s)!",
                            Toast.LENGTH_LONG).show();
                }

                @Override
                public void onFailure(Call<DespesasDTO> callDespesas, Throwable t) {
                    Log.e("PHS", "ERRO CHAMAR API: "+t.getMessage());
                }
            });
        }catch (Exception ex){
            Log.e("PHS", "Erro: "+ex.getMessage());
        }
    }
}
