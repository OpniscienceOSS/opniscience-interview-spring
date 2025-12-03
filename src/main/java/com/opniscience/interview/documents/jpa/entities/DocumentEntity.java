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
  private String externalId; // Public immutable ID

  @Column(nullable = false)
  private String filename;

  @Column(nullable = false)
  private String contentType;

  @Column(nullable = false)
  private long sizeBytes;

  @Column(nullable = false)
  private Integer version;

  @Column(nullable = false)
  private String s3Bucket;

  @Column(nullable = false)
  private String s3Key;

  @Column(nullable = false)
  private UUID ownerUserId;

  @Column(nullable = false)
  private Instant createdAt;

  @Column(nullable = false)
  private Instant updatedAt;
}
