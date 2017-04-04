
package cz.artin.ships.impl;

import cz.artin.ships.LocationService;

import java.io.FileInputStream;
import java.util.Properties;

public class LocationServiceImpl implements LocationService{
    
    private final Properties property = new Properties();
    

    public Properties load(String filePath) {

        try {
            property.load(new FileInputStream(filePath));
        } catch (Exception ex) {
            System.err.println("Exception: "+ ex.getMessage());
        }
        return property;
        
    }
    
}
