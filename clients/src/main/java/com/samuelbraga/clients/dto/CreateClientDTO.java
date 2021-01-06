package com.samuelbraga.clients.dto;

import io.quarkus.runtime.annotations.RegisterForReflection;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@RegisterForReflection
public class CreateClientDTO {

  @NotBlank
  @Email
  private String email;

  @NotBlank
  private String name;

  @NotBlank
  private String last_name;

  @NotBlank
  private String country_code;

  @NotBlank
  private String state_code;

  @NotBlank
  private String phone_number;

  public CreateClientDTO() {}

  public CreateClientDTO(
    String email,
    String name,
    String last_name,
    String country_code,
    String state_code,
    String phone_number
  ) {
    this.email = email;
    this.name = name;
    this.last_name = last_name;
    this.country_code = country_code;
    this.state_code = state_code;
    this.phone_number = phone_number;
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

  public String getCountry_code() {
    return country_code;
  }

  public void setCountry_code(String country_code) {
    this.country_code = country_code;
  }

  public String getState_code() {
    return state_code;
  }

  public void setState_code(String state_code) {
    this.state_code = state_code;
  }

  public String getPhone_number() {
    return phone_number;
  }

  public void setPhone_number(String phone_number) {
    this.phone_number = phone_number;
  }
}
