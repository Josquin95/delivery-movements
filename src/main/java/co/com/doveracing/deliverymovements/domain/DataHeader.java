package co.com.doveracing.deliverymovements.domain;

import com.fasterxml.jackson.annotation.JsonInclude;

public class DataHeader {
    private String mensaje;
    private String error;

    public String getMensaje() {
        return mensaje;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
