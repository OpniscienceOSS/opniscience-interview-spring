package com.opniscience.interview.documents.services;

import org.springframework.stereotype.Service;

@Service
public class AwsObjectStorageService implements ObjectStorageClient {
  @Override
  public void uploadObject(String bucket, String key, byte[] content, String contentType) {
    throw new UnsupportedOperationException("Unimplemented");
  }

  @Override
  public byte[] downloadObject(String bucket, String key) {
    throw new UnsupportedOperationException("Unimplemented");
  }

  @Override
  public boolean objectExists(String bucket, String key) {
    throw new UnsupportedOperationException("Unimplemented");
  }

  @Override
  public void deleteObject(String bucket, String key) {
    throw new UnsupportedOperationException("Unimplemented");
  }
}
