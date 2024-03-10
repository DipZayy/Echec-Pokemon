class Kabuto extends Pokemon{
public Kabuto(){
super(140,"Kabuto",Type.ROCHE,Type.EAU,30,80,90,55);
}
public Kabuto(String nom){
super(140,nom,Type.ROCHE,Type.EAU,30,80,90,55);
}
public String getEspece() {
return "Kabuto";
}
public int getNumero() {
return 140;
}
}
