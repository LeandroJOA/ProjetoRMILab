import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class CandidatoImpl extends UnicastRemoteObject implements Candidato {

    private Integer votos;
    private String numero;
    private String nome;
    private String partido;
    private Boolean impugnado = false;

    public CandidatoImpl() throws RemoteException {
        super();
    }

    public Integer obterVotos() throws RemoteException {
        System.out.println("Número do candidato: " + numero);
        System.out.println("Nome: " + nome);
        System.out.println("Partido: " + nome);
        System.out.println("Total de votos: " + nome);
        System.out.println("Operação: Obter Votos");
        return votos;
    }

    public String obterNome() throws RemoteException {
        System.out.println("Número do candidato: " + numero);
        System.out.println("Nome: " + nome);
        System.out.println("Partido: " + nome);
        System.out.println("Total de votos: " + nome);
        System.out.println("Operação: Obter Nome");
        return nome;
    }

    public String obterPartido() throws RemoteException {
        System.out.println("Número do candidato: " + numero);
        System.out.println("Nome: " + nome);
        System.out.println("Partido: " + nome);
        System.out.println("Total de votos: " + nome);
        System.out.println("Operação: Obter Partido");
        return partido;
    }

    public Boolean creditarVoto() throws RemoteException {
        System.out.println("Número do candidato: " + numero);
        System.out.println("Nome: " + nome);
        System.out.println("Partido: " + nome);
        System.out.println("Total de votos: " + nome);
        System.out.println("Operação: Creditar Voto");
        if (impugnado) {
            return false;
        }
        votos ++;
        return true;
    }

    public Boolean impugnarCandidato() throws RemoteException {
        System.out.println("Número do candidato: " + numero);
        System.out.println("Nome: " + nome);
        System.out.println("Partido: " + nome);
        System.out.println("Total de votos: " + nome);
        System.out.println("Operação: Impugnar Candidato");
        impugnado = true;
        return true;
    }

    public Integer getVotos() {
        return votos;
    }

    public void setVotos(Integer votos) {
        this.votos = votos;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public Boolean getImpugnado() {
        return impugnado;
    }

    public void setImpugnado(Boolean impugnado) {
        this.impugnado = impugnado;
    }
}
