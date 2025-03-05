package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a = 1;
        int b = 1;
        System.out.println("Valor de a:" + a);
        while(a < 10){

            System.out.println("Digite valores > 10:");

            //Lê os valores digitados
            Scanner leitor = new Scanner(System.in);
            a = leitor.nextInt();
            b = leitor.nextInt();

            //Quando chega aqui, o código volta para
            //a linha 8 e verifica se os dois valores
            //digitados são maiores ou iguais a 10
            //se um for menor, repete
        }

        System.out.println("Fim");
    }
}

50