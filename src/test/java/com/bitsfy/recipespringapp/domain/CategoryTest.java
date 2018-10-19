package com.bitsfy.recipespringapp.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CategoryTest {

    Category category;

    @Before
    public void setup() {
        category = new Category();
    }

    @Test
    public void getId() {
        Long newIdValue = 4L;
        category.setId(newIdValue);
        assertEquals(newIdValue, category.getId());
    }

    @Test
    public void getDescription() {
    }
}