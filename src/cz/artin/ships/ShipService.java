
package cz.artin.ships;

import cz.artin.ships.gen.Ships;
import cz.artin.ships.model.Ship;

import java.util.List;


public interface ShipService {
    /**
     * Method creates ships from XML representation
     * @param ships XML representation
     * @return List of {@link Ships}
     */
    List<Ship> createShip(Ships ships);
}
