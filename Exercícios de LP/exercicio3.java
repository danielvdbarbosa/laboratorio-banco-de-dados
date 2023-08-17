public class exercicio3 {

    public static void main(String[] args) {
        exercicio3 Exercicio = new exercicio3();
        Exercicio.ExercicioA();
        Exercicio.ExercicioB();
        Exercicio.ExercicioC();
        
    }
    public void ExercicioA(){
        System.out.println("Exercicio A");
        double resultado1 = (4/2) + (2/4);
        double resultado2 = 4/2 + 2/4;
        System.out.println(resultado1==resultado2);
    }
    public void ExercicioB(){
        System.out.println("Exercicio B");
        double resultado1 = 4/(2+2)/4;
        double resultado2 = 4/2+2/4;
        System.out.println(resultado1==resultado2);
    }
    public void ExercicioC(){
        System.out.println("Exercicio C");
        double resultado1 = (4+2)*2-4;
        double resultado2 = 4+2*2-4;
        System.out.println(resultado1==resultado2);

    }

    
}
