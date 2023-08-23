import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o custo de fábrica do carro:");
        double custo_fabrica = in.nextDouble();
        in.close();

        double custo_final = custo_fabrica + (custo_fabrica*0.28) + (custo_fabrica*0.45);
        
        System.out.print("O custo final ao consumidor é: ");
        System.out.println(custo_final);


    }
    
}
