FROM gradle:jdk11 as builder
WORKDIR /app
ADD ./settings.gradle .
ADD ./gradle ./gradle
ADD ./article ./article
WORKDIR ./article
RUN gradle installDist --no-daemon

FROM openjdk:11-jre as run
COPY --from=builder /app/article/build/install /app
ENTRYPOINT /app/article/bin/article
