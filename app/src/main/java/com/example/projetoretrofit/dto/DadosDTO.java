package com.example.projetoretrofit.dto;

import java.util.ArrayList;
import java.util.List;

public class DadosDTO {
    private String email;
    private int id;
    private int idLegislatura;
    private String nome;
    private String siglaPartido;
    private String siglaUf;
    private String uri;
    private String uriPartido;
    private String urlFoto;

    private List<DadosDTO> dados;

    public List<DadosDTO> getDados() {
        return new ArrayList<>(id);
    }
    public void setDados(List<DadosDTO> dados) {
        this.dados = dados;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdLegislatura() {
        return idLegislatura;
    }

    public void setIdLegislatura(int idLegislatura) {
        this.idLegislatura = idLegislatura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSiglaPartido() {
        return siglaPartido;
    }

    public void setSiglaPartido(String siglaPartido) {
        this.siglaPartido = siglaPartido;
    }

    public String getSiglaUf() {
        return siglaUf;
    }

    public void setSiglaUf(String siglaUf) {
        this.siglaUf = siglaUf;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getUriPartido() {
        return uriPartido;
    }

    public void setUriPartido(String uriPartido) {
        this.uriPartido = uriPartido;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    @Override
    public String toString() {
        return "DadosDTO{" +
                "email='" + email + '\'' +
                ", id=" + id +
                ", idLegislatura=" + idLegislatura +
                ", nome='" + nome + '\'' +
                ", siglaPartido='" + siglaPartido + '\'' +
                ", siglaUf='" + siglaUf + '\'' +
                ", uri='" + uri + '\'' +
                ", uriPartido='" + uriPartido + '\'' +
                ", urlFoto='" + urlFoto + '\'' +
                '}';
    }
}
