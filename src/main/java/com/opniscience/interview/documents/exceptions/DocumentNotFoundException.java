package com.opniscience.interview.documents.exceptions;

public class DocumentNotFoundException extends Exception {
  public DocumentNotFoundException(String externalId) {
    super("Document with id " + externalId + " not found");
  }
}
