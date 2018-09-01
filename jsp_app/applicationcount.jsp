<%
String counter=new String("counter");
Integer val=new Integer(0);
Integer count=(Integer)application.getAttribute(counter);
if(count==null){
    application.setAttribute(counter,val);

}
else{
    out.println("<h4>old count is: "+count+"</h4>");
    count=count+1;
    application.setAttribute(counter,count);
    
}
out.println("<h4>new count is: "+count+"</h4>");
out.println("<a href='summary.jsp'>click here for summary</a");


%>                  
