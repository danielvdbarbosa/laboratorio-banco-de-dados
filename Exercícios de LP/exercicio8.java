import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o numero total de eleitores:");
        double eleitores = in.nextInt();
        System.out.println("Digite o total de votos brancos:");
        double brancos = in.nextInt();
        System.out.println("Digite o total de votos nulos:");
        double nulos = in.nextInt();
        System.out.println("Digite o total de votos válidos:");
        double validos = in.nextInt();
        in.close();
        
        double perc_validos = (validos/eleitores)*100;
        double perc_brancos = (brancos/eleitores)*100;
        double perc_nulos = (nulos/eleitores)*100;
        
        System.out.print("Percentual de votos validos: ");
        System.out.println(perc_validos);
        System.out.print("Percentual de votos brancos: ");
        System.out.println(perc_brancos);
        System.out.print("Percentual de votos nulos: ");
        System.out.println(perc_nulos);
        
    }
    
}
