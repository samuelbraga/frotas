package com.samuelbraga.clients.repository;

import com.samuelbraga.clients.model.Client;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;

@ApplicationScoped
@Transactional
public class ClientRepository implements PanacheRepository<Client> {

  public void save(Client client) {
    persist(client);
  }
}
