package lk.ijse.dinermore.service;

import java.rmi.Remote;

public interface ServiceFactory extends Remote {

    public enum ServiceType{
        ORDER,RECEPTION,CHEF,USER
    }
    public SuperService getService(ServiceType serviceType) throws Exception;

}
