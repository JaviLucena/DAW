package Modelo_Controlador;

import java.util.List;
import javax.servlet.http.HttpServlet;

public abstract class ServletBase extends HttpServlet {

    protected List<Producto> productos;
    protected List<Pedido> pedidos;

    @Override
    public void init() {
        productos = (List<Producto>) this.getServletContext().getAttribute("productos");
        pedidos = (List<Pedido>) this.getServletContext().getAttribute("pedidos");
    }
       
}
