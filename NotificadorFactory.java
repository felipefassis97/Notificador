package factory;

import strategy.*;

public class NotificadorFactory {
    public static Notificador criar(String tipo) {
        if (tipo.equalsIgnoreCase("email")) {
            return new EmailNotificador();
        } else if (tipo.equalsIgnoreCase("sms")) {
            return new SmsNotificador();
        } else {
            throw new IllegalArgumentException("Tipo inválido");
        }
    }
}
