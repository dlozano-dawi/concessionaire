package tests.createObjectsTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import vehicles.types.F1;

public class f1Test {
    @Test
    public void testAddF1() {  
        F1 arm24 = new F1(17, 1, 390, 970, false, "Aston Martin", "ARM24", 2000000);

        assertEquals(17, arm24.getRacesWined());  
        assertEquals(1, arm24.getChampionshipsWinned());  
        assertEquals(390, arm24.getTopSpeed());  
        assertEquals(970, arm24.getHp());  
        assertEquals("Turned On", arm24.turnOn());  
        assertEquals(true, arm24.isStarted());  
        assertEquals("Turned Off", arm24.turnOff());  
        assertEquals("Aston Martin", arm24.getBrand());  
        assertEquals("ARM24", arm24.getModel());  
        assertEquals(2000000, arm24.getPrice());  
        assertEquals("Brand: Aston Martin, Model: ARM24, Price: 2000000.0, HP: 970.0, ChampionshipsWinned: 1, RacesWinned: 17, Started: false, TopSpeed: 390.0", arm24.toString());
    }  
}
