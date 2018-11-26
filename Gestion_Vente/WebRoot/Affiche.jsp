<%@ page language="java" import="java.util.*" pageEncoding="windows-1256"%>
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
    
<title>Dashboard AsusTec</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href="./css/bootstrap.css" rel="stylesheet" type="text/css">
        <link href="./css/font-awesome.css" rel="stylesheet" type="text/css">
        <link href="./css/bootstrap-datetimepicker.min.css" rel="stylesheet" type="text/css">
        <link href="./css/jquery.gritter.css" rel="stylesheet" type="text/css">
        <link href="./css/redactor.css" rel="stylesheet" type="text/css">
        <link href="./css/select2.css" rel="stylesheet" type="text/css">
        <link href="./css/animate.css" rel="stylesheet" type="text/css">
        <link href="./css/hover-min.css" rel="stylesheet" type="text/css">
        <link href="./css/print.css" rel="stylesheet" type="text/css">
        <link href="./css/style.css" rel="stylesheet" type="text/css">
        
        <script src="./css/jquery.js"></script>
  </head>
  
  <body>    
   <f:view>
   <section id="container">
   
    <header class="header orange-bg">
                <div class="container">
                    <span class="logo animated bounceIn"><a href="Affiche.faces"><strong>AsusTec</strong></a></span>
                    <div class="nav notify-row pull-right" id="top_menu">
                        <ul class="nav top-menu pull-right">
                            
                            <li class="dropdown animated bounceInRight">
                                <a  style="background-color: #428bca;"  data-toggle="dropdown" class="logout dropdown-toggle" href="Affiche.faces">
                                    <div id="mydiv"></div> &nbsp;&nbsp;<span  style="font-size:14px;" class="hidden-xs"><strong>Produits</strong></span>
                                    
                                </a>
                               
                            </li>
                             <li class="dropdown animated bounceInRight">
                                <a data-toggle="dropdown" class="dropdown-toggle" href="clientsList.faces">
                                    <div id="mydiv1"></div> <span style="font-size: 14px;" class="hidden-xs"><strong>Clients</strong></span>
                                </a>
                              
                            </li>
                            
                            <li  class="dropdown animated bounceInRight">
                                <a data-toggle="dropdown" class=" dropdown-toggle" href="commande.faces">
                                    <div id="mydiv2"> </div> &nbsp;&nbsp;<span  style="font-size:14px;" class="hidden-xs"><strong>Commandes</strong></span>
                                    
                                </a>
                               
                            </li>
                            
                            <li class="dropdown animated bounceInRight">
                                <a data-toggle="dropdown" class="dropdown-toggle" href="ModifierPwd.faces">
                                    <div id="mydiv30"></div> &nbsp;&nbsp; <span style="font-size: 14px;" class="hidden-xs"><strong>Profile</strong></span>
                                </a>
                              
                            </li>
                            <li class="dropdown animated bounceInRight">
                                <a data-toggle="dropdown" class=" dropdown-toggle"  href="Login.faces">
                                   <span  style="font-size: 14px;" class="hidden-xs capitalize"><strong>Déconnexion</strong></span>
                                </a>
                                
                            </li>
                        </ul>
                    </div>
                </div>
            </header>
        
        <section id="main-content">
                <section class="wrapper">
                    <div class="container">
                    
                    <div class = "page-header">
   
   <h1>
      Liste des produits en Stock 
      
   </h1>
   
</div>
<div class="animated bounceInDown">
   <h:form>
        
  		  <h:dataTable styleClass="table" var="c" value="#{Produit.liste}" summary="La liste des produit">
  		   <thead>
  		    <h:column >
  		   <f:facet name="header">
  			<h:outputText styleClass="hh" value="Code de produit"/> </f:facet>
  			<h:outputText styleClass="bb" value="#{c.codePdt}"></h:outputText>
  		    </h:column>
  		    <h:column>
  		    <f:facet name="header">
  			<h:outputText styleClass="hh" value="Nom de produit"/> </f:facet>
  			<h:outputText styleClass="bb" value="#{c.nomPdt}"></h:outputText>
  		    </h:column>
  		    <h:column>
  		    <f:facet name="header">
  			<h:outputText styleClass="hh" value="Quantité de produit"/> </f:facet>
  			<h:outputText styleClass="bb" value="#{c.qtePdt}"></h:outputText>
  		    </h:column>
  		    <h:column>
  		    <f:facet name="header">
  			<h:outputText styleClass="hh" value="Prix de produit"/> </f:facet>
  			<h:outputText styleClass="bb" value="#{c.prixPdt}"></h:outputText>
  		    </h:column>
  		    <h:column>
  		    <f:facet name="header">
  			<h:outputText styleClass="hh" value="Commander"/> </f:facet>
  			 <h:commandLink  id="code" action="#{Commandes.affiche}">
  			 <img id="myim" style="margin-left: 50px;" src="./img/Drawing (19).png"/>
  			<f:param name="codePdt" value="#{c.codePdt}"></f:param>
  			<f:param name="qtePdt" value="#{c.qtePdt}"></f:param></h:commandLink>
  			</h:column>
  		  </h:dataTable>
  	 </h:form>

                    </div></div>
                    </section></section>
                    
                     <footer class="site-footer animated bounceInUp">
                <div class="text-center">
                    © 2016 AsusTec 
                </div>
            </footer>
   </section>
       </f:view>
  </body>
</html>
