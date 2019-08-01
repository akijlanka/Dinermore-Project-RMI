package lk.ijse.dinermore.startserver;

import lk.ijse.dinermore.service.impl.ServiceFactoryImpl;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StartServer {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.createRegistry(5050);
            registry.rebind("Dinermore", ServiceFactoryImpl.getInstance());
            System.out.println("Server Has Been Strated Successfully");
        } catch (Exception ex) {
            Logger.getLogger(StartServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
