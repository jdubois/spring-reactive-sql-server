package com.example.reactivesql.reactivesqlserver.config;

import io.r2dbc.mssql.MssqlConnectionConfiguration;
import io.r2dbc.mssql.MssqlConnectionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.r2dbc.config.AbstractR2dbcConfiguration;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

@Configuration
@EnableR2dbcRepositories("com.example.reactivesql.reactivesqlserver.repository")
public class DatabaseConfiguration extends AbstractR2dbcConfiguration {

    private final Logger log = LoggerFactory.getLogger(DatabaseConfiguration.class);

    @Value("${spring.data.mssql.host}")
    private String host;

    @Value("${spring.data.mssql.database}")
    private String database;

    @Value("${spring.data.mssql.username}")
    private String username;

    @Value("${spring.data.mssql.password}")
    private String password;

    @Bean
    @Override
    public MssqlConnectionFactory connectionFactory() {
        log.info("Connecting to database '{}'...", host);
        return new MssqlConnectionFactory(MssqlConnectionConfiguration.builder()
                .host(host)
                .port(1433)
                .database(database)
                .username(username)
                .password(password)
                .build());
    }
}
