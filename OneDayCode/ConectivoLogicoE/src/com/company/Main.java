package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Cria o leitor
        Scanner leitor = new Scanner(System.in);

        //Lê a idade de cada pessoa
        int pessoa1 = leitor.nextInt();
        int pessoa2 = leitor.nextInt();

        //Comparações em que as duas pessoas precisam
        //ser maiores de idade
        if (pessoa1 > 17 && pessoa2 > 17){
            System.out.println("OK");
        }else {
            System.out.println("PROBLEMA");
        }
    }
}
