class Herbizarre extends Pokemon{
public Herbizarre(){
super(2,"Herbizarre",Type.PLANTE,Type.POISON,60,62,63,60);
}
public Herbizarre(String nom){
super(2,nom,Type.PLANTE,Type.POISON,60,62,63,60);
}
public String getEspece() {
return "Herbizarre";
}
public int getNumero() {
return 2;
}
}
