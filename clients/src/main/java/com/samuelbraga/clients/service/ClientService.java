package com.samuelbraga.clients.service;

import com.samuelbraga.clients.dto.CreateClientDTO;
import com.samuelbraga.clients.model.Client;

public interface ClientService {
  Client create(CreateClientDTO createClientDTO);
}
