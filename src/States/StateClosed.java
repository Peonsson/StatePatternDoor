package States;

/**
 * Created by Peonsson on 08/10/15.
 */

public class StateClosed extends State {
    public String getStateName() {
        return "States.StateClosed";
    }

    public State receivedOpenButtonPressed() {
        return new StateOpening();
    }
}