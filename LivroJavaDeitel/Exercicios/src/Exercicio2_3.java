import java.util.Scanner; // Importação da classe Scanner para entrada de dados

public class Exercicio2_3 {
    public static void main(String[] args) {
        // Declaração e inicialização das variáveis do tipo int
        int c = 0;
        int thisIsAVariable = 0;
        int q76354 = 0;
        int number = 0; // Inicializando number para evitar erro de variável não inicializada

        // Criação do objeto Scanner para leitura de entrada do usuário
        Scanner input = new Scanner(System.in);

        // Solicita que o usuário insira um inteiro
        System.out.print("Digite um número inteiro: ");

        // Insere um inteiro e atribui o valor à variável int value
        int value = input.nextInt();

        // Exibe o valor inserido para confirmação
        System.out.println("Você digitou: " + value);

        // Imprime "This is a Java program" em duas linhas usando printf e %s
        System.out.printf("%s%n%s%n", "This is a Java", "program");

        // Se a variável number não for igual a 7, exibe a mensagem correspondente
        if (number != 7) {
            System.out.println("The variable number is not equal to 7");
        }

        // Fecha o Scanner para evitar vazamento de recursos
        input.close();
    }
}