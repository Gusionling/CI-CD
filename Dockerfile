FROM bellsoft/liberica-openjdk-alpine:21
ARG JAR_FILE=build/libs/*.jar
ARG PROFILES
ARG ENV
# JAR_FILE 변수에 지정된 파일을 app.jar이름으로 컨테이너에 추가
COPY ${JAR_FILE} app.jar
#컨테이너가 실행될 때 기본적으로 실행될 명령어를 설정 , 이 경우에는 java 애플리케이션을 실행하는 명령어
ENTRYPOINT ["java","-Dspring.profiles.active=${PROFILES}","-Dserver.env=${ENV}","-jar", "app.jar"]