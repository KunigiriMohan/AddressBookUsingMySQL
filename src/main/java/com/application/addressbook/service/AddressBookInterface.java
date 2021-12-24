package com.application.addressbook.service;

import java.util.List;

import com.application.addressbook.DTO.AddressBookDTO;


public interface AddressBookInterface {
    AddressBookDTO addContact(AddressBookDTO addressBook);
    AddressBookDTO getContactById(Long id);
    List<AddressBookDTO> getAllContact();
    List<AddressBookDTO> deleteContactById(Long id);
    AddressBookDTO updateContact(AddressBookDTO addressBookDTO);
    
}
