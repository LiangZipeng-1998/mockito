package com.zipeng.mockito.quickstart;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : liang.zi.peng
 * @create 2023/6/13 21:59
 */
public class AccountLoginController {

    private final AccountDao accountDao;

    public AccountLoginController(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public String login(HttpServletRequest request) {
        final String username = request.getParameter("username");
        final String password = request.getParameter("password");

//        Account account = accountDao.findAccount(username, password);
//        if (account == null) {
//            return "/login";
//        } else {
//            return "/index";
//        }

        // 加固
        try {
            Account account = accountDao.findAccount(username, password);
            if (account == null) {
                return "/login";
            } else {
                return "/index";
            }
        } catch (Exception e) {
            return "/505";
        }
    }

}
