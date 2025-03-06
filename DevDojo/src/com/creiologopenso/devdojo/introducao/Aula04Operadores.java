package com.creiologopenso.devdojo.introducao;

import com.sun.source.util.SourcePositions;

public class Aula04Operadores {
    public static void main(String[] args) {


        int numero01 = 100;
        int numero02 = 20;
        double resultado = numero01 / numero02;
        System.out.println(resultado);
        // %
        int resto = 21 % 2;
        System.out.println(resto);
        // <> <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezDiferenteQueVinte = 10 != 20;

        System.out.println("isDezMaiorQueVinte " +isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " +isDezMenorQueVinte);
        System.out.println("isDezIgualVinte " +isDezIgualVinte);
        System.out.println("isDezDiferenteQueVinte " +isDezDiferenteQueVinte);

        // && (and) || (or) !
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta " +isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " +isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaContaPoupança = 10000;
        float valorPlaystation = 5000f;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaContaPoupança > valorPlaystation;
        System.out.println(" is PlaystationCincoComprável " +isPlaystationCincoCompravel);
    }
}
