class Rhinoferos extends Pokemon{
public Rhinoferos(){
super(112,"Rhinoferos",Type.SOL,Type.ROCHE,105,130,120,40);
}
public Rhinoferos(String nom){
super(112,nom,Type.SOL,Type.ROCHE,105,130,120,40);
}
public String getEspece() {
return "Rhinoferos";
}
public int getNumero() {
return 112;
}
}
