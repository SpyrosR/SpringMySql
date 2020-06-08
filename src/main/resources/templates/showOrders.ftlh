<!DOCTYPE html>
<html>
<head>
    <title>Orders</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
<h2>List of Orders</h2>

<table>
    <tr>
        <th>Order Id</th>
        <th>First Name</th>
        <th>Last Name</th>
    </tr>

    <#list orders as order>
        <tr>
            <td>${order.orderId}</td>
            <td>${order.firstName}</td>
            <td>${order.lastName}</td>
        </tr>
    </#list>
</table>
</body>
</html>