<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Boring Bank - home</title>
    </head>

    <style>
        @import url('https://fonts.googleapis.com/css2?family=Roboto:wght@100;300&display=swap');

        body {
            background-color: #C5D5E4;
            font-family: "Roboto", sans-serif;
        }

        header a {
            text-decoration: none;
            color: #000;
        }

        header {
            display: flex;
            border: 1px solid black;
            justify-content: space-between;

            /*background-color: #F8F4E3;*/
            background-color: #DAE2DF;

            padding: 10px;
            color: black;
        }

        .header-section {
            display: flex;
            align-items: center;
        }

        .header-item {
            padding: 10px 15px;
            font-size: 15px;
            margin-left: 5px;
        }

        .header-item:hover {
            background-color: #FFFFFC;
            border-radius: 4px;
        }

        .header-logo {
            font-weight: bold;
        }

        .header-button {
            cursor: pointer;
        }

        .container {
            background-color: #DAE2DF;
            border: 1px solid black;

            margin-top: 10px;

            height: 100%;
            width: 100%;
        }

        .presentation-picture {
            position: absolute;
            margin-left: 75%;

            width: 550px;
            height: 300px;
        }
    </style>
    <body>
        <header>
            <div class="header-section">
                <div class="header-item header-logo">BB</div>
                <div class="header-item header-button"><a href="#">Home</a> </div>
                <div class="header-item header-button"><a href="#">About</a> </div>
                <div class="header-item header-button"><a href="#">Private Clients</a> </div>
                <div class="header-item header-button"><a href="#">Currency Rate</a> </div>
            </div>
            <div class="header-section">
<%--                TODO change LANG to language selector--%>
                <div class="header-item header-button"><a href="#">[LANG]</a></div>
    <div class="header-item header-button"><a href="#">Sign up</a></div>
                <div class="header-item header-button"><a href="#">Sign in</a></div>
            </div>
        </header>

<%--        <div class="container">--%>
<%--            <div class="presentation-image"><img src="media/bank-image-home.jpg"></div>--%>
<%--        </div>--%>


    </body>
</html>