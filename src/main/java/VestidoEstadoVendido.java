public class VestidoEstadoVendido implements VestidoEstado {

    private VestidoEstadoVendido () {};
    private static VestidoEstadoVendido instance = new VestidoEstadoVendido();
    public static VestidoEstadoVendido getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Vendido";
    }

}
