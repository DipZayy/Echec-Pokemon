public class Main {
    public static void main(String[] args) {

        //Création des deux pokemon
        Lippoutou pokemon1 = new Lippoutou("pokemonB");
        Magneti pokemon2 = new Magneti("pokemonA");

        //Présentation des pokémons
        System.out.println("Voici les deux pokémons qui vont s'affronter :");
        System.out.println(pokemon1.toString());
        System.out.println(pokemon2.toString());

        //On lance le combat et on met le nom du gagant dans win
        String win = pokemon1.attaque(pokemon2);

        //Annonce du gagant
        System.out.println("C'est le pokemon " + win + " qui a gagné.");

        Plateau plat = new Plateau() ;
        System.out.println(plat);
        MainGraphique.affichage() ;
    }
}