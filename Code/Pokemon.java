public abstract class Pokemon {

    private int numPokemon;
    private String nomPokemon;
    private int type1;
    private int type2;
    private int pv;
    private int atk;
    private int def;
    private int vitesse;

    //Constructeur par defaut

    public Pokemon() {
        this.numPokemon = 1;
        this.nomPokemon = "Bulbizarre";
        this.type1 = 3;
        this.type2 = 7;
        this.pv = 45;
        this.atk = 49;
        this.def = 49;
        this.vitesse = 45;
    }

    //Constructeur par parametres

    public Pokemon(int numPokemon, String nomPokemon, int type1, int type2, int pv, int atk, int def, int vitesse) {
        this.numPokemon = numPokemon;
        this.nomPokemon = nomPokemon;
        this.type1 = type1;
        this.type2 = type2;
        this.pv = pv;
        this.atk = atk;
        this.def = def;
        this.vitesse = vitesse;
    }

    //Cette fonction permet de faire combattre deux pokémons

    public int attaque(Pokemon pokemon2) {

        int degPoke1 = this.atk - pokemon2.def ; 
        int degPoke2 = pokemon2.atk - this.def ;

        if (degPoke1 < 0){  
            degPoke1 = 1 ;
        }
        if (degPoke2 < 0){  
            degPoke2 = 1 ;
        }

        while (true) {
            if (this.vitesse >= pokemon2.vitesse) {   
                pokemon2.pv = pokemon2.pv - degPoke1 ;
                if (pokemon2.pv > 0) {         
                    this.pv = this.pv - degPoke2 ;
                } 
                if (this.pv <= 0){
                    return 2;
                }
                if(pokemon2.pv <= 0) {    
                    return 1 ; 
                }
            } 
            else {   
                this.pv = this.pv - degPoke2;
                if (this.pv > 0) {      
                    pokemon2.pv = pokemon2.pv - degPoke1 ;
                } 
                if (this.pv <= 0){
                    return 2;
                }
                if(pokemon2.pv <= 0) {        
                    return 1 ; 
                }
            }
        }
    }

    //Cette fonction retourne une chaine de caractère avec tout les attributs d'un pokémon

    public String toString() {      
        return "Ce pokemon est un "+this.getEspece()+ 
        " (Numéro : " + this.numPokemon + ")"+
        " nommé "+this.nomPokemon +
        " de type "+Type.getNomType(this.type1)+
        " et "+Type.getNomType(this.type2)+
        " avec "+this.pv+" pv , "+
        this.atk+" d'attaque , "+
        this.def+" de def et "+
        this.vitesse+" de vittesse." ;
    }

    //Permet de récuperer les PV d'un pokémon

    public int getPV(){
        return this.pv;
    }

    //Méthode abstraite qui retourne l'espece d'un pokémon

    public abstract String getEspece();

    //Méthode abstraite qui retourne le numéro d'un pokémon

    public abstract int getNumero();
}