<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags"  %>

<html >
	<head>
		<title >Willkommen Admin</title>
	</head>
	
	<body bgcolor="white">
		<br/>
		<a href="<s:url action="forward_to_product_create"/>">Produkt erstellen</a><br/>
		<a href="<s:url action="forward_to_product_delete"/>">Produkt l�schen</a><br/>
		<a href="<s:url action="forward_to_category_create"/>">Kategorie erstellen</a><br/>
		<a href="<s:url action="forward_to_category_delete"/>">Kategorie l�schen</a>
		
	</body>
</html>
