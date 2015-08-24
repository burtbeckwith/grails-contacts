/*
 * Copyright 2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *		http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package sample.contact.pages

import geb.Page

/**
 * The login page.
 *
 * @author Rob Winch
 */
class LoginPage extends Page {
	static url = 'login'
	static at = { assert driver.title == 'Login'; true}
	static content = {
		login(required: false) { user = 'rod', password = 'koala' ->
			loginForm.j_username = user
			loginForm.j_password = password
			submit.click()
		}
		loginForm { $('form') }
		submit { $('input', type: 'submit') }
	}
}
