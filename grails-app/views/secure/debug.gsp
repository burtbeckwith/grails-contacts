<html>

<head>
	<title>Security Debug Information</title>
</head>

<body>
<div class="body">
	<div class="dialog">

		<h3>Security Debug Information</h3>

		<g:if test='${auth}'>
			<p>Authentication object is of type: <em>${auth.getClass().name}</em></p>
			<p>Authentication object as a String: <br/><br/>${auth}</p>

			Authentication object holds the following granted authorities:<br /><br />
			<g:each var='authority' in='${auth.authorities}'>
				${authority} (<em>getAuthority()</em>: ${authority.authority})<br />
			</g:each>

			<p><b>Success! Your web filters appear to be properly configured!</b></p>
		</g:if>
		<g:else>
			Authentication object is null.<br />
			This is an error and your Spring Security application will not operate properly until corrected.<br /><br />
		</g:else>

	</div>
</div>
</body>
</html>
