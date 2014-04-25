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
        <title>EnCaPaqui JSP page</title>
    </head>
    <body>
        <c:import url="cabecera.html" charEncoding="utf-8"/>
        
        <form method='get' action='Tienda'>
             <br>
            <form method='get' action='ServerListaProductos'>
                Buscar producto: <input var='prodBuscado' type='text' name='idProd'/><br>
                <select name="listbox" multiple="true" style="height: 18px">
                    <option value="nombre">Nombre</option>
                    <option value="categoria">Categoria</option>
                    <option value="precio">Precio</option>
                </select>
                <input type='submit' value='Buscar'/>
        </form>
        <c:import url="MostrarProductos.jsp" charEncoding="utf-8"/>
    </body>
</html>

