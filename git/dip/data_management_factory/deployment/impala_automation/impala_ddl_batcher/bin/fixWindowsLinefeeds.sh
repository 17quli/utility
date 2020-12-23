# Converts file to linux format from windows format.
# This alters the line return characters at the end of each line
filename=$1

echo sed -ie 's///g/' ${filename}
