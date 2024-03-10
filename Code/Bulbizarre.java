class Bulbizarre extends Pokemon{
public Bulbizarre(){
super(1,"Bulbizarre",Type.PLANTE,Type.POISON,45,49,49,45);
}
public Bulbizarre(String nom){
super(1,nom,Type.PLANTE,Type.POISON,45,49,49,45);
}
public String getEspece() {
return "Bulbizarre";
}
public int getNumero() {
return 1;
}
}
