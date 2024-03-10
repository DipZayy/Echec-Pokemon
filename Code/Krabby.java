class Krabby extends Pokemon{
public Krabby(){
super(98,"Krabby",Type.EAU,Type.SANS,30,105,90,50);
}
public Krabby(String nom){
super(98,nom,Type.EAU,Type.SANS,30,105,90,50);
}
public String getEspece() {
return "Krabby";
}
public int getNumero() {
return 98;
}
}
