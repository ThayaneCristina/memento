public class VestidoEstadoDisponivel implements VestidoEstado {

    private VestidoEstadoDisponivel () {};
    private static VestidoEstadoDisponivel instance = new VestidoEstadoDisponivel();
    public static VestidoEstadoDisponivel getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Disponivel";
    }

}
