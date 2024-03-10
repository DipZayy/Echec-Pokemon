class Dardargnan extends Pokemon{
public Dardargnan(){
super(15,"Dardargnan",Type.INSECTE,Type.POISON,65,80,40,75);
}
public Dardargnan(String nom){
super(15,nom,Type.INSECTE,Type.POISON,65,80,40,75);
}
public String getEspece() {
return "Dardargnan";
}
public int getNumero() {
return 15;
}
}
