package cz.artin.ships.gen;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.List;

public class Ships {
    private List<Ship> ships;

    public List<Ship> getShip() {
        return this.ships;
    }

    public static class Ship {

        private Ship ship;

        public Ship(Ship ship) {
            this.ship = ship;
        }

        public Ship getShip() {
            return ship;
        }

        public String getName(){
            return ship.getName();
        }

        int getDeckArea(){
            return ship.getDeckArea();
        }

        public int getWeight() {
            return ship.getWeight();
        }

        public XMLGregorianCalendar getDateOfCreation() {
            return ship.getDateOfCreation();
        }

        public Object getLength() {
            return ship.getLength();
        }

        public Object getWidth() {
            return ship.getWidth();
        }

        public Class<? extends Ship> getClazz() {
            return ship.getClass();
        }
    }
//


}
