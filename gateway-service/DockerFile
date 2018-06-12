FROM java:8-jre
MAINTAINER Ivan Zelinov <wag6051@gmail.com>

RUN mkdir /workdir
ADD build/distributions/gateway-service.tar /workdir/
WORKDIR /workdir
CMD /bin/bash gateway-service/bin/gateway-service
EXPOSE 8080