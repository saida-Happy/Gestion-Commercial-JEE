<%@ page language="java" pageEncoding="windows-1256"%>
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

		<title>My JSF 'test.jsp' starting page</title>

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


	</head>

	<body>
		<f:view>

			<section id="container">

			<header class="header orange-bg">
			<div class="container">
				<span class="logo animated bounceIn"><a href="Affiche.faces"><strong>AsusTec</strong>
				</a> </span>
				<div class="nav notify-row pull-right" id="top_menu">
					<ul class="nav top-menu pull-right">

						<li class="dropdown animated bounceInRight">
							<a data-toggle="dropdown"
								class="dropdown-toggle" href="Affiche.faces">
								<div id="mydiv"></div>&nbsp;&nbsp;<span style="font-size: 14px;"
								class="hidden-xs"><strong>Produits</strong> </span> </a>

						</li>

						<li class="dropdown animated bounceInRight">
							<a data-toggle="dropdown" class="dropdown-toggle"
								href="clientsList.faces">
								<div id="mydiv1"></div> <span style="font-size: 14px;"
								class="hidden-xs"><strong>Clients</strong>
							</span> </a>

						</li>

						<li class="dropdown animated bounceInRight">
							<a data-toggle="dropdown" class=" dropdown-toggle"
								href="commande.faces">
								<div id="mydiv2">
								</div> &nbsp;&nbsp;<span style="font-size: 14px;" class="hidden-xs"><strong>Commandes</strong>
							</span> </a>

						</li>

						<li class="dropdown animated bounceInRight">
							<a style="background-color: #428bca;" data-toggle="dropdown" class="logout dropdown-toggle"
								href="ModifierPwd.faces">
								<div id="mydiv30"></div> &nbsp;&nbsp; <span style="font-size: 14px;"
								class="hidden-xs"><strong>Profile</strong> </span> </a>

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
			<br />
			<br />
			<section id="main-content">
			<section class="wrapper">
			<div class="container">

				<div class="animated bounceInDown">
					<h2>
						Bienvenue
						<strong> <h:outputText value="#{users.login}"></h:outputText>
						</strong>
					</h2>
					<h5>
						Veuillez remplir les informations en dessous :
					</h5>
				</div>
				<br />
				<br />

				<div class="row animated zoomIn">
					<h:form id="addCmdForm" rendered="true">

						<div class="row">
							<div class="col-md-12">
								<div class="row">

									<div class="col-md-12">
										<div class="form-group">
											<strong><h:outputText value="Nom du compte :"></h:outputText>
											</strong>
											<h:inputText disabled="true" styleClass="form-control tip"
												style=" width: 300px" id="login" value="#{users.login}"></h:inputText>


										</div>
									</div>



									<div class="col-md-12">
										<div class="form-group">
											<strong> <h:outputText value="Nouveau mot de passe : "></h:outputText>
											</strong>
											<h:inputText styleClass="form-control tip"
												style="width: 300px" id="pass" value="#{users.password}"
												required="true" rendered="true"
												requiredMessage="Veuillez saisir un nouveau mot de passe !! "></h:inputText>

										</div>
									</div>

								</div>

							</div>
						</div>

						<br />
						<br />
						<h:commandButton style="width: 100px; height: 42px"
							styleClass="btn btn-theme02" id="add"
							action="#{users.ModifierPassword}" value="Valider"></h:commandButton>
						<h:commandButton styleClass="btn btn-theme02"
							style="margin-left:100px;   width: 100px; height: 42px"
							action="#{users.annulerModif}" immediate="true" value="Annuler"></h:commandButton>
						</br>
						</br>
						<br/>
						<div>
							<h:messages style="color: blue; padding-right:30px;"  globalOnly="true" />
							<h:message style="color:red;" id="codePassMessage" for="pass" errorClass="erreur" />
						
							

						</div>


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

		</f:view>
	</body>
</html>