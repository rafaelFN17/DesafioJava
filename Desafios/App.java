import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        
        int menu = -1;
        while (menu != 0) {
            
            System.out.println("Digite a opção de desafio (1- Classe Luxfacta | 2- Classe Palindrome | 3- Classe Path | 0- Sair ): ");
            Scanner in = new Scanner(System.in);
            menu = Integer.parseInt(in.nextLine());

            if (menu == 1 ) {
                System.out.println("Digite um numero inteiro:");
                Luxfacta lux = new Luxfacta(Integer.parseInt(in.nextLine()));
                System.out.println(lux.Say());
            }

            if (menu == 2) {
                System.out.println("Digite uma palavra:");
                Palindromes palindroma = new Palindromes(in.nextLine());
                System.out.println(palindroma.isPalindrome());
            }

            if (menu == 3){
                System.out.println("Digite o caminho inicial:");
                Path cmd = new Path(in.nextLine());
                System.out.println("Digite o comando:");
                System.out.println(cmd.changeDirectory(in.nextLine()));
            }

            if (menu != 1 && menu != 2 && menu != 3 && menu != 0){
                System.out.println("Numero invalido");
            }
        }

    }
}
