package com.epam.mjc.stage0;

import com.epam.mjc.stage0.utils.Fridge;


// Assume this is the interface provided
interface Fridge {
    void open();
    void close();
    boolean hasMilk();
    void takeMilk();
}

public class FridgeAlgorithm {
    public void fridgeAlgorithm(Fridge fridge) {
        // Step 1: Open the fridge door
        fridge.open();

        // Step 2: Check if there is milk in the fridge
        if (fridge.hasMilk()) {
            // Step 3: If milk is present, take the milk out
            fridge.takeMilk();
        }

        // Step 4: Close the fridge door
        fridge.close();
    }
}

