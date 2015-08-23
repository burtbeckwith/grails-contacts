package sample.contact

import grails.plugin.springsecurity.annotation.Secured

@Secured(['ROLE_SUPERVISOR'])
class SuController {

	def exitUser() {}

	def switchUser() {}
}
