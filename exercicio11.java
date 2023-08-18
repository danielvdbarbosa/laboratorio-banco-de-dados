import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o numero de carros vendidos:");
        int carros_vendidos = in.nextInt();
        System.out.println("Digite o valor total de vendas: ");
        double valor_vendas = in.nextDouble();
        System.out.println("Digite o salário fixo: ");
        double salario_fixo = in.nextDouble();
        System.out.println("Digite a comissão por venda: ");
        double comissao = in.nextDouble();
        in.close();
        
        double salario_final = salario_fixo + (comissao*carros_vendidos) + (valor_vendas*0.05);

        System.out.print("O salário final do vendedor é: ");
        System.out.println(salario_final);

    }
    
}
