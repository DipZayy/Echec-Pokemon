import MG2D.*;
import MG2D.geometrie.*;

public class MainGraphique {
    public static void affichage(){

        Fenetre f = new Fenetre("Jeu d'échecs", 900, 900);
        Carre case1 = new Carre(Couleur.GRIS,new Point(0,800),100,true);
        f.ajouter(case1);
        f.rafraichir();
    }   
}