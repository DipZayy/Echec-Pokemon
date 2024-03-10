class Kadabra extends Pokemon{
public Kadabra(){
super(64,"Kadabra",Type.PSY,Type.SANS,40,35,30,105);
}
public Kadabra(String nom){
super(64,nom,Type.PSY,Type.SANS,40,35,30,105);
}
public String getEspece() {
return "Kadabra";
}
public int getNumero() {
return 64;
}
}
