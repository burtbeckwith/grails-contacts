<html>

<head>
<title>Administer Permissions</title>
</head>

<body>
<div class="body">
	<div class="dialog">

		<h1>Administer Permissions</h1>
		<p>
			<code>${contact}</code>
		</p>

		<table cellpadding="3" border="0">
<g:each var='ace' in="${acl.entries}">
			<tr>
				<td>
					<code>${ace}</code>
				</td>
				<td>
					<g:link action='deletePermission' params='[contactId: contact.id, sid: ace.sid.principal, permission: ace.permission.mask]'>Del</g:link>
				</td>
			</tr>
</g:each>
		</table>

		<p>
			<g:link action='addPermission' params='[contactId: contact.id]'>Add Permission</g:link>
			<g:link>Manage</g:link>
		</p>

	</div>
</div>
</body>
</html>
