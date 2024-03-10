class Tauros extends Pokemon{
public Tauros(){
super(128,"Tauros",Type.NORMAL,Type.SANS,75,100,95,110);
}
public Tauros(String nom){
super(128,nom,Type.NORMAL,Type.SANS,75,100,95,110);
}
public String getEspece() {
return "Tauros";
}
public int getNumero() {
return 128;
}
}
