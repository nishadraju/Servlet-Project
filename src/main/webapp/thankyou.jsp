
<%@page import="java.util.ArrayList"%>
<%= request.getAttribute("data")%>

<%

int fff=90;
ArrayList<String> al=(ArrayList <String>) request.getAttribute("data");
for(String xx:al){
	
	out.println(xx); %> </br> <%
	
	
}

%>

<%!int xx1=90;%>
