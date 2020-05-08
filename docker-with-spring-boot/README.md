This is simple project with spring boot and docker on java 8 docker image

Command to run docker image with port mapping as you localhost wont be able to access port directly until you map it.
docker run -p 8080:8080 <contianer-id>
