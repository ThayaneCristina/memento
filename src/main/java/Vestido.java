import java.util.ArrayList;
import java.util.List;

public class Vestido {

    private List<VestidoEstado> memento = new ArrayList<VestidoEstado>();

    private VestidoEstado estado;

    public VestidoEstado getEstado() {
        return this.estado;
    }

    public void setEstado(VestidoEstado estado) {
        this.estado = estado;
        this.memento.add(this.estado);
    }

    public void restauraEstado(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.estado = this.memento.get(indice);
    }

    public List<VestidoEstado> getEstados() {
        return this.memento;
    }

}
