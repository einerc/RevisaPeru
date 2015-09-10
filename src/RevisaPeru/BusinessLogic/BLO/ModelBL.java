/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RevisaPeru.BusinessLogic.BLO;

import RevisaPeru.BusinessLogic.*;
import RevisaPeru.DataAccess.*;
import RevisaPeru.DataAccess.DAO.*;
import RevisaPeru.Entities.Model;
import java.util.List;

/**
 *
 * @author user
 */
public class ModelBL implements IModelBL{
    
    IModelDAO modelDAO=null;
    public ModelBL() {
        modelDAO = new ModelDAO();
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
    public void deleteFromModelById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        return modelDAO.getFromModelById(id);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Model> getAllFromModel() {
        return modelDAO.getAllFromModel();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Model> getCustomizedFromModel(String searchValue, String searchYear, Integer makerId) {
        return modelDAO.getCustomizedFromModel(searchValue, searchYear, makerId);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
