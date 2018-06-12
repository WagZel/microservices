FROM java:8-jre
MAINTAINER Ivan Zelinov <wag6051@gmail.com>

RUN mkdir /workdir
ADD build/distributions/hello-service.tar /workdir/
WORKDIR /workdir
CMD /bin/bash hello-service/bin/hello-service
EXPOSE 1002