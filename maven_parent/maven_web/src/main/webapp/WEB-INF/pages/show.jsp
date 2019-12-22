<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        table{
            border: 10px solid orangered;
            margin: auto;
            width: 1000px;
        }

        th{
            border: 1px solid orangered;
        }

        td{

            border: 1px solid orangered;
        }
    </style>
</head>
<body>
       <table cellspacing="0">
           <tr>
               <th>编号</th>
               <th>用户名</th>
               <th>密码</th>
               <th>性别</th>
               <th>年龄</th>
               <th>邮箱</th>
           </tr>
           <tr>
               <td>${user.id}</td>
               <td>${user.username}</td>
               <td>${user.PASSWORD}</td>
               <td>${user.sex}</td>
               <td>${user.age}</td>
               <td>${user.email}</td>
           </tr>

       </table>
a
</body>
</html>
