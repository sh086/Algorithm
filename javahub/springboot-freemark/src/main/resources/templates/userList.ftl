<html>
    <head>
        <title>用户数据</title>
        <meta charset="utf-8"/>
    </head>
    <body>
        <table border="1" width="50%" align="center">
            <tr>
                <td>ID</td>
                <td>NAME</td>
                <td>AGE</td>
            </tr>
            <#list userLists as user>
                <tr>
                    <td>${user.id}</td>
                    <td>${user.name}</td>
                    <td>${user.age}</td>
                </tr>
            </#list>
        </table>
    </body>
</html>