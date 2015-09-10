/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RevisaPeru.BusinessLogic;

import RevisaPeru.Entities.*;
import java.util.List;

/**
 *
 * @author user
 */
public interface IMarkBL {
    void insertMark(Mark mark);
    void modifyMark(Mark mark);
    void deleteFromMarkById(int id);
    void deleteMark(Mark mark);
    int getIdMark();
    Mark getFromMarkById(int id);
    List<Mark> getAllFromMark();
    List<Mark> getCustomizedFromMark(String parameter);
}
