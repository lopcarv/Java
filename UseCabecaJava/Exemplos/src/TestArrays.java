public class TestArrays {
    public static void main(String[] args){
        // Declara e inicializa os arrays fora do loop
        String[] islands = new String[4];
        int[] index = new int[4];

        // Preenche o array de ilhas
        islands[0] = "Bermuda";
        islands[1] = "Fiji";
        islands[2] = "Azores";
        islands[3] = "Cozumel";

        // Define a ordem de exibição através do array de índices
        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;

        int y = 0;
        while (y < 4){
            int ref = index[y]; // Declaração e atribuição corretas
            System.out.print("island = ");
            System.out.println(islands[ref]);
            y = y + 1; // Incremento mantido como no original
        }
    }
}
