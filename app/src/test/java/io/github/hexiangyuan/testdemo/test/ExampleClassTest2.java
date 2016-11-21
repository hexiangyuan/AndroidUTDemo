package io.github.hexiangyuan.testdemo.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

/**
 * Creator:HeXiangYuan
 * Date  : 16-11-21
 */

public class ExampleClassTest2 {
    @Spy
    ExampleClass exampleClass;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testOrigin() {
        Assert.assertEquals("test", exampleClass.test());//success
    }

    @Test
    public void testMockSky(){//success
        Mockito.when(exampleClass.test()).thenReturn("test");
        Assert.assertEquals("test",exampleClass.test());
    }
}
