package lk.ijse.dinermore.observer;

import java.rmi.Remote;

public interface Observer extends Remote {

    public void updateObserver() throws Exception;
}
