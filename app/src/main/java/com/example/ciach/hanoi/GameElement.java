package com.example.ciach.hanoi;

/**
 * Created by ciach on 10/24/2017.
 */

public class GameElement {

    public class Recurse3 {
        public String hanoi(int nRings, int fromTower, int toTower) {
            int helpTower;
            String Sol1, Sol2, MyStep, mySol;   // Contains moves

            if (nRings == 1) {
                return fromTower + " -> " + toTower + "\n";
            } else {
                helpTower = 6 - fromTower - toTower;    // Because fromTower + helpTower + toTower = 6

                Sol1 = hanoi(nRings - 1, fromTower, helpTower);

                MyStep = fromTower + " -> " + toTower + "\n";

                Sol2 = hanoi(nRings - 1, helpTower, toTower);

                mySol = Sol1 + MyStep + Sol2;     // + = String concatenation !

                return mySol;
            }
        }
    }
}






























