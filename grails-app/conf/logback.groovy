import grails.util.BuildSettings
import grails.util.Environment

// See http://logback.qos.ch/manual/groovy.html for details on configuration

appender('STDOUT', ConsoleAppender) {
	encoder(PatternLayoutEncoder) {
		pattern = '%d{HH:mm:ss.SSS} [%thread] %-5level %logger{36} - %msg%n'
	}
}

root INFO, ['STDOUT']

logger 'grails.plugin.springsecurity', DEBUG
logger 'org.springframework.security', DEBUG

logger 'org.hibernate.SQL', DEBUG
//logger 'org.hibernate.type.descriptor.sql.BasicBinder', TRACE

File targetDir = BuildSettings.TARGET_DIR
if (Environment.developmentMode && targetDir) {

	appender('FULL_STACKTRACE', FileAppender) {
		file = "$targetDir/stacktrace.log"
		append = true
		encoder(PatternLayoutEncoder) {
			pattern = '%level %logger - %msg%n'
		}
	}

	logger 'StackTrace', ERROR, ['FULL_STACKTRACE'], false
}
