[![Build Status](https://travis-ci.org/flapdoodle-oss/de.flapdoodle.embed.mongo.svg?branch=embed-mongo-4.x)](https://travis-ci.org/flapdoodle-oss/de.flapdoodle.embed.mongo)
[![Maven Central](https://img.shields.io/maven-central/v/de.flapdoodle.embed/de.flapdoodle.embed.mongo.svg)](https://maven-badges.herokuapp.com/maven-central/de.flapdoodle.embed/de.flapdoodle.embed.mongo)

# Make Peace, No War!

# Organization Flapdoodle OSS

We are a github organization. You are invited to participate. Every version < 4.x.x is considered as legacy.

# Embedded MongoDB

Embedded MongoDB will provide a platform neutral way for running mongodb in unittests.

## Why?

- dropping databases causing some pains (often you have to wait long time after each test)
- its easy, much easier as installing right version by hand
- you can change version per test

## How?

- download mongodb (and cache it)
- extract it (and cache it)
- java uses its process api to start and monitor the mongo process
- you run your tests
- java kills the mongo process


## License

We use http://www.apache.org/licenses/LICENSE-2.0

## Dependencies

### Build on top of

- Embed Process Util [de.flapdoodle.embed.process](https://github.com/flapdoodle-oss/de.flapdoodle.embed.process)

### Other ways to use Embedded MongoDB

- in a Maven build using [maven-mongodb-plugin](https://github.com/Syncleus/maven-mongodb-plugin) or [embedmongo-maven-plugin](https://github.com/joelittlejohn/embedmongo-maven-plugin)
- in a Clojure/Leiningen project using [lein-embongo](https://github.com/joelittlejohn/lein-embongo)
- in a Gradle build using [gradle-mongo-plugin](https://github.com/sourcemuse/GradleMongoPlugin)
- in a Scala/specs2 specification using [specs2-embedmongo](https://github.com/athieriot/specs2-embedmongo)
- in Scala tests using [scalatest-embedmongo](https://github.com/SimplyScala/scalatest-embedmongo)

## Howto

[Usage](Howto.md)

### Maven

	<dependency>
		<groupId>de.flapdoodle.embed</groupId>
		<artifactId>de.flapdoodle.embed.mongo</artifactId>
		<version>4.3.3</version>
	</dependency>

### Spring Integration

As the spring projects
[removed the embed mongo support in 2.7.0](https://github.com/spring-projects/spring-boot/wiki/Spring-Boot-2.7-Release-Notes#springmongodbembeddedfeatures-configuration-property-removed)
you should consider to use one of these integration projects.
It should behave mostly like the original spring integration, but there are some minor differences:
- version in 'spring.mongodb.embedded.version' is used in package resolver and is not matched against version enum.
- 'spring.mongodb.embedded.features' is not supported (not the way to change the config of mongodb)

If you have any trouble in using them fell free to create an issue.

- [Spring 2.6.x](https://github.com/flapdoodle-oss/de.flapdoodle.embed.mongo.spring/tree/spring-2.6.x)
- [Spring 2.7.x](https://github.com/flapdoodle-oss/de.flapdoodle.embed.mongo.spring/tree/spring-2.7.x)
- [Spring 3.0.x](https://github.com/flapdoodle-oss/de.flapdoodle.embed.mongo.spring/tree/spring-3.0.x)

### Changelog

[Changelog](Changelog.md)
