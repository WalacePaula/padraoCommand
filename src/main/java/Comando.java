public interface Comando {

    void executar();
    void cancelar(); // Funciona como o "Desfazer" (Undo)
}