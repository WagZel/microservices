FROM java:8-jre
MAINTAINER Ivan Zelinov <wag6051@gmail.com>

RUN mkdir /workdir
ADD build/distributions/authorization-service.tar /workdir/
WORKDIR /workdir
CMD /bin/bash authorization-service/bin/authorization-service
EXPOSE 1001