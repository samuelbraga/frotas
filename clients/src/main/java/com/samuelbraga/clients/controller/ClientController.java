package com.samuelbraga.clients.controller;

import com.samuelbraga.clients.dto.CreateClientDTO;
import com.samuelbraga.clients.model.Client;
import com.samuelbraga.clients.service.ClientService;
import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/client")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ClientController {

  @Inject
  ClientService clientService;

  @POST
  public Client create(@Valid CreateClientDTO createClientDTO) {
    Client client = clientService.create(createClientDTO);
    return client;
  }
}
