/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RevisaPeru.DataAccess.DAO;

import RevisaPeru.DataAccess.*;
//import RevisaPeru.DataAccess.DAO.*;
import RevisaPeru.Entities.*;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class ModelDAO implements IModelDAO {
    //Acceso a objetos embebidos
    IMarkDAO markDAO =null;
 //obtener instacia del objeto de coneccion base de datos
    Objectdb db=null;
    //Lista de objetos 
    List<Model> models = null;
    ResultSet modelRS=null;
    //Stored procedure requierd
    CallableStatement modelStmt=null;
    //Objeto embebido
    Mark mark=null;
    //Constructor
    public ModelDAO() 
    {        
        markDAO= new MarkDAO();
        db= Objectdb.getIntacia();
    }
    
    @Override
    public void insertModel(Model model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modifyModel(Model model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteFromModeById(int id) {
        try {
            modelStmt = db.conexion.prepareCall("{CALL deleteFromModeById(?)}");
            modelStmt.setInt(1, id);
            modelStmt.execute();           
        } catch (SQLException ex) {
            Logger.getLogger(ModelDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void deleteModel(Model model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getIdModel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Model getFromModelById(int id) {
        Model model=null;
        try {
            modelStmt = db.conexion.prepareCall("{CALL getFromModelById(?)}");
            modelStmt.setInt(1, id);
            modelStmt.execute();
            modelRS = modelStmt.getResultSet();
            while(modelRS.next())
            {
                if ((model==null) && (modelRS.getRow()==0))
                {                    
                    model = new Model(
                        modelRS.getInt("id"),
                        modelRS.getString("name"),
                        modelRS.getString("trany"),
                        modelRS.getString("year"),                        
                        modelRS.getString("vClass"),
                        modelRS.getString("cylinders"),
                        modelRS.getString("drive"),
                        modelRS.getString("fuelType"),                       
                        modelRS.getString("fuelType1"),
                        modelRS.getString("fuelType2"),
                        modelRS.getString("atvType"),
                        modelRS.getInt("markId")                      
                    );
                }
                //models.add(model);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MarkDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return model;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Model> getAllFromModel() {
        models = new ArrayList<Model>();        
        try {
            modelStmt = db.conexion.prepareCall("{CALL getAllFromModel()}");
            //markStmt.setString(1, parameter);
            modelStmt.execute();
            modelRS = modelStmt.getResultSet();
            db.cerrarBD();
            while(modelRS.next())
            {                
                Model model = new Model(
                        modelRS.getInt("id"),
                        modelRS.getString("name"),
                        modelRS.getString("trany"),
                        modelRS.getString("year"),                        
                        modelRS.getString("vClass"),
                        modelRS.getString("cylinders"),
                        modelRS.getString("drive"),
                        modelRS.getString("fuelType"),                       
                        modelRS.getString("fuelType1"),
                        modelRS.getString("fuelType2"),
                        modelRS.getString("atvType"),
                        modelRS.getInt("markId")                      
                    );
                mark= markDAO.getFromMarkById(model.getMarkId());
                model.setMark(mark);
                models.add(model);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MarkDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return models;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Model> getCustomizedFromModel(String searchValue, String searchYear, Integer makerId) {
        models = new ArrayList<Model>();
        try {
            modelStmt = db.conexion.prepareCall("{CALL getCustomizedFromModel(?,?,?)}");
            modelStmt.setString(1, searchValue);
            modelStmt.setString(2, searchYear);
            modelStmt.setInt(3, makerId);
            //markStmt.setString(1, parameter);
            modelStmt.execute();
            modelRS = modelStmt.getResultSet();
            db.cerrarBD();
            while(modelRS.next())
            {
                 Model model = new Model(
                        modelRS.getInt("id"),
                        modelRS.getString("name"),
                        modelRS.getString("trany"),
                        modelRS.getString("year"),                        
                        modelRS.getString("vClass"),
                        modelRS.getString("cylinders"),
                        modelRS.getString("drive"),
                        modelRS.getString("fuelType"),                       
                        modelRS.getString("fuelType1"),
                        modelRS.getString("fuelType2"),
                        modelRS.getString("atvType"),
                        modelRS.getInt("markId")                      
                    );
                mark= markDAO.getFromMarkById(model.getMarkId());
                model.setMark(mark);
                models.add(model);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MarkDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return models;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
