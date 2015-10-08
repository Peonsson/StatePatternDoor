package States;

/**
 * Created by Peonsson on 08/10/15.
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