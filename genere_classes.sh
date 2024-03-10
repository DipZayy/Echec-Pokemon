#!/bin/bash

fichierALire="pokedex_gen1.csv"

while read line
do
  numero=`echo $line | cut -d ";" -f 1`
  nom_original=`echo $line | cut -d ";" -f 2`
  nom=`echo $line | cut -d ";" -f 2`
  nom=`echo $nom | sed 's/é/e/g'`
  nom=`echo $nom | sed 's/è/e/g'`
  nom=`echo $nom | sed 's/É/E/g'`
  nom=`echo $nom | sed 's/ê/e/g'`
  nom=`echo $nom | sed 's/É/E/g'`
  nom=`echo $nom | sed 's/♀/F/g'`
  nom=`echo $nom | sed 's/♂/M/g'`
  nom=`echo $nom | sed 's/\. /_/g'`
  type1=$(echo "$line" | cut -d ";" -f 3 | tr '[:lower:]' '[:upper:]')
  type2=$(echo "$line" | cut -d ";" -f 4 | tr '[:lower:]' '[:upper:]')
  pv=`echo $line | cut -d ";" -f 5`
  force=`echo $line | cut -d ";" -f 6`
  defense=`echo $line | cut -d ";" -f 7`
  vitesse=`echo $line | cut -d ";" -f 8`

  echo "Traitement de "$nom_original". Création du fichier "$nom".java"

  if [ -z "$type2" ]; then
    type2="SANS"
  fi  
  
  fichierAEcrire=$nom".java"
  
  echo 'class '$nom' extends Pokemon{' >> $fichierAEcrire

  echo 'public '$nom'(){' >> $fichierAEcrire
  echo 'super('$numero',"'$nom'",Type.'$type1',Type.'$type2','$pv','$force','$defense','$vitesse');' >> $fichierAEcrire
  echo '}' >> $fichierAEcrire

  echo 'public '$nom'(String nom){' >> $fichierAEcrire
  echo 'super('$numero',nom,Type.'$type1',Type.'$type2','$pv','$force','$defense','$vitesse');' >> $fichierAEcrire
  echo '}' >> $fichierAEcrire

  echo 'public String getEspece() {' >> $fichierAEcrire
  echo 'return "'$nom'";' >> $fichierAEcrire
  echo '}' >> $fichierAEcrire
  
  echo 'public int getNumero() {' >> $fichierAEcrire
  echo 'return '$numero';' >> $fichierAEcrire
  echo '}' >> $fichierAEcrire

  echo '}' >> $fichierAEcrire

done < $fichierALire;
