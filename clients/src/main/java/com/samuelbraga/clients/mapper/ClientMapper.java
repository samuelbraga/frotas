package com.samuelbraga.clients.mapper;

import com.samuelbraga.clients.dto.ClientDTO;
import com.samuelbraga.clients.model.Client;
import org.mapstruct.Mapper;

@Mapper(componentModel = "cdi")
public interface ClientMapper {
  ClientDTO toResource(Client client);
}
