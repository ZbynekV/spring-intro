package net.test.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "net.test.persistence", "net.test.services" })
public class ConfigurationComponentScan {

}
