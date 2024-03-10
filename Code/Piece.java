import java.util.ArrayList;

public class Piece {

    private Position coordonees ;
    private Pokemon pokemon ;
    private int player ;

    //Constructeur par défaut

    public Piece(){                                       
        this.coordonees = new Position(0,1);
        this.pokemon = new Bulbizarre() ;
        this.player = 1 ;
    }

    //Constructeur par parametre avec nouvelle position

    public Piece(int x , int y , Pokemon poke , int id){   
        this.coordonees = new Position(x,y) ;
        this.pokemon = poke ;
        this.player = id ;
    }

    //Constructeur par parametre avec nouvelle position char

    public Piece(char x , int y , Pokemon poke , int id){
        this.coordonees = new Position(x,y) ;
        this.pokemon = poke ;
        this.player = id ;
    }

    //Constructeur par parametre avec position existante

    public Piece(Position pos , Pokemon poke , int id){ 
        this.coordonees = pos ;
        this.pokemon = poke ;
        this.player = id ;
    }

    //Constructeur par copie

    public Piece(Piece copie){                      
        this.coordonees = copie.coordonees ;
        this.pokemon = copie.pokemon ;
        this.player = copie.player ;
    }

    //Set coordonnes avec 2 entiers

    public void setCoordonees(int x , int y){ 
        this.coordonees = new Position(x,y);
    }

    //Set coordonnes avec 1 entier et un char

    public void setCoordonees(char x , int y){  
        this.coordonees = new Position(x,y);
    }

    //Set coordonnes avec une position

    public void setCoordonees(Position pos){ 
        this.coordonees = pos ;
    }

    //Return le pokemon contenu dans la piece

    public Pokemon getPokemon(){
        return this.pokemon ;
    }

    //Return la position de la piece

    public Position getPosition(){                
        return this.coordonees ;  
    }

    //Return le joueur qui possede la piece 

    public int getPlayer(){                       
        return this.player ;
    }

    //Cette fonction verifie si deux objets de type pièces sont identiques

    public Boolean equals(Piece piece2){
        if(this.coordonees == piece2.coordonees && this.pokemon == piece2.pokemon && this.player == piece2.player){
            return true ;
        }
        else {
            return false ;
        }
    }

    //Cette fonction renvoie un tableau de Positions avec tout les déplacements possible pour une pièce bien précise

    public ArrayList<Position> getDeplacementPossible(Plateau plat){

        ArrayList<Position> deplacamentPossible = new ArrayList<Position>();

        int monX = this.coordonees.getX() ;
        int monY = this.coordonees.getY() ;
        int index = 0 ;

        int monXBas = monX-1;
        if(monXBas == -1 ){
            monXBas = 0 ;
        }

        int monXHaut = monX+1;
        if(monXHaut == 9){
            monXHaut = 8 ;
        }

        int monYBas = monY-1;
        if(monYBas == -1 ){
            monYBas = 0 ;
        }

        int monYHaut = monY+1;
        if(monYHaut == 9){
            monYHaut = 8 ;
        }

        for(int i = monXBas ; i <= monXHaut ; i++){

            for(int j = monYBas ; j <= monYHaut ; j++){

                if(plat.getCase(i,j) == null){

                    Position disponible = new Position(i,j);

                    deplacamentPossible.add(index,disponible);

                    index++ ;
                }
            }
        }
        return deplacamentPossible ;
    }

    //Cette fonction renvoie un tableau de Positions avec tout les attaques possible pour une pièce bien précise

    public ArrayList<Position> getAttaquePossible(Plateau plat){

        ArrayList<Position> attaquePossible = new ArrayList<Position>();

        int monX = this.coordonees.getX() ;
        int monY = this.coordonees.getY() ;
        int index = 0 ;

        int monXBas = monX-1;
        if(monXBas == -1 ){
            monXBas = 0 ;
        }

        int monXHaut = monX+1;
        if(monXHaut == 9){
            monXHaut = 8 ;
        }

        int monYBas = monY-1;
        if(monYBas == -1 ){
            monYBas = 0 ;
        }

        int monYHaut = monY+1;
        if(monYHaut == 9){
            monYHaut = 8 ;
        }

        for(int i = monXBas ; i <= monXHaut ; i++){

            for(int j = monYBas ; j <= monYHaut ; j++){

                if(plat.getCase(i,j) != null){

                    if(plat.getCase(i,j).getPlayer() != this.player){
                        
                        Position disponible = new Position(i,j);

                        attaquePossible.add(index,disponible);

                        index++ ;
                    }
                }
            }
        }
        return attaquePossible ;
    }

    //Cette fonction renvoie une chaine de caractère avec toute les informations sur cette pièce

    public String toString(){
        return " Ce pokemon se situe en " + this.coordonees + " , il appartient au joueur " + this.player + " : " + this.pokemon + "\n";
    }
}