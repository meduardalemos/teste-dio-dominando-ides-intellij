package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        /*int a = 5;
        int b = 3;
        System.out.println("Hello World! " + (a+b));*/

        Gato gato = new Gato();
        System.out.println(gato);

        Livro livro1 = new Livro("O problema dos 3 corpos", 200);
        System.out.println(livro1);
    }
}

class Livro {
    private String nome;
    private Integer npag;

    public Livro(String nome, Integer npag) {
        this.nome = nome;
        this.npag = npag;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNpag() {
        return npag;
    }

    public void setNpag(Integer npag) {
        this.npag = npag;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", npag=" + npag +
                '}';
    }
}

