<%
Cookie cookie=null;
Cookie[] cookies=null;
cookies=request.getCookies();
String color=null;
if(cookies!=null){
    out.println("<h2>found cookies </h2>");
    for (int i = 0; i < cookies.length; i++) {
        if(cookies[i].getName().equals("color")){
            color = cookies[i].getValue();

            out.print("Name : " + cookies[i].getName( ) + ",  ");
            out.print("Value: " + cookies[i].getValue( )+" <br/>");
        }
    }
}    
     else {
        out.println("<h2>No cookies founds</h2>");     
}


%>
<html>
<head>
<style>
<%@ include file="style.css" %>
</style>
</head>
<body>

<%
    if(color.equals("green")){
         out.println("<h2 class=green>color is green</h2>");  
   }
   else{
      out.println("<h2 class=red>color is red</h2>"); 
   }
%>
</body>
</html>