package com.creiologopenso.devdojo.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int age = (int)10000000000000L; // Cast
        long numeroGrande = (long) 155.23;
        double salarioDouble = 2000;
        float salarioFloat = (float) 2500.00;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'M';
        char caractere1 = '\u0041';
// String é um classe e não um tipo primitivo
        String nome = " é um classe";

        System.out.println(" A idade é " + age + " anos");
        System.out.println(verdadeiro);
        System.out.println(caractere1);
        System.out.println(" String: " +nome);
    }
}
