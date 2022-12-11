package behavioral.state.concretestates;

import behavioral.state.interfaces.IGate;
import behavioral.state.interfaces.IGateState;

public class GateStateOpen implements IGateState {
    private final IGate gate;

    public GateStateOpen(IGate gate) {
        this.gate = gate;
    }

    @Override
    public void payInit() {

    }

    @Override
    public void payOk() {

    }

    @Override
    public void payFailed() {

    }

    @Override
    public void enter() {
        this.gate.setGateState(new GateStateClosed(gate));
    }

    @Override
    public String getStateName() {
        return "Open";
    }
}
