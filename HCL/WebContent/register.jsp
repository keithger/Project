

<%@page import="com.registerDAO" %>

<jsp:useBean id="R" class="com.registerBean" scope="session"></jsp:useBean>  
<jsp:setProperty name="R" property="*"/>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
int status=registerDAO.validate(R);
 
if(status>0){
    out.println("REGSTRATION SUCESSFULL ...");
    response.sendRedirect("index.jsp");
}
else
	out.println("REGISTRATION ERROR ...");

 
%>

</body>
</html>