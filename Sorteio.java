import java.util.Random;

public class Sorteio {

    public static void main(String[] args) {

        System.out.println("===============================");
        System.out.println("         SORTEIO");
        System.out.println("===============================");

 Random numeros = new Random();
        int valor = numeros.nextInt(0, 101);
        Scanner scanner = new Scanner(System.in);

        System.out.println("===============================");
        System.out.println("         SORTEIO");
        System.out.println("===============================");

        int numeroEscolhido;
        int contador = 1;
        int tentativas;

        do {
            tentativas = contador += 1;
            System.out.println();
            System.out.println("Qual numero vai sair?");
            numeroEscolhido = scanner.nextInt();

            if (numeroEscolhido < valor) {
                System.out.println("Chute mais auto!");

            }
            if (numeroEscolhido > valor) {
                System.out.println("Chute mais baixo!");

            }
            if (numeroEscolhido == valor) {
                System.out.println("Você acertou!");
            }

        } while ((valor > numeroEscolhido) || (valor < numeroEscolhido));

        System.out.println("Você teve " + tentativas + " tentativas até acertar! ");

    }
}
