package refactoring.game.entities.sensor;

import refactoring.game.entities.Codename;

public class Breeze extends Sensor {

    public Breeze() {
        super(Codename.BREEZE);
    }

    @Override
    protected String getResponse() {
        return "Breeze";
    }
}
