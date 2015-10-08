/**
 * Created by Johan Pettersson on 2015-10-08 15:10.
 * Contact: johanp7@kth.se
 * Credits: Johnny Panrike
 */

import java.util.*;

public class Door {
    public static void main(String[] args) {

        DoorHandler dh = new DoorHandler();
        int choice = -1;
        Scanner scan = new Scanner(System.in);

        do {

            System.out.println("\n" + "States.State: " + dh.getState());
            System.out.println("1. Receive close-button pressed");
            System.out.println("2. Receive open-button pressed");
            System.out.println("3. Receive door-closed");
            System.out.println("4. Receive door-open");
            System.out.println("5. Receive obstacle encountered");
            System.out.println("0. Quit");

            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    dh.invokeReceivedCloseButtonPressed();
                    break;
                case 2:
                    dh.invokeReceivedOpenButtonPressed();
                    break;
                case 3:
                    dh.invokeReceivedDoorClosed();
                    break;
                case 4:
                    dh.invokeReceivedDoorOpen();
                    break;
                case 5:
                    dh.invokeReceivedObstacleEncountered();
                    break;
            }
        } while (choice != 0);
    }
}