package behavioral.state.interfaces;

public interface IGateState {
    void payInit();

    void payOk();

    void payFailed();

    void enter();

    String getStateName();
}
