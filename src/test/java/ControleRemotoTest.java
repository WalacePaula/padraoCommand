import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ControleRemotoTest {

    ControleRemoto controleRemoto;
    Lampada lampada;

    @BeforeEach
    void setUp() {
        controleRemoto = new ControleRemoto();
        lampada = new Lampada();
    }

    @Test
    void deveLigarLampada() {
        Comando ligarLampada = new LigarLampadaComando(lampada);
        controleRemoto.pressionarBotao(ligarLampada);

        assertEquals("Lâmpada ligada", lampada.getEstado());
    }

    @Test
    void deveDesligarLampada() {
        Comando desligarLampada = new DesligarLampadaComando(lampada);
        controleRemoto.pressionarBotao(desligarLampada);

        assertEquals("Lâmpada desligada", lampada.getEstado());
    }

    @Test
    void deveCancelarDesligamentoLampada() {
        Comando ligarLampada = new LigarLampadaComando(lampada);
        Comando desligarLampada = new DesligarLampadaComando(lampada);

        controleRemoto.pressionarBotao(ligarLampada);
        controleRemoto.pressionarBotao(desligarLampada);

        controleRemoto.desfazerUltimaAcao();

        assertEquals("Lâmpada ligada", lampada.getEstado());
    }
}