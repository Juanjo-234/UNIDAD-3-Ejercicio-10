public class BilleteraVirtual {
    private String alias;
    private double saldo;
    private double limiteDiarioTransferencia;
    private String pinSeguridad;

    public BilleteraVirtual(String alias, double saldo, double limiteDiarioTransferencia){
        this.alias = alias;
        this.saldo = saldo;
        this.limiteDiarioTransferencia = (limiteDiarioTransferencia >= 0) ? limiteDiarioTransferencia : 0.0;
        this.pinSeguridad = pinSeguridad;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimiteDiarioTransferencia() {
        return limiteDiarioTransferencia;
    }

    public void setLimiteDiarioTransferencia(double limiteDiarioTransferencia) {
        this.limiteDiarioTransferencia = limiteDiarioTransferencia;
    }

    void transferir(double monto){
        if (monto > saldo || monto > limiteDiarioTransferencia){
            System.out.println("Se ha superado el limite de transferencias diario o tiene fondos insuficientes.");
        }else{
            saldo -= monto;
            System.out.println("Se ha retirado: " + monto + ". Dinero restante: " + saldo);
        }
    }

    public void actualizarLimiteDiario(double nuevoLimite) {
        if (nuevoLimite >= 0) {
            this.limiteDiarioTransferencia = nuevoLimite;
            System.out.println("-> [Actualizado] Nuevo límite diario: $" + this.limiteDiarioTransferencia);
        } else {
            System.out.println("-> [Error] El límite no puede ser negativo.");
        }
    }

}
