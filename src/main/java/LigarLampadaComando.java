public class LigarLampadaComando implements Comando {

    private Lampada lampada;

    public LigarLampadaComando(Lampada lampada) {
        this.lampada = lampada;
    }

    public void executar() {
        this.lampada.ligar();
    }

    public void cancelar() {
        // Para cancelar o "Ligar", nós desligamos
        this.lampada.desligar();
    }
}