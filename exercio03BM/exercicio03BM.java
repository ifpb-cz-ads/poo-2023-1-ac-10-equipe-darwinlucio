public class exercicio03BM {
    public static void main(String[] args) {
        // Exemplo de conversão de metro quadrado para pés quadrados
        double metroQuadrado = 10;
        double peQuadrado = ConversaoDeUnidadesDeArea.metroQuadradoParaPeQuadrado(metroQuadrado);
        System.out.println(metroQuadrado + " metro quadrado(s) equivale a " + peQuadrado + " pé(s) quadrado(s).");

        // Exemplo de conversão de pé quadrado para centímetros quadrados
        double peQuadrado2 = 1000;
        double cmQuadrado = ConversaoDeUnidadesDeArea.peQuadradoParaCentimetroQuadrado(peQuadrado2);
        System.out.println(peQuadrado2 + " pé(s) quadrado(s) equivale a " + cmQuadrado + " centímetro(s) quadrado(s).");

        // Exemplo de conversão de milha quadrada para acres
        double milhaQuadrada = 5;
        double acre = ConversaoDeUnidadesDeArea.milhaQuadradaParaAcre(milhaQuadrada);
        System.out.println(milhaQuadrada + " milha(s) quadrada(s) equivale a " + acre + " acre(s).");

        // Exemplo de conversão de acre para pé quadrado
        double acre2 = 2;
        double peQuadrado3 = ConversaoDeUnidadesDeArea.acreParaPeQuadrado(acre2);
        System.out.println(acre2 + " acre(s) equivale a " + peQuadrado3 + " pé(s) quadrado(s).");
    }
}
