find . -name '*.txt' | xargs -n 1 tail -5 | cat >> allmixedLast5.txt
