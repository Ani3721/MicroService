package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService
{
    List<User> list  = List.of(

            new User(1311L, "Durgesh Tiwari", "9373284445"),
            new User(1312L, "Ankit Tiwari", "7875507392"),
            new User(1314L, "Ravi Tiwari", "9767399608")
    );

    @Override
    public User getUser(Long id)
    {
        return list.stream().filter(user->user.getUserId().equals(id)).findAny().orElse(null);
    }
}
