package com.samuelbraga.clients.exception.handle;

import javax.validation.ConstraintViolationException;
import javax.validation.UnexpectedTypeException;
import javax.ws.rs.ProcessingException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class UnexpectedTypeExceptionHandle
  implements ExceptionMapper<UnexpectedTypeException> {

  @Override
  public Response toResponse(UnexpectedTypeException exception) {
    return Response
      .status(Response.Status.BAD_REQUEST)
      .entity(exception.getMessage())
      .build();
  }
}
