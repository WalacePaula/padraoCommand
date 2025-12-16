public class Lampada {

    private String estado;

    public Lampada() {
        this.estado = "Lâmpada desligada";
    }

    public String getEstado() {
        return estado;
    }

    public void ligar() {
        this.estado = "Lâmpada ligada";
    }

    public void desligar() {
        this.estado = "Lâmpada desligada";
    }
}