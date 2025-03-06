import java.util.Scanner; // Importação da classe Scanner para entrada de dados

public class Exercicio2_5 {
    public static void main(String[] args) {
        // Criação do objeto Scanner para entrada do usuário
        Scanner input = new Scanner(System.in);

        // Declaração das variáveis
        int x, y, z, result;

        // Solicita os três números inteiros ao usuário
        System.out.print("Enter first integer: ");
        x = input.nextInt();

        System.out.print("Enter second integer: ");
        y = input.nextInt();

        System.out.print("Enter third integer: ");
        z = input.nextInt();

        // Calcula o produto dos três números
        result = x * y * z;

        // Exibe o resultado
        System.out.printf("Product is %d%n", result);

        // Fecha o Scanner para evitar vazamento de recursos
        input.close();
    }
}
