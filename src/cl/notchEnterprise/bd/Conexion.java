package cl.notchEnterprise.bd;

import java.sql.*;

public class Conexion {
    private Connection con;// Establecer la conexión
    private Statement sen; // Ejecutar consultas
    private ResultSet rs;  // Recorrer los resultados (Tabla)
    
    public Conexion(String server, String bd, String user, String pass) throws SQLException{
        String protocolo = "jdbc:mysql://";
        String lineaUser = "user="+user;
        String lineaPass = "password="+pass;
        //jdbc:mysql://localhost/bd_juegos?user=root&password=123456
        
        
        String url = protocolo + 
                server + "/" + 
                bd + "?" + 
                lineaUser + "&" +
                lineaPass;
        
        System.out.println(url);
        
        /*con es un atributo de la clase conexion, encargado de conectarse con la base de datos.
        Este objeto luego se utiliza en cada query*/
        con = DriverManager.getConnection(url);
    }
    
    /*
    consultas actualizan los datos --> delete, insert, update
    ver datos--> select
    */
    
    //insert, delete, update
    public void ejecutar(String query) throws SQLException{
        sen=con.createStatement();//abrir
        sen.executeUpdate(query);//ejecuto
        sen.close();//cierro
    }
    
    /**
     * Metodo se utiliar para hacer una query que se conecte con la bd. Permitirá
     * convertir un registro mysql en un objeto java.
     * @param query
     * @return
     * @throws SQLException 
     */
    public ResultSet ejecutarSelect(String query) throws SQLException{
        /*se llama al atributo, y se ejecuta el metodo create Statement, 
        que no entraré en detalles porque tampoco lo sé y porque no va al caso
        por ahora.
        
        Solo se debe entender que es así.
        */
        sen=con.createStatement(); // No recibe parametros.(segun se ve): createStatment en un meotod de con.
        rs=sen.executeQuery(query); //execute Query ES un metodo de sen.
        return rs;        
    }
    
    public void desconectar() throws SQLException{
        sen.close();
    }
}
