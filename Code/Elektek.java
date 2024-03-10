class Elektek extends Pokemon{
public Elektek(){
super(125,"Elektek",Type.ELECTRIK,Type.SANS,65,83,57,105);
}
public Elektek(String nom){
super(125,nom,Type.ELECTRIK,Type.SANS,65,83,57,105);
}
public String getEspece() {
return "Elektek";
}
public int getNumero() {
return 125;
}
}
