package org.cybermoose;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.dropwizard.Configuration;
import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HelloWorldConfiguration extends Configuration {
    @NotEmpty
    private String template;

    @NotEmpty
    private String defaultName = "Stranger";
}
