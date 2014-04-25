package Modelo_Controlador;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class InicioFinContexto implements ServletContextListener {

    @Override
    public void contextDestroyed(ServletContextEvent event) {
    }

    @Override
    public void contextInitialized(ServletContextEvent event) {

        List<Producto> productos = new ArrayList<Producto>();
        event.getServletContext().setAttribute("Productos", productos);
        
    }
}
