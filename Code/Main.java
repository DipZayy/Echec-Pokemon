public class Main {
    public static void main(String[] args) {
        
        Plateau plateau = new Plateau();

        int auth = 1 ;
        int jeu = 0 ;

        MainGraphique affichage = new MainGraphique();

        affichage.choixJeu();

        //On attend que les joueurs choisissent le mode de jeu

        while (jeu == 0) {
            jeu = affichage.cliqueChoixJeu();
        }

        //On lance l'affichage en fonction du mode de jeu choisi

        if(jeu == 1){
            affichage.init(plateau);
            affichage.texture(plateau); 
        }

        //Cette boucle infini se charge des tours ( Qui dois jouer ) et se charge aussi de la fonction qui detecte les cliques

        while (true) {

            if(affichage.getProgress() != 2){
                affichage.clique(plateau,auth);
            }
            else{
                if(auth == 1){
                    auth = 2 ;
                }
                else{
                    auth = 1 ;
                }
                affichage.setAuth(auth);
            }
        }
    }
}