package strategy;

public class EmailNotificador implements Notificador {
    public void notificar(String mensagem) {
        System.out.println("Enviando por EMAIL: " + mensagem);
    }
}
