package com.zipeng.mockito.quickstart;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : liang.zi.peng
 * @create 2023/6/13 22:36
 */
public class AccountDao {

    public Account findAccount(String username, String password) {
        // 代表当前 db 不可用
        throw new UnsupportedOperationException();
    }

}
