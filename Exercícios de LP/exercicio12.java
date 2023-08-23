import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Digite a temperatura em Farenheit: ");
        double temperatura_F = in.nextDouble();
        in.close();

        double temperatura_C = ((temperatura_F - 32)/9)*5;

        System.out.print("A temperatura em Celsius é: ");
        System.out.println(temperatura_C);

    }

}
    
