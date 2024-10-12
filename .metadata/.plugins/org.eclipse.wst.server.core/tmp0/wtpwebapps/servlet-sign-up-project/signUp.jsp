<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
    <style>
        * {
            box-sizing: border-box;
            margin: 0;
            padding: 0;
        }
        .main {
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
            gap: 5vw;
            border: 3px solid aqua;
            box-shadow: 0 1px 12px 1px red;
            background-color: black;
            color: black;
            height: 70vh;
            width: 86vw;
            position: relative;
            background-color: whitesmoke;
         
            
        }

        .main form table tr td {
            color: black;
            font-size: large;
            font-family: 'Franklin Gothic Medium', 'Arial Narrow', Arial, sans-serif;
        }

        .main h2 {
            color:black;
            font-family: 'Courier New', Courier, monospace;
        }

        .main form table tr td input {
            padding: 2px 5px 1px 16px;
            text-align: start;

        }
        .main form{
            display: flex;
            flex-direction: column;
        }
        button{
        border: 5px solid black;
        background-color: blue;
        color:white
        }



    </style>
</head>

<body>
    <div class="main">
        <h2>Sign up Form</h2>
        <form action="MyForm">
            <table>
                <tr>
                    <td>Enter your Name</td>
                    <td><input type="text" name="user_name" placeholder="Enter the your name"></td>
                </tr>
                <tr>
                    <td>Enter your Password</td>
                    <td><input type="password" name="user_password" placeholder="Enter the your Password"></td>
                </tr>
                <tr>
                    <td>Enter your Email</td>
                    <td><input type="email" name="user_email" placeholder="Enter the your email"></td>
                </tr>
                <tr>
                    <td>Select Gender</td>
                    <td><input type="radio" name="user_gender" value="male">Male &nbsp; &nbsp; <input type="radio"
                            name="user_gender" value="female">female
                    </td>
                </tr>
                <tr>
                    <td>Select your Course</td>
                    <td> &nbsp;
                        <select name="user_course" id="">
                            <option value="Java">Java</option>
                            <option value="Python">Python</option>
                            <option value="C++">C++</option>
                            <option value="JavaScript">JavaScript</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td style="text-align: right;">&nbsp;<input type="checkbox" name="user_checked" value="chicked" />
                    </td>
                    <td>Agree terms and condition</td>
                </tr>
                <div class="button">
                    <tr>
                        <td><button type="submit">submit</button></td>
                        <td><button type="reset">Reset</button></td>
                    </tr>
                </div>
            </table>
        </form>
    </div>
</body>

</html>