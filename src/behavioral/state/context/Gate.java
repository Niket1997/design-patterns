package behavioral.state.context;

import behavioral.state.concretestates.GateStateClosed;
import behavioral.state.interfaces.IGate;
import behavioral.state.interfaces.IGateState;

public class Gate implements IGate {
    private IGateState gateState;

    public Gate() {
        this.gateState = new GateStateClosed(this);
        System.out.println("Setting initial state to " + this.gateState.getStateName());
    }

    public void payInit() {
        this.gateState.payInit();
    }

    public void payOk() {
        this.gateState.payOk();
    }

    public void payFailed() {
        this.gateState.payFailed();
    }

    public void enter() {
        this.gateState.enter();
    }

    public void setGateState(IGateState gateState) {
        this.gateState = gateState;
        System.out.println("Current state is " + gateState.getStateName());
    }
}
