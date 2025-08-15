package strategy;

public class SmsNotificador implements Notificador {
    public void notificar(String mensagem) {
        System.out.println("Enviando por SMS: " + mensagem);
    }
}
