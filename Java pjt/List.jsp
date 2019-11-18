<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ page import="com.sastra.bean.Restaurent"%> 
    <%@ page import="java.util.ArrayList" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<style>
div{
width:400px;
height:400px;
border:10px solid green;
padding:15px;
margin:15px;
}</style>
<html>
<head>
<script language="Javascript">
	function confirmDelete() {
		var t=confirm("Do you want to delete the record?");
		return t;
	}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Restaurent Management System</title>
</head>
<body bgcolor="#23E1E1">
<img src="image1.jpg" width="50" height="50" align="left">
<h1 align="center"><font color="blue">Online Restaurent Management</font></h1>
<hr>
<%
	ArrayList<Restaurent> alllist=(ArrayList<Restaurent>) request.getAttribute("alllist");
	if(alllist!=null) {
		
%>
<h3 ALIGN="center">VEG MENU</h3>
<TABLE BORDER="1" WIDTH="70%" ALIGN="CENTER">
			<TR><Th>Menuid</Th><Th>menuname</Th><Th>category</Th><Th>cost</Th><Th>status</Th><Th>Delete</Th></TR>
			<%
		for(Restaurent e:alllist) {
			if("VEG".equalsIgnoreCase(e.getType())){
%>
			<TR>
				<TD><%=e.getMenuid() %></TD>
				<TD><%=e.getMenuname() %></TD>
				<TD><%=e.getCategory() %></TD>
				<TD><%=e.getCost() %></TD>
				<TD><%=e.getStatus() %></TD>
				<TD align="center">
<%		if(e.getStatus().equalsIgnoreCase("Not Available")){
%>
					 <a href="RestaurentController?action=delete&menuid=<%=e.getMenuid() %>" onclick="return confirmDelete();">Delete</a>	
<%		}
else{
	%>
	<label>NA</label>
	<%
	
}
%></TD>
			</TR>

<%		}
			}
%>

		</TABLE>
		<span><a href="add.jsp">Add Veg Menu</a></span>	
<%
	}
	%>
	<h3 ALIGN="center">NON VEG MENU</h3>
	<TABLE BORDER="1" WIDTH="70%" ALIGN="CENTER">
			<TR><Th>Menuid</Th><Th>menuname</Th><Th>category</Th><Th>cost</Th><Th>status</Th><Th>Delete</Th></TR>
			<%
		for(Restaurent e:alllist) {
			if("NON VEG".equalsIgnoreCase(e.getType())){
%>
			<TR>
				<TD><%=e.getMenuid() %></TD>
				<TD><%=e.getMenuname() %></TD>
				<TD><%=e.getCategory() %></TD>
				<TD><%=e.getCost() %></TD>
				<TD><%=e.getStatus() %></TD>
				<TD align="center">
<%		if(e.getStatus().equalsIgnoreCase("Not Available")){
%>
					 <a href="RestaurentController?action=delete&menuid=<%=e.getMenuid() %>" onclick="return confirmDelete();">Delete</a>	
<%		}
else{
	%>
	<label>NA</label>
	<%
	
}
%></TD>
			</TR>

<%		}}
%>
		</TABLE>
		<span><a href="add.jsp">AddNon  Veg Menu</a></span>	

<p align="center"><a href="index.jsp">Home</a></p>

</body>
</html>
