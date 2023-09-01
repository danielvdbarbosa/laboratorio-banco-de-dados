public class App {
    public static void main(String[] args){
        Pokemon pikachu = new Pokemon("Pikachu", "Choque do Trovão", "Investida", "Raichu");
        Pokemon charmander = new Pokemon("Charmander", "Lança Chamas", "Megasoco", "Charmeleon");
        Pokemon bulbasaur = new Pokemon("Bulbasaur", "Chicote de Cipó", "Semente Sangue-suga", "Ivysaur");
        Pokemon squirtle = new Pokemon("Squirtle", "Esguicho", "Bolhas", "Wartortle");
        
        pikachu.usarHabilidade1();
        pikachu.usarHabilidade2();
        pikachu.evoluir();


       
    }
}
