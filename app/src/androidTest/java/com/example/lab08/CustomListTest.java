package com.example.lab08;

import org.junit.Test;
import static org.junit.Assert.*;

public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        list.deleteCity(calgary);
        assertFalse(list.hasCity(calgary));
    }

    @Test
    public void testCityCount() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        City redDeer = new City("Red Deer", "AB");
        City edmonton = new City("Edmonton", "AB");
        list.addCity(calgary);
        list.addCity(redDeer);
        list.addCity(edmonton);
        list.addCity(edmonton);
        assertEquals(3, list.cityCount());
    }
}
