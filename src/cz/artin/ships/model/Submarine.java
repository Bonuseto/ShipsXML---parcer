
package cz.artin.ships.model;

import java.util.Date;


public class Submarine extends ShipParent{
    
    public Submarine(String name, int weight, int length, int width, Date dateOfCreation) {        
        super(name, weight, length, width, dateOfCreation, true, false);
    }
    
}
