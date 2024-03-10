class Florizarre extends Pokemon{
public Florizarre(){
super(3,"Florizarre",Type.PLANTE,Type.POISON,80,82,83,80);
}
public Florizarre(String nom){
super(3,nom,Type.PLANTE,Type.POISON,80,82,83,80);
}
public String getEspece() {
return "Florizarre";
}
public int getNumero() {
return 3;
}
}
