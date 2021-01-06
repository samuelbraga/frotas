package com.samuelbraga.clients.model;

import com.samuelbraga.clients.dto.CreateClientDTO;
import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Client {

  @Id
  @GeneratedValue
  private Long id;

  private String name;

  private String last_name;

  public Client() {}

  public Client(Long id, String name, String last_name) {
    this.id = id;
    this.name = name;
    this.last_name = last_name;
  }

  public Client(CreateClientDTO createClientDTO) {
    this.name = createClientDTO.getName();
    this.last_name = createClientDTO.getLast_name();
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLast_name() {
    return last_name;
  }

  public void setLast_name(String last_name) {
    this.last_name = last_name;
  }
}
