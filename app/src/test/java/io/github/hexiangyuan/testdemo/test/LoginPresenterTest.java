package io.github.hexiangyuan.testdemo.test;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import io.github.hexiangyuan.testdemo.LoginManager;
import io.github.hexiangyuan.testdemo.LoginPresenter;
import io.github.hexiangyuan.testdemo.PasswordValidator;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;

/**
 * Creator:HeXiangYuan
 * Date  : 16-11-18
 */

public class LoginPresenterTest {
    private LoginPresenter mPresenter;

    @Before
    public void setUp() {
        mPresenter = new LoginPresenter();
    }

    @Test()
    public void loginTest() throws Exception {
        LoginManager loginManager = Mockito.mock(LoginManager.class);
        PasswordValidator passwordValidator = Mockito.mock(PasswordValidator.class);
        mPresenter.setLoginManager(loginManager);
        mPresenter.passwordValidator = passwordValidator;
        Mockito.when(passwordValidator.verifyPassword(anyString())).thenReturn(true);
        Mockito.verify(loginManager).performLogin("xiaochuang", "xiaochuang password");
    }

    @Test()
    public void testMockAnswer() {
        LoginManager loginManager = Mockito.mock(LoginManager.class);
        Mockito.doAnswer(new Answer() {
            @Override
            public Object answer(InvocationOnMock invocation) throws Throwable {
                Object[] arguments = invocation.getArguments();
                LoginManager.CallBack callBack = (LoginManager.CallBack) arguments[2];
                callBack.onComplete(true);
                return true;
            }
        }).when(loginManager).performLogin(anyString(), anyString(), any(LoginManager.CallBack.class));
        loginManager.performLogin("xiaochuang", "xiaochuang password", Mockito.mock(LoginManager.CallBack.class));
    }

}
