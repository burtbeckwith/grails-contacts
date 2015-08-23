<%@ page import='org.springframework.security.core.context.SecurityContextHolder' %>
<html>

<head>
	<title>Access denied!</title>
</head>

<body>
<div class="body">
	<div class="dialog">

		<h1>Sorry, access is denied</h1>
		<p>${request.SPRING_SECURITY_403_EXCEPTION}</p>

		<p>
		<g:set var='auth' value="${SecurityContextHolder.context.authentication}"/>
		<g:if test="${auth}">
		Authentication object as a String: $auth}<br /><br />
		</g:if>
		</p>

	</div>
</div>
</body>
</html>
