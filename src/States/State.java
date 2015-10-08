package States;

/**
 * Created by Johan Pettersson on 2015-10-08 15:10.
 * Contact: johanp7@kth.se
 * Credits: Johnny Panrike
 */

public abstract class State {
    public abstract String getStateName();

    public State receivedCloseButtonPressed() {
        return this;
    }

    public State receivedOpenButtonPressed() {
        return this;
    }

    public State receivedDoorClosed() {
        return this;
    }

    public State receivedDoorOpen() {
        return this;
    }

    public State receivedObstacleEncountered() {
        return this;
    }
}