class BootStrap {

	def dataSourcePopulatorService

	def init = {
		dataSourcePopulatorService.populate()
	}
}
