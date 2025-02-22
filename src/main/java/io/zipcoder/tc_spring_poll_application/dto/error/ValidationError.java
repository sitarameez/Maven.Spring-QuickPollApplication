package io.zipcoder.tc_spring_poll_application.dto.error;

import java.util.List;
import java.util.Map;

public class ValidationError {
    String code;
    String message;
    Map<String, List<ValidationError>> errors;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
