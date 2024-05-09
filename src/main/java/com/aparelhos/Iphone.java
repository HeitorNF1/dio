package com.aparelhos;

public class Iphone implements ReprodutorMusical,AparelhoTelefonico,NavegadorDeInternet{

    public void ligar(int telefone) {
        System.out.println("ligando para: " + telefone);
    }


    public void atender() {
        System.out.println("Atendendo ligação");
    }


    public void enviarCorreioDeVoz(int telefone) {
        System.out.println("Enviando novo correio de voz para: " + telefone);
    }


    public void exbirPagina() {

        System.out.println("exibindo pagina");

    }


    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");

    }


    public void adicionarNovaPagina() {
        System.out.println("Adicionando nova página");

    }


    public void tocar(String musica) {
        System.out.println("Tocando a musica" + musica);
    }


    public void pausar(String musica) {
        System.out.println("Pausando a musica: " + musica);
    }


    public void selecionarMusica(String musica) {
        System.out.println("Musica selecionada: " + musica);
    }
}
