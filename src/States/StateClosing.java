package States;

/**
 * Created by Peonsson on 08/10/15.
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