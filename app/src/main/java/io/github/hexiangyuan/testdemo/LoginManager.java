package io.github.hexiangyuan.testdemo;

/**
 * Creator:HeXiangYuan
 * Date  : 16-11-18
 */

public class LoginManager {

    public void performLogin(String userName, String password,CallBack callBack) {

    }
    public void performLogin(String userName, String password) {

    }

   public interface CallBack {
        void onComplete(boolean loginResult);

        void onFailure();
    }
}
