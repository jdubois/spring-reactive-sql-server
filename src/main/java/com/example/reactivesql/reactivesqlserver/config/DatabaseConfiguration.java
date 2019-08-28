package com.example.reactivesql.reactivesqlserver.config;

import io.r2dbc.mssql.MssqlConnectionConfiguration;
import io.r2dbc.mssql.MssqlConnectionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

@Configuration
@EnableR2dbcRepositories
public class DatabaseConfiguration {

    @Value("spring.data.mssql.host")
    private String host;

    @Value("spring.data.mssql.port")
    private int port;

    @Value("spring.data.mssql.database")
    private String database;

    @Value("spring.data.mssql.username")
    private String username;

    @Value("spring.data.mssql.password")
    private String password;

    @Bean
    public MssqlConnectionFactory connectionFactory() {
        return new MssqlConnectionFactory(getBuild());
    }

    private MssqlConnectionConfiguration getBuild() {
        return MssqlConnectionConfiguration.builder()
                        .host(host)
                        .port(port)
                        .database(database)
                        .username(username)
                        .password(password)
                        .build();
    }
}
