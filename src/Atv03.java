import  java.util.Scanner;

public class Atv03 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double numero = 0;

        do {
            System.out.printf("Digite um número: ");
            numero = leitor.nextDouble();
        }while(numero != 0);
            System.out.println("Finalizando Programa");
    }
}
