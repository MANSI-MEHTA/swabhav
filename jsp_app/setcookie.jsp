<%
Cookie cookie=new Cookie("color","green");
cookie.setMaxAge(60*60*24*7); 
response.addCookie(cookie);
out.println("<h1>cookie is created</h1>");


%>