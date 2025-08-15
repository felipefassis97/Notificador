package config;

public class Configuracao {
    private static Configuracao instancia;
    private String tipoNotificacao = "email";

    private Configuracao() {}

    public static Configuracao getInstance() {
        if (instancia == null) {
            instancia = new Configuracao();
        }
        return instancia;
    }

    public String getTipoNotificacao() {
        return tipoNotificacao;
    }

    public void setTipoNotificacao(String tipo) {
        this.tipoNotificacao = tipo;
    }
}
