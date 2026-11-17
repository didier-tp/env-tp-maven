REM start/run app via spring-boot-devtools AND spring-boot-maven-plugin
REM mvn spring-boot:run -Dspring.profiles.active=persistence-dev,persistence-reinit
REM mvn spring-boot:start may be stop by mvn spring-boot:stop
mvn spring-boot:start -Dspring.profiles.active=persistence-dev,persistence-reinit
pause
