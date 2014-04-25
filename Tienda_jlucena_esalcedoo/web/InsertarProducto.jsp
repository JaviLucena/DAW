<%-- 
/**
 * Grado en ingeniería del Software
 * @author  Javier Lucena Fernández, EXP: 37
 *          Elena Salcedo Ortega, EXP: 46
 */
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insertar nuevo producto</title>
    </head>

    <body>
        <c:import url="cabecera.html" charEncoding="utf-8"/>

        <form method='get' action='ServerListaProductos'>
            <br>
            <br>
            <br>
            Id Producto: <input type='text' name='idProducto' value='${producto.idProducto}'/><br>
            Nombre: <input type='text' name='nombreProducto' value='${producto.nombre}'/><br>
            Precio: <input type='text' name='precio' value='${producto.precio}'/><br>
            <input type='submit' value='Guardar'/>
        </form>

        <br>
        <br>
        <a href='EnCaPaqui.jsp'>
            <button><- Volver</button>
        </a>
    </body>
</html>