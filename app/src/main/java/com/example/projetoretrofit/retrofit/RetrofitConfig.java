package com.example.projetoretrofit.retrofit;

import com.example.projetoretrofit.service.DeputadoService;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class RetrofitConfig {

    private final Retrofit retrofit;
    private static final String BASE_URL = "https://dadosabertos.camara.leg.br/api/v2/";
    OkHttpClient okHttpClient = UnsafeOkHttpClient.getUnsafeOkHttpClient();

    //configuração retrofit

    public RetrofitConfig() {
        this.retrofit = new Retrofit.Builder()
                //URL SERVIDOR
                .baseUrl(BASE_URL)
                .client(okHttpClient)
                //CONVERSOR JSON
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
    }

    //service da api a ser acessada
    public DeputadoService deputadoService(){
        return this.retrofit.create(DeputadoService.class);
    }

    public DeputadoService buscarDespesasDeputado(){
        return this.retrofit.create(DeputadoService.class);
    }


}
