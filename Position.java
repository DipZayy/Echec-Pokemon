public class Position {
    
    private int x ;
    private int y ;

    public Position(){                      //Constructeur par défaut 
        this.x = 0 ;
        this.y = 0 ;
    }

    public Position(int x , int y){         //Constructeur par paramètres
        setX(x);
        setY(y);
    }

    public Position(Position copie){        //Constructeur par copie 
        this.x = copie.x ;
        this.y = copie.y ;
    }

    public Position(char x , int y){        //Constructeur lettre et chiffre
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

    public boolean equals(Position pos){
        if(this.x == pos.x && this.y == pos.y){
            return true ;
        }
        else{
            return false ;
        }
    }

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
    
    public void setX(int x){
        if (x >= 0 && x <= 8){
            this.x = x ;
        }
        else {
            System.out.println("Erreur de coordonnées de X.");
        }
    }

    public void setY(int y){
        if (y >= 0 && y <= 8){
            this.y = y ;
        }
        else {
            System.out.println("Erreur de coordonnées de Y.");
        }
    }

    public int getX(){
        return this.x ;
    }

    public int getY(){
        return this.y ;
    }
}