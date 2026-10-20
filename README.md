Este programa está diseñado para modelar y gestionar las operaciones financieras de una billetera virtual asegurando el cumplimiento estricto de las reglas de negocio mediante la aplicación de encapsulamiento (ocultación de datos) y validaciones financieras duales (verificación de saldo y de límite diario de transferencia) en programación orientada a objetos (por ejemplo, en Java).

A continuación se detalla exactamente lo que hace cada parte del programa:

Define la clase BilleteraVirtual: Declara atributos privados (alias, saldo, limiteDiarioTransferencia y montoTransferidoHoy) para proteger el estado económico y los límites operativos de accesos externos no controlados.

Implementa el método transferir(double monto): Verifica de manera simultánea dos condiciones críticas antes de autorizar la salida de dinero:

Que el monto solicitado no supere el saldo disponible en la cuenta.

Que la suma de la transferencia actual más lo ya transferido en el día no rebase el límite diario permitido.

Provee métodos de configuración segura: Permite actualizar el límite diario de transferencias aplicando validaciones defensivas (por ejemplo, rechazando topes negativos o en cero).

Ejecuta la prueba en el main: Instancia una billetera virtual, realiza pruebas de transferencias exitosas, operaciones rechazadas por falta de fondos o por superar el límite diario, y muestra el estado final de cuentas por consola.
