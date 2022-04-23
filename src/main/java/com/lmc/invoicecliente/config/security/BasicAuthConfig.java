package com.lmc.invoicecliente.config.security;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "security")
public class BasicAuthConfig {
    private String username;
    private String password;
}
