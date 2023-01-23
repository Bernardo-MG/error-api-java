
package com.bernardomg.api.validation.error;

import lombok.Data;

@Data
public class DefaultErrorDetails implements ErrorDetails {

    private String context;

    private String details;

    private String instance;

    private String title;

    private String type;

}
