package com.example.jacksondemo;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Ticket {
    private Integer id;
    private List<Value> values;

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    static class Value {
        private String field_id;
        private String value;
        private List<ValueLabel> values;

        @Data
        @JsonIgnoreProperties(ignoreUnknown = true)
        static class ValueLabel {
            private String id;
            private String label;
            private String color;
        }
    }
}
