public class VestidoEstadoManutencao implements VestidoEstado {

    private VestidoEstadoManutencao () {};
    private static VestidoEstadoManutencao instance = new VestidoEstadoManutencao();
    public static VestidoEstadoManutencao getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Em manutencao";
    }

}
