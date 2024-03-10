class Ponyta extends Pokemon{
public Ponyta(){
super(77,"Ponyta",Type.FEU,Type.SANS,50,85,55,90);
}
public Ponyta(String nom){
super(77,nom,Type.FEU,Type.SANS,50,85,55,90);
}
public String getEspece() {
return "Ponyta";
}
public int getNumero() {
return 77;
}
}
