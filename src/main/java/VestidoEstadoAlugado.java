public class VestidoEstadoAlugado implements VestidoEstado {

    private VestidoEstadoAlugado () {};
    private static VestidoEstadoAlugado instance = new VestidoEstadoAlugado();
    public static VestidoEstadoAlugado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Alugado";
    }

}
