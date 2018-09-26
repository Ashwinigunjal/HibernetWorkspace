<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.dao.UserDao" %>

<jsp:useBean id="obj" class="com.dao.User"></jsp:useBean>
<jsp:setProperty property="*" name="obj"/>  

<%

int i= UserDao.register(obj);

if( i>0){
	out.print("Inser data successfully");
}

%>