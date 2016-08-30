echo -n "Enter the file name: "
read name
cat $filename < $name | xargs -n1 | sort | uniq -c
