/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RevisaPeru.BusinessLogic.BLO;

import RevisaPeru.BusinessLogic.*;
import RevisaPeru.Entities.*;
import java.util.List;

/*Invoker DataAccess LAYER*/
import RevisaPeru.DataAccess.*;
import RevisaPeru.DataAccess.DAO.*;
/*import RevisaPeru.DataAccess.DAO.MarcaDAO;
import RevisaPeru.DataAccess.IMarcaDA;
*/
/**
 *
 * @author user
 */
public class MarkBL implements IMarkBL {
    IMarkDAO markDAO;
    public MarkBL() {
        markDAO= new MarkDAO();
    }
        
    @Override
    public void insertMark(Mark mark) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modifyMark(Mark mark) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteFromMarkById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        return markDAO.getFromMarkById(id);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Mark> getAllFromMark() {
        return markDAO.getAllFromMark();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Mark> getCustomizedFromMark(String parameter) {
        return markDAO.getCustomizedFromMark(parameter);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
}
