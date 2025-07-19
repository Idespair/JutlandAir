package com.JutlandAir.JutlandAir.client.repository;

import com.JutlandAir.JutlandAir.client.model.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISeatRepository extends JpaRepository<Seat, String> {

}
