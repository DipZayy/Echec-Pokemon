class Insecateur extends Pokemon{
public Insecateur(){
super(123,"Insecateur",Type.INSECTE,Type.VOL,70,110,80,105);
}
public Insecateur(String nom){
super(123,nom,Type.INSECTE,Type.VOL,70,110,80,105);
}
public String getEspece() {
return "Insecateur";
}
}
