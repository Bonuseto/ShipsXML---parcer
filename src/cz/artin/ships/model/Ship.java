
package cz.artin.ships.model;

import java.util.Date;


public interface Ship {
    String getName();
    
    int getDeckArea();

    int getWeight();
    
    Date getDateOfCreation();
    
    boolean isWarShip();
    
    boolean isSurfaceShip();
    
}
