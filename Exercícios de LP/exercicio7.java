import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int ano = in.nextInt();
        int mes = in.nextInt();
        int dia = in.nextInt();

        int idade = (ano*365)+(mes*30)+dia;
        
        System.out.print("Idade em dias: ");
        System.out.println(idade);

        
    }
    
}
