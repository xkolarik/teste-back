FROM java:8

MAINTAINER Paulo Kolarik

ADD /target/teste-back.jar teste-back.jar
ENTRYPOINT ["java","-jar", "teste-back.jar"]

