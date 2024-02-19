class Rhinocorne extends Pokemon{
public Rhinocorne(){
super(111,"Rhinocorne",Type.SOL,Type.ROCHE,80,85,95,25);
}
public Rhinocorne(String nom){
super(111,nom,Type.SOL,Type.ROCHE,80,85,95,25);
}
public String getEspece() {
return "Rhinocorne";
}
}
