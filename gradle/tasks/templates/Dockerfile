FROM gradle:jdk11 as builder
WORKDIR /app
ADD ./settings.gradle .
ADD ./gradle ./gradle
ADD ./${serviceName} ./${serviceName}
WORKDIR ./${serviceName}
RUN gradle installDist --no-daemon

FROM openjdk:11-jre as run
COPY --from=builder /app/${serviceName}/build/install /app
ENTRYPOINT /app/${serviceName}/bin/${serviceName}
