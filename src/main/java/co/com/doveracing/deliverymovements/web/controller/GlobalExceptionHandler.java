package co.com.doveracing.deliverymovements.web.controller;

import co.com.doveracing.deliverymovements.domain.ApiResponse;
import co.com.doveracing.deliverymovements.domain.DataHeader;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiResponse<Object>> handleException(Exception ex) {
        ApiResponse<Object> response = new ApiResponse<>();
        DataHeader dataHeader = new DataHeader();
        dataHeader.setError("Error interno en el servidor");
        response.setDataHeader(dataHeader);
        response.setData(null);
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
