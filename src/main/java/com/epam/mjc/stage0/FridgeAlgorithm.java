package com.epam.mjc.stage0;

import com.epam.mjc.stage0.utils.Fridge;

public class FridgeAlgorithm {

    /**
     * This is a first task in this module. You need to get milk from a fridge =)
     * <p>
     * Call the methods of the Fridge object inside the fridgeAlgorithm method in the required logical order.
     * P.S All methods of interaction with the fridge can be found inside the {@see Fridge} class.
     */
    public void fridgeAlgorithm(Fridge fridge) {
        // Open the fridge
        fridge.open();

        // Check if there's milk
        if (fridge.hasMilk()) {
            // If there is milk, take it
            fridge.takeMilk();
        } else {
            // If there's no milk, close the fridge and go buy some
            fridge.close();
            fridge.goToStore();
            fridge.buyMilk();
            // After buying milk, return home and open the fridge again
            fridge.returnHome();
            fridge.open();
            // Take the milk from the fridge
            fridge.takeMilk();
        }

        // Close the fridge after taking the milk
        fridge.close();
    }
}
