package io.github.hexiangyuan.testdemo.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

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
        Assert.assertEquals("test", exampleClass.test());//will fail
    }

    @Test
    public void testMock(){
        Mockito.when(exampleClass.test()).thenReturn("test");
        Assert.assertEquals("test",exampleClass.test());//successed
    }
}
