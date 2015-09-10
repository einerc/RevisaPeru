/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RevisaPeru.Entities;

import java.util.Date;

/**
 *
 * @author user
 */
public class Log {
    private int id;
    private String table;
    private int row_id;
    private Date created;
    private Date modified;
    private String sql;
}
