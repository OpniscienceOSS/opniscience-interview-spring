package com.opniscience.interview.documents.jpa.repositories;

import com.opniscience.interview.documents.jpa.entities.DocumentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * A simple JpaRepository interface for DocumentEntity records.
 * <p>
 * In addition to the explicitly defined methods below, JpaRepository also provides a `save` method, which will insert
 * or update the appropriate row in the database for the passed DocumentEntity.
 * </p>
 */
public interface DocumentRepository extends JpaRepository<DocumentEntity, UUID> {
  Optional<DocumentEntity> findByExternalId(String externalId);

  List<DocumentEntity> findAllByOwnerUserId(UUID userId);
}
