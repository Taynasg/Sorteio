import java.util.Random;

public class Sorteio {

    public static void main(String[] args) {

        System.out.println("===============================");
        System.out.println("         SORTEIO");
        System.out.println("===============================");


        Random numeros = new Random();
        int valor = numeros.nextInt(0,101);
        System.out.println(valor);
    }


}
