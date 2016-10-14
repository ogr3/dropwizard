package org.cybermoose;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.Builder;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Builder(toBuilder = true)
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonDeserialize(builder = HelloWorld.HelloWorldBuilder.class)
public class HelloWorld {
    private final long id;

    @Length(max = 3)
    private final String content;

    @JsonPOJOBuilder(withPrefix = "")
    public static final class HelloWorldBuilder {
    }
}