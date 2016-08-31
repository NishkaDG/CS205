find . -name '*.txt' | xargs -n 1 grep -ci "the" | awk '{ SUM += $1; print $1} END { print SUM }'
