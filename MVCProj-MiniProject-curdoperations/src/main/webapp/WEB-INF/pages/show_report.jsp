<%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:choose>
<c:when test="${!empty listemps}">
<table align="center" bgcolor="cyan" border="1">
<tr style="color: red;"><th>Empno</th><th>Ename</th><th>JOB</th><th>Salary</th><th>Deptno</th><th>operation</th></tr>
<c:forEach var="emp" items="${listemps }">
<tr>
<td>${emp.empno}</td>
<td>${emp.ename}</td>
<td>${emp.job}</td>
<td>${emp.sal}</td>
<td>${emp.deptno}</td>
<td><a href="edit_employee?no=${emp.empno}"><img src="resource/images/edit.jpeg" style="width: 50px; height: 50px" />Edit</a>&nbsp;&nbsp;
<a href="delete_employee?no=${emp.empno}" onclick="return confirm('do you want delete?')"><img src="resource/images/delete.jpeg" style="width: 50px; height: 50px" />delete</a>
</tr>
</c:forEach>
</table>
</c:when>
<c:otherwise><h1 style="color=red;" text-align="center">Record not Found</h1>
</c:otherwise>

</c:choose>
<h1 style="text-align: center;">${resultmsg }</h1>
<br>
<h1 style="color: red;text-align: center;"><a href="add_employee"><img src="resource/images/add.jpeg" style="width: 50px;height: 50px">Add</a></h1>

<br>
<center><a href="./"><img src="resource/images/home.jpeg" style="width: 50px; height: 50px" />Home</a></center>