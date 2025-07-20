package com.JutlandAir.JutlandAir.client.repository;

import com.JutlandAir.JutlandAir.client.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IClientRepository extends JpaRepository<Client, String> {

}
