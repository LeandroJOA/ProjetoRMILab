import java.net.MalformedURLException;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.*;

class ContaImpl extends UnicastRemoteObject implements Conta {

//	public ContaImpl() throws RemoteException {
//		super();
//	}

//	public String echo(String input) throws RemoteException {
//		return "From server: " + input;
//	}

    private int numero;
    private double saldo = 0.0;

    public ContaImpl(int n) throws RemoteException {
        super();
        numero = n;
    }

    public double obterSaldo() throws RemoteException {
        System.out.println("Metodo remoto em execucao: Retornar Saldo");
        return saldo;
    }

    public void setSaldo(double s) throws RemoteException {
        System.out.println("Metodo remoto em execucao: Atualizar saldo");
        saldo = s;
    }

    public static void main(String[] args) throws RemoteException, MalformedURLException {
        Registry registry = LocateRegistry.createRegistry(5099);
        registry.rebind("Conta804", new ContaImpl(804));
        System.out.println("Servidor ativo!");
    }
}