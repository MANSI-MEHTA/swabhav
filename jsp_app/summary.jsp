<%
    String counter=new String("counter");
    Integer valueOfSessionCount=(Integer)session.getAttribute(counter);
    Integer valueOfApplicationCount=(Integer)application.getAttribute(counter);
    
    out.println("<h1>Summary </h1>");
    
    out.println("<h4>Session count is: "+valueOfSessionCount+"</h4>");
    
    out.println("<h4>Application  count is: "+valueOfApplicationCount+"</h4>");
    


%>