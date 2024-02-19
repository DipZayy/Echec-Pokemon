public abstract class Pokemon {

    private int numPokemon;
    private String nomPokemon;
    private int type1;
    private int type2;
    private int pv;
    private int atk;
    private int def;
    private int vitesse;

    public Pokemon() {                          // Constructeur par defaut
        this.numPokemon = 1;
        this.nomPokemon = "Bulbizarre";
        this.type1 = 3;
        this.type2 = 7;
        this.pv = 45;
        this.atk = 49;
        this.def = 49;
        this.vitesse = 45;
    }

    public Pokemon(int numPokemon, String nomPokemon, int type1, int type2, int pv, int atk, int def, int vitesse) {     // Constructeur par parametres
        this.numPokemon = numPokemon;
        this.nomPokemon = nomPokemon;
        this.type1 = type1;
        this.type2 = type2;
        this.pv = pv;
        this.atk = atk;
        this.def = def;
        this.vitesse = vitesse;
    }

    public String attaque(Pokemon pokemon2) {

        int degPoke1 = this.atk - pokemon2.def ;                         //On définit les dégats en fonction de l'atk et def
        int degPoke2 = pokemon2.atk - this.def ;

        if (degPoke1 < 0){                                               //Si les dégats sont < 0 on les met à 0 pour eviter les gain de PV
            degPoke1 = 1 ;
        }
        if (degPoke2 < 0){                                               //Comme au dessus mais pour le second pokemon
            degPoke2 = 1 ;
        }

        if (this.equals(pokemon2)){
            return "Erreur , les deux pokémon sont identiques" ;
        }

        while (this.pv > 0 || pokemon2.pv > 0) {
            if (this.vitesse >= pokemon2.vitesse) {                       // Alors le pokemon 1 a la priorité
                pokemon2.pv = pokemon2.pv - degPoke1 ;
                if (pokemon2.pv > 0) {                                    // Ensuite c'est le tours de poke 2 s'il est encore en vie
                    this.pv = this.pv - degPoke2 ;
                } 
                else {                                                    // Sinon c'est victoire du pokemon 1
                    return this.getEspece() + " nommé " + this.nomPokemon ; 
                }
            } 
            else {                                                        // Sinon c'est Pokemon 2 qui a la priorité
                this.pv = this.pv - degPoke2;
                if (this.pv > 0) {                                        // Ensuite c'est le tours de poke 1 s'il est encore en vie
                    pokemon2.pv = pokemon2.pv - degPoke1 ;
                } 
                else {                                                    // Sinon c'est victoire du pokemon 2
                    return pokemon2.getEspece() + " nommé " + pokemon2.nomPokemon ; 
                }
            }
        }
        return "erreur"; // Si erreur ?
    }

    public String toString() {                                           //Permet d'afficher toute les informations relative a un pokemon
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

    public abstract String getEspece();

}