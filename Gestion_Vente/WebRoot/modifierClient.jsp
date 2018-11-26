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
							<a style="background-color: #428bca;" data-toggle="dropdown"
								class="logout dropdown-toggle" href="Affiche.faces">
								<div id="mydiv"></div>&nbsp;&nbsp;<span style="font-size: 14px;"
								class="hidden-xs"><strong>Produits</strong> </span> </a>
						</li>

						<li class="dropdown animated bounceInRight">
							<a data-toggle="dropdown" class="dropdown-toggle"
								href="clientsList.faces">
								<div id="mydiv1"></div> <span style="font-size: 14px;"
								class="hidden-xs"><strong>Clients</strong> </span> </a>
						</li>

						<li class="dropdown animated bounceInRight">
							<a data-toggle="dropdown" class=" dropdown-toggle"
								href="commande.faces">
								<div id="mydiv2">
								</div> &nbsp;&nbsp;<span style="font-size: 14px;" class="hidden-xs"><strong>Commandes</strong>
							</span> </a>

						</li>

						<li class="dropdown animated bounceInRight">
							<a data-toggle="dropdown" class="dropdown-toggle"
								href="ModifierPwd.faces">
								<div id="mydiv30"></div> &nbsp;&nbsp;<span
								style="font-size: 14px;" class="hidden-xs"><strong>Profile</strong>
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
			<br />
			<br />
			<section id="main-content">
			<section class="wrapper">
			<div class="container">

				<div class="animated bounceInDown">
					<h2>
						Modifier un Client
					</h2>
					<p>
						Veuillez remplir les informations en dessous :
					</p>
				</div>
				<br />
				<br />

				<div class="row animated zoomIn">
				
					<h:form rendered="true">

						<div class="row">
							<div class="col-md-12">
								<div class="row">

									<div class="col-md-6">
										<div class="form-group">
											<strong> <h:outputText value=" Nom du client * :"></h:outputText>
											</strong>
											<h:inputText styleClass="form-control tip"
												style="width: 300px" id="nomClient"
												value="#{Client.nomClient}" required="true"
												rendered="true"
												requiredMessage="Veuillez saisir le nom du client !"></h:inputText>

										</div>
									</div>

									<div class="col-md-6">
										<div class="form-group">

											<strong> <h:outputText
													value=" Adresse du client * :"></h:outputText> </strong>
											<h:inputText styleClass="form-control tip"
												style="width: 300px" id="adresseClient"
												value="#{Client.adresseClient}" required="true"
												requiredMessage="Veuillez saisir l'adresse du client !">
											</h:inputText>

										</div>
									</div>

									<div class="col-md-6">
										<div class="form-group">
											<strong> <h:outputText
													value="Téléphone du client * :"></h:outputText> </strong>
											<h:inputText styleClass="form-control tip"
												style="width: 300px" id="teleClient"
												value="#{Client.teleClient}" required="true"
												rendered="true"
												requiredMessage="Veuillez saisir le téléphone du client !"></h:inputText>

										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<strong> <h:outputText value="Email du client * :"></h:outputText>
											</strong>

											<h:inputText styleClass="form-control tip"
												style="width: 300px" id="emailClient"
												value="#{Client.emailClient}" required="true"
												rendered="true"
												requiredMessage="Veuillez saisir l'email du client !">
											</h:inputText>
										</div>
									</div>


								</div>

							</div>
						</div>



						<br />
						<br />
							
						<h:commandButton styleClass="btn btn-theme02"
							style="width: 120px; height: 42px" id="add"
							action="#{Client.updateClient}" value="Modifier client">
							<f:param name="nomClient" value="#{Client.nomClient}"></f:param>
							<f:param name="adresseClient"
								value="#{Client.adresseClient}"></f:param>
							<f:param name="teleClient" value="#{Client.teleClient}"></f:param>
							<f:param name="emailClient" value="#{Client.emailClient}"></f:param>

						</h:commandButton>
						<h:commandButton styleClass="btn btn-theme02"
							style="margin-left:100px;   width: 100px; height: 42px"
							action="#{Client.annulerModif}" value="Annuler" immediate="true"></h:commandButton>

						<br />
						<br />
						<br />
						<h:message style="color:red;" id="nomClientMessage" for="nomClient"
							errorClass="erreur" />
						<br />
						<h:message style="color:red;" id="adresseClientMessage" for="adresseClient"
							errorClass="erreur" />
						<br />
						<h:message style="color:red;" id="teleClientMessage" for="teleClient"
							errorClass="erreur" />
						<br />
						<h:message style="color:red;" id="emailClientMessage" for="emailClient"
							errorClass="erreur" />

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