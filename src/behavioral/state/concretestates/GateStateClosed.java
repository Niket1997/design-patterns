package behavioral.state.concretestates;

import behavioral.state.interfaces.IGate;
import behavioral.state.interfaces.IGateState;

public class GateStateClosed implements IGateState {
    private final IGate gate;

    public GateStateClosed(IGate gate) {
        this.gate = gate;
    }

    @Override
    public void payInit() {
        this.gate.setGateState(new GateStatePaymentProcessing(gate));
    }

    @Override
    public void payOk() {

    }

    @Override
    public void payFailed() {

    }

    @Override
    public void enter() {

    }

    @Override
    public String getStateName() {
        return "Closed";
    }
}
