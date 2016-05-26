package cl.notchEnterprise.model;


import cl.notchEnterprise.bd.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Data {
    private Conexion c;
    private String query;
    
    /*
    Variable rs: Tabla virtual. MMMh. 
    No se puede hace un sout. Entiendelo como la planilla que se va a llenar con 
    los datos de la BD.
    */
    private ResultSet rs;
    
    /*Atributos que se utilizarán en metodos posteriores.*/
    private List<Genero> generos; //se utiliza para declarar una lista como atributo
    private List<Juego> juegos; //se utiliza para declarar una lista como atributo
    /*Para utilizarlas como unidad de retorno.*/
    
    /* LO QUE HACE DATA.
       // se utilizar para obtener sus atributos de manera mas rapida.
       //es para evitar el uso excesivo de consultas. (codigo mysql.)
       
       //Ejemplo:
       //Si voy a utilizar un REGISTRO ( en este caso, "de"  y "en" son lo mismo xd)
       //de la base de datos, no llamaré.
       //(NO HARE UNA CONSULTA PARA CADA ATRIBUTO.)
       //               (select*from tbl_NOMBRE, where id='id'); Se rescata el registro.
       //               Luego JAVA permite convertir ese registro como un objeto.
       //               Por eso existen metodos que realiza todo este proceso
       //a cada uno de sus atributos: Llamaré una sola vez, (al REGISTRO de la
       //bd para convertirlo en un OBJETO java), para utilizarlo en la gui.
       //Y así poder acceder a sus atributos (codigo java: el uso de los get())    
    */
    
    public Data() throws SQLException{
        c = new Conexion(
            "localhost",
            "bd_juegos",
            "root",
            "123456"
        );
    }
    
    /*Insert género*/
    public void crearGenero(String nombre) throws SQLException{
        query = "insert into genero values(null,'"+nombre+"')";
        System.out.println(query);
        c.ejecutar(query);
    }
    
    /*Select género*/
    /*Listado de todos géneros*/
    public List<Genero> getGeneros() throws SQLException{ //como acá. 
       //En este metodo en particular. Se hace la query y se retorna una lista de objetos: genero
       //:)
        generos=new ArrayList<>();
        Genero g;
        
        query = "select * from genero";
        System.out.println(query);
        rs=c.ejecutarSelect(query);
        
//        /*Mientras exista un siguiente registro*/
        while(rs.next()){
            g=new Genero();
            g.setId(rs.getInt(1));
            g.setNombre(rs.getString(2));
            generos.add(g);
        }
//        
        c.desconectar();
        return generos;
    }
    
    /**
     * El metodo permite obtener un objeto de la clase Genero que se encuentre 
     * a partir de un registro en la BD.
     * @param id como parametro para filtrar la query
     * @return un objeto de la clase Genero.
     * @throws SQLException 
     * SI
     */
    /*Buscar un genero por id*/
    public Genero getGenero(int id) throws SQLException{ //como acá.
        Genero g=null;
        query = "select * from genero where id = '"+id+"'";
        System.out.println(query);
        rs=c.ejecutarSelect(query);
        
        if(rs.next()){
            g=new Genero();
            g.setId(rs.getInt(1));
            g.setNombre(rs.getString(2));            
        }
        
        c.desconectar();
        return g;
    }
    
    /**
     * 
     * @param filtro se utiliza para filtrar la cantidad de resultados de la query.
     *      
     * @return SI : una lista de generos
     * @throws SQLException 
     * YA.
     */
    /*Buscar un género por nombre*/
    public List<Genero> buscarGenero(String filtro) throws SQLException{ 
        /*
        No se cual es la diferencia entre list y arraylit, pero
        List se utiliza al principio para declararla como atributo
        Y Arraylist se utiliza ACA para INICIALIZARLA.
        */     
        
        generos=new ArrayList<>();
        Genero g; //acá se declara un objeto de la clase genero para SETEARLA        
        
        /*Dudas con la query?*/
        query = "select * from genero "
                + "where nombre like '%"+filtro+"%' "
                + "or id like '%"+filtro+"%'";
        System.out.println(query);
        
        /*
        Se declara una variabla rs, al inicio.
        y ACA se inicializa con un valor a partir de la consulta: "ejecutarSelect."
        */
        rs=c.ejecutarSelect(query); //Ya        

        /*Mientras exista un siguiente registro*/
        while(rs.next()){ //SETEO
            g=new Genero();
            g.setId(rs.getInt(1));
            g.setNombre(rs.getString(2));
            generos.add(g);
        }
        
        c.desconectar();
        return generos;        
    }
    
    
    /*Actualizar un género*/
    /**
     * 
     * @param g debe ya venir actualizado 
     */
    public void actualizarGenero(Genero g) throws SQLException{
        query = "update genero "
                + "set nombre = '"+g.getNombre()+"' "
                + "where id = '"+g.getId()+"'";
        System.out.println(query);
        c.ejecutar(query);
    }
    
    /*Eliminar un género*/
    public void eliminarGenero(int id) throws SQLException{
        query = "delete from genero where id = '"+id+"'";
        System.out.println(query);
        c.ejecutar(query);
    }
    
    /*Insert juego*/
    public void crearJuego(Juego j) throws SQLException{
        query = "insert into juego "
                + "values(null, "
                + "'"+j.getNombre()+"',"
                + "'"+j.getStock()+"',"
                + "'"+j.getPrecio()+"',"
                + "'"+j.getGenero()+"')";
        System.out.println(query);
        c.ejecutar(query);
    }
    /*Select juego*/
    /*Listado de todos los juegos*/
    public List<Juego> getJuegos() throws SQLException{
        juegos=new ArrayList<>();
        Juego j;
        
        query = "select * from juego";
        System.out.println(query);
        rs=c.ejecutarSelect(query);
        
        while(rs.next()){
            j=new Juego();
            j.setId(rs.getInt(1));
            j.setNombre(rs.getString(2));
            j.setStock(rs.getInt(3));
            j.setPrecio(rs.getInt(4));
            j.setGenero(rs.getInt(5));
            juegos.add(j);
        }
        c.desconectar();
        return juegos;
    }
    
    /*Buscar un juego por id*/
    public Juego getJuego(int id) throws SQLException{
        Juego j=null;
        
        query = "select * from juego where id = "+id;
        System.out.println(query);
        rs=c.ejecutarSelect(query);
        
        if(rs.next()){
            j=new Juego();
            j.setId(rs.getInt(1));
            j.setNombre(rs.getString(2));
            j.setStock(rs.getInt(3));
            j.setPrecio(rs.getInt(4));
            j.setGenero(rs.getInt(5));
        }       
        
        c.desconectar();
        return j;
    }
    
    /*Buscar un género por nombre*/
    public List<Juego> buscarJuego(String filtro) throws SQLException{
        juegos=new ArrayList<>();
        Juego j;
        
        query = "select * from juego "
                + "where id like '%"+filtro+"%' or "
                + "nombre like '%"+filtro+"%' or "
                + "genero like '%"+filtro+"%'";
        System.out.println(query);
        rs=c.ejecutarSelect(query);  
        
        while(rs.next()){
            j=new Juego();
            j.setId(rs.getInt(1));
            j.setNombre(rs.getString(2));
            j.setStock(rs.getInt(3));
            j.setPrecio(rs.getInt(4));
            j.setGenero(rs.getInt(5));
            juegos.add(j);
        }
        c.desconectar();
        return juegos;
    }
    
    /*Actualizar un juego*/
    /**
     * 
     * @param j debe ya venir actualizado 
     */
    public void actualizarJuego(Juego j) throws SQLException{
        query = "update juego "
                + "set nombre = '"+j.getNombre()+"',"
                + "stock = '"+j.getStock()+"',"
                + "precio = '"+j.getPrecio()+"',"
                + "genero = '"+j.getGenero()+"' "
                + "where id = '"+j.getId()+"'";
        System.out.println(query);
        c.ejecutar(query);
    }
    
    /*Eliminar un juego*/
    public void eliminarJuego(int id) throws SQLException{
        query = "delete from juego where id = '"+id+"'";
        System.out.println(query);
        c.ejecutar(query);
    }
    
    
}
