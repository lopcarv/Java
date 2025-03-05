public class TestaRobo {
    public static void main(String[] args) {
        // Teste do primeiro robô (construtor padrão)
        System.out.println("---- Teste Robô 1 ----");
        Robo robo1 = new Robo();
        System.out.println("Nome do Robô: " + robo1.getNome());

        robo1.somar(3, 2);
        robo1.subtrair(8, 2);
        robo1.multiplicar(3, 2);
        robo1.dividir(8, 2);
        robo1.dividir(6, 3);

        // Teste do segundo robô (construtor personalizado)
        System.out.println("\n---- Teste Robô 2 ----");
        Robo robo2 = new Robo("D288", 2, "05/11/2002");
        System.out.println("Nome do Robô: " + robo2.getNome());

        robo2.somar(5, 4);
        robo2.multiplicar(3, 5);

        robo2.exibirInformacoes();
    }
}

