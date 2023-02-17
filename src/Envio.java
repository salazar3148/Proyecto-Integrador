public class Envio {
    private int numeroGuia;
    private Cliente remitente;
    private Cliente destinatario;
    private Hora horaEntrega;
    private EstadoEnvio estado;
    private Paquete paquete;

    public Envio(int numeroGuia, Cliente remitente, Cliente destinatario, Hora horaEntrega, EstadoEnvio estado, Paquete paquete) {
        this.numeroGuia = numeroGuia;
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.horaEntrega = horaEntrega;
        this.estado = estado;
        this.paquete = paquete;
    }
}
