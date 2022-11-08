import java.net.MalformedURLException;
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

    }
}
