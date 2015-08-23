package sample.contact

import org.springframework.beans.factory.annotation.Autowired

import grails.plugin.springsecurity.annotation.Secured

@Secured(['permitAll'])
class HelloController {

	@Autowired private ContactService contactService

	/**
	 * The public index page, used for unauthenticated users.
	 */
	def index() {
		[contact: contactService.randomContact]
	}
}
