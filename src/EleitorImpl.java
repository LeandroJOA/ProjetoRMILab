import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class EleitorImpl extends UnicastRemoteObject implements Eleitor{

    private String nome;
    private String titulo;
    private Boolean votou = false;

    protected EleitorImpl() throws RemoteException {
        super();
    }

    public String obterNome() throws RemoteException {
        return nome;
    }

    public String obterTitulo() throws RemoteException {
        return titulo;
    }

    public Boolean votou() throws RemoteException {
        return votou;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Boolean getVotou() {
        return votou;
    }

    public void setVotou(Boolean votou) {
        this.votou = votou;
    }
}
