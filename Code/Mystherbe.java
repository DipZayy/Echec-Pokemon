class Mystherbe extends Pokemon{
public Mystherbe(){
super(43,"Mystherbe",Type.PLANTE,Type.POISON,45,50,55,30);
}
public Mystherbe(String nom){
super(43,nom,Type.PLANTE,Type.POISON,45,50,55,30);
}
public String getEspece() {
return "Mystherbe";
}
public int getNumero() {
return 43;
}
}
