import config.Configuracao;
import factory.NotificadorFactory;
import strategy.Notificador;

public class Main {
    public static void main(String[] args) {
        // Configuração global
        Configuracao config = Configuracao.getInstance();
        config.setTipoNotificacao("sms");

        // Criar o notificador com base na configuração
        Notificador notificador = NotificadorFactory.criar(config.getTipoNotificacao());

        // Enviar mensagem
        notificador.notificar("Olá, você tem uma nova mensagem!");
    }
}
