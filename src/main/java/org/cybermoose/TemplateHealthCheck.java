package org.cybermoose;

import com.codahale.metrics.health.HealthCheck;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TemplateHealthCheck extends HealthCheck {
    private final String template;

    @Override
    protected Result check() throws Exception {
        final String saying = String.format(template, "TEST");
        if (!saying.contains("TEST")) {
            return Result.unhealthy("template doesn't include a name");
        }
        return Result.healthy();
    }
}
