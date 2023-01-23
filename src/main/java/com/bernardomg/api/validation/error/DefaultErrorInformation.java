
package com.bernardomg.api.validation.error;

import lombok.Data;

@Data
public class DefaultErrorInformation implements ErrorInformation {

    private String context;

    private String details;

    private String instance;

    private String title;

    private String type;

}
