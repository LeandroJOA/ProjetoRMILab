import java.net.MalformedURLException;
import java.rmi.*;

public class ClienteImpl {
    public static void main(String[] args) throws NotBoundException, MalformedURLException, RemoteException {

        Conta c = (Conta) Naming.lookup("rmi://localhost:5000/Conta804");

        double s = c.obterSaldo(); // chamada remota
        System.out.println("Saldo inicial: " + s);
        //s += 200;
        c.setSaldo(s); // chamada remota
        s = c.obterSaldo(); // chamada remota
        System.out.println("Saldo atual: " + s);
    }
}