<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
			<form:form action="viewDetails" method="post" modelAttribute="queryMaster">

				<tr>
					<td><form:label path= "query_id"> Query Id</form:label></td>
					<td><form:input path="query_id" size="30" /></td>
					<td><form:errors path="query_id" cssClass="error" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="Search"></td>
					
				</tr>
		
				</form:form>
				</table>
</body>
</html>