package behavioral.state;

import behavioral.state.context.Gate;
import behavioral.state.interfaces.IGate;

public class Demo {
    public static void main(String[] args) {
        IGate gate = new Gate();
        gate.payInit();
        gate.payOk();
        gate.enter();
    }
}
