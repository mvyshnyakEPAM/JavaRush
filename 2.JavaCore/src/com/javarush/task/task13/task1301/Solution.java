package com.javarush.task.task13.task1301;

/* 
Пиво
*/
public class Solution {
    public static void main(String[] args) throws Exception {
    }

    public interface Drink {
        void askMore(String message);

        void sayThankYou();

        boolean isReadyToGoHome();
    }

    public interface Alcohol extends Drink {
        boolean READY_TO_GO_HOME = false;

        void sleepOnTheFloor();
    }

    public static class Beer implements Alcohol {
        public boolean isReadyToGoHome() {
            return READY_TO_GO_HOME;
        }

        public void askMore(String message) {
            System.out.println("I need one more");
        }

        public void sayThankYou() {
            System.out.println("Thank you");
        }

        public void sleepOnTheFloor() {
            System.out.println("Zzzzz...");
        }
    }
}