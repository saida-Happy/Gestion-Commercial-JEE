<%@ page language="java" pageEncoding="windows-1256"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<base href="<%=basePath%>">

	<title>ASUS. Rock Solid-Heart Touching</title>	
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="./css/bootstrap.css" rel="stylesheet" type="text/css">
        <link href="./css/font-awesome.css" rel="stylesheet" type="text/css">
        <link href="./css/animate.css" rel="stylesheet" type="text/css">
        <link href="./css/jquery.gritter.css" rel="stylesheet" type="text/css">
        <link href="./css/style.css" rel="stylesheet" type="text/css">

</head>
  
<body class="bg-theme02">
	<f:view>
	 <div id="login-page">
            <div class="container">
			<h:form styleClass="form-login animated zoomIn" id="loginForm" rendered="true">
			
			    <h2 class="form-login-heading" style="font-weight:900;">AsusTec Manager</h2>
                    <div class="login-wrap">
                        <p>Connectez vous à votre compte :</p>
                        
			
				  <strong style="margin-left: 120px;">Login</strong> <br/>
				  	<h:inputText  styleClass="form-control"  id="nom"  value="#{users.login}" rendered="true" 
				   	required="true" size="80"  maxlength="70" requiredMessage=" Veuillez saisir un nom d'utilisateur" /> <br/>     
				   <strong style="margin-left: 100px;">Mot de passe</strong><br/>
			        <h:inputSecret styleClass="form-control" id="motdepasse" value="#{users.password}"  rendered="true" 
			        required="true" size="80" maxlength="70" requiredMessage="   Veuillez  saisir  un  mot  de  passe" >
			        </h:inputSecret>
			        <h:outputLabel styleClass="checkbox"> 
			        <a class="pull-right" id="ft_pd" data-toggle="modal" href="Login.faces">Mot de passe oublié?</a>
			         </h:outputLabel>
			       <h:messages style="color:red; padding-left:38px;" globalOnly="true" />
			        <h:commandButton styleClass="btn btn-theme btn-block" value="Connexion" action="#{users.Login}" ></h:commandButton>
	               
	    <h:message style="color:red; padding-left:38px;" id="nomMessage" for="nom" errorClass="erreur"  /><br/>
	               <h:message style="color:red; padding-left:38px;" id="motDePasseMessage" for="motdepasse" errorClass="erreur" /> 
			
			</h:form>
			</div></div>
	</f:view>
</body>
</html>