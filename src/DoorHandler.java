import States.State;
import States.StateClosed;

/**
 * Created by Peonsson on 08/10/15.
 * Credits: Johnny Panrike
 */

public class DoorHandler {
    private State currentState;

    public DoorHandler() {
        currentState = new StateClosed();
    }

    public String getState() {
        return currentState.getStateName();
    }

    public void invokeReceivedOpenButtonPressed() {
        currentState = currentState.receivedOpenButtonPressed();
    }

    public void invokeReceivedCloseButtonPressed() {
        currentState = currentState.receivedCloseButtonPressed();
    }

    public void invokeReceivedDoorOpen() {
        currentState = currentState.receivedDoorOpen();
    }

    public void invokeReceivedDoorClosed() {
        currentState = currentState.receivedDoorClosed();
    }

    public void invokeReceivedObstacleEncountered() {
        currentState = currentState.receivedObstacleEncountered();
    }
}