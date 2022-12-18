package com.example.graphicassignment;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class UserControllerTest {
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void switchToScene2() {
    }


    @Test
    void buttonGrayedOutClickTest() {
    }

    @Test
    void TestFileCreation(@TempDir Path tmpTest) {
        try {
            File file = new File(tmpTest+"\\usertest.txt");
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Detta är ett test!");
            bw.close();

            assertTrue(file.exists());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}