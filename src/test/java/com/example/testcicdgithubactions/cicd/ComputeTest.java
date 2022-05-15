package com.example.testcicdgithubactions.cicd;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ComputeTest {

    @Test
    public void testAdd() {
        Compute compute = new Compute();
        assertEquals(compute.add(2,4), 6);
    }

}
