package com.samuelbraga.clients.model;

import com.samuelbraga.clients.dto.CreateClientDTO;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Client {

  @Id
  @GeneratedValue
  private Long id;

  @Column(unique = true)
  private String email;

  private String name;

  private String last_name;

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Client() {}

  public Client(Long id, String email, String name, String last_name) {
    this.id = id;
    this.email = email;
    this.name = name;
    this.last_name = last_name;
  }

  public Client(CreateClientDTO createClientDTO) {
    this.email = createClientDTO.getEmail();
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
