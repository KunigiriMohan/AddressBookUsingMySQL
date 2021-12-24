package com.application.addressbook.repository;

import com.application.addressbook.DTO.AddressBookDTO;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository Interface
 */
@Repository
public interface AddressBookRepository extends JpaRepository<AddressBookDTO,Long>{
    
}
