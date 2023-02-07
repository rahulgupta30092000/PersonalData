<%
String id=request.getParameter("id");
String pwd=request.getParameter("pwd");
if(id.equals("admin") && pwd.equals("12345")){
	session.setAttribute("id",id);
	session.setAttribute("pwd",pwd);
	response.sendRedirect("Adminhome.jsp");
}
else{
	response.sendRedirect("index.html");
	out.println("<script>window.alert('invalid id and passowrd')</script>");
}
%>