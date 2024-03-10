class Magneti extends Pokemon{
public Magneti(){
super(81,"Magneti",Type.ELECTRIK,Type.SANS,25,35,70,45);
}
public Magneti(String nom){
super(81,nom,Type.ELECTRIK,Type.SANS,25,35,70,45);
}
public String getEspece() {
return "Magneti";
}
public int getNumero() {
return 81;
}
}
