package io.github.hexiangyuan.testdemo.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

/**
 * Creator:HeXiangYuan
 * Date  : 16-11-21
 */
class ExampleClass {
    public String test() {
        return "test";
    }
}

public class ExampleMockTest {
    @Mock
    ExampleClass exampleClass;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void tesOrigin() {
        Assert.assertEquals("test", exampleClass.test());//will fail testOrigin()会报失败，因为test()方法被hook后返回了nul
    }

    @Test
    public void testMock() {
        Mockito.when(exampleClass.test()).thenReturn("test");
        Assert.assertEquals("test", exampleClass.test());//successed
    }
}


