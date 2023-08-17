public class exercicio2 {

    public static void main(String[] args) {

        exercicio2 Exercicio = new exercicio2();
        Exercicio.exercicioA ();
        Exercicio.exercicioB ();
        Exercicio.exercicioC ();
        Exercicio.exercicioD ();
        Exercicio.exercicioE ();
        Exercicio.exercicioF ();
    
    }

    public void exercicioA () {
        System.out.println("Exercicio A");
        int A = 10;
        int B = 20;
        System.out.println(B);
        B = 5;
        System.out.print(A);
        System.out.print(", ");
        System.out.println(B);
    }

    public void exercicioB (){
        System.out.println("Exercicio B");
        int A = 30;
        int B = 20;
        int C = A + B;
        System.out.println(C);
        B = 10;
        System.out.print(B);
        System.out.print(", ");
        System.out.println(C);
    }

    public void exercicioC (){
        System.out.println("Exercicio C");
        int A = 10;
        int B = 20;
        int C = A;
        B = C;
        A = B;
        System.out.print(A);
        System.out.print(", ");
        System.out.print(B);
        System.out.print(", ");
        System.out.println(C);
    }

    public void exercicioD (){
        System.out.println("Exercicio D");
        int A = 10;
        int B = A + 1;
        A = B + 1;
        B = A + 1;
        System.out.println(A);
        A = B + 1;
        System.out.print(A);
        System.out.print(", ");
        System.out.println(B);
    }

    public void exercicioE (){
        System.out.println("Exercicio E");
        int A = 10;
        int B = 5;
        int C = A + B;
        B = 20;
        A = 10;
        System.out.print(A);
        System.out.print(", ");
        System.out.print(B);
        System.out.print(", ");
        System.out.println(C);

    }
    
    public void exercicioF (){
        System.out.println("Exercicio F");
        int X = 1;
        int Y = 2;
        int Z = Y - X;
        System.out.println(Z);
        X = 5;
        Y = X + Z;
        System.out.print(X);
        System.out.print(", ");
        System.out.print(Y);
        System.out.print(",");
        System.out.println(Z);

    }
}
