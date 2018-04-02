package com.github.autoconf;

import com.github.autoconf.api.IConfig;
import com.github.autoconf.base.Config;
import org.junit.Test;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by david on 18-4-2.
 */
public class ConfigFactoryTest {
    @Test
    public void testConfig() throws InterruptedException {
        ConfigFactory.getInstance().getConfig("test", (config) -> {
            System.out.println("changed");
            System.out.println(config.getAll());
        });
        AtomicInteger num = new AtomicInteger(0);
        TestHelper.busyWait(num);
    }
}
