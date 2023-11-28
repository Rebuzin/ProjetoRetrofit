package com.example.projetoretrofit.dto;

import java.util.List;

public class DespesasDTO {

    private List<DadosDespesaDTO> dados;
    private List<LinkDTO> links;

    public List<DadosDespesaDTO> getDados() {
        return dados;
    }

    public void setDados(List<DadosDespesaDTO> dados) {
        this.dados = dados;
    }

    public List<LinkDTO> getLinks() {
        return links;
    }

    public void setLinks(List<LinkDTO> links) {
        this.links = links;
    }

}