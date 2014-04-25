/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo_Controlador;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Modelo_Controlador.Producto;
/**
 *
 * @author elena 
 */

@WebServlet("/MostrarProducto")
public class MostrarProducto extends ServletBase{
        @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        String nombre = request.getParameter("nombre");
        Double precio1 = Double.parseDouble(request.getParameter("precio1"));
        Double precio2 = Double.parseDouble(request.getParameter("precio1"));
        String categoria1 = request.getParameter("alimentacion");
        String categoria2 = request.getParameter("drogueria");
        String categoria3 = request.getParameter("prensa");
        String categoria4 = request.getParameter("alimentacion");
        
        Producto prod = productos.get(
                Integer.parseInt(request.getParameter("idAnuncio")));
        
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/EnCaPaqui.jsp");
        rd.forward(request, response);                
    }
}
