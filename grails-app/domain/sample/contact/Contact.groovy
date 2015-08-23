package sample.contact

class Contact implements Serializable {

	private static final long serialVersionUID = 1

	String email
	String name

	Contact(String name, String email) {
		this()
		this.name = name
		this.email = email
	}

	@Override
	String toString() {
		"${super.toString()}: Id: $id; Name: $name; Email: $email"
	}

	static constraints = {
		email size: 3..50
		name  size: 3..50
	}
}
