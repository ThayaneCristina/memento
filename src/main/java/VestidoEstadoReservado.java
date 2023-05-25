public class VestidoEstadoReservado implements VestidoEstado {

    private VestidoEstadoReservado () {};
    private static VestidoEstadoReservado instance = new VestidoEstadoReservado();
    public static VestidoEstadoReservado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Reservado";
    }

}
