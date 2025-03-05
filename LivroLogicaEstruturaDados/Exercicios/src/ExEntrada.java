import java.io.*;

public class ExEntrada {
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String nome;

        try {
            System.out.println("Qual o seu nome?");
            nome = entrada.readLine();
            System.out.println("Seu nome é: " + nome);
        } catch (IOException e) {
            System.out.println("Ocorreu um erro durante a leitura!");
        }
    }
}
