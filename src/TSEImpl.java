import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class TSEImpl extends UnicastRemoteObject implements TSE{
    static CandidatoEleitoral candidatoEleitoral = new CandidatoEleitoral();
    public CandidatoImpl votos = new CandidatoImpl();
     public ArrayList<CandidatoEleitoral> candidatos = new ArrayList<>();

    public TSEImpl() throws RemoteException {
        super();
    }

    public CandidatoEleitoral registrarCandidato(String numero, String sigla, String cargo, String nome) throws RemoteException {
        candidatoEleitoral.setNumero(numero);
        candidatoEleitoral.setPartido(sigla);
        candidatoEleitoral.setCargo(cargo);
        candidatoEleitoral.setNome(nome);

        System.out.println("Candidato de numero " + candidatoEleitoral.getNumero() + " do partido " + candidatoEleitoral.getPartido() + " de nome " + candidatoEleitoral.getNome()+ " registrado!");
        candidatos.add(candidatoEleitoral);

        return candidatoEleitoral;
    }




    public static void main(String[] args) throws RemoteException, MalformedURLException {
        Registry registry = LocateRegistry.createRegistry(5000);
        registry.rebind("Cargo99", new TSEImpl());
        System.out.println("Servidor ativo!");


    }
}
