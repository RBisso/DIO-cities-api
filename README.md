# Cities-API

This project is part of the [Digital Innovation One](https://web.digitalinnovation.one) platform where the Quality Assurance Bootcamp was delivered by Everis.

This projects was built using [SpringBoot](https://start.spring.io).
Requirements for this project are: 
* Srping Web
* Spring Data JPA
* PostgreSQL Driver


I used vscode to wirte de source code, and in order to run the project, command-line tools. You can find a guide [here](https://spring.io/guides/gs/gradle).


This project is no diferent from what was presented during the bootcamp. However, I used this project to learn more about Java and Spring, since its my first real project with the language other than a few homeworks and little projects during college. Not only I learned more about Java and Spring, but how to use Gradle via the terminal, using online guides and the documentation.


# Notes (outside DIO)
In order to populate the database I used a project that have all countries with BACEN code and all states and cities of Brazil, that you can finde [here](https://github.com/chinnonsantos/sql-paises-estados-cidades).

The DBSM that was used in this project is a PostgreSQL running on a [docker container](https://hub.docker.com/_/postgres). The extensions ```cube``` and ```earthdistance``` were used to calculate the distance between cities in miles and meters. The following commands are used to run and populate the database:

```shell
docker run --name cities-db -d -p 5432:5432 -e POSTGRES_USER=postgres_user_city -e POSTGRES_PASSWORD=super_password -e POSTGRES_DB=cities postgres

docker run -it --rm --net=host -v $PWD:/tmp postgres /bin/bash

psql -h localhost -U postgres_user_city cities -f /tmp/pais.sql
psql -h localhost -U postgres_user_city cities -f /tmp/estado.sql
psql -h localhost -U postgres_user_city cities -f /tmp/cidade.sql

psql -h localhost -U postgres_user_city cities

CREATE EXTENSION cube; 
CREATE EXTENSION earthdistance;
```
The file ```docker-run.sh``` contains the first command in order to run the container.

To build the project using Gradle:
```shell
./gradlew build
```

And to run locally:
```shell
./gradlew bootRun
```
