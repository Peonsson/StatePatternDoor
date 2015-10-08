package States;

/**
 * Created by Peonsson on 08/10/15.
 * Credits: Johnny Panrike
 */

public class StateClosing extends State {
    public String getStateName() {
        return "States.StateClosing";
    }

    public State receivedObstacleEncountered() {
        return new StateOpening();
    }

    public State receivedDoorClosed() {
        return new StateClosed();
    }
}