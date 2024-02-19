class Ectoplasma extends Pokemon{
public Ectoplasma(){
super(94,"Ectoplasma",Type.SPECTRE,Type.POISON,60,65,60,110);
}
public Ectoplasma(String nom){
super(94,nom,Type.SPECTRE,Type.POISON,60,65,60,110);
}
public String getEspece() {
return "Ectoplasma";
}
}
