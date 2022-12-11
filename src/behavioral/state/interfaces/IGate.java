package behavioral.state.interfaces;

public interface IGate {
    void payInit();

    void payOk();

    void payFailed();

    void enter();

    void setGateState(IGateState gateState);
}
