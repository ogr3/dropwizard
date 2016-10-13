package org.cybermoose;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class HelloWorld {
    @JsonProperty
    private long id;

    @Length(max = 3)
    @JsonProperty
    private String content;
}