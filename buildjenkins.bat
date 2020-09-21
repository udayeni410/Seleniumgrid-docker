call mvn clean test -DsuiteXmlFile=testng.xml
call mvn clean test -DsuiteXmlFile=testngfirefox.xml
call docker build -f DockerfileChrome . -t=image1
call docker build -f DockerfileFirefox . -t=image2