# Damn Vulnerable Java Application

> Forked from: https://github.com/appsecco/dvja

This intentional vulnerable web application is developed using Java and popular libraries for Java web application
development such as Struts2, Spring, Hibernate etc. The web application in our context is primarily used 
for the following purpose:

* Use OWASP Top 10 vulnerabilities as an example to demonstrate scanning with SemGrep
* Baseline to understand SemGrep and master the CLI
* Learn how to write custom rules for SemGrep
* Understand taint analysis and taint mode in SemGrep

## Requirements

**We focus on scanning the codebase using SemGrep!**

Clone this repository and Install [SemGrep CLI](https://semgrep.dev/docs/getting-started/installation) you 
are not required to install Java, Maven, MySQL Server, MySQL Workbench or run the docker-compose file. 

## SemGrep Slides
The companion Slidedeck [Semgrep - From Zero to Hero](https://github.com/Raccoon-gang/recon-dvja-semgrep-lab/blob/main/docs/SemGrep%20-%20From%20Zero%20to%20Hero.pdf) is also present in this repository if you like to revist some of the parts. 

## SemGrep Labs

You find the Labs for this training [here](https://github.com/Raccoon-gang/recon-dvja-semgrep-lab/wiki) in Lab 1 we also take care on the prerequisites and working SemGrep installation.

This lab is designed to help you learn how to write custom rules for SemGrep and apply them to your codebase. The lab is divided into four parts:  
1. **Introduction to SemGrep**: Get an overview of SemGrep, its capabilities, and how it can help you identify security vulnerabilities in your code.
2. **Writing a Custom Rule**: Learn how to write custom rules in SemGrep, including defining sources and sinks, and linking them to detect potential vulnerabilities.
3. **Applying the Custom Rule**: Apply the custom rule to your codebase to identify and fix security issues.
4. **Immersive Mob Session**: Participate in a live session to scan your own repository with SemGrep and receive real-time feedback on the results.

__Happy hacking and have fun! 🚀__


---
# Original Readme below
If you want to continue with the original project, please follow the instructions below. This project gives you
a great guided journey to understand and fix OWASP Top 10 vulnerabilities. Have fun! 

## Quick Start

Install Docker and Docker Compose.

```
docker-compose up
```
Navigate to `http://localhost:8080`

To update image

```
docker-compose build
```

## Requirements

* Java 1.8+
* Maven 3.x
* MySQL Server

## Configuration

### Database

Create MySQL database and credentials and configure the same in:

```
./src/main/webapp/WEB-INF/config.properties
```

### Schema Import

Import the schema into MySQL database:

```
$ mysql -u USER -pPASSWORD dvja < ./db/schema.sql
```

## Build

```
$ mvn clean package
```

The deployable `war` file is generated in targets directory.

## Run with Jetty

```
$ mvn jetty:run
```

This will start the `Jetty` server on port 8080.

## Deploy in Tomcat Server

* Build app
* Copy targets/dvja.war to Tomcat webapps directory
* To serve as root application, copy as `ROOT.war` to Tomcat webapps directory.

