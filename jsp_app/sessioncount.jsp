<%
String counter=new String("counter");
Integer val=new Integer(0);

if(session.getAttribute(counter)==null){
    session.setAttribute(counter,val);

}
val=(Integer)session.getAttribute(counter);
out.println("<h4>old count is: "+val+"</h4>");
val=val+1;
session.setAttribute(counter,val);
out.println("<h4>new count is: "+val+"</h4>");
out.println("<h4>session id is: "+session.getId()+"</h4>");
out.println("<a href='summary.jsp'>click here for summary</a");
    
%>                  
