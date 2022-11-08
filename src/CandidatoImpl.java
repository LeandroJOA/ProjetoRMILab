import java.net.MalformedURLException;
<<<<<<< HEAD
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class CandidatoImpl implements Candidato{

        public static void main(String[] args) throws NotBoundException, MalformedURLException, RemoteException {

            TSE c = (TSE) Naming.lookup("rmi://localhost:5000/Cargo99");
            Scanner ler = new Scanner(System.in);

            String numero;
            String sigla;
            String cargo;
            String nome;
            String numeroVotado;

            System.out.printf("Informe o numero do candidato:\n");
            numero = ler.nextLine();

            System.out.printf("Informe a sigla do candidato:\n");
            sigla = ler.nextLine();

            System.out.printf("Informe o cargo do candidato:\n");
            cargo = ler.nextLine();

            System.out.printf("Informe o nome do candidato:\n");
            nome = ler.nextLine();
            sigla.toUpperCase();
            cargo.toUpperCase();
            nome.toUpperCase();

            CandidatoEleitoral candidato = c.registrarCandidato(numero, sigla, cargo, nome); // chamada remota
            System.out.println("Candidato " + candidato.getNome() + " registrado com sucesso!\n");
        }


    public Integer obterVotos(String votos) throws RemoteException {
        return null;
    }


    public String obterNome() throws RemoteException {
        return null;
    }


    public String obterPartido() throws RemoteException {
        return null;
    }


    public void creditarVoto() throws RemoteException {
    }


    public void impugnarCandidato() throws RemoteException {

=======
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
>>>>>>> leandro
    }
}
