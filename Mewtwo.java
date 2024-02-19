class Mewtwo extends Pokemon{
public Mewtwo(){
super(150,"Mewtwo",Type.PSY,Type.SANS,106,110,90,130);
}
public Mewtwo(String nom){
super(150,nom,Type.PSY,Type.SANS,106,110,90,130);
}
public String getEspece() {
return "Mewtwo";
}
}
