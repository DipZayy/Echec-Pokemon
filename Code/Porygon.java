class Porygon extends Pokemon{
public Porygon(){
super(137,"Porygon",Type.NORMAL,Type.SANS,65,60,70,40);
}
public Porygon(String nom){
super(137,nom,Type.NORMAL,Type.SANS,65,60,70,40);
}
public String getEspece() {
return "Porygon";
}
public int getNumero() {
return 137;
}
}
