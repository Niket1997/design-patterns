package behavioral.state.concretestates;

import behavioral.state.interfaces.IGate;
import behavioral.state.interfaces.IGateState;

public class GateStatePaymentProcessing implements IGateState {
    private final IGate gate;

    public GateStatePaymentProcessing(IGate gate) {
        this.gate = gate;
    }

    @Override
    public void payInit() {

    }

    @Override
    public void payOk() {
        this.gate.setGateState(new GateStateOpen(gate));
    }

    @Override
    public void payFailed() {
        this.gate.setGateState(new GateStateClosed(gate));
    }

    @Override
    public void enter() {

    }

    @Override
    public String getStateName() {
        return "Processing";
    }
}
