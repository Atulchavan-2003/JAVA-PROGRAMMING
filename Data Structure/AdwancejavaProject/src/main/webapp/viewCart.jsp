
<%@ page import="java.util.*" %>

<html>
<body>

<h2>Your Cart</h2>

<%
    ArrayList<String> cart = (ArrayList<String>) session.getAttribute("cart");

    if (cart == null || cart.size() == 0) {
%>

<h3>No items in cart!</h3>

<%
    } else {
        for (String p : cart) {
%>

<form action="CartServlet" method="post">
    <input type="hidden" name="action" value="remove">
    <input type="hidden" name="product" value="<%= p %>">
    <%= p %> 
    <button type="submit">Remove</button>
</form>
<br>

<%
        }
    }
%>

<a href="product.html">Back to Product Page</a>

</body>
</html>
