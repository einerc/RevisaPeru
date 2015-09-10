/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RevisaPeru.Entities;

import java.sql.Timestamp;
import java.util.Date;

/**
 *
 * @author user
 */
public class Payment {
    private int id;
    private String documentNumber;
    private Date date;
    private Timestamp registrationDate;
    private int documentId;
    private int customerId;
    private int vehicleId;
    private int discontId;
    private int userId;
    private int localId;
    private Customer customer; 
}
