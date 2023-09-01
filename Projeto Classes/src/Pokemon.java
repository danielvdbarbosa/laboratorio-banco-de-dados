public class Pokemon{
    private String nome;
    private String habilidade1;
    private String habilidade2;
    private String evolucao;

    public Pokemon (String nome, String habilidade1, String habilidade2, String evolucao){
        this.nome = nome;
        this.habilidade1 = habilidade1;
        this.habilidade2 = habilidade2;
        this.evolucao = evolucao;
    }
    public String getNome (){
        return nome;

    }
    public String getHabilidade1 (){
        return habilidade1;
    }
    public String getHabilidade2 (){
        return habilidade2;
    }
    public String getEvolucao (){
        return evolucao;
    }
    public void setNome (String nome){
        this.nome = nome;
    }
    public void setHabilidade1 (String habilidade1){
        this.habilidade1 = habilidade1;
    }
    public void setEvolucao (String evolucao){
        this.evolucao = evolucao;
    }
    public void usarHabilidade1 (){
        System.out.printf("%s usou %s. Foi super efetivo!%n", this.nome, this.habilidade1);
    }
    public void usarHabilidade2 (){
        System.out.printf("%s usou %s. Foi super efetivo!%n", this.nome, this.habilidade2);
    }
    public void evoluir (){
        System.out.printf("%s evoluiu para %s.%n", this.nome, this.evolucao);
        this.nome = this.evolucao;
    }
}