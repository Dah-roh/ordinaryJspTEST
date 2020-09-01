<%@ page import ="java.util.*" %>
<!DOCTYPE html>
<html>
<body>
<center>
<h1>
    Available Brands
</h1>
<%
List tasks = (List) request.getAttribute("tasks");
Iterator it = tasks.iterator();
out.println("<br>Your tasks are  <br><br>");
while(it.hasNext()){
out.println(it.next()+"<br>");
}
%>
</body>
</html>