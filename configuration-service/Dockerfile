FROM java:8-jre
MAINTAINER Ivan Zelinov <wag6051@gmail.com>

RUN mkdir /workdir
ADD build/distributions/configuration-service.tar /workdir/
WORKDIR /workdir
CMD /bin/bash configuration-service/bin/configuration-service
EXPOSE 1000