import MG2D.geometrie.Point;

public class Position {
    
    private int x ;
    private int y ;

    //Constructeur par défaut 

    public Position(){                  
        this.x = 0 ;
        this.y = 0 ;
    }

    //Constructeur par paramètres

    public Position(int x , int y){         
        setX(x);
        setY(y);
    }

    //Constructeur par copie 

    public Position(Position copie){     
        this.x = copie.x ;
        this.y = copie.y ;
    }

    //Constructeur qui utilise les point de MG2D

    public Position(Point p){       
        this.x = p.getX();
        this.y = p.getY();
    }

    //Constructeur lettre et chiffre

    public Position(char x , int y){
        switch(x){
            case 'A':
                this.x = 0 ;
                break ;
            case 'B':
                this.x = 1 ;
                break ;
            case 'C':
                this.x = 2 ;
                break ;
            case 'D':
                this.x = 3 ;
                break ;
            case 'E':
                this.x = 4 ;
                break ;
            case 'F':
                this.x = 5 ;
                break ;
            case 'G':
                this.x = 6 ;
                break ;
            case 'H':
                this.x = 7 ;
                break ;
            case 'I':
                this.x = 8 ;
                break ;
        }
        this.y = y ;
    }

    //Cette fonction verifie si deux objets de type position sont identiques

    public boolean equals(Position pos){
        if(this.x == pos.x && this.y == pos.y){
            return true ;
        }
        else{
            return false ;
        }
    }

    //Cette fonction renvoie une chaines de caractère avec toute les informations sur la positions

    public String toString() {

        char xChar;

        switch(this.x) {
            case 0:
                xChar = 'A';
                break;
            case 1:
                xChar = 'B';
                break;
            case 2:
                xChar = 'C';
                break;
            case 3:
                xChar = 'D';
                break;
            case 4:
                xChar = 'E';
                break;
            case 5:
                xChar = 'F';
                break;
            case 6:
                xChar = 'G';
                break;
            case 7:
                xChar = 'H';
                break;
            case 8:
                xChar = 'I';
                break; 
            default:
                xChar = '?';
        }
    
        String co = String.valueOf(xChar) + this.y;
        return co; 
    }

    //Cette fonction permet de modifier X
    
    public void setX(int x){
        if (x >= 0 && x <= 8){
            this.x = x ;
        }
        else {
            System.out.println("Erreur de coordonnées de X.");
        }
    }

    //Cette fonction permet de modifier Y

    public void setY(int y){
        if (y >= 0 && y <= 8){
            this.y = y ;
        }
        else {
            System.out.println("Erreur de coordonnées de Y.");
        }
    }

    //Cette fonction permet d'obtenir X

    public int getX(){
        return this.x ;
    }

    //Cette fonction permet d'obtenir Y

    public int getY(){
        return this.y ;
    }
}