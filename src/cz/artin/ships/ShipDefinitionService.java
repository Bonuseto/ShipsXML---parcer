
package cz.artin.ships;
import cz.artin.ships.gen.Ships;


public interface ShipDefinitionService {
    /**
     * Method loads ships definitions
     * @param xmlFilePath
     * @return {@link Ships}
     */
    Ships load(String xmlFilePath);
}
