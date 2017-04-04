
package cz.artin.ships.impl;

import cz.artin.ships.ShipDefinitionService;
import cz.artin.ships.gen.Ships;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class ShipDefinitionServiceImpl implements ShipDefinitionService {

   
    private Ships ship;


    public Ships load(String xmlFilePath) {
        
        try {
            File file = new File(xmlFilePath);

            JAXBContext jaxbContext = JAXBContext.newInstance(Ships.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            ship = (Ships) jaxbUnmarshaller.unmarshal(file);
           

        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return ship;
    }
}
