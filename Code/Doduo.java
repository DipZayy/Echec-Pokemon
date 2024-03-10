class Doduo extends Pokemon{
public Doduo(){
super(84,"Doduo",Type.NORMAL,Type.VOL,35,85,45,75);
}
public Doduo(String nom){
super(84,nom,Type.NORMAL,Type.VOL,35,85,45,75);
}
public String getEspece() {
return "Doduo";
}
public int getNumero() {
return 84;
}
}
