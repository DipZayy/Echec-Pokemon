import java.util.ArrayList;

import MG2D.*;
import MG2D.geometrie.*;

public class MainGraphique {

    private Fenetre f = new Fenetre("Pokémon Chess", 900, 1000);
    private Souris s = f.getSouris();

    private ArrayList<Cercle> cercles = new ArrayList<Cercle>();
    private ArrayList<Texture> imagePokemon = new ArrayList<Texture>();
    private ArrayList<Texte> textePv = new ArrayList<Texte>();

    private Piece copie = new Piece();
    private Piece copie2 = new Piece();

    private java.awt.Font maPolice = new java.awt.Font("Arial", java.awt.Font.PLAIN, 20);

    private boolean selection = false ;

    private int progress = 0;

    private Rectangle rect = new Rectangle(new Point(0,900),new Point(900,1000),true);
    private Texte tour = new Texte("Au tour des rouges.",maPolice,new Point(450,950));

    //Cette fonction affiche le choix du mode de jeu

    public void choixJeu(){

        Texte nom = new Texte("Jeu d'échec avec des Pokémons :",maPolice,new Point(450,900));
        f.ajouter(nom);

        Texte consigne = new Texte("Choisissez votre mode de jeu :",maPolice,new Point(450,800));
        f.ajouter(consigne);


        Rectangle rect1 = new Rectangle(new Point(150,400), new Point(440,600));
        f.ajouter(rect1);

        rect1.setPlein(true);
        rect1.setCouleur(Couleur.BLEU);

        Texte choix1 = new Texte("Sans choix des pokémons.",maPolice,new Point(295,500));
        f.ajouter(choix1);


        Rectangle rect2 = new Rectangle(new Point(460,400), new Point(750,600));
        f.ajouter(rect2);

        rect2.setPlein(true);
        rect2.setCouleur(Couleur.ROUGE);

        Texte choix2 = new Texte("Avec choix des pokémons.",maPolice,new Point(605,525));
        f.ajouter(choix2);

        Texte erreur = new Texte("Bientot.",maPolice,new Point(605,475));
        f.ajouter(erreur);


        Texte credit1 = new Texte("Projet universitaire - 2023/2024",maPolice,new Point(450,200));
        f.ajouter(credit1);

        Texte credit2 = new Texte("Louis Prévost.",maPolice,new Point(450,100));
        f.ajouter(credit2);

        f.rafraichir();
    }

    //Detection du clique pour savoir quelle mode de jeu est choisi

    public int cliqueChoixJeu(){

        try {
            Thread.sleep(40);
        }
        catch (InterruptedException ie) {}

        if (s.getClicDroit()) {

            if(s.getPosition().getX() >= 150 && s.getPosition().getX() <= 440){

                if(s.getPosition().getY() >= 400 && s.getPosition().getY() <= 600){
                    return 1 ;
                }
            }
        }
        return 0 ;
    }

    //Cette fonction initialise les cases du plateau ainsi que la bande d'information en haut

    public void init(Plateau plat){

        f.effacer();

        rect.setCouleur(Couleur.ROUGE);
        tour.setCouleur(Couleur.NOIR);

        f.ajouter(rect);
        f.ajouter(tour);

        int couleur = 0 ;

        for(int i = 0 ; i <= 8 ; i++){

            for(int j = 0 ; j <= 8 ; j++){

                int x = i * 100 ;
                int y = j * 100 ;

                if(couleur % 2 == 0){
                    Carre carreGris = new Carre(Couleur.GRIS,new Point(x,y),100,true);
                    f.ajouter(carreGris);
                }
                else{
                    Carre carreGrisClair = new Carre(Couleur.GRIS_CLAIR,new Point(x,y),100,true);
                    f.ajouter(carreGrisClair);
                }
                couleur++; 
            }
        }
        f.rafraichir();
    }   

    //Cette fonction initialise toute les images de pokémon et leurs PV

    public void texture(Plateau plat){

        for(int i = 0 ; i <= 8 ; i++){

            for(int j = 0 ; j <= 8 ; j++){

                Piece pieceCopie = new Piece();
                pieceCopie = plat.getCase(i,j);

                if(pieceCopie != null) {
                    Position positionCopie = new Position();
                    positionCopie = pieceCopie.getPosition();
                
                    int x = positionCopie.getX() * 100;
                    int y = positionCopie.getY() * 100;

                    int numPoke = pieceCopie.getPokemon().getNumero();
                    int index = 0 ;


                    String chemin = new String("images/"+numPoke+".png");

                    Texture imagePoke = new Texture(chemin,new Point(x,y),100,100);

                    f.ajouter(imagePoke);
                    imagePokemon.add(index,imagePoke);

                    String pv = new String(String.valueOf(pieceCopie.getPokemon().getPV()));

                    Texte pvPoke = new Texte(pv,maPolice,new Point(x+20,y+15));

                    f.ajouter(pvPoke);
                    textePv.add(index,pvPoke);

                    index++;

                    if(pieceCopie.getPlayer() == 1){
                        pvPoke.setCouleur(Couleur.ROUGE);
                    }
                    else{
                        pvPoke.setCouleur(Couleur.BLEU);
                    }
                }
            }
        }
    f.rafraichir();
    }

    //Cette fonction permet de gérer les cliques droit et toutes les interactions possibles

    public void clique(Plateau plat , int auth){

        try {
            Thread.sleep(40);
        }
        catch (InterruptedException ie) {}

        if (s.getClicDroit()) {

            //On supprime les anciens cercle s'il y en a

            for (Cercle cercle : cercles) {
                if (cercle instanceof Cercle) {
                    f.supprimer(cercle);
                }
            }

            cercles.clear();

            //Permet de ne garder que les centaines dans les coordonnées du clique ( 729 devient 700)
           
            int monX = (s.getPosition().getX() % 1000) - (s.getPosition().getX() % 100);
            int monY = (s.getPosition().getY() % 1000) - (s.getPosition().getY() % 100);

            Position pos = new Position(monX/100,monY/100);                                 

            //Si je clique sur une de mes pièces

            if(plat.getCase(pos) != null && plat.getCase(pos).getPlayer() == auth){
                affichageCercle(plat, pos);
                progress = 1 ;
            } 

            //Si je clique sur un pokémon adverse après avoir cliqué sur un des miens

            if(plat.getCase(pos) != null && plat.getCase(pos).getPlayer() != auth && selection == true){
                combat(plat,pos);
                progress = 2 ;
            }

            //Si je clique sur une case vide après avec selectionné une de mes pieces.

            if(plat.getCase(pos) == null && selection == true ){
                move(plat,pos);
                progress = 2 ;
            }

            //On verifie si aucun des deux joueurs n'a perdu

            if(plat.getPiecesJoueur1().isEmpty()){
                end(1);
            }

            if(plat.getPiecesJoueur2().isEmpty()){
                end(2);
            }
        }      
    }

    //Cette fonction permet d'afficher les cercle autour de la pièce sur laquelle on vient de cliquer 

    public void affichageCercle(Plateau plat , Position pos){
        copie = plat.getCase(pos);

        int taille = copie.getDeplacementPossible(plat).size();
        int index = 0 ;

        for(int i = 0 ; i < taille ; i++){
            Position nouveauCercle = new Position(copie.getDeplacementPossible(plat).get(i));

            Cercle tour = new Cercle(new Point((nouveauCercle.getX()*100)+50,(nouveauCercle.getY()*100)+50),50,false);
            f.ajouter(tour);

            cercles.add(index,tour);
            index++;
        }

        taille = copie.getAttaquePossible(plat).size();
        index = 0 ;

        for(int i = 0 ; i < taille ; i++){
            Position nouveauCercle = new Position(copie.getAttaquePossible(plat).get(i));

            Cercle tour = new Cercle(Couleur.ROUGE,new Point((nouveauCercle.getX()*100)+50,(nouveauCercle.getY()*100)+50),50,false);
            f.ajouter(tour);

            cercles.add(index,tour);
            index++;
        }

        selection = true ;

        f.rafraichir();
    }

    //Cette fonction permet de supprimer complétement un pokémon

    public void remove(Plateau plat , Piece piece){

        plat.suppr(piece);

        Position pos = new Position(piece.getPosition());
        Point point = new Point(pos.getX(),pos.getY());

        for(int i = 0 ; i <  imagePokemon.size() ; i++){
                    
            Point coTexture = new Point(imagePokemon.get(i).getA().getX()/100,imagePokemon.get(i).getA().getY()/100);

            if(coTexture.equals(point)){

                f.supprimer(imagePokemon.get(i));
                imagePokemon.remove(i);

                f.supprimer(textePv.get(i));
                textePv.remove(i);

                f.rafraichir();  
            }
        }
    }

    //Cette fonction est le combat entre deux pokémon

    public void combat(Plateau plat , Position pos){
        Boolean possible = false ;

        for(int i = 0 ; i < copie.getAttaquePossible(plat).size() ; i++){    //verification si la case choisi est disponible
            if(pos.equals(copie.getAttaquePossible(plat).get(i))){
                possible = true ;
            }
        }

        if(possible == true){
            copie2 = plat.getCase(pos);

            int win = copie.getPokemon().attaque(copie2.getPokemon());

            if(win == 2){
                remove(plat , copie);
                actuPv(copie2);
            }
            if(win == 1){
                remove(plat , copie2);
                move(plat,pos);
            }

            selection = false ;
        }
    }

    //Cette fonction permet d'actualiser les pv d'un pokémon qui ne bouge pas 

    public void actuPv(Piece piece){
        Position pos = new Position(piece.getPosition());
        Point point = new Point(pos.getX(),pos.getY());

        Point nouveauPoint = new Point((pos.getX()*100)+20,(pos.getY()*100)+15);

        for(int i = 0 ; i <  imagePokemon.size() ; i++){
                    
            Point coTexture = new Point(imagePokemon.get(i).getA().getX()/100,imagePokemon.get(i).getA().getY()/100);

            if(coTexture.equals(point)){
                f.supprimer(textePv.get(i));
                Couleur color = new Couleur(textePv.get(i).getCouleur());
                textePv.remove(i);

                String pv = new String(String.valueOf(piece.getPokemon().getPV()));
                Texte pvPoke = new Texte(pv,maPolice,nouveauPoint);
                pvPoke.setCouleur(color);

                textePv.add(textePv.size(),pvPoke);

                f.ajouter(pvPoke);
                f.rafraichir();  
            }
        }
    }

    //Cette fonction sert a bouger une seule pièce + actualiser les textures.

    public void move(Plateau plat , Position pos){
        boolean possible = false ;

        for(int i = 0 ; i < copie.getDeplacementPossible(plat).size() ; i++){    //verification si la case choisi est disponible
            if(pos.equals(copie.getDeplacementPossible(plat).get(i))){
                possible = true ;
            }
        }

        if(possible == true){
            Point ancienPoint = new Point(copie.getPosition().getX(),copie.getPosition().getY());
            Point nouveauPoint = new Point(pos.getX()*100,pos.getY()*100);

            Point nouveauPointTexte = new Point();

            nouveauPointTexte.setX(nouveauPoint.getX()+20);
            nouveauPointTexte.setY(nouveauPoint.getY()+15);

            plat.changement(copie, pos);

            for(int i = 0 ; i <  imagePokemon.size() ; i++){
            
                Point coTexture = new Point(imagePokemon.get(i).getA().getX()/100,imagePokemon.get(i).getA().getY()/100);

                if(coTexture.equals(ancienPoint)){
                    f.supprimer(imagePokemon.get(i));
                    imagePokemon.remove(i);

                    f.supprimer(textePv.get(i));
                    Couleur color = new Couleur(textePv.get(i).getCouleur());
                    textePv.remove(i);

                    int numPoke = copie.getPokemon().getNumero();

                    String chemin = new String("images/"+numPoke+".png");
                    Texture imagePoke = new Texture(chemin,nouveauPoint,100,100);

                    imagePokemon.add(imagePokemon.size(),imagePoke);

                    String pv = new String(String.valueOf(copie.getPokemon().getPV()));
                    Texte pvPoke = new Texte(pv,maPolice,nouveauPointTexte);
                    pvPoke.setCouleur(color);

                    textePv.add(textePv.size(),pvPoke);

                    f.ajouter(imagePoke);
                    f.ajouter(pvPoke);
                    f.rafraichir();  
                }
            }
        }
        selection = false ;
    }

    //Cette fonction est utilisé quand un joueur a perdu et modifie l'affichage en circonstance

    public void end(int perdant){

        if(perdant == 2){
            f.effacer();

            f.setBackground(Couleur.ROUGE);

            Texte victoire = new Texte("Victoire des rouges !!",maPolice,new Point(450,500));
            f.ajouter(victoire);

            f.rafraichir();
        }
        else{
            f.effacer();

            f.setBackground(Couleur.BLEU);

            Texte victoire = new Texte("Victoire des bleus !!",maPolice,new Point(450,500));
            f.ajouter(victoire);

            f.rafraichir();
        }
    }

    //Cette partie retourne la progression du joueur actuel (auth)

    public int getProgress(){
        return progress ;
    }

    //Cette fonction modifie l'affichage du haut avec le joueur qui doit jouer

    public void setAuth(int auth){
        progress = 0 ;

        if(auth == 1){
            rect.setCouleur(Couleur.ROUGE);
            tour.setTexte("Au tour des rouges.");
        }
        else{
            rect.setCouleur(Couleur.BLEU);
            tour.setTexte("Au tour des bleus.");
        }
    }
}