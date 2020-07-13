import java.util.Locale;
import java.util.Scanner;

public class DizMediaPonderadaParaTesstes {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double pesoDaPrimeiraNotaDoTeste = 2.0;
        double pesoDaSegundaNotaDoTeste = 3.0;
        double pesoDaTerceiraNotaDoTeste = 5.0;
        int numeroDeTestes = obterNumeroDeTestes();
        executarTestes(numeroDeTestes, pesoDaPrimeiraNotaDoTeste, pesoDaSegundaNotaDoTeste, pesoDaTerceiraNotaDoTeste);
    }

    private static int obterNumeroDeTestes() {
        System.out.println("Digite o número de testes a serem executados:");
        return scanner.nextInt();
    }

    private static void executarTestes(int numeroDeTestes, double pesoDaPrimeiraNotaDoTeste, double pesoDaSegundaNotaDoTesste, double pesoDaTerceiraNotaDoTeste) {
        double primeiraNotaDoTeste;
        double segundaNotaDoTeste;
        double terceiraNotaDoTeste;
        double somaDosPesosDasNotasDoTeste = (pesoDaPrimeiraNotaDoTeste+pesoDaSegundaNotaDoTesste+pesoDaTerceiraNotaDoTeste);
        double mediaPonderadaDoTesste;
        for (int testeSendoExecutadoNoMomento = 1; testeSendoExecutadoNoMomento <= numeroDeTestes; testeSendoExecutadoNoMomento++) {
            System.out.println(testeSendoExecutadoNoMomento + "O Teste");
            primeiraNotaDoTeste = obterNotaDoTeste("Digite a primeira nota do teste:");
            segundaNotaDoTeste = obterNotaDoTeste("Digite a segunda nota do teste:");
            terceiraNotaDoTeste = obterNotaDoTeste("Digite a terceira e última nota deste teste:");
            mediaPonderadaDoTesste = ((primeiraNotaDoTeste * pesoDaPrimeiraNotaDoTeste) + (segundaNotaDoTeste * pesoDaSegundaNotaDoTesste) + (terceiraNotaDoTeste * pesoDaTerceiraNotaDoTeste))/somaDosPesosDasNotasDoTeste;
            System.out.printf("Média ponderada para este teste: %.1f%n", mediaPonderadaDoTesste);
        }
    }

    private static double obterNotaDoTeste(String mensagemAoUsuario) {
        System.out.println(mensagemAoUsuario);
        return scanner.nextDouble();
    }
}
