class Raichu extends Pokemon{
public Raichu(){
super(26,"Raichu",Type.ELECTRIK,Type.SANS,60,90,55,100);
}
public Raichu(String nom){
super(26,nom,Type.ELECTRIK,Type.SANS,60,90,55,100);
}
public String getEspece() {
return "Raichu";
}
}
