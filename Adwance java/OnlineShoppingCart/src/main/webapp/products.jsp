<%@ page import="java.sql.*, com.project.util.DBConnection" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ include file="common/header.jsp" %>

<style>
.products-container {
    width: 90%;
    margin: 25px auto;
    display: grid;
    grid-template-columns: repeat(auto-fit, minmax(220px, 1fr));
    gap: 20px;
}

.product-card {
    background: white;
    padding: 15px;
    border-radius: 8px;
    box-shadow: 0 2px 6px rgba(0,0,0,0.2);
    text-align: center;
}

.product-card img {
    width: 100%;
    height: 180px;
    object-fit: cover;
    border-radius: 6px;
}

.product-card h3 {
    margin: 10px 0;
}

.product-card p {
    font-size: 14px;
    color: #555;
}

button {
    width: 90%;
    padding: 10px;
    margin-top: 8px;
    border: none;
    border-radius: 5px;
    cursor: pointer;
    font-weight: bold;
}

.add-btn {
    background: orange;
    color: white;
}

.buy-btn {
    background: green;
    color: white;
}
</style>

<h2 style="text-align:center; margin-top:20px;">Our Products</h2>

<div class="products-container">

<%
Connection con = null;
PreparedStatement ps = null;
ResultSet rs = null;

try {
    con = DBConnection.getConnection();
    ps = con.prepareStatement("SELECT * FROM products");
    rs = ps.executeQuery();

    while (rs.next()) {
%>

    <div class="product-card">
        <img src="images/<%= rs.getString("image") %>" alt="Product Image">

        <h3><%= rs.getString("name") %></h3>
        <p><%= rs.getString("description") %></p>
        <h3>₹ <%= rs.getDouble("price") %></h3>

       
        <form action="CartServlet" method="post">
            <input type="hidden" name="productId" value="<%= rs.getInt("id") %>">
            <button type="submit" name="action" value="add" class="add-btn">
                Add to Cart
            </button>
        </form>

       
        <form action="payment.jsp" method="get">
            <input type="hidden" name="total" value="<%= rs.getDouble("price") %>">
            <button type="submit" class="buy-btn">
                Buy Now
            </button>
        </form>
    </div>

<%
    }
} catch(Exception e) {
    out.println("<p style='color:red;text-align:center;'>Error loading products</p>");
    e.printStackTrace();
} finally {
    if (rs != null) rs.close();
    if (ps != null) ps.close();
    if (con != null) con.close();
}
%>

</div>

<%@ include file="common/footer.jsp" %>
