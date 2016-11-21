package io.github.hexiangyuan.testdemo;

/**
 * Creator:HeXiangYuan
 * Date  : 16-11-18
 */

public class LoginPresenter {
    public LoginManager getLoginManager() {
        return loginManager;
    }

    public void setLoginManager(LoginManager loginManager) {
        this.loginManager = loginManager;
    }

    private LoginManager loginManager = new LoginManager();
    public PasswordValidator passwordValidator = new PasswordValidator();

    public void login(String userName, String password) {
        if (userName == null || userName.length() == 0
                || password == null || password.length() == 0) return;
        if (!passwordValidator.verifyPassword(password)) return;
        loginManager.performLogin(userName, password);
    }

    public void loginCallBack(String userName, String password) {
        if (userName == null || userName.length() == 0
                || password == null || password.length() == 0) return;
        if (!passwordValidator.verifyPassword(password)) return;
        loginManager.performLogin(userName, password, new LoginManager.CallBack() {
            @Override
            public void onComplete(boolean loginResult) {

            }

            @Override
            public void onFailure() {

            }
        });
    }
}
