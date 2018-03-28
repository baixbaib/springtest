package com.bai;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ApplicationTest.class, HttpRequestTest.class, WebLayerTest.class, WebMockTest.class })
public class AllTests {

}
