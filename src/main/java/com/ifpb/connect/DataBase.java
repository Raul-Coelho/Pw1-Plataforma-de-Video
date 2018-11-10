package com.ifpb.connect;

public class DataBase {
    private String url;
    private String email;
    private String senha;


    public DataBase(String url, String email, String senha) {
        this.url = "jdbc:postgresql://127.0.0.1:5432/IFchannelVideo";
        this.email = "postgres";
        this.senha = "coelho";
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
