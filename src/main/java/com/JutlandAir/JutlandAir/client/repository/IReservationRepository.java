package com.JutlandAir.JutlandAir.client.repository;

import com.JutlandAir.JutlandAir.client.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IReservationRepository extends JpaRepository<Reservation, String> {

}
