package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;
    /**
     * we create a CustomList object before running
     */
    @Before
    public void createList(){
        list = new CustomList(null,new ArrayList<City>());
    }

}
