package com.aluracursos.screenmatch.excepcion;

public class ErrorEnConversionDeDuracionExcption extends RuntimeException {
    private  String mensaje;
    public ErrorEnConversionDeDuracionExcption(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMessage() {
        return this.mensaje;
    }
}
