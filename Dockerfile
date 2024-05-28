# 使用官方的 Gradle 镜像作为构建镜像
FROM gradle:8.7.0-jdk17 AS build

# 设置工作目录
WORKDIR /app

# 将项目的 Gradle 文件和源代码复制到工作目录
COPY --chown=gradle:gradle build.gradle settings.gradle /app/
COPY --chown=gradle:gradle src /app/src

# 运行 Gradle 构建项目
RUN gradle build --no-daemon

# 使用官方的 OpenJDK 运行时镜像
FROM openjdk:17-jdk-slim

# 设置工作目录
WORKDIR /app

# 将构建好的 JAR 文件从构建镜像中复制到运行时镜像
COPY --from=build /app/build/libs/JavaDocker-0.0.1-SNAPSHOT.jar app.jar

# 启动 Spring Boot 应用
ENTRYPOINT ["java", "-jar", "app.jar"]
