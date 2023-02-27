/**
 * Domain class contains the data that you need
 * Any property not bound will be ignored
 */

package com.minte9.democonsumingrest;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties (ignoreUnknown = true) // Look Here
public class Quote {
    
    private String type;
    private Value value;

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public Value getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Quote{type='" + type + "', value=" + value + "}";
    }
}
