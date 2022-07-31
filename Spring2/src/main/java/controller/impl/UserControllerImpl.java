package controller.impl;

import controller.UserController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import service.UserService;

@Controller
@Qualifier("userControllerImpl")
public class UserControllerImpl implements UserController {
    @Autowired(required = false)
    UserService userService;
}
