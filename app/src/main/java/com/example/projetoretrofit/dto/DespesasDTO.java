package com.example.projetoretrofit.dto;

import java.util.List;

public class DespesasDTO {

    private String ano;
    private int cnpjCpfFornecedor;
    private int codDocumento;
    private String codLote;
    private String codTipoDocumento;
    private String dataDocumento;
    private String mes;
    private String nomeFornecedor;
    private String numDocumento;
    private String numRessarcimento;
    private String parcela;
    private String tipoDespesa;
    private String tipoDocumento;
    private String urlDocumento;
    private String valorDocumento;
    private String valorGlosa;
    private String valorLiquido;

    private List<DadosDTO> dados;

    public List<DadosDTO> getDados() {
        return dados;
    }
    public void setDados(List<DadosDTO> dados) {
        this.dados = dados;
    }


    //DTO - DATA TRANSFER OBJECT
    private List<DespesasDTO> despesas;
    private List<LinkDTO> links;

    public List<DespesasDTO> getDespesas() {
        return despesas;
    }

    public void setDespesas(List<DespesasDTO> despesas) {
        this.despesas = despesas;
    }
//
//    public List<LinkDTO> getLinks() {
//        return links;
//    }
//
//    public void setLinks(List<LinkDTO> links) {
//        this.links = links;
//    }
//
//    @Override
//    public String toString() {
//        return "DadosDeputadoDTO{" +
//                "dados=" + dados +
//                ", links=" + links +
//                '}';
//    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public int getCnpjCpfFornecedor() {
        return cnpjCpfFornecedor;
    }

    public void setCnpjCpfFornecedor(int cnpjCpfFornecedor) {
        this.cnpjCpfFornecedor = cnpjCpfFornecedor;
    }

    public int getCodDocumento() {
        return codDocumento;
    }

    public void setCodDocumento(int codDocumento) {
        this.codDocumento = codDocumento;
    }

    public String getCodLote() {
        return codLote;
    }

    public void setCodLote(String codLote) {
        this.codLote = codLote;
    }

    public String getCodTipoDocumento() {
        return codTipoDocumento;
    }

    public void setCodTipoDocumento(String codTipoDocumento) {
        this.codTipoDocumento = codTipoDocumento;
    }

    public String getDataDocumento() {
        return dataDocumento;
    }

    public void setDataDocumento(String dataDocumento) {
        this.dataDocumento = dataDocumento;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public String getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(String numDocumento) {
        this.numDocumento = numDocumento;
    }

    public String getNumRessarcimento() {
        return numRessarcimento;
    }

    public void setNumRessarcimento(String numRessarcimento) {
        this.numRessarcimento = numRessarcimento;
    }

    public String getParcela() {
        return parcela;
    }

    public void setParcela(String parcela) {
        this.parcela = parcela;
    }

    public String getTipoDespesa() {
        return tipoDespesa;
    }

    public void setTipoDespesa(String tipoDespesa) {
        this.tipoDespesa = tipoDespesa;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getUrlDocumento() {
        return urlDocumento;
    }

    public void setUrlDocumento(String urlDocumento) {
        this.urlDocumento = urlDocumento;
    }

    public String getValorDocumento() {
        return valorDocumento;
    }

    public void setValorDocumento(String valorDocumento) {
        this.valorDocumento = valorDocumento;
    }

    public String getValorGlosa() {
        return valorGlosa;
    }

    public void setValorGlosa(String valorGlosa) {
        this.valorGlosa = valorGlosa;
    }

    public String getValorLiquido() {
        return valorLiquido;
    }

    public void setValorLiquido(String valorLiquido) {
        this.valorLiquido = valorLiquido;
    }

    @Override
    public String toString() {
        return "DadosDTO{" +
                "ano='" + ano + '\'' +
                "cnpjCpfFornecedor='" + cnpjCpfFornecedor +'\'' +
                "codDocumento='" + codDocumento +'\'' +
                "codLote='" + codLote +'\'' +
                "codTipoDocumento='" + codTipoDocumento +'\'' +
                "dataDocumento='" + dataDocumento +'\'' +
                "mes='" + mes +'\'' +
                "nomeFornecedor='" + nomeFornecedor +'\'' +
                "numDocumento='" + numDocumento +'\'' +
                "numRessarcimento='" + numRessarcimento +'\'' +
                "parcela='" + parcela +'\'' +
                "tipoDespesa='" + tipoDespesa +'\'' +
                "tipoDocumento='" + tipoDocumento +'\'' +
                "urlDocumento='" + urlDocumento +'\'' +
                "valorDocumento='" + valorDocumento +'\'' +
                "valorGlosa='" + valorGlosa +'\'' +
                "valorLiquido='" + valorLiquido +'\'' +
                '}';
    }
}