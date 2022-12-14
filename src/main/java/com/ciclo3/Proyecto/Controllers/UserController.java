package com.ciclo3.Proyecto.Controllers;

import com.ciclo3.Proyecto.Models.UsersApplication;
import com.ciclo3.Proyecto.Services.ServiceInterfaceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {
    @Autowired
    private ServiceInterfaceUser UserBDX;



    @GetMapping("/userRegister")
    public String getUserRegister(Model model){
        model.addAttribute("formUserRegister",new UsersApplication());
        return "userRegister";
    }

    @PostMapping("/CreateUser")
    public String CreateUser (@ModelAttribute("redirect:/WelcomeUser") UsersApplication UserX){
        UserBDX.setCreateUsersApplication(UserX);
        return "redirect:/userList";
    }




    @GetMapping("/userList")
    public String getUserList(Model model){
        model.addAttribute("UsersApplication",UserBDX.getUsersApplication());
        return "userList";
    }



    @PostMapping("/deleteUser/{userApplication}")
    public String deleteUser(@PathVariable String userApplication, Model model){
        try {
            UserBDX.getDeleteUsersApplication(userApplication);
            return "redirect:/userList";
        } catch (Exception e) {
            return "redirect:/errorLogin";
        }
    }



    @GetMapping("/updateUser/{userApplication}")
    public String updateUser(@PathVariable String userApplication, Model model){
        try {
            model.addAttribute("userUpdate",UserBDX.getOnlyOneUsersApplication(userApplication));
            return "updateUserNew";
        } catch (Exception e) {
            return "redirect:/errorLogin";
        }
    }

    @PostMapping("/updateUser")
    public String updateUser (@ModelAttribute("redirect:/WelcomeUser") UsersApplication UserX){
        try {
            UserBDX.getUpdateUsersApplication(UserX);
            return "redirect:/userList";
        } catch (Exception e) {
            return "redirect:/errorLogin";
        }

    }



}
