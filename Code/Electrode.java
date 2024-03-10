class Electrode extends Pokemon{
public Electrode(){
super(101,"Electrode",Type.ELECTRIK,Type.SANS,60,50,70,140);
}
public Electrode(String nom){
super(101,nom,Type.ELECTRIK,Type.SANS,60,50,70,140);
}
public String getEspece() {
return "Electrode";
}
public int getNumero() {
return 101;
}
}
