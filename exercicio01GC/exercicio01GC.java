public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.emitirSom(); // O animal emitiu um som.

        Mamifero mamifero = new Mamifero();
        mamifero.emitirSom(); // O mamífero emitiu um som.

        Reptil reptil = new Reptil();
        reptil.emitirSom(); // O réptil emitiu um som.

        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom(); // O cachorro latiu.
        cachorro.abanarRabo(); // O cachorro está abanando o rabo.

        Gato gato = new Gato();
        gato.emitirSom(); // O gato miou.
        gato.arranharMoveis(); // O gato está arranhando os móveis.

        Cobra cobra = new Cobra();
        cobra.emitirSom(); // A cobra sibilou.
        cobra.rastejar(); // A cobra está rastejando.
    }
}
