> SpringBoot 웹 애플리케이션을 DockerFile을 통해 이미지로 만든다.
>
> 해당 이미지를 DockerHub에 Push한다.

## DockerFile
* `이미지 생성 과정을 기술`한 Docker 전용 DSL

***

## 1. DockerFile 생성

> 코드 

```dockerfile
FROM openjdk:8

VOLUME /tmp

EXPOSE 8080

ARG JAR_FILE=target/*.jar

ADD ${JAR_FILE} spring-docker.jar

ENTRYPOINT ["java","-jar","/spring-docker.jar"]
```

<br>

> 참고
* https://docs.docker.com/engine/reference/builder/
* https://shmoon.tistory.com/8
* https://imasoftwareengineer.tistory.com/40
  

***

## 2. DockerFile 빌드(이미지로 만든다)
```linux
docker build -f Dockerfile -t iyoungman/spring-docker-example .
```

* -f 옵션
  * 도커파일 이름 지정

* -t 옵션
  * 생성할 이미지 이름
  * DockerHub에 이미지를 올리려면 이미지 이름을<br>
  `<DockerHub 사용자 계정>/<이미지 이름>:<태그>` 형식으로 생성해야한다.
  * 태그는 지정하지 않으면 latest


***

## 3. DockerFile을 DockerHub에 올린다
> docker login  
* 로그인

<br>

> docker push 이미지 이름
>
> docker push iyoungman/spring-docker-example:latest  
* DockerHub에 해당 저장소가 없다면 자동 생성

* My DockerHub
  * https://hub.docker.com/repository/docker/iyoungman/spring-docker-example

* 참고
  * http://pyrasis.com/book/DockerForTheReallyImpatient/Chapter13/02
