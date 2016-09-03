for i in `find . -type f`
	do 
	mv "$i" "`(echo $i | tr '[a-z]' '[A-Z]')`"
	done
