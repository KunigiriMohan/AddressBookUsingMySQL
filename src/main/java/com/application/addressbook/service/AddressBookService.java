package com.application.addressbook.service;

import java.util.List;

import com.application.addressbook.DTO.AddressBookDTO;
import com.application.addressbook.repository.AddressBookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AddressBookService implements AddressBookInterface{

    @Autowired
    AddressBookRepository addressBookRepository;

    /**
     * method to add Contact to database
     */
    @Override
    public  AddressBookDTO addContact(AddressBookDTO addressBook) {
        return addressBookRepository.save(addressBook);
    }
    
    /**
     * method to get Contact by id
     */
    @Override
    public AddressBookDTO getContactById(Long id) {
        return addressBookRepository.findById(id).get();
    }

    /**
     * method to get all contact by ID
     */
    @Override
    public List<AddressBookDTO> getAllContact(){
        return addressBookRepository.findAll();
    }

    /**
     * method to Delete Contact by ID and return list of all contacts after Deleting
     */
    @Override
    public List<AddressBookDTO> deleteContactById(Long id) {
        addressBookRepository.deleteById(id);
        return addressBookRepository.findAll();
    }

    /**
     * method to update details of Contact
     */
    @Override
    public AddressBookDTO updateContact(AddressBookDTO addressBookDTO) {
        AddressBookDTO existingContact = addressBookRepository.findById(addressBookDTO.getid()).orElse(null);
        existingContact.setName(addressBookDTO.getName());
        existingContact.setState(addressBookDTO.getState());
        existingContact.setAddress(addressBookDTO.getAddress());
        existingContact.setEmail(addressBookDTO.getEmail());
        existingContact.setCity(addressBookDTO.getCity());
        existingContact.setPhoneNumber(addressBookDTO.getPhoneNumber());
        existingContact.setPinCode(addressBookDTO.getPinCode());
        return addressBookRepository.save(existingContact);
    } 
}
