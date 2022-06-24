package com.alphapires.parkingcontrol.repository;

import com.alphapires.parkingcontrol.model.ParkingSpotModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {

    boolean existsByLicensePlateCar(String licensePlateCar);
    boolean existsByParkingSpotNumber(String parkingSpotNumber);
    boolean existsByApartmentAndBlock(String apartment, String block);
    Page<ParkingSpotModel> findAll(Pageable pageable);
    Optional<ParkingSpotModel> findById(UUID id);
    void delete(ParkingSpotModel parkingSpotModel);
}
