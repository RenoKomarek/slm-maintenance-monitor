package com.example.slmmaintenancemonitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class slmmaintenancemonitorControllerTest {

    public slmmaintenancemonitorController slmmaintenancemonitorController = new slmmaintenancemonitorController();

    String defaultmessage = "Everything works as expected";

    @Test
    void defaultoutput() {
        assertEquals(defaultmessage, slmmaintenancemonitorController.message());
    }

    @Test
    void message() {
        String example = "Service checks: No power until 5:00 pm";
        slmmaintenancemonitorController.set(example);
        assertEquals(example, slmmaintenancemonitorController.message());

    }

    @Test
    void set() {
        String newmessage1 = "test1";
        String newmessage2 = "test2";
        slmmaintenancemonitorController.set(newmessage1);
        slmmaintenancemonitorController.set(newmessage2);
        assertEquals(newmessage2, slmmaintenancemonitorController.message());
    }

    @Test
    void reset() {
        String newmessage = "reset";
        slmmaintenancemonitorController.set(newmessage);
        slmmaintenancemonitorController.reset();
        assertEquals(defaultmessage, slmmaintenancemonitorController.message());
    }
}