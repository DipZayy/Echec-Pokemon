public class Piece {

    private Position coordonees ;
    private Pokemon pokemon ;
    private int player ;

    public Piece(){                                       //Constructeur par défaut
        this.coordonees = new Position(0,1);
        this.pokemon = new Bulbizarre() ;
        this.player = 1 ;
    }

    public Piece(int x , int y , Pokemon poke , int id){   //Constructeur par parametre avec nouvelle position
        this.coordonees = new Position(x,y) ;
        this.pokemon = poke ;
        this.player = id ;
    }

    public Piece(char x , int y , Pokemon poke , int id){   //Constructeur par parametre avec nouvelle position char
        this.coordonees = new Position(x,y) ;
        this.pokemon = poke ;
        this.player = id ;
    }

    public Piece(Position pos , Pokemon poke , int id){     //Constructeur par parametre avec position existante
        this.coordonees = pos ;
        this.pokemon = poke ;
        this.player = id ;
    }

    public Piece(Piece copie){                             //Constructeur par copie
        this.coordonees = copie.coordonees ;
        this.pokemon = copie.pokemon ;
        this.player = copie.player ;
    }

    public void setCoordonees(int x , int y){     //Set coordonnes avec 2 entiers
        this.coordonees = new Position(x,y);
    }

    public void setCoordonees(char x , int y){    //Set coordonnes avec 1 entier et un char
        this.coordonees = new Position(x,y);
    }

    public void setCoordonees(Position pos){      //Set coordonnes avec une position
        this.coordonees = pos ;
    }

    public Pokemon getPokemon(){                  //Return le pokemon contenu dans la piece
        return this.pokemon ;
    }

    public Position getPosition(){                //Return la position de la piece
        return this.coordonees ;  
    }

    public int getPlayer(){                       //Return le joueur qui possede la piece 
        return this.player ;
    }

    public Boolean equals(Piece piece2){
        if(this.coordonees == piece2.coordonees && this.pokemon == piece2.pokemon && this.player == piece2.player){
            return true ;
        }
        else {
            return false ;
        }
    }

    public String toString(){
        return " Ce pokemon se situe en " + this.coordonees + " , il appartient au joueur " + this.player + " : " + this.pokemon + "\n";
    }
}