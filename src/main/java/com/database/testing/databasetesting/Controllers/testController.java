package com.database.testing.databasetesting.Controllers;

import com.database.testing.databasetesting.Models.Enterprise;
import com.database.testing.databasetesting.Models.RegisterUser;
import com.database.testing.databasetesting.respository.EnterpriseRepository;
import com.database.testing.databasetesting.respository.InfoRepository;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/test")
public class testController {
    @Autowired
    private InfoRepository infoRepository;
    @Autowired
    private EnterpriseRepository enterpriseRepository;


    @RequestMapping(path = "res", method = RequestMethod.GET)
    public List<RegisterUser> list() {
//      List<User> usersList = (List<User>) infoRepository.findAll();
        List<RegisterUser> usersList = (List<RegisterUser>) infoRepository.findAll();
        return usersList;
    }
    @RequestMapping(path = "addOne", method = RequestMethod.GET)
    public String addOne() {
        RegisterUser u = new RegisterUser();
        u.setEmail("un email");
        u.setName("un nombre");
        u.setUserType("un userType");
        //infoRepository.save(u);
        return  "Created";
    }

    @PostMapping(path ="/register",consumes="application/json")
    public String register( @RequestBody RegisterUser user) {
//        enterpriseRepository.save(user.getEnterprise());
        System.out.println("-------------------------------------------");
        System.out.println(user.getName());
        System.out.println(user.getEmail());
        System.out.println(user.getUserType());
        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        System.out.println("Enterprice!");
        System.out.println(user.getEnterprise().getId());
        System.out.println(user.getEnterprise().getEnterpriseName());
        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
//        System.out.println("Phones!");
//        for (Phone phone: user.getPhones()
//        ) {
//            System.out.println(phone.getPhoneType() + " " + phone.getPhoneNumber());
//        }
//        System.out.println("-------------------------------------------");
//        System.out.println("-------------------------------------------");
//        System.out.println("IdentityID!");
//        System.out.println(user.getIdentityID().getIdentityType());
//        System.out.println(user.getIdentityID().getIdentityNumber());
//        System.out.println("-------------------------------------------");
//        System.out.println("-------------------------------------------");
//
//        System.out.println("-------------------------------------------");
        infoRepository.save(user);

        return "register";
    }


}
