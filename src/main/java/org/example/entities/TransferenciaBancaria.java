package org.example.entities;

public class TransferenciaBancaria implements Pagable {
    private String cuentaDestino;

    public TransferenciaBancaria(String cuentaDestino) {
        this.cuentaDestino = cuentaDestino;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando transferencia de $" + monto + " a la cuenta: " + cuentaDestino);
    }
}
