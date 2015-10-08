package States;

/**
 * Created by Johan Pettersson on 2015-10-08 15:10.
 * Contact: johanp7@kth.se
 * Credits: Johnny Panrike
 */

public class StateOpening extends State {
    public String getStateName() {
        return "States.StateOpening";
    }

    public State receivedDoorOpen() {
        return new StateOpen();
    }
}