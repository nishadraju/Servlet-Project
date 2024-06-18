
<%
out.print(request.getAttribute("msg"));
%>
<form action="login" method="post">

user name : <input type="text" name="username"/>
password  : <input type="text" name="password"/>
            <input type="submit"/>

</form>