<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title> Boring Bank - Sign up
        </title>
    </head>

    <style>
        @import url('https://fonts.googleapis.com/css2?family=Roboto:wght@100;300&display=swap');

        body {
            background-color: #C5D5E4;
            font-family: Roboto, sans-serif;
        }

        .signup-box {
            width: 360px;
            background-color: #DAE2DF;
        }

        h1 {
            text-align: center;
            padding-top: 15px;
        }

        form {
            width: 300px;

            margin: auto;
        }

        form label {
            display: flex;
            margin-top: 20px;
            font-size: 18px;
        }

        form input {
            width: 100%;
            padding: 7px;

            border: 1px solid black;
            outline: none;

        }

        /*FIXME change to correct selector*/
        .submit-form {
            width: 100%;

            margin-top: 10px;
            height: 25px;

            border: 1px solid black;
        }

        p {
            text-align: center;
            padding-top: 20px;

            font-size: 15px;
        }
    </style>

    <body>
    <form>
        <div class="signup-box">
            <h1>Sign Up</h1>
            <label>First Name</label>
            <input type="text" size="16">
            <label>Last Name</label>
            <input type="text" size="16">
            <label>Date of Birth</label>
            <input type="date">

            <label>E-mail</label>
            <input type="text" size="32">

            <label>Password</label>
            <input type="password" size="32">
            <label>Confirm Password</label>
            <input type="password" size="32">

            <button class="submit-form" type="submit">Submit</button>

            <p>Already have an account? <a href="#">Login</a></p>
        </div>
    </form>
    </body>
</html>
