import java.util.ArrayList;
import java.util.List;

public class ControleRemoto {

    private List<Comando> historicoComandos = new ArrayList<Comando>();

    public void pressionarBotao(Comando comando) {
        this.historicoComandos.add(comando);
        comando.executar();
    }

    public void desfazerUltimaAcao() {
        if (historicoComandos.size() != 0) {
            Comando comando = this.historicoComandos.get(this.historicoComandos.size() - 1);
            comando.cancelar();
            this.historicoComandos.remove(this.historicoComandos.size() - 1);
        }
    }
}