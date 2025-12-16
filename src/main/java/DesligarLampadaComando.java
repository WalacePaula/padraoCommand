public class DesligarLampadaComando implements Comando {

    private Lampada lampada;

    public DesligarLampadaComando(Lampada lampada) {
        this.lampada = lampada;
    }

    public void executar() {
        this.lampada.desligar();
    }

    public void cancelar() {
        this.lampada.ligar();
    }
}