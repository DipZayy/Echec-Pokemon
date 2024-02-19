class Parasect extends Pokemon{
public Parasect(){
super(47,"Parasect",Type.INSECTE,Type.PLANTE,60,95,80,30);
}
public Parasect(String nom){
super(47,nom,Type.INSECTE,Type.PLANTE,60,95,80,30);
}
public String getEspece() {
return "Parasect";
}
}
