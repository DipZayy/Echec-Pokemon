class Pikachu extends Pokemon{
public Pikachu(){
super(25,"Pikachu",Type.ELECTRIK,Type.SANS,35,55,30,90);
}
public Pikachu(String nom){
super(25,nom,Type.ELECTRIK,Type.SANS,35,55,30,90);
}
public String getEspece() {
return "Pikachu";
}
public int getNumero() {
return 25;
}
}
