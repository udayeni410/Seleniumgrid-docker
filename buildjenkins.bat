call mvn clean test -DsuiteXmlFile=testng.xml
call mvn clean test -DsuiteXmlFile=testngfirefox.xml
call docker build -f DockerfileChrome .
call docker build -f DockerfileFirefox .