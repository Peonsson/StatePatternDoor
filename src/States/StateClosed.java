package States;

/**
 * Created by Johan Pettersson on 2015-10-08 15:10.
 * Contact: johanp7@kth.se
 * Credits: Johnny Panrike
 */

public class StateClosed extends State {
    public String getStateName() {
        return "States.StateClosed";
    }

    public State receivedOpenButtonPressed() {
        return new StateOpening();
    }
}