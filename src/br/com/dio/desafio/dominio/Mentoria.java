package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class  Mentoria extends Conteudo {
    String titulo;
    String descricao;
    LocalDate date;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }


    public Mentoria() {
    }


    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", date=" + date +
                '}';
    }

    public void setDate(LocalDate date) {
        this.date = date;


    }

}
