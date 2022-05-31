package academy.learningProgramming;


import java.util.*;

public class Main {

    public static void main(String[] args) {

        Player Mohamed = new Player("Mohamed", 10, 16);
        ISaveable wolf = new Monster("Wolf", 20, 40);

//        System.out.println(Mohamed.toString()); // unnecessary toString. since you override toString, then
        //it is assumed to you mean toString.

        Mohamed.setHitPoints(8);
        System.out.println(Mohamed);
        Mohamed.setWeapon("Seddex gees");
        System.out.println("Weapon is " + Mohamed.getWeapon());

        savedObject(Mohamed);
        loadObjects(Mohamed);
        System.out.println(Mohamed);

        //Monster
        System.out.println(wolf);
        savedObject(wolf);
        //access method without creating an object of the class. solution cast the object to the class.
//        System.out.println(wolf.getName); isn't working.
        System.out.println(((Monster)wolf).getName());





    }
        public static ArrayList readValues () {
            ArrayList<String> values = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);
            boolean quit = false;
            int index = 0;

            System.out.println("Choose\n" + "Enter 1 to a string\n" + "Enter 0 to quit");
            while (!quit) {
                System.out.println("Choose an option");
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 0:
                        quit = true;
                        break;
                    case 1:
                        System.out.println("Enter a string");
                        String stringInput = scanner.nextLine();
                        values.add(index, stringInput);
                        index += 1;
                        break;
                }
            }
            return values;
        }



        public static void savedObject (ISaveable  objectToSave){
            for (int index = 0; index < objectToSave.write().size(); index += 1) {
                System.out.println("Saving " + objectToSave.write().get(index) + " to storage device");
                //.get(index) returns the object to be saved not index itself.
            }
        }

        public static void loadObjects (ISaveable objectToLoad){
            ArrayList<String> values = readValues();
            objectToLoad.read(values);

        }



}
