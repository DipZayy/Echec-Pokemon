class Alakazam extends Pokemon{
public Alakazam(){
super(65,"Alakazam",Type.PSY,Type.SANS,55,50,45,120);
}
public Alakazam(String nom){
super(65,nom,Type.PSY,Type.SANS,55,50,45,120);
}
public String getEspece() {
return "Alakazam";
}
public int getNumero() {
return 65;
}
}
