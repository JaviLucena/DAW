/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo_Controlador;

/**
 *
 * @author elena
 */
public class Tienda {
    
    private Connection conn;

    public Tienda(DataSource ds) {
        try {
            conn = ds.getConnection();

        } catch (SQLException e) {
            throw new RuntimeException("Error en la base de datos",e);
        }
    }

    public void close() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                System.err.println("Error al cerrar la conexión: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }

    public List<Producto> getProductosCategoría(enum categoria){
        return getProductosQuery("nombre LIKE '%" + categoria + "%'");
    }
    
    public List<Producto> getProductosNombre(String nombre) {
        return getProductosQuery("nombre LIKE '%" + nombre + "%'");
    }

    public List<Producto> getProductosPrecio(double precio) {
        return getProductosQuery("precio = " + precio);
    }

    public List<Producto> getTodosProductos() {
        return getProductosQuery(null);
    }

    private List<Producto> getProductosQuery(String where, String cat) {

        List<Producto> productos = new ArrayList<Producto>();
        Statement stm = null;
        try {
            stm = this.conn.createStatement();
            String sql = "SELECT idProducto, nombre, precio FROM Productos";
            if (where != null) {
                sql += " WHERE " + where;
            }

            ResultSet rs = stm.executeQuery(sql);
            productos = crearProductoListFromRS(rs);
            cargarUsuarios(productos);
            rs.close();

        } catch (SQLException e) {
            throw new RuntimeException("Error al realizar la consulta",e);
        } finally {
            try {
                stm.close();
            } catch (SQLException e) {
                System.err.println("Error al realizar la consulta: " + e.getLocalizedMessage());
                e.printStackTrace();
            }
        }
        return productos;
    }

    private void cargarUsuarios(List<Producto> productos) {

        Statement stm = null;
        try {
            stm = this.conn.createStatement();

            for (Producto produc : productos) {
                ResultSet rs = stm.executeQuery("SELECT productos.idProducto, nombre, direccion FROM usuario, relacionproductousuarios "
                        + "WHERE usuario.idUsuario = relacionproductousuarios.idUsuario "
                        + "AND relacionproductousuario.idProducto = " + produc.getId());
                produc.setUsuarios(crearUsuarioListFromRS(rs));
                rs.close();
            }

        } catch (SQLException e) {
            throw new RuntimeException("Error al realizar la consulta",e);
        } finally {
            try {
                stm.close();
            } catch (SQLException e) {
                System.err.println("Error al realizar la consulta: " + e.getLocalizedMessage());
                e.printStackTrace();
            }
        }
    }

    private List<Usuario> crearUsuarioListFromRS(ResultSet rs) throws SQLException {
        List<Usuario> usuarios = new ArrayList<Usuario>();
        while (rs.next()) {
            int id = rs.getInt("idUsuario");
            String nombre = rs.getString("nombre");
            String nacionalidad = rs.getString("nacionalidad");
            usuarios.add(new Usuario(id, nombre, nacionalidad));
        }
        return usuarios;
    }

    private List<Producto> crearProductoListFromRS(ResultSet rs) throws SQLException {
        List<Producto> productos = new ArrayList<Producto>();
        while (rs.next()) {
            int id = rs.getInt("idProducto");
            String nombreProducto = rs.getString("nombre");
            int precio = rs.getInt("precio");
            productos.add(new Producto(id, nombreProducto, precio, null));
        }
        return productos;
    }
}
