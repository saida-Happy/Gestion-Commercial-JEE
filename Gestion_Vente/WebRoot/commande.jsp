<%@ page language="java" import="java.util.*"
	pageEncoding="windows-1256"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
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
		<link href="./css/bootstrap-datetimepicker.min.css" rel="stylesheet"
			type="text/css">
		<link href="./css/jquery.gritter.css" rel="stylesheet" type="text/css">
		<link href="./css/redactor.css" rel="stylesheet" type="text/css">
		<link href="./css/select2.css" rel="stylesheet" type="text/css">
		<link href="./css/animate.css" rel="stylesheet" type="text/css">
		<link href="./css/hover-min.css" rel="stylesheet" type="text/css">
		<link href="./css/print.css" rel="stylesheet" type="text/css">
		<link href="./css/style.css" rel="stylesheet" type="text/css">

		<script src="./css/jquery.js">
</script>
	</head>

	<body>
		<f:view>
			<section id="container">

			<header class="header orange-bg">
			<div class="container">
				<span class="logo animated bounceIn"><a href="Affiche.faces"><strong>AsusTec</strong>
				</a>
				</span>
				<div class="nav notify-row pull-right" id="top_menu">
					<ul class="nav top-menu pull-right">

						<li class="dropdown animated bounceInRight">
							<a  data-toggle="dropdown"
								class=" dropdown-toggle" href="Affiche.faces">
								<div id="mydiv"></div> &nbsp;&nbsp;<span
								style="font-size: 14px;" class="hidden-xs"><strong>Produits</strong>
							</span> </a>

						</li>
						<li class="dropdown animated bounceInRight">
							<a data-toggle="dropdown" class="dropdown-toggle"
								href="clientsList.faces">
								<div id="mydiv1"></div> <span style="font-size: 14px;"
								class="hidden-xs"><strong>Clients</strong>
							</span> </a>

						</li>

						<li class="dropdown animated bounceInRight">
							<a  style="background-color: #428bca;"  data-toggle="dropdown" class=" logout dropdown-toggle"
								href="commande.faces">
								<div id="mydiv2">
								</div> &nbsp;&nbsp;<span style="font-size: 14px;" class="hidden-xs"><strong>Commandes</strong>
							</span> </a>

						</li>

						<li class="dropdown animated bounceInRight">
							<a data-toggle="dropdown" class="dropdown-toggle"
								href="ModifierPwd.faces">
								<div id="mydiv30"></div> &nbsp;&nbsp;<span style="font-size: 14px;"
								class="hidden-xs"><strong>Profile</strong>
							</span> </a>

						</li>
						<li class="dropdown animated bounceInRight">
							<a data-toggle="dropdown" class=" dropdown-toggle"
								href="Login.faces"> <span style="font-size: 14px;"
								class="hidden-xs capitalize"><strong>Déconnexion</strong>
							</span> </a>

						</li>
					</ul>
				</div>
			</div>
			</header>

			<section id="main-content">
			<section class="wrapper">
			<div class="container">

				<div class="page-header">

					<h1>
						Liste des commandes

					</h1>

				</div>
				<div class="animated bounceInDown">
					<h:form>

						<h:dataTable styleClass="table" var="c" value="#{Commandes.liste}"
							summary="La liste des commandes">
							<thead>
								<h:column>
									<f:facet name="header">
										<h:outputText styleClass="hh" value="Code de la commande" />
									</f:facet>
									<h:outputText style="padding-left:75px; color:black;" value="#{c.codeCmd}"></h:outputText>
								</h:column>
								<h:column>
									<f:facet name="header">
										<h:outputText styleClass="hh" value="Nom de client" />
									</f:facet>
									<h:outputText style="padding-left:35px; color:black;" value="#{c.nomClt}"></h:outputText>
								</h:column>
								<h:column>
									<f:facet name="header">
										<h:outputText styleClass="hh" value="Code de produit" />
									</f:facet>
									<h:outputText style="padding-left:60px; color:black;" value="#{c.codePdt}"></h:outputText>
								</h:column>
								<h:column>
									<f:facet name="header">
										<h:outputText styleClass="hh" value="Quantité commandée" />
									</f:facet>
									<h:outputText style="padding-left:60px; color:black;"  value="#{c.qteCmd}"></h:outputText>
								</h:column>
								<h:column>
									<f:facet name="header">
										<h:outputText styleClass="hh" value="Date de la commande" />
									</f:facet>
									<h:outputText style="padding-left:50px; color:black;" value="#{c.dateCmd}"></h:outputText>
								</h:column>

								<h:column>
									<f:facet name="header">
										<h:outputText styleClass="hh" value="PDF" />
									</f:facet>
									<h:commandLink action="#{Commandes.Imprimer}"> 
  									 <img id="myim" style="margin-left: 50px;" src="./img/Drawing (20).png"/>

  										<f:param name="codeCmd" value="#{c.codeCmd}"></f:param>
										<f:param name="codePdt" value="#{c.codePdt}"></f:param>
										<f:param name="nomClt" value="#{c.nomClt}"></f:param>
										<f:param name="qteCmd" value="#{c.qteCmd}"></f:param>
										<f:param name="dateCmd" value="#{c.dateCmd}"></f:param>


									</h:commandLink>
								</h:column>
						</h:dataTable>
					</h:form>

				</div>
			</div>
			</section>
			</section>

			<footer class="site-footer animated bounceInUp">
			<div class="text-center">
				© 2016 AsusTec
			</div>
			</footer>
			</section>
		</f:view>
	</body>
</html>
