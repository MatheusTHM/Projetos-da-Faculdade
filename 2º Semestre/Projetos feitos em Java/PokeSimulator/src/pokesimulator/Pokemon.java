package pokesimulator;

public class Pokemon {
    //Criar os atributos genéricos de um pokemon
    //Encapsulamento
    private String nome;
    private String tipo;
    private int level;
    private int vida = 200;
    private int ataque;
    private int defesa;
    
    //Construtor da classe
    public Pokemon(String nome, String tipo, int level){
        this.nome = nome;
        this.tipo = tipo;
        this.level = level;
        
        calculaAtributos();
        calculaBonus();
    }
    
    //Get
    public String getTipo(){
        return this.tipo;
    }
    public int getVida(){
        return this.vida;
    }
    
    public int getAtaque(){
        return this.ataque;
    }
    
    public int getDefesa(){
        return this.defesa;
    }
    
    //Métodos que podem ser usados por um objeto do tipo Pokemon
    private void calculaAtributos(){
        switch(tipo){
            case "Fogo":
                vida -= 10;
                ataque = 35;
                defesa = 25;
                break;
            case "Água":
                ataque = 30;
                defesa = 20;
                break;
            case "Terra":
                vida += 10;
                ataque = 20;
                defesa = 40;
                break;
            case "Ar":
                ataque = 45;
                defesa = 15;
                break;
                    
        }
    }
    
    private void calculaBonus(){
        vida = vida + (level/2);
        ataque = ataque + (level/3);
        defesa = defesa + (level/3);
    }
    
    public void imprimePokemon(){
        System.out.println("Nome: " + nome + " | " +
                "Tipo: " + tipo + " | " +
                    "Level: " + level + " | " +
                        "Vida: " + vida + " | " +
                            "Ataque: " + ataque + " | " +
                                "Defesa: " + defesa  + "\n");
    }
}
