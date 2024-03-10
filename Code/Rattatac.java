class Rattatac extends Pokemon{
public Rattatac(){
super(20,"Rattatac",Type.NORMAL,Type.SANS,55,81,60,97);
}
public Rattatac(String nom){
super(20,nom,Type.NORMAL,Type.SANS,55,81,60,97);
}
public String getEspece() {
return "Rattatac";
}
public int getNumero() {
return 20;
}
}
