package com.lmc.invoicecliente.mapper;

import com.lmc.invoicecliente.domain.Client;
import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.core.statement.StatementContext;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class ClientRowMapper implements RowMapper<Client> {

    @Override
    public Client map(ResultSet resultSet, StatementContext statementContext) throws SQLException {

        return Client.builder()
                .id(resultSet.getLong("id"))
                .name(resultSet.getString("name"))
                .email(resultSet.getString("email"))
                .active(resultSet.getBoolean("active"))
                .build();
    }
}
