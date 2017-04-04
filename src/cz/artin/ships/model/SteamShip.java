
package cz.artin.ships.model;

import java.util.Date;


public class SteamShip extends ShipParent {
    
    public SteamShip(String name, int weight, int length, int width, Date dateOfCreation) {        
        super(name, weight, length, width, dateOfCreation, false, true);
    }
    
}
