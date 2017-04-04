
package cz.artin.ships.model;

import java.util.Date;


public class IceBreaker extends ShipParent{

    public IceBreaker(String name, int weight, int length, int width, Date dateOfCreation) {        
        super(name, weight, length, width, dateOfCreation, false, true);
    }

    
    
}
