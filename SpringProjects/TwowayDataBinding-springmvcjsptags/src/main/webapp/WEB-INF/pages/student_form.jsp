<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<h1 style="color: green; text-align: center;">Student Registration pPage</h1>

<form:form action="student" method="post" modelAttribute="stud">
<table align="center" bgcolor="cyan">
<tr>
<td>Student NO::</td>
<td><form:input path="sno"/></td>
</tr>
<tr>
<td>Student NAME::</td>
<td><form:input path="sname"/></td>
</tr>
<tr>
<td>Student ADDRS::</td>
<td><form:input path="addrs"/></td>
</tr>
<tr>
<td>Student AVGS::</td>
<td><form:input path="avg"/></td>
</tr>
<tr>
<td colspan="2"><input type="submit" value="register" ></td>
</tr>

</table>

</form:form>