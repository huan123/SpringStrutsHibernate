package com.huanhuan.spring;

import com.huanhuan.spring.service.LoginService;
import com.opensymphony.xwork2.Action;

/**
 * Created by huan on 2015/6/13 0013.
 */
public class Login implements Action {

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    String password;

    String username;

    public String getPassword() {
        return password;
    }

    public LoginService getLoginService() {
        return loginService;
    }

    public void setLoginService(LoginService loginService) {
        this.loginService = loginService;
    }

    LoginService loginService;
    @Override
    public String execute() throws Exception {


     boolean lg =    loginService.login(username,password);

        if (lg)
        {
            System.out.println("登陆成功");
            return  SUCCESS;
        }
        else
        {
            System.out.println("登陆失败");
            return ERROR;
        }



    }

}
