package com.samuelbraga.clients.service;

import com.samuelbraga.clients.dto.ClientDTO;
import com.samuelbraga.clients.dto.CreateClientDTO;

public interface ClientService {
  ClientDTO create(CreateClientDTO createClientDTO);
}
