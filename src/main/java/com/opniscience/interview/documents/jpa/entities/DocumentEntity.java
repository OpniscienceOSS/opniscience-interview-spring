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
  private int version;

  @Column(nullable = false)
  private String objectBucket;

  @Column(nullable = false)
  private String objectKey;

  @Column(nullable = false)
  private UUID ownerUserId;

  @Column(nullable = false, updatable = false)
  private Instant createdAt;

  @Column(nullable = false)
  private Instant updatedAt;

  public static DocumentEntity build(
      String externalId,
      String filename,
      String contentType,
      long sizeBytes,
      int version,
      String objectBucket,
      String objectKey,
      UUID ownerUserId,
      Instant createdAt
  ) {
    DocumentEntity entity = new DocumentEntity();
    entity.externalId = externalId;
    entity.filename = filename;
    entity.contentType = contentType;
    entity.sizeBytes = sizeBytes;
    entity.version = version;
    entity.objectBucket = objectBucket;
    entity.objectKey = objectKey;
    entity.ownerUserId = ownerUserId;

    if (createdAt == null) {
      createdAt = Instant.now();
    }
    entity.createdAt = createdAt;
    entity.updatedAt = createdAt;
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

  public int getVersion() {
    return this.version;
  }

  public String getObjectBucket() {
    return this.objectBucket;
  }

  public String getObjectKey() {
    return this.objectKey;
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

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  public void setSizeBytes(long sizeBytes) {
    this.sizeBytes = sizeBytes;
  }

  public void setVersion(int version) {
    this.version = version;
  }

  public void setObjectBucket(String objectBucket) {
    this.objectBucket = objectBucket;
  }

  public void setObjectKey(String objectKey) {
    this.objectKey = objectKey;
  }

  public void setUpdatedAt(Instant updatedAt) {
    this.updatedAt = updatedAt;
  }
}
