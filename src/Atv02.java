import java.util.Scanner;

public class Atv02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int senha = 0;

       do {
           System.out.println("Digite a senha: ");
           senha = leitor.nextInt();
           if (senha != 123) {
               System.out.println("Senha Incorreta");
           }

       } while (senha != 123);

        System.out.println("Senha Correta!");
    }

}
