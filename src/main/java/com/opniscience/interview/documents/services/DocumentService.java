package com.opniscience.interview.documents.services;

import com.opniscience.interview.documents.jpa.entities.DocumentEntity;
import com.opniscience.interview.documents.jpa.repositories.DocumentRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
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

  private String createExternalId() {
    return UUID.randomUUID().toString();
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
   * Increments the version and sets updatedAt and uploads the new content to object storage.
   * </p>
   */
  public DocumentEntity updateDocument(String externalId, byte[] newContent, String newContentType) {
    throw new UnsupportedOperationException("TODO");
  }

  /**
   * Soft-delete a document.
   * <p>
   * Deletes a document in the database in a soft-delete manner. May require a new database column.
   * </p>
   */
  public void deleteDocument(String externalId) {
    throw new UnsupportedOperationException("TODO");
  }

  /**
   * List all documents for a given user.
   */
  public List<DocumentEntity> listUserDocuments(UUID userId) {
    throw new UnsupportedOperationException("TODO");
  }

  /**
   * Download the latest version of a document by external ID.
   */
  public byte[] downloadDocument(String externalId) {
    throw new UnsupportedOperationException("TODO");
  }
}
