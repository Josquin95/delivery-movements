package co.com.doveracing.deliverymovements.domain;

import com.fasterxml.jackson.annotation.JsonInclude;

public class ApiResponse<T> {
    private DataHeader dataHeader;
    private T data;

    public DataHeader getDataHeader() {
        return dataHeader;
    }

    public void setDataHeader(DataHeader dataHeader) {
        this.dataHeader = dataHeader;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
