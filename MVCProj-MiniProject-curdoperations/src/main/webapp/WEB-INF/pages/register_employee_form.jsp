<%@page isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<h1 style="color:green;text-align: center;">Register Employee</h1>
<form:form action="add_employee" method="post" modelAttribute="emp">
<table align="center" border="0" bgcolor="cyan" style="width: 70px;height: 100px">
<tr>
<td>Empno::
<form:input path="empno"/></td>
<td>Ename::
<form:input path="ename"/></td>
<td>job::
<form:input path="job"/></td>
<td>salary::</td>
<td><form:input path="sal"/></td>
<td>Deptno::</td>
<td><form:input path="deptno"/></td>
</tr>
<tr >
<td><input type="submit" value="register Employee" ></td>
<td><input type="reset" value="cancel"></td>
</tr>

</table>

</form:form>