<html>

<head>
	<title>Add Permission</title>
</head>

<body>
<div class="body">
	<div class="dialog">

		<h1>Add Permission</h1>

		<g:form action='addPermission'>
			<g:hiddenField name='contactId' value='${contact.id}' />

			<table width="95%" bgcolor="f8f8ff" border="0" cellspacing="0" cellpadding="5">

				<tr>
					<td alignment="right" width="20%">Contact:</td>
					<td width="60%">${contact}</td>
				</tr>

				<tr>

					<td alignment="right" width="20%">Recipient:</td>
					<td width="20%">
						<g:select name='recipient' from='${recipients}' value='${command.recipient}'
						          noSelection="['': '-- please select --']"/>
					</td>
					<td width="60%">
						<font color="red"><c:out value="${status?.errorMessage}"/></font>
					</td>

					</td>
					<td width="60%">
						<font color="red"><g:fieldError bean='${command}' field='recipient' /></font>
					</td>
				</tr>

				<tr>

					<td alignment="right" width="20%">Permission:</td>
					<td width="20%">
						<g:select name='permission' from='${permissions}' value='${command.permission}'
						          optionKey='key' optionValue='value' />
					</td>
					<td width="60%">
						<font color="red"><g:fieldError bean='${command}' field='permission' /></font>
					</td>
				</tr>
			</table>

			<br/>

			<g:hasErrors bean='${command}'>
			<b>Please fix all errors!</b><br/><br/>
			</g:hasErrors>

			<br/> <br/>

			<input name="execute" type="submit" alignment="center" value="Execute">
		</g:form>

		<p>
		<g:link action='adminPermission' params='[contactId: contact.id]'>Admin Permission</g:link>
		<g:link>Manage</g:link>

	</div>
</div>
</body>
</html>
