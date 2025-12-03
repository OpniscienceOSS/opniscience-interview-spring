package com.opniscience.interview.documents.services;

public interface ObjectStorageClient {
  void uploadObject(String bucket, String key, byte[] content, String contentType);

  byte[] downloadObject(String bucket, String key);

  boolean objectExists(String bucket, String key);

  void deleteObject(String bucket, String key);
}
