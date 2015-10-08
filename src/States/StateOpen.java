package States;

/**
 * Created by Peonsson on 08/10/15.
 */

public class StateOpen extends State {
    public String getStateName() {
        return "States.StateOpen";
    }

    public State receivedCloseButtonPressed() {
        return new StateClosing();
    }
}