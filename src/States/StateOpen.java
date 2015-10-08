package States;

/**
 * Created by Johan Pettersson on 2015-10-08 15:10.
 * Contact: johanp7@kth.se
 * Credits: Johnny Panrike
 */

public class StateOpen extends State {
    public String getStateName() {
        return "States.StateOpen";
    }

    public State receivedCloseButtonPressed() {
        return new StateClosing();
    }
}