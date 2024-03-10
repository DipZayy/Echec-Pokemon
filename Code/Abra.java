class Abra extends Pokemon{
public Abra(){
super(63,"Abra",Type.PSY,Type.SANS,25,20,15,90);
}
public Abra(String nom){
super(63,nom,Type.PSY,Type.SANS,25,20,15,90);
}
public String getEspece() {
return "Abra";
}
public int getNumero() {
return 63;
}
}
