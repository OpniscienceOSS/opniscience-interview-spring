package com.opniscience.interview.documents.jpa.entities;

import jakarta.persistence.*;

import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "documents")
public class DocumentEntity {
  @Id
  @GeneratedValue
  private UUID id;

  @Column(nullable = false, unique = true, updatable = false)
  private String externalId;

  @Column(nullable = false)
  private String filename;

  @Column(nullable = false)
  private String contentType;

  @Column(nullable = false)
  private long sizeBytes;

  @Column(nullable = false)
  private Integer version;

  @Column(nullable = false)
  private String bucketName;

  @Column(nullable = false)
  private String objectPath;

  @Column(nullable = false)
  private UUID ownerUserId;

  @Column(nullable = false)
  private Instant createdAt;

  @Column(nullable = false)
  private Instant updatedAt;

  public static DocumentEntity create(
      String externalId,
      String filename,
      String contentType,
      long sizeBytes,
      Integer version,
      String bucketName,
      String objectPath,
      UUID ownerUserId
  ) {
    DocumentEntity entity = new DocumentEntity();
    entity.externalId = externalId;
    entity.filename = filename;
    entity.contentType = contentType;
    entity.sizeBytes = sizeBytes;
    entity.version = version;
    entity.bucketName = bucketName;
    entity.objectPath = objectPath;
    entity.ownerUserId = ownerUserId;
    entity.createdAt = Instant.now();
    entity.updatedAt = entity.createdAt;
    return entity;
  }

  public UUID getId() {
    return this.id;
  }

  public String getExternalId() {
    return this.externalId;
  }

  public String getFilename() {
    return this.filename;
  }

  public String getContentType() {
    return this.contentType;
  }

  public long getSizeBytes() {
    return this.sizeBytes;
  }

  public Integer getVersion() {
    return this.version;
  }

  public String getBucketName() {
    return this.bucketName;
  }

  public String getObjectPath() {
    return this.objectPath;
  }

  public UUID getOwnerUserId() {
    return this.ownerUserId;
  }

  public Instant getCreatedAt() {
    return this.createdAt;
  }

  public Instant getUpdatedAt() {
    return this.updatedAt;
  }
}
