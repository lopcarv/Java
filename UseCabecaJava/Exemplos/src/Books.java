public class Books {
    String title;
    String author;
}

class BooksTestDrive {
    public static void main(String[] args) {
        // Cria uma matriz de objetos Books
        Books[] myBooks = new Books[3];

        // Inicializa cada elemento da matriz com um novo objeto Books
        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();

        // Define os títulos dos livros
        myBooks[0].title = "The Grapes of Java";
        myBooks[1].title = "The Java Gatsby";
        myBooks[2].title = "The Java Cookbook";

        // Define os autores dos livros
        myBooks[0].author = "bob";
        myBooks[1].author = "sue";
        myBooks[2].author = "ian";

        // Loop para imprimir os títulos e autores
        int x = 0;
        while (x < 3) {
            System.out.print(myBooks[x].title + " by ");
            System.out.println(myBooks[x].author);
            x = x + 1;
        }
    }
}