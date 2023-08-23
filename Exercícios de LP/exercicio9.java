import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        System.out.println("Digite o salário mensal: ");
        double salario_mensal = in.nextDouble();
        System.out.println("Digite o percentual de reajuste: ");
        double percentual_reajuste = in.nextDouble();
        in.close();
        
        double salario_final = salario_mensal + salario_mensal * (percentual_reajuste/100);

        System.out.print("O salario reajustado é: ");
        System.out.println(salario_final);

        
        
        
    }
    
}
