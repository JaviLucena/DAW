<%-- 
    Document   : MostrarProductos
    Created on : 25-abr-2014, 1:14:07
    Author     : elena
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tablón Anuncios</title>
    </head>
    <body>
       <!-- <c:import url="cabecera.html" charEncoding="utf-8"/> -->

        <c:choose>
            <c:when test="${pageContext.session.new}">
                
            </c:when>
        </c:choose>

        <h2>Productos</h2>
        <h3>Precio / Nombre / categoria</h3>        

        <c:forEach var="anuncio" items="${anuncios}" varStatus="status">
            <a href='MostrarProducto?idProducto=${status.count-1}'>
                ${producto.idProducto} ${producto.nombre} ${producto.precio} ${producto.categoria}
            </a><br>            
        </c:forEach>

        <br/><br/><a href='InsertarProducto.jsp'>Inicia Sesion</a>

        <br><br><br>
        

    </body>
</html>