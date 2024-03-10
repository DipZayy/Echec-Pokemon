class Aeromite extends Pokemon{
public Aeromite(){
super(49,"Aeromite",Type.INSECTE,Type.POISON,70,65,60,90);
}
public Aeromite(String nom){
super(49,nom,Type.INSECTE,Type.POISON,70,65,60,90);
}
public String getEspece() {
return "Aeromite";
}
public int getNumero() {
return 49;
}
}
