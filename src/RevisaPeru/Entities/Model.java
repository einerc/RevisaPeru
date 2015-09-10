/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RevisaPeru.Entities;

/**
 *
 * @author user
 */
public class Model {
    
    private int id;
    private String name;
    private String trany;
    private String year;
    private String vClass;
    private String cylinders;
    private String drive;
    private String fuelType;
    private String fuelType1;
    private String fuelType2;
    private String atvType;
    private Integer markId;
    
    private Mark mark;

    public Model() {
    }
    //sin embeber la marca
    public Model(int id, String name, String trany, String year, String vClass, String cylinders, String drive, String fuelType, String fuelType1, String fuelType2, String atvType, Integer markId) {
        this.id = id;
        this.name = name;
        this.trany = trany;
        this.year = year;
        this.vClass = vClass;
        this.cylinders = cylinders;
        this.drive = drive;
        this.fuelType = fuelType;
        this.fuelType1 = fuelType1;
        this.fuelType2 = fuelType2;
        this.atvType = atvType;
        this.markId = markId;
    }
    //Objeto sin restrincciones embebido la marca
    public Model(int id, String name, String trany, String year, String vClass, String cylinders, String drive, String fuelType, String fuelType1, String fuelType2, String atvType, Integer markId, Mark mark) {
        this.id = id;
        this.name = name;
        this.trany = trany;
        this.year = year;
        this.vClass = vClass;
        this.cylinders = cylinders;
        this.drive = drive;
        this.fuelType = fuelType;
        this.fuelType1 = fuelType1;
        this.fuelType2 = fuelType2;
        this.atvType = atvType;
        this.markId = markId;
        this.mark = mark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTrany() {
        return trany;
    }

    public void setTrany(String trany) {
        this.trany = trany;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getvClass() {
        return vClass;
    }

    public void setvClass(String vClass) {
        this.vClass = vClass;
    }

    public String getCylinders() {
        return cylinders;
    }

    public void setCylinders(String cylinders) {
        this.cylinders = cylinders;
    }

    public String getDrive() {
        return drive;
    }

    public void setDrive(String drive) {
        this.drive = drive;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getFuelType1() {
        return fuelType1;
    }

    public void setFuelType1(String fuelType1) {
        this.fuelType1 = fuelType1;
    }

    public String getFuelType2() {
        return fuelType2;
    }

    public void setFuelType2(String fuelType2) {
        this.fuelType2 = fuelType2;
    }

    public String getAtvType() {
        return atvType;
    }

    public void setAtvType(String atvType) {
        this.atvType = atvType;
    }

    public Integer getMarkId() {
        return markId;
    }

    public void setMarkId(Integer markId) {
        this.markId = markId;
    }

    public Mark getMark() {
        return mark;
    }

    public void setMark(Mark mark) {
        this.mark = mark;
    }
    
 
    public Object[] toArrayObject(){
        Object[] model= new Object[12]; 
        model[0]=this.id;
        model[1]=this.name;
        model[2]=this.trany;
         model[3]=this.year;
        model[4]=this.vClass;
        model[5]=this.cylinders;
         model[6]=this.drive;
        model[7]=this.fuelType;
        model[8]=this.fuelType1;
         model[9]=this.fuelType2;
        model[10]=this.atvType;
        model[11]=this.mark.toString();
        return model; 
    }
}
