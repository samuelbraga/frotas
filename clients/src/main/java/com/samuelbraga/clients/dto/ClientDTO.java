package com.samuelbraga.clients.dto;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class ClientDTO {

  private Long id;
  private String email;
  private String name;
  private String last_name;

  public ClientDTO() {}

  public ClientDTO(Long id, String email, String name, String last_name) {
    this.id = id;
    this.email = email;
    this.name = name;
    this.last_name = last_name;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
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
