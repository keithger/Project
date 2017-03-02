

<%@page import="com.loginDAO" %>

<jsp:useBean id="L" class="com.loginBean" scope="session"></jsp:useBean>  
<jsp:setProperty name="L" property="*"/>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
int status=(int)loginDAO.validate(L);
 
if(status>0){
	session.setAttribute("email",L.getEmail());
	response.sendRedirect("index.jsp");
   
}
else
{
	out.println("LOGIN ERROR ...");
	response.sendRedirect("index.jsp");
}
 
%>

</body>
</html>