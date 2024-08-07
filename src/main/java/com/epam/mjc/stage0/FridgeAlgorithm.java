package com.epam.mjc.stage0;

import com.epam.mjc.stage0.utils.Fridge;


public class FridgeAlgorithm {
    public void fridgeAlgorithm(Fridge fridge) {
        // Step 1: Open the fridge door
        fridge.open();

        fridge.getMilk();

        // Step 4: Close the fridge door
        fridge.close();
    }
}

