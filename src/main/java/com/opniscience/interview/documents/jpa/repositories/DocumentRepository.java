package com.opniscience.interview.documents.jpa.repositories;

import com.opniscience.interview.documents.jpa.entities.DocumentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface DocumentRepository extends JpaRepository<DocumentEntity, UUID> {
  Optional<DocumentEntity> findByExternalId(String externalId);

  List<DocumentEntity> findAllByOwnerUserId(UUID userId);
}
