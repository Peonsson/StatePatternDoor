package States;

/**
 * Created by Peonsson on 08/10/15.
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