# jar-jar-spring

The main goal of **jar-jar-spring** is to set patterns to be easily implemented on Nodejs projects. **jar-jar-spring** is a starter Java 8 using Spring Framework template to implement an API. Check out the patterns we defined this document bellow. 

<p  align="center" style="padding:15px 0;">
	<img src="https://i.imgur.com/MOjyaDq.png" width="400px" />
  <br />
  Icon by <a href="https://dribbble.com/shots/551565-Star-Wars-Icons-1" target="_blank">Chad Landenberger</a>
</p>

*******
Table of contents 
 1. [How to get Started](#startup)
 2. [Gitflow recommendations](#gitflow)
 3. [Patterns and libs](#patterns)
 4. [Project structure](#projetcstructure)
 5. [Licence](#license)
*******

<div id='startup'/>

## :rocket: Startup

Step by step to get this up and running.

We recommend you to use [VS Code Editor](https://code.visualstudio.com) and [Java Extension Pack](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)

### Clone repo and go to project folder

```sh
$ git clone https://github.com/stanleygomes/jar-jar-spring.git && cd jar-jar-spring
```

### Install dependencies

via maven pom.xml `root of the repo`

### Start server

Use VS Code launch configuration. Press F5.

### Start database

Copy enviroment variables template

```sh
$ cp .env.template .env
```

Via docker-compose (start database, run migrations and start server)

```sh
$ docker-compose up
```

<div id='gitflow'/>

## :trident:  Git flow

To file a new a feature

- create a branch from `master` branch. Use the pattern: `feature/description`
- file a pull request on `master` branch
- since your PR is aproved, it will be merged to `master` branch
- in a moment in time we'll create a release, using the pattern: `release/vX.X.X`

<div id='patterns'/>

## :heavy_check_mark: Patterns

These are some of patterns definitions to help us to keep a default arquitecture.

- Package manager: [Apache Maven](http://maven.apache.org)
- Java Version (JRE): [1.8](https://www.oracle.com/java/technologies/javase-jre8-downloads.html)
- Java Framework: [Spring](https://spring.io/projects/spring-boot) framework
- Java server: [Apache Tomcat](http://tomcat.apache.org)
- Database persistence: [JPA](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#reference)
- Migrations: Run on a container described in docker-compose file: [boxfuse/flyway](https://hub.docker.com/r/boxfuse/flyway/dockerfile) image
- Template transpiler: [Mustache](https://mustache.github.io) templates
- Test: [JUnity](https://junit.org)
- Docker compose and dockerfile attached running migrations e starting database and nodejs

<div id='projetcstructure'/>

## :open_file_folder: Project structure

Basic folder structure (MVC)

- **src.main.java.com.jarjarspring.app.controller**: Endpoints layer
- **src.main.java.com.jarjarspring.app.service**: Business logic layer
- **src.main.java.com.jarjarspring.app.model**: Model concept layer
- **src.main.java.com.jarjarspring.app.repository**: JPA repository layer
- **src.main.resources.static**: Images, styles, fonts and other files that can be served
- **src.main.resources.template**: mustache interpreted files
- **src.test.java.com.jarjarspring.app.test**: Junity tests

<div id='license'/>

## :scroll: License 

```
MIT license. Copyright (c) 2020 Marco Túlio Melo.
For more information, see the LICENSE file.
```
