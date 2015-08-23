grails.plugin.springsecurity.userLookup.userDomainClassName = 'sample.contact.auth.User'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'sample.contact.auth.UserRole'
grails.plugin.springsecurity.authority.className = 'sample.contact.auth.Role'
grails.plugin.springsecurity.controllerAnnotations.staticRules = [
	'/':                ['permitAll'],
	'/error':           ['permitAll'],
	'/index':           ['permitAll'],
	'/index.gsp':       ['permitAll'],
	'/shutdown':        ['permitAll'],
	'/assets/**':       ['permitAll'],
	'/**/js/**':        ['permitAll'],
	'/**/css/**':       ['permitAll'],
	'/**/images/**':    ['permitAll'],
	'/**/favicon.ico':  ['permitAll'],

	'/j_spring_security_switch_user': ['ROLE_SUPERVISOR']
]

grails.plugin.springsecurity.useSwitchUserFilter = true
grails.plugin.springsecurity.switchUser.targetUrl = '/secure/'
grails.plugin.springsecurity.adh.errorPage = null // to trigger a 403
