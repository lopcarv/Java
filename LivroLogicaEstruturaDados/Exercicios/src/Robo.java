public class Robo extends Robo_superclasse {
    private String nome;
    private int serie;
    private String data;
    private int bateria;

    // Construtor padrão
    public Robo() {
        this.nome = "Xpt11";
        this.serie = 0;
        this.data = "00/00/0000";
        this.bateria = 5;
    }

    // Construtor com parâmetros
    public Robo(String nome, int serie, String data) {
        this.nome = nome;
        this.serie = serie;
        this.data = data;
        this.bateria = 5;
    }

    // Método para mudar o nome do robô
    public void mudarNome(String novoNome) {
        this.nome = novoNome;
    }

    // Método para obter o nome do robô
    public String getNome() {
        return this.nome;
    }

    // Método para exibir todas as informações do robô
    public void exibirInformacoes() {
        System.out.println("Nome do Robô: " + this.nome);
        System.out.println("Série: " + this.serie);
        System.out.println("Data de Fabricação: " + this.data);
        System.out.println("Nível da Bateria: " + this.bateria);
    }

    // Métodos de operações matemáticas com consumo de bateria
    public void somar(int a, int b) {
        executarOperacao("Soma", a + b);
    }

    public void subtrair(int a, int b) {
        executarOperacao("Subtração", a - b);
    }

    public void multiplicar(int a, int b) {
        executarOperacao("Multiplicação", a * b);
    }

    public void dividir(int a, int b) {
        if (b == 0) {
            System.out.println("Erro: divisão por zero!");
            return;
        }
        executarOperacao("Divisão", a / b);
    }

    // Método para executar operação matemática e reduzir bateria
    private void executarOperacao(String operacao, int resultado) {
        if (this.bateria > 0) {
            System.out.println("Resultado da " + operacao + ": " + resultado);
            this.bateria--;
            verificarBateria();
        } else {
            System.out.println("Bateria esgotada! Recarregue o robô.");
        }
    }

    // Método para verificar o nível da bateria
    private void verificarBateria() {
        if (this.bateria == 1) {
            System.out.println("Atenção: Bateria fraca, recarregar!");
        } else if (this.bateria == 0) {
            System.out.println("Bateria esgotada! O robô está desativado.");
        }
    }
}
