package com.contact.service;


import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService
{
    List<Contact> list = List.of(

            new Contact(1L, "amit@gmail.com","Amit", 1311L),
            new Contact(2L, "anil@gmail.com","Anil", 1311L),
            new Contact(3L, "rohan@gmail.com","rohan", 1312L),
            new Contact(4L, "sameer@gmail.com","sameer", 1313L)

    );


    @Override
    public List<Contact> getContactsofUser(Long userId)
    {
        return list.stream().filter(contact->contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
