/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author maloriegomm
 */
public class Deliveries implements Serializable {
    
    // I set the money for every delivery to 10 dollars and the time to half an hour
    
    public static final int DELIVERY_MONEY = 10;
    public static final double DELIVERY_TIME = 0.50;

    private String type;
    private boolean status;
    
    
    public Deliveries() {
    }

    public static int getDELIVERY_MONEY() {
        return DELIVERY_MONEY;
    }

    public static double getDELIVERY_TIME() {
        return DELIVERY_TIME;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

     @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.type);
        hash = 67 * hash + (this.status ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Deliveries other = (Deliveries) obj;
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (this.status != other.status) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "Deliveries{" + "type=" + type + ", status=" + status + '}';
    }
}

   
    
    ///////////////////////////////////////////////
    // METHODS
    //////////////////////////////////////////////

   
    
   
            
        

    
