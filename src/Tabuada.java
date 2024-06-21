import br.senai.sp.jandira.model.CriarTabuada;
import br.senai.sp.jandira.view.TelaTabuada;

public class Tabuada {
    public static void main(String[] args) {
        CriarTabuada tabuada = new CriarTabuada();
        tabuada.gerarTabuada(10,1);

        new TelaTabuada();

    }
}
