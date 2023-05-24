package com.example.Anywr;

import com.example.Anywr.model.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentTests {

    @Test
    public void testSettersAndGetters() {
        Student student = new Student();

        Long id = 1L;
        String firstName = "Mouldi";
        String lastName = "Bani";

        student.setId(id);
        student.setFirstName(firstName);
        student.setLastName(lastName);

        Assertions.assertEquals(id, student.getId());
        Assertions.assertEquals(firstName, student.getFirstName());
        Assertions.assertEquals(lastName, student.getLastName());
    }
}
