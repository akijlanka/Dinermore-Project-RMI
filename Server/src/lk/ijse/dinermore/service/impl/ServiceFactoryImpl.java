package lk.ijse.dinermore.service.impl;

import lk.ijse.dinermore.service.ServiceFactory;
import lk.ijse.dinermore.service.SuperService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServiceFactoryImpl extends UnicastRemoteObject implements ServiceFactory {

    protected ServiceFactoryImpl() throws RemoteException {
    }

    @Override
    public SuperService getService(ServiceType serviceType) throws Exception {
        return null;
    }
}
