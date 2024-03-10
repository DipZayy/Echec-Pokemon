class Grolem extends Pokemon{
public Grolem(){
super(76,"Grolem",Type.ROCHE,Type.SOL,80,110,130,45);
}
public Grolem(String nom){
super(76,nom,Type.ROCHE,Type.SOL,80,110,130,45);
}
public String getEspece() {
return "Grolem";
}
public int getNumero() {
return 76;
}
}
