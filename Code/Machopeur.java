class Machopeur extends Pokemon{
public Machopeur(){
super(67,"Machopeur",Type.COMBAT,Type.SANS,80,100,70,45);
}
public Machopeur(String nom){
super(67,nom,Type.COMBAT,Type.SANS,80,100,70,45);
}
public String getEspece() {
return "Machopeur";
}
public int getNumero() {
return 67;
}
}
