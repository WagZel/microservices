FROM java:8-jre
MAINTAINER Ivan Zelinov <wag6051@gmail.com>

RUN mkdir /workdir
ADD build/distributions/registration-service.tar /workdir/
WORKDIR /workdir
CMD /bin/bash registration-service/bin/registration-service
EXPOSE 8761