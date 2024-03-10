class Caninos extends Pokemon{
public Caninos(){
super(58,"Caninos",Type.FEU,Type.SANS,55,70,45,60);
}
public Caninos(String nom){
super(58,nom,Type.FEU,Type.SANS,55,70,45,60);
}
public String getEspece() {
return "Caninos";
}
public int getNumero() {
return 58;
}
}
