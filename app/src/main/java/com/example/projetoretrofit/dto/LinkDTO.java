package com.example.projetoretrofit.dto;

public class LinkDTO {

    private String href;
    private String rel;
    private String type;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getRel() {
        return rel;
    }

    public void setRel(String rel) {
        this.rel = rel;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "LinkDTO{" +
                "href='" + href + '\'' +
                ", rel='" + rel + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
