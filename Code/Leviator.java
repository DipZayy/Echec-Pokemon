class Leviator extends Pokemon{
public Leviator(){
super(130,"Leviator",Type.EAU,Type.VOL,95,125,79,81);
}
public Leviator(String nom){
super(130,nom,Type.EAU,Type.VOL,95,125,79,81);
}
public String getEspece() {
return "Leviator";
}
public int getNumero() {
return 130;
}
}
