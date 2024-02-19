class Ptera extends Pokemon{
public Ptera(){
super(142,"Ptera",Type.ROCHE,Type.VOL,80,105,65,130);
}
public Ptera(String nom){
super(142,nom,Type.ROCHE,Type.VOL,80,105,65,130);
}
public String getEspece() {
return "Ptera";
}
}
