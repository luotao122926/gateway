package com.bosum.gateway.config.properties;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@RefreshScope
@ConfigurationProperties(prefix = "whites-rules.ignore.expose-whites")
@Data
public class ExposeWhitesProperties {
    private List<String> whites;
}
