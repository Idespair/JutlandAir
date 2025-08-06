package com.JutlandAir.JutlandAir.client.repository;

import com.JutlandAir.JutlandAir.client.model.Client;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IClientRepository extends JpaRepository<Client, UUID> {
    void deleteById(UUID id);

    Page<Client> findByNameContainingIgnoreCase (String name, Pageable page);

    boolean existsById(UUID id);
}
