package States;

/**
 * Created by Peonsson on 08/10/15.
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