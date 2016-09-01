for x in *; 
do y=${x%.*}; 
z=${y##*/}; 
mkdir $z
mv $x $z/$x
done
