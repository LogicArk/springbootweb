package net.biancheng.entity;

/**
 * @Author: LogicArk
 * @Description:
 * @Date: Created in 2021/8/18 17:56
 */
public class ResponseData {

    private Boolean status = true;

    private int code = 200;

    private String message;

    private Object data;

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
