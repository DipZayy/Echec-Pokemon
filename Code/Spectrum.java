class Spectrum extends Pokemon{
public Spectrum(){
super(93,"Spectrum",Type.SPECTRE,Type.POISON,45,50,45,95);
}
public Spectrum(String nom){
super(93,nom,Type.SPECTRE,Type.POISON,45,50,45,95);
}
public String getEspece() {
return "Spectrum";
}
public int getNumero() {
return 93;
}
}
