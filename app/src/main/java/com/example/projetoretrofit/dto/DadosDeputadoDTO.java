package com.example.projetoretrofit.dto;

import java.util.List;

public class DadosDeputadoDTO {


    //DTO - DATA TRANSFER OBJECT
    private List<DadosDTO> dados;
    private List<LinkDTO> links;

    public List<DadosDTO> getDados() {
        return dados;
    }

    public void setDados(List<DadosDTO> dados) {
        this.dados = dados;
    }

    public List<LinkDTO> getLinks() {
        return links;
    }

    public void setLinks(List<LinkDTO> links) {
        this.links = links;
    }

    @Override
    public String toString() {
        return "DadosDeputadoDTO{" +
                "dados=" + dados +
                ", links=" + links +
                '}';
    }
}
