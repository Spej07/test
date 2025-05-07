/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config.java;

/**
 *
 * @author Bentastic
 */
public class Session {
    
    private static Session instance;
    private int rid;
    private String rfn;
    private String rln;
    private String adds;
    private String usn;
    private String r_type;
    private String r_status;
    
    private Session(){
       //Private cons.prevents instance 
    }

    public static synchronized Session getInstance() {
        if(instance == null){
            instance = new Session();
        }
        return instance;
    }

    public static boolean isInstanceEmpty(){
        return instance == null;
    }

        public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }
    
    public String getFname() {
        return rfn;
    }

    public void setFname(String rfn) {
        this.rfn = rfn;
    }

    public String getLname() {
        return rln;
    }

    public void setLname(String rln) {
        this.rln = rln;
    }

    public String getAddress() {
        return adds;
    }

    public void setAddress(String Address) {
        this.adds = Address;
    }

    public String getUsername() {
        return usn;
    }

    public void setUsername(String username) {
        this.usn = username;
    }

    public String getType() {
        return r_type;
    }

    public void setType(String type) {
        this.r_type = type;
    }

    public String getStatus() {
        return r_status;
    }

    public void setStatus(String status) {
        this.r_status = status;
    }

    public String getrid() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
}
