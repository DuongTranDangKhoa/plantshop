<%@page import="DTO.OrderDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="DTO.AccountDTO"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">

	<!-- Boxicons -->
	<link href='https://unpkg.com/boxicons@2.0.9/css/boxicons.min.css' rel='stylesheet'>
	<!-- My CSS -->
	<link rel="stylesheet" href="style.css">
        <meta content="width=device-width, initial-scale=1.0" name="viewport">
        <meta content="Free HTML Templates" name="keywords">
        <meta content="Free HTML Templates" name="description">

        <!-- Favicon -->
        <link href="img/favicon.ico" rel="icon">

        <!-- Google Web Fonts -->
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;500;700&display=swap" rel="stylesheet">  

        <!-- Font Awesome -->
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">

        <!-- Libraries Stylesheet -->
        <link href="lib/animate/animate.min.css" rel="stylesheet">
        <link href="lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">

        <!-- Customized Bootstrap Stylesheet -->
        <link href="css/style.css" rel="stylesheet">s
	<title>Your Acount</title>
</head>
<body>


	<!-- SIDEBAR -->
	<section id="sidebar">
		<a href="#" class="brand">
			<i class='bx bxs-smile'></i>
			<span class="text">YOUR ACCOUNT</span>
		</a>
		<ul class="side-menu top">
                <li class="active">
                    <a href="#">
                        <i class='bx bxs-dashboard' ></i>
                        <span class="text">Change Profile</span>
                    </a>
                </li>
                <li>
                    <a href="changePlant?page=seeOrder">
                        <i class='bx bxs-shopping-bag-alt' ></i>
                        <span class="text">Order</span>
                    </a>
                </li>
                
            </ul>
		<ul class="side-menu">
			
			<li>
				<a href="index.jsp" class="logout">
					<i class='bx bxs-log-out-circle' ></i>
					<span class="text">Logout</span>
				</a>
			</li>
		</ul>
	</section>
	<!-- SIDEBAR -->



	<!-- CONTENT -->
	<section id="content">
		<!-- NAVBAR -->
		<nav>
			<i class='bx bx-menu' ></i>
			<a href="#" class="nav-link">Categories</a>
			<form action="#">
				<div class="form-input">
					<input type="search" placeholder="Search...">
					<button type="submit" class="search-btn"><i class='bx bx-search' ></i></button>
				</div>
			</form>
			<input type="checkbox" id="switch-mode" hidden>
			<label for="switch-mode" class="switch-mode"></label>
			<a href="#" class="notification">
				<i class='bx bxs-bell' ></i>
				<span class="num">8</span>
			</a>
			<a href="#" class="profile">
				<img src="img/people.png">
			</a>
		</nav>
		<!-- NAVBAR -->

		<!-- MAIN -->
		<main>
			<div class="head-title">
				<div class="left">
					<h1>Account</h1>
					<ul class="breadcrumb">
						<li>
							<a href="index.jsp">Home</a>
						</li>
						<li><i class='bx bx-chevron-right' ></i></li>
						<li>
							<a class="active" href="#">Order</a>
						</li>
					</ul>
				</div>				
			</div>

			


			<div class="table-data">
				<div class="order">
					<div class="head">
						<h3>Account</h3>
						<i class='bx bx-search' ></i>
						<i class='bx bx-filter' ></i>
					</div>
                                        <% ArrayList<OrderDTO> mange1 = (ArrayList<OrderDTO>) request.getAttribute("Order");
                            if (mange1 != null) {
                        %>
                        <table>
                            <thead>
                                <tr>
                                   <th>Plant ID</th>
                                    <th>Full Name</th>
                                    <th>Price</th>
                                    <th>Picture</th>
                                    <th>Description</th>
                                    <th>Status</th>
                                </tr>
                            </thead>
                            <tbody>
                                <%
                                 for (OrderDTO mange : mange1) {
                                %>
                                <tr>
                                    <td>
                                        <img src="img/people.png">
                                        <p><%= mange.getOrderID() %></p>
                                    </td>
                                    <td><%= mange.getOrderDate() %></td>
                                    <td>  <%= mange.getShipDate() %></td>
                                    <td><%= mange.getOrderID() %></td>
                                    <%if (mange.getStatus() == 1) { %>
                                    <td><span class="status completed">Completed</span></td>
                                    <%}%>
                                    <%if (mange.getStatus() == 2) { %>
                                    <td><span class="status process">Process</span></td>
                                    <%}%>
                                    <%if (mange.getStatus() == 3) { %>
                                    <td><span class="status pending">Canceled</span></td>
                                    <%}%>
                                </tr>
                                <%
                                        }
                                    }
                                %>
						</tbody>
					</table>
				</div>
			</div>
		</main>
		<!-- MAIN -->
	</section>
	<!-- CONTENT -->
	

	<script src="script.js"></script>
</body>
</html>