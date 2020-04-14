package com.example.listviewpersonalizado;

public class Contato {

    String nome, mensagem, data;
    int imagem;

    public Contato(String nome, String mensagem, String data, int imagem){
        this.nome = nome;
        this.mensagem = mensagem;
        this.data = data;
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public String getMensagem() {
        return mensagem;
    }

    public String getData() {
        return data;
    }

    public int getImagem() {
        return imagem;
    }
}
