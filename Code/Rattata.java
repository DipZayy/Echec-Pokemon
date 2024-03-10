class Rattata extends Pokemon{
public Rattata(){
super(19,"Rattata",Type.NORMAL,Type.SANS,30,56,35,72);
}
public Rattata(String nom){
super(19,nom,Type.NORMAL,Type.SANS,30,56,35,72);
}
public String getEspece() {
return "Rattata";
}
public int getNumero() {
return 19;
}
}
