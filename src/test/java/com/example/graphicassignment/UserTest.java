package com.example.graphicassignment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    User user;
    @BeforeEach
    void setUp() {
        user = new User("Anders","Andersson","WoopWoop");
    }

    @Test
    void testGetLastName() {
        String expResult = "Andersson";
        assertEquals(expResult, user.getLastName());
    }
    @Test
    void testGetLastNameAfterChange() {
        user.setLastName("Börjesson");
        String expResult = "Börjesson";
        assertEquals(expResult, user.getLastName());
    }

    @Test
    void testGetLastNameAsEmpty() {
        user.setLastName("");
        String expResult = "";
        assertEquals(expResult, user.getLastName());
    }
    @Test
    void testGetLastNameAsNumber() {
        user.setLastName("123");
        String expResult = "123";
        assertEquals(expResult, user.getLastName());
    }
    @Test
    void testGetName() {
        String expResult = "Anders";
        assertEquals(expResult, user.getName());
    }
    @Test
    void testGetNameAfterChange() {
        user.setName("Björn");
        String expResult = "Björn";
        assertEquals(expResult, user.getName());
    }
    @Test
    void testGetNameAsEmpty() {
        user.setName("");
        String expResult = "";
        assertEquals(expResult, user.getName());
    }

    @Test
    void testGetNameAsNumber() {
        user.setName("123");
        String expResult = "123";
        assertEquals(expResult, user.getName());
    }

    @Test
    void testGetSong() {
        String expResult = "WoopWoop";
        assertEquals(expResult, user.getSong());
    }
    @Test
    void testGetSongAfterChange() {
        user.setSong("Kalle Anka");
        String expResult = "Kalle Anka";
        assertEquals(expResult, user.getSong());
    }
    @Test
    void testGetSongAsEmpty() {
        user.setSong("");
        String expResult = "";
        assertEquals(expResult, user.getSong());
    }
    @Test
    void testGetSongAsNumber() {
        user.setSong("123");
        String expResult = "123";
        assertEquals(expResult, user.getSong());
    }
}