1) se placer dans le projet modèle "simple-springboot-app"
2) comprendre sa structure , lancer test et application (idéalement via un IDE)
3a) arrêter l'IDE et lancer une console de commandes dans le répertoire simple-springboot-app
3b) lancer mvn clean
3c) supprimer tous les fichiers pas indispensables (.idea  , .mvn , .git …) de eclipse/intellij/git/….
4) lancer mvn archetype:create-from-project
   si erreur de type manque settings.xml 
   alors créer ou ajuster dans $HOME/.m2 un fichier settings.xml comportant un repository d'id "archetype"
   ------------
   <settings>

      <repositories>
        <repository>
          <id>archetype</id><!-- id expected by maven-archetype-plugin to avoid fetching from everywhere -->
          <url>file:///c:\temp\repo</url>
          <releases>
            <enabled>true</enabled>
            <checksumPolicy>fail</checksumPolicy>
          </releases>
          <snapshots>
            <enabled>true</enabled>
            <checksumPolicy>warn</checksumPolicy>
          </snapshots>
        </repository>
      </repositories>

  </settings>
   ------------
5) visualiser l'archetype construit dans simple-springboot-app/target\generated-sources\archetype
6) recopier le code généré (dans simple-springboot-app/target\generated-sources\archetype)
   dans un nouveau projet de nom "my-sb-archetype" par exemple en prenant soin de renommer artifactId et name dans pom.xml
7)  lancer une console de commandes dans le répertoire my-sb-archetype et lancer mvn install (ou éventuellement mvn deploy si c'est possible)
   et visualiser l'archetype installé dans le référentiel maven local
