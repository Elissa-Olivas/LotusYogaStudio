package com.detroitlabs.LotusYogaStudio.data;

import com.detroitlabs.LotusYogaStudio.Model.Classes;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClassesRepositoryTest {


    @Test
    void returnPicID() {
        ClassesRepository classesRepository = new ClassesRepository();
        List<Classes> results= classesRepository.returnPicID("mediumyoga");

        for (Classes classes : results) {
            assertTrue(classes.getPicID().equals("mediumyoga"));
        }
    }

    @Test
    void searchByName() {
        ClassesRepository classesRepository = new ClassesRepository();
        List<Classes> results= classesRepository.searchByName("Beginners Yoga");

        for (Classes classes : results) {
            assertTrue(classes.getNameOfClass().equals("Beginners Yoga"));
        }
    }
}