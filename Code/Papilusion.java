class Papilusion extends Pokemon{
public Papilusion(){
super(12,"Papilusion",Type.INSECTE,Type.VOL,60,45,50,70);
}
public Papilusion(String nom){
super(12,nom,Type.INSECTE,Type.VOL,60,45,50,70);
}
public String getEspece() {
return "Papilusion";
}
public int getNumero() {
return 12;
}
}
