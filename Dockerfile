FROM ubuntu:latest
LABEL authors="eurdr"

ENTRYPOINT ["top", "-b"]