package com.example.lab8;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size plus
     one
     */
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }

    /**
     * create a mock city
     * add the city to the list
     * check if list contains the mock city
     */
    @Test
    public void hasCityTest() {
        City test = new City("Estevan", "SK");
        list = MockCityList();
        list.addCity(test);
        assertTrue(list.hasCity(test));
    }

    /**
     * create a mock city
     * add mock city to list
     * check that mock city is in list
     * remove mock city from list
     * check that mock city is not in list
     */
    @Test
    public void deleteTest() {
        City test = new City("Estevan", "SK");
        list = MockCityList();
        list.addCity(test);
        assertTrue(list.hasCity(test));
        list.delete(test);
        assertFalse(list.hasCity(test));
    }

    /**
     * create an empty cities list
     * check that countCities returns 0
     * add 3 mock cities to list
     * check that countCities returns 3
     */
    @Test
    public void countCitiesTest() {
        list = MockCityList();
        assertEquals(0, list.countCities());
        list.addCity(new City("Edmonton", "AB"));
        list.addCity(new City("Vancouver", "BC"));
        assertEquals(2, list.countCities());
    }
}
