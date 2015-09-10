/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates meditran_admin
 * and open the template in the editor. v3@0;@pvqTgn
 */
package RevisaPeru.DataAccess;

import java.sql.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
//import java.sql.CallableStatement;

/**
 *
 * @author user
 */
public class Objectdb {
     //la variable nonInstance es de tipo Objectdb
    private static Objectdb nonInstance = null;
    public static Objectdb getIntacia;
    
    public Connection conexion=null;
    Statement st=null;
    //Stored Procedure
        
    //caracteristica del patron Singleton donde su constructor el privado
    private Objectdb() 
    {
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            conexion = DriverManager.getConnection("jdbc:mysql://meditranperu.com:3306/meditran_RevisaTest","33","''''");
            st=conexion.createStatement();
        } catch (SQLException ex) 
        {
            Logger.getLogger(Objectdb.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
   /* public insertMethod(String )
    {
        try {
            cStatmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Objectdb.class.getName()).log(Level.SEVERE, null, ex);
        }

    }*/

   /* public CallableStatement invokerProcedure(String storedProcedure)
    {
        try {
            cStatmt = this.conexion.prepareCall("{ CALL"+storedProcedure+"}");
        } catch (SQLException ex) {
            Logger.getLogger(Objectdb.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cStatmt;
    }
    */
    public int modificarBD(String sql)
    {
        try 
        {
            
            return st.executeUpdate(sql);
        } catch (SQLException ex) 
        {
            return -1;
        }
    }
    
    public ResultSet consultarBD(String sql)
    {
        ResultSet rs = null;
        try 
        {
            
            rs = st.executeQuery(sql);
        } catch (SQLException ex) 
        {
            System.out.println(ex.getMessage());
        }
       return rs;
    }
    
    public void cerrarBD()
    {
        try {
            st.close();
            conexion.close();
        } catch (SQLException ex) 
        {
            Logger.getLogger(Objectdb.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    
    public static Objectdb getIntacia()
    {
        //analizamos si el objecto no a sido creado es decir si no existe
        if(nonInstance==null)
            // si no se ah instanciado la clase entonces creamos el objeto
            nonInstance = new Objectdb();
        return nonInstance;
    }
}
