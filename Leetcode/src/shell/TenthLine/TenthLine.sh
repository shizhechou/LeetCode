# Read from the file file.txt and output the tenth line to stdout.
# Solution 1
awk 'NR == 10' file.txt
# Solution 2
sed -n '10p' file.txt
# Solution 3
tail -n+10 file.txt | head -1