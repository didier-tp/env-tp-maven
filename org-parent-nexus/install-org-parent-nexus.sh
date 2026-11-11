#cd ../org-parent-nexus

# installation de la configuration du projet parent "org-parent-nexus" dans .m2/repository
# de facon a ce que cette config soit accessible (par heritage) depuis les autres projets de la meme machine
mvn install   #  > ../mvn-scripts/res-build.txt

# deploiement de la configuration du projet parent "org-parent-nexus" vers nexus
# de facon a ce que cette config soit accessible (par heritage) depuis les autres projets d'autres machines de l'entreprise
#mvn deploy   # >../mvn-scripts/res-build.txt

echo "fin?" ; read fin
