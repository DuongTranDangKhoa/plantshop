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

	<title>AdminHub</title>
</head>
<body>


	<!-- SIDEBAR -->
	<section id="sidebar">
		<a href="#" class="brand">
			<i class='bx bxs-smile'></i>
			<span class="text">AdminHub</span>
		</a>
		<ul class="side-menu top">
                <li>
                    <a href="admin.jsp">
                        <i class='bx bxs-dashboard' ></i>
                        <span class="text">Order</span>
                    </a>
                </li>
                <li class="active">
                    <a href="mangeAcc?page=account">
                        <i class='bx bxs-shopping-bag-alt' ></i>
                        <span class="text">Account</span>
                    </a>
                </li>
                <li>
                    <a href="dispatch?btAction=Mange&page=plant">
                        <i class='bx bxs-doughnut-chart' ></i>
                        <span class="text">Plant</span>
                    </a>
                </li>
                <li>
                    <a href="categories.jsp?btAction=categories">
                        <i class='bx bxs-message-dots' ></i>
                        <span class="text">Categories</span>
                    </a>
                </li>
            </ul>
		<ul class="side-menu">
			
			<li>
				<a href="dispatch?btAction=Signout" class="logout">
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
							<a href="admin.jsp">Home</a>
						</li>
						<li><i class='bx bx-chevron-right' ></i></li>
						<li>
							<a class="active" href="account.jsp">Account</a>
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
                                        <% ArrayList<AccountDTO> AC = (ArrayList<AccountDTO>) session.getAttribute("account");
                            if (AC != null) {
                        %>
                        <table>
                            <thead>
                                <tr>
                                    <th>ACC ID</th>
                                    <th>Email</th>
                                    <th>Password</th>
                                    <th>FullName</th>
                                    <th>Phone</th>
                                    <th>Status</th>
                                    <th>Role</th>
                                </tr>
                            </thead>
                            <tbody>
                                <%
                                    for (AccountDTO mange : AC) {
                                %>
                                <tr>
                                    <td>
                                        <img src="img/people.png">
                                        <p><%= mange.getAccID()%></p>
                                    </td>
                                    <td><%= mange.getEmail() %></td>
                                    <td>  <%= mange.getPassword() %></td>
                                    <td><%= mange.getFullnameString() %></td>
                                    <td><%= mange.getPhone() %></td>
                                    <%if (mange.getStatus() == 1) { %>
                                    <td><span class="status completed">Open</span></td>
                                    <%}%>
                                    <%if (mange.getStatus() == 0) { %>
                                    <td><span class="status process">Block</span></td>
                                    <%}%>
                                    <%if (mange.getRole() == 1) { %>
                                    <td><span class="status completed">Admin</span></td>
                                    <%}%>
                                    <%if (mange.getRole() == 0) { %>
                                    <td><span class="status process">User</span></td>
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