/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RevisaPeru.DataAccess.DAO;

import RevisaPeru.DataAccess.*;
import RevisaPeru.Entities.*;
import java.sql.CallableStatement;
import java.util.List;
/*
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.HashSet;
import java.util.Set;
*/
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class MarkDAO implements IMarkDAO {
    //obtener instacia del objeto de coneccion base de datos
    Objectdb db=null;
    //Lista de objetos 
    List<Mark> marks = null;
    ResultSet markRS=null;
    //Stored procedure requierd
    CallableStatement markStmt=null;
    //
    public MarkDAO() {
        db = Objectdb.getIntacia();
    }
    
    @Override
    public void insertMark(Mark mark) {
        try {
            markStmt = db.conexion.prepareCall("{CALL insertMark(?,?,?)}");
            markStmt.setInt(1, mark.getId());
            markStmt.setString(2, mark.getName());
            markStmt.setString(3,mark.getDescription());
            markStmt.execute();
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        } catch (SQLException ex) {
            Logger.getLogger(MarkDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void modifyMark(Mark mark) {
        try {
            markStmt = db.conexion.prepareCall("{CALL modifyMark(?,?,?)}");
            markStmt.setInt(1, mark.getId());
            markStmt.setString(2, mark.getName());
            markStmt.setString(3,mark.getDescription());
            markStmt.execute();
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        } catch (SQLException ex) {
            Logger.getLogger(MarkDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteFromMarkById(int id) {
        try {
            markStmt = db.conexion.prepareCall("{CALL insertMark(?,?,?)}");
            markStmt.setInt(1, id);
            markStmt.execute();
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        } catch (SQLException ex) {
            Logger.getLogger(MarkDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void deleteMark(Mark mark) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getIdMark() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Mark getFromMarkById(int id) {
       // marks = new ArrayList<Mark>();
        Mark mark=null;
        try {
            markStmt = db.conexion.prepareCall("{CALL getFromMarkById(?)}");
            markStmt.setInt(1, id);
            markStmt.execute();
            markRS = markStmt.getResultSet();
            //db.cerrarBD();
            while(markRS.next())
            {
                 if ((mark==null) && (markRS.getRow()==0))
                {
                    mark = new Mark(
                            markRS.getInt("id"),
                            markRS.getString("name"),
                            markRS.getString("description")
                    );
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(MarkDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mark;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Mark> getAllFromMark() {
        marks = new ArrayList<Mark>();
        try {
            markStmt = db.conexion.prepareCall("{CALL getAllFromMark()}");
            //markStmt.setString(1, parameter);
            markStmt.execute();
            markRS = markStmt.getResultSet();
            //db.cerrarBD();
            while(markRS.next())
            {
                Mark mark = new Mark(
                        markRS.getInt("id"),
                        markRS.getString("name"),
                        markRS.getString("description")
                );
                marks.add(mark);
                //producto.setIdProducto(rs.getInt("Codigo"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(MarkDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return marks;
//        marks = new ArrayList<Mark>();
//        try {
//            ResultSet rs = db.consultarBD("SELECT * FROM Mark");
//            while (rs.next()) {
//                Mark mark = new Mark();
//                mark.setId(rs.getInt("id"));
//                mark.setName(rs.getString("name"));
//                mark.setDescription(rs.getString("description"));
//                marks.add(mark);
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(MarkDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return marks;
       
    }

    @Override
    public List<Mark> getCustomizedFromMark(String parameter) {
        marks = new ArrayList<Mark>();
        try {
            markStmt = db.conexion.prepareCall("{CALL getCustomizedFromMark(?)}");
            markStmt.setString(1, parameter);
            markStmt.execute();
            markRS = markStmt.getResultSet();
            //db.cerrarBD();
            while(markRS.next())
            {
                Mark mark = new Mark(
                        markRS.getInt("id"),
                        markRS.getString("name"),
                        markRS.getString("description")
                );
                marks.add(mark);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MarkDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return marks;
    }
}
