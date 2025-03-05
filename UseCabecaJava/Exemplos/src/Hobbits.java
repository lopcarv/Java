public class Hobbits {
    String name;

    public static void main(String[] args) {
        // Cria uma matriz de objetos Hobbits
        Hobbits[] h = new Hobbits[3];

        // Inicializa cada elemento da matriz com um novo objeto Hobbits
        int z = 0;
        while (z < 3) { // Corrigido: o loop agora vai de 0 a 2
            h[z] = new Hobbits(); // Inicializa o objeto na posição z
            if (z == 0) {
                h[z].name = "bilbo";
            } else if (z == 1) {
                h[z].name = "frodo";
            } else if (z == 2) {
                h[z].name = "sam";
            }

            // Imprime o nome do hobbit
            System.out.print(h[z].name + " is a");
            System.out.println(" Good Hobbit name");

            z = z + 1; // Incrementa o índice
        }
    }
}
