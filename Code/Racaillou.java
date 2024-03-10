class Racaillou extends Pokemon{
public Racaillou(){
super(74,"Racaillou",Type.ROCHE,Type.SOL,40,80,100,20);
}
public Racaillou(String nom){
super(74,nom,Type.ROCHE,Type.SOL,40,80,100,20);
}
public String getEspece() {
return "Racaillou";
}
public int getNumero() {
return 74;
}
}
