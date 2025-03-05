class Dog {
    String name;

    public static void main(String[] args) {
        // cria um objeto Dog e o acessa
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Bart";

        // agora cria uma matriz Dog
        Dog[] myDogs = new Dog[3];

        // and put some dogs in it
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        // agora acessa os objetos Dog usando as referencias da matriz
        myDogs[0].name = "Fred";
        myDogs[1].name = "Marge";

        // humm ... qual é o do MyDogs[2]?
        System.out.print("o nome do ultimo cão é ");
        System.out.println(myDogs[2].name);

        int x = 0;
        while (x < myDogs.length) {
            myDogs[x].bark();
            x = x + 1;
        }
    }

    public void bark() {
        System.out.println(name + " Diz Ruff! ");
    }

    public void eat() { }

    public void chaseCat() { }
}
