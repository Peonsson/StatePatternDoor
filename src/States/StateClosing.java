package States;

/**
 * Created by Johan Pettersson on 2015-10-08 15:10.
 * Contact: johanp7@kth.se
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