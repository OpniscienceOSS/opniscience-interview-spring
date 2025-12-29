package com.opniscience.interview.documents.services;

import com.opniscience.interview.documents.exceptions.DocumentNotFoundException;
import com.opniscience.interview.documents.jpa.entities.DocumentEntity;
import com.opniscience.interview.documents.jpa.repositories.DocumentRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class DocumentService {
  private final ObjectStorageClient storageClient;
  private final DocumentRepository documentRepository;
  private final String bucketName;

  public DocumentService(
      ObjectStorageClient storageClient,
      DocumentRepository documentRepository,
      @Value("${app.document-bucket}") String bucketName
  ) {
    this.storageClient = storageClient;
    this.documentRepository = documentRepository;
    this.bucketName = bucketName;
  }

  /**
   * Generate a unique ID for mapping object storage to database entries.
   */
  private String createExternalId() {
    return UUID.randomUUID().toString();
  }

  /**
   * Generate a unique key string for object storage in the form of a filepath for the given document and version.
   * @param externalId the unique and immutable ID for the document
   * @param version the version as a positive integer
   */
  private String createObjectKey(String externalId, int version) {
    throw new UnsupportedOperationException("TODO");
  }

  /**
   * Upload a brand new document.
   * <p>
   * Generates a new unique externalId, then uploads the actual file contents to object storage and stores appropriate
   * metadata in the database. Returns the saved DocumentEntity if both tasks were successful, otherwise throws an
   * exception. In the case of an exception, any data manipulation should be rolled back.
   * </p>
   */
  public DocumentEntity uploadDocument(UUID ownerUserId, String filename, String contentType, byte[] content) {
    throw new UnsupportedOperationException("TODO");
  }

  /**
   * Update an existing document (creates a new version).
   * <p>
   * Uploads the new content to object storage and updates the existing database entry, including incrementing the
   * version and setting the updatedAt timestamp.
   * </p>
   */
  public DocumentEntity updateDocument(String externalId, byte[] newContent, String newContentType)
      throws DocumentNotFoundException {
    throw new UnsupportedOperationException("TODO");
  }

  /**
   * Soft-delete a document.
   * <p>
   * Deletes a document in the database in a soft-delete manner. May require a new database column.
   * </p>
   */
  public void deleteDocument(String externalId) throws DocumentNotFoundException {
    throw new UnsupportedOperationException("TODO");
  }
}
