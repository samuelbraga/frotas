package com.samuelbraga.clients.service.Impl;

import com.samuelbraga.clients.dto.ClientDTO;
import com.samuelbraga.clients.dto.CreateClientDTO;
import com.samuelbraga.clients.mapper.ClientMapper;
import com.samuelbraga.clients.model.Client;
import com.samuelbraga.clients.repository.ClientRepository;
import com.samuelbraga.clients.service.ClientService;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class ClientServiceImpl implements ClientService {

  @Inject
  ClientRepository clientRepository;

  @Inject
  ClientMapper clientMapper;

  public ClientDTO create(CreateClientDTO createClientDTO) {
    Client client = new Client(createClientDTO);
    this.clientRepository.save(client);
    return this.clientMapper.toResource(client);
  }
}
