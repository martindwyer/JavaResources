/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.sql.Timestamp;
import java.util.Date;

/**
 *
 * @author marti
 */
public class LocationNotFoundException extends DatabaseExceptions {
    
    public Timestamp ts = null;

    public LocationNotFoundException() {
        super();
        Date date = new Date();
        long time = date.getTime();
        this.ts = new Timestamp(time);
    }

    @Override
    public String getMessage() {
        return "LOCATION NOT FOUND EXCEPTION OCCURED AT: " + this.ts;
    }
    
}
