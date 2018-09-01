<%
String parameter=request.getParameter("name");
for(int i=0;i<5;i++){
    out.println("<h1>welcome to jsp/"+parameter+"</h1>");
}
%>