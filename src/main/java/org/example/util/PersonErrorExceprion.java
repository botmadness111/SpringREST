package org.example.util;

import java.sql.Timestamp;

public class PersonErrorExceprion {
    String error;
    Long time;

    public PersonErrorExceprion(String error, long time) {
        this.error = error;
        this.time = time;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }
}
