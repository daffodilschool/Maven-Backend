package com.daffodilschool.schoolmanagement.utils;


import com.daffodilschool.schoolmanagement.dto.StudentEntryDTO;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Optional;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@NoArgsConstructor

public class CustomResponsePojo<T> {

        @JsonProperty("status")
        private String status;

        @JsonProperty("message")
        private String message;

    private T data;


    public CustomResponsePojo(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public CustomResponsePojo(String status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }
}
