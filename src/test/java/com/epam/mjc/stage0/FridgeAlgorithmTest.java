package com.epam.mjc.stage0;

import com.epam.mjc.stage0.utils.FridgeIml;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FridgeAlgorithmTest {

    interface Fridge {
        void open();
        void getMilk();
        void close();
    }

    class FridgeIml implements Fridge {
        enum Actions {
            OPEN, GET_MILK, CLOSE
        }

        private final List<Actions> actionsQueue = new ArrayList<>();

        @Override
        public void open() {
            actionsQueue.add(Actions.OPEN);
        }

        @Override
        public void getMilk() {
            actionsQueue.add(Actions.GET_MILK);
        }

        @Override
        public void close() {
            actionsQueue.add(Actions.CLOSE);
        }

        public List<Actions> getActionsQueue() {
            return actionsQueue;
        }
    }

    class FridgeAlgorithm {
        public void fridgeAlgorithm(Fridge fridge) {
            fridge.open();
            fridge.getMilk();
            fridge.close();
        }
    }


}