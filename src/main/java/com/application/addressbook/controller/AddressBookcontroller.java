package com.application.addressbook.controller;

import java.util.List;

import com.application.addressbook.DTO.AddressBookDTO;
import com.application.addressbook.service.AddressBookInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/addressbook/")
public class AddressBookcontroller {

    /**
    * @RestController : Defining Class as a RestController
    * @RequestMapping : Defining path of URL
    * @PostMapping : Defining URL path of API and to perform POST operation
    * @GetMapping : Defining URL Path of API
    * @PutMapping : Defining URL Path of API which perform PUT operation
    * @DeleteMapping : Defining URL Path of API which perform DELETE opertion
    * @Autowired : Dependency Injection
    */
    @Autowired
    AddressBookInterface addressBookInterface;

    /**
     * API for adding Contact to Database
     * @param addressbook
     * @return : Added Contact Details
     */
    @PostMapping("/post/")
    public AddressBookDTO addContact(@RequestBody AddressBookDTO addressbook){
        return addressBookInterface.addContact(addressbook);
    }

    /**
     * API for Getting Details by Id
     * @param Id
     * @return Contact
     */
    @GetMapping("/get/{Id}")
    public AddressBookDTO getContact(@PathVariable Long Id){
        return addressBookInterface.getContactById(Id);
    }
    
    
    /**
     * API for Getting All Contact Details
     * @return : List of all Contacts
     */
    @GetMapping("/get/allemployee")
    public List<AddressBookDTO> getAllContact(){
        return addressBookInterface.getAllContact();
    }
    
    
    /**
     * API for updating Contact details in repository 
     */
    @PutMapping("/update")
    public AddressBookDTO updateContact(@RequestBody AddressBookDTO addressBookDTO){
        return addressBookInterface.updateContact(addressBookDTO);
    }
    
    
    /**
     * API for deleting Contact by Id
     * @param Id
     * @return : list Remaining Contact after Deleting
     */
    @DeleteMapping("/delete/{Id}")
    public List<AddressBookDTO> deleteContact(@PathVariable Long Id){
        return addressBookInterface.deleteContactById(Id);
    }
    
}
