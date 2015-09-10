/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RevisaPeru.DataAccess;
import RevisaPeru.Entities.*;
import java.util.List;

/**
 *
 * @author user
 */
public interface IModelDAO {
    void insertModel(Model model);
    void modifyModel(Model model);
    void deleteFromModeById(int id);
    void deleteModel(Model model);
    int getIdModel();
    Model getFromModelById(int id);
    List<Model> getAllFromModel();
    List<Model> getCustomizedFromModel(String searchValue, String searchYear, Integer makerId);
}
