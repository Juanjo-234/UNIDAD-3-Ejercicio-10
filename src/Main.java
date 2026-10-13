//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    BilleteraVirtual miBilletera = new BilleteraVirtual("ASDHF-2189", 10000.0, 15000.0);
    miBilletera.transferir(1000.0);
    miBilletera.transferir(10000.0);

    System.out.println("\nActualizando límite diario a $20,000...");
    miBilletera.actualizarLimiteDiario(20000.0);

    miBilletera.transferir(5000.0);
}
