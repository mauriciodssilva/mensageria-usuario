package com.ms.user.controllers;

import com.ms.user.forms.user.SaveUserForm;
import com.ms.user.models.UserModel;
import com.ms.user.services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author Mauricio Silva
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/users")
    public ResponseEntity<UserModel> saveUser(@RequestBody @Valid SaveUserForm saveUserForm) {
        var userModel = new UserModel();
        BeanUtils.copyProperties(saveUserForm, userModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(userModel));
    }
}
