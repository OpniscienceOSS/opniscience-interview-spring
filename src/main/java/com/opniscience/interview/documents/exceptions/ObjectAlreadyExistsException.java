package com.opniscience.interview.documents.exceptions;

public class ObjectAlreadyExistsException extends Exception {
  public ObjectAlreadyExistsException(String bucket, String key) {
    super("Object with key " + key + " already exists in bucket " + bucket);
  }
}
