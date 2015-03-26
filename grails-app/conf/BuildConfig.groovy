grails.project.work.dir = 'target'

grails.project.dependency.resolution = {

	inherits 'global'
	log 'warn'

	repositories {
		grailsCentral()
		mavenLocal()
		mavenCentral()
	}

	dependencies {
		compile 'org.springframework.mobile:spring-mobile-device:1.1.0.RELEASE', {
			excludes 'javax.servlet-api', 'spring-web', 'spring-webmvc'
		}
	}

	plugins {
		build ':release:3.1.0', ':rest-client-builder:2.1.0', {
			export = false
		}
	}
}
