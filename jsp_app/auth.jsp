<%
    String username=request.getParameter("username");
    String password=request.getParameter("password");
    if(!username.equals("root")){
        response.sendRedirect("login.html");
    }
    else{
    out.println("<h1>username is:"+username+"</h1>");
    out.println("<h1>password is: "+password+"</h1>");
    }
%>