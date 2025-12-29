package com.opniscience.interview.documents.exceptions;

public class ObjectNotFoundException extends Exception {
  public ObjectNotFoundException(String bucket, String key) {
    super("Object with key " + key + " not found in bucket " + bucket);
  }
}
