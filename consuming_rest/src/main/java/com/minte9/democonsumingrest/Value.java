/**
 * Value class
 */

package com.minte9.democonsumingrest;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties (ignoreUnknown = true)
public class Value {

    private Long id;
    private String quote;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public String getQuote() {
        return quote;
    }

    @Override
    public String toString() {
        return "Value{id='" + id + "', quote=" + quote + "}";
    }
}