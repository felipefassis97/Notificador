# 📢 Projeto Java: Notificador com Design Patterns

Este é um projeto **simples** em Java que demonstra o uso de **padrões de projeto GoF**:

- Strategy
- Singleton
- Factory

## 💡 Funcionalidade

O programa envia uma mensagem de notificação usando **Email** ou **SMS**, com base na configuração definida.

## 🔧 Padrões utilizados

- **Strategy** – Define diferentes formas de notificar.
- **Singleton** – Controla uma única instância de configuração global.
- **Factory** – Cria a implementação do notificador.

## 🚀 Como rodar

```bash
javac Main.java strategy/*.java factory/*.java config/*.java
java Main
