<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="register.css">
    <title>Register</title>
</head>

<body>

    <section>
        <div class="form-box">
            <div class="form-value">
                <form action="dispatch">
                    <h2>Register</h2>
                    <div class="inputbox">
                        <ion-icon name="mail-outline"></ion-icon>
                        <input type="username" name="txtemail" required>
                        <label for="">Email</label>
                    </div>
                    <div class="inputbox">
                        <ion-icon name="lock-closed-outline"></ion-icon>
                        <input type="password" name="txtpassword" required>
                        <label for="">Password</label>
<!--                        <input type="text" name="txtpassword" value="" required="" />-->
                    </div>
                    <div class="inputbox">
                        <ion-icon name="person-outline"></ion-icon>
                        <input type="text" name="txtfullname" required>
                        <label for="">Fullname</label>
                    </div>
                    <div class="inputbox">
                        <ion-icon name="call-outline"></ion-icon>
                        <input type="text" name="txtphone" required>
                        <label for="">Phone</label>
                    </div>
                    <button name="btAction" value="Registrate">Register</button>
                    <% 
                    String Error =(String)request.getAttribute("error");
                    if (Error!=null) {
                            %>
                     <div style="color: red"><%= Error %> </div>
                    <%
                        }
                    %>
                    <div class="login">
                        <p>Have an account <a href="login.html">Login</a></p>
                    </div>
                </form>
            </div>
        </div>
    </section>


    <script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
    <script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>
</body>

</html>