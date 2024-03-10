import java.util.ArrayList;

public class Plateau {

    private ArrayList<Piece> tableau = new ArrayList<Piece>();

    //Constructeur par défaut sans choix de pokémon 

    public Plateau(){

        //---------------------Ligne 0---------------------//      Joueur 1

        Pokemon poke1 = new Salameche();
        tableau.add(0,new Piece(0,0,poke1,1));

        Pokemon poke2 = new Carapuce();
        tableau.add(1,new Piece(1,0,poke2,1));

        Pokemon poke3 = new Bulbizarre();
        tableau.add(2,new Piece(2,0,poke3,1));

        Pokemon poke4 = new Sulfura();
        tableau.add(3,new Piece(3,0,poke4,1));

        Pokemon poke5 = new Mewtwo();
        tableau.add(4,new Piece(4,0,poke5,1));

        Pokemon poke6 = new Electhor();
        tableau.add(5,new Piece(5,0,poke6,1));

        Pokemon poke7 = new Bulbizarre();
        tableau.add(6,new Piece(6,0,poke7,1));

        Pokemon poke8 = new Carapuce();
        tableau.add(7,new Piece(7,0,poke8,1));

        Pokemon poke9 = new Salameche();
        tableau.add(8,new Piece(8,0,poke9,1));

        //---------------------Ligne 1---------------------//

        Pokemon poke10 = new Reptincel();
        tableau.add(9,new Piece(0,1,poke10,1));

        Pokemon poke11 = new Carabaffe();
        tableau.add(10,new Piece(1,1,poke11,1));

        Pokemon poke12 = new Herbizarre();
        tableau.add(11,new Piece(2,1,poke12,1));

        Pokemon poke13 = new Dracolosse();
        tableau.add(12,new Piece(3,1,poke13,1));

        Pokemon poke14 = new Artikodin();
        tableau.add(13,new Piece(4,1,poke14,1));

        Pokemon poke15 = new Dracolosse();
        tableau.add(14,new Piece(5,1,poke15,1));

        Pokemon poke16 = new Herbizarre();
        tableau.add(15,new Piece(6,1,poke16,1));

        Pokemon poke17 = new Carabaffe();
        tableau.add(16,new Piece(7,1,poke17,1));

        Pokemon poke18 = new Reptincel();
        tableau.add(17,new Piece(8,1,poke18,1));

        //---------------------Ligne 2---------------------//

        Pokemon poke19 = new Florizarre();
        tableau.add(18,new Piece(3,2,poke19,1));

        Pokemon poke20 = new Tortank();
        tableau.add(19,new Piece(4,2,poke20,1));

        Pokemon poke21 = new Dracaufeu();
        tableau.add(20,new Piece(5,2,poke21,1));

        //---------------------Ligne 6---------------------//      Joueur 2

        Pokemon poke22 = new Dracaufeu();
        tableau.add(21,new Piece(3,6,poke22,2));

        Pokemon poke23 = new Tortank();
        tableau.add(22,new Piece(4,6,poke23,2));

        Pokemon poke24 = new Florizarre();
        tableau.add(23,new Piece(5,6,poke24,2));

        //---------------------Ligne 7---------------------//

        Pokemon poke25 = new Reptincel();
        tableau.add(24,new Piece(0,7,poke25,2));

        Pokemon poke26 = new Carabaffe();
        tableau.add(25,new Piece(1,7,poke26,2));

        Pokemon poke27 = new Herbizarre();
        tableau.add(26,new Piece(2,7,poke27,2));

        Pokemon poke28 = new Dracolosse();
        tableau.add(27,new Piece(3,7,poke28,2));

        Pokemon poke29 = new Artikodin();
        tableau.add(28,new Piece(4,7,poke29,2));

        Pokemon poke30 = new Dracolosse();
        tableau.add(29,new Piece(5,7,poke30,2));

        Pokemon poke31 = new Herbizarre();
        tableau.add(30,new Piece(6,7,poke31,2));

        Pokemon poke32 = new Carabaffe();
        tableau.add(31,new Piece(7,7,poke32,2));

        Pokemon poke33 = new Reptincel();
        tableau.add(32,new Piece(8,7,poke33,2));

        //---------------------Ligne 8---------------------//

        Pokemon poke34 = new Salameche();
        tableau.add(33,new Piece(0,8,poke34,2));

        Pokemon poke35 = new Carapuce();
        tableau.add(34,new Piece(1,8,poke35,2));

        Pokemon poke36 = new Bulbizarre();
        tableau.add(35,new Piece(2,8,poke36,2));

        Pokemon poke37 = new Sulfura();
        tableau.add(36,new Piece(3,8,poke37,2));

        Pokemon poke38 = new Mewtwo();
        tableau.add(37,new Piece(4,8,poke38,2));

        Pokemon poke39 = new Electhor();
        tableau.add(38,new Piece(5,8,poke39,2));

        Pokemon poke40 = new Bulbizarre();
        tableau.add(39,new Piece(6,8,poke40,2));

        Pokemon poke41 = new Carapuce();
        tableau.add(40,new Piece(7,8,poke41,2));

        Pokemon poke42 = new Salameche();
        tableau.add(41,new Piece(8,8,poke42,2));
    }

    //Constructeur custom a faire

    //Permet de modifier les coordonnées d'une pièce dans le tableau

    public void changement(Piece piece , Position nouvelleCo){

        for(int i = 0 ; i <  tableau.size() ; i++){

            if(tableau.get(i).equals(piece) == true){
                tableau.get(i).setCoordonees(nouvelleCo);
            }
        }
    }

    //Permet de supprimer une pièce du tableau

    public void suppr(Piece piece){

        for(int i = 0 ; i <  tableau.size() ; i++){

            if(tableau.get(i).equals(piece) == true){
                tableau.remove(i);
            }
        }
    }

    //Méthode getCase utilisant 2 entiers

    public Piece getCase(int x , int y){

        Position pos = new Position(x,y);
        Piece maPiece ;

        for (int i = 0 ; i < tableau.size() ; i++) {
            maPiece = tableau.get(i);
            if(maPiece.getPosition().equals(pos)){
                return maPiece;
            }
        }
        return null ;
    }

    //Méthode getCase utilisant un objet de type position

    public Piece getCase(Position pos){

        Piece maPiece ;

        for (int i = 0 ; i < tableau.size() ; i++) {
            maPiece = tableau.get(i);
            if(maPiece.getPosition().equals(pos)){
                return maPiece;
            }
        }
        return null ;
    }

    //Méthode getCase utilisant un entier et une lettre

    public Piece getCase(char x , int y){

        Position pos = new Position(x,y);
        Piece maPiece ;

        for (int i = 0 ; i < tableau.size() ; i++) {
            maPiece = tableau.get(i);
            if(maPiece.getPosition().equals(pos)){
                return maPiece;
            }
        }
        return null ;
    }

    //Cette fonction renvoie un tableau avec toute les pièces du joueur 1

    public ArrayList<Piece> getPiecesJoueur1() {

        ArrayList<Piece> pokeJoueur1 = new ArrayList<Piece>();
        Piece temp = new Piece();
        int j = 0 ;

        for (int i = 0 ; i < tableau.size() ; i++){

            temp = tableau.get(i);

            if (temp.getPlayer() == 1){
                pokeJoueur1.add(j,temp);
                j++ ;
            }
        }
        return pokeJoueur1 ;
    }

    //Cette fonction renvoie un tableau avec toute les pièces du joueur 2

    public ArrayList<Piece> getPiecesJoueur2() {

        ArrayList<Piece> pokeJoueur2 = new ArrayList<Piece>();
        Piece temp = new Piece();
        int j = 0 ;

        for (int i = 0 ; i < tableau.size() ; i++){

            temp = tableau.get(i);

            if (temp.getPlayer() == 2){
                pokeJoueur2.add(j,temp);
                j++ ;
            }
        }
        return pokeJoueur2 ;
    }

    //Cette fonction renvoie une chaine de caractère avec tout les pokémons du plateau

    public String toString(){
        String liste_pokemon = new String() ;
        Piece temp = new Piece();
        
        for (int i = 0 ; i < tableau.size() ; i++){
            temp = tableau.get(i);
            liste_pokemon = liste_pokemon + temp.toString();
        }

        return liste_pokemon ;
    }
}