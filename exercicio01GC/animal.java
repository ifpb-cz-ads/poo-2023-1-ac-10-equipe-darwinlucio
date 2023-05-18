public class Animal {
    public void emitirSom() {
        System.out.println("O animal emitiu um som.");
    }
}

public class Mamifero extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("O mamífero emitiu um som.");
    }
}

public class Reptil extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("O réptil emitiu um som.");
    }
}

public class Cachorro extends Mamifero {
    @Override
    public void emitirSom() {
        System.out.println("O cachorro latiu.");
    }

    public void abanarRabo() {
        System.out.println("O cachorro está abanando o rabo.");
    }
}

public class Gato extends Mamifero {
    @Override
    public void emitirSom() {
        System.out.println("O gato miou.");
    }

    public void arranharMoveis() {
        System.out.println("O gato está arranhando os móveis.");
    }
}

public class Cobra extends Reptil {
    @Override
    public void emitirSom() {
        System.out.println("A cobra sibilou.");
    }

    public void rastejar() {
        System.out.println("A cobra está rastejando.");
    }
}

