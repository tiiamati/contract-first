package com.lmc.invoicecliente.repository;

import com.lmc.invoicecliente.domain.Client;
import com.lmc.invoicecliente.mapper.ClientRowMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.locator.UseClasspathSqlLocator;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.UseRowMapper;
import org.springframework.stereotype.Repository;

@UseClasspathSqlLocator
@Repository
public interface JdbiClientRepository extends ClientRepository{
    @Override
    @SqlQuery
    @UseRowMapper(ClientRowMapper.class)
    Client findClientById(@Bind("id") Long id);
}
