<%@ page import="your.package.User" %>

<!DOCTYPE html>
<html>
<head>
    <title>User Form</title>
</head>
<body>
    <h2>User Form</h2>
    <form action="user" method="post">
        <input type="hidden" name="action" value="${empty user ? 'add' : 'update'}">
        <c:if test="${not empty user}">
            <input type="hidden" name="id" value="${user.id}">
        </c:if>
        <label for="username">Username:</label>
        <input type="text" name="username" value="${empty user ? '' : user.username}" required><br>
        <label for="email">Email:</label>
        <input type="email" name="email" value="${empty user ? '' : user.email}" required><br>
        <label for="password">Password:</label>
        <input type="password" name="password" value="${empty user ? '' : user.password}" required><br>
        <input type="submit" value="${empty user ? 'Add User' : 'Update User'}">
    </form>
    <a href="user?action=list">Cancel</a>
</body>
</html>
