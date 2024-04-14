package tests.createObjectsTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import vehicles.types.Cars;

public class carsTest {
    @Test  
    public void testAddCars() {  
        Cars nissanSilvia = new Cars(2, "Coupe", 100000, 270, false, "Nissan", "Silvia 240sx", 20000);

        assertEquals(2, nissanSilvia.getDoors());  
        assertEquals("Coupe", nissanSilvia.getCategory());  
        assertEquals(100000, nissanSilvia.getKms());  
        assertEquals(270, nissanSilvia.getHp());  
        assertEquals("Turned On", nissanSilvia.turnOn());  
        assertEquals(true, nissanSilvia.isStarted());  
        assertEquals("Turned Off", nissanSilvia.turnOff());  
        assertEquals("Nissan", nissanSilvia.getBrand());  
        assertEquals("Silvia 240sx", nissanSilvia.getModel());  
        assertEquals(20000, nissanSilvia.getPrice());  
        assertEquals("Brand: Nissan, Model: Silvia 240sx, Price: 20000.0, HP: 270.0, Category: Coupe, Doors: 2, Started: false, KMs: 100000.0", nissanSilvia.toString());
    }  
}
