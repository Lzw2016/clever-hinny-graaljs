package org.clever.hinny.graal.test.core;

import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;

@Slf4j
public class T19SpringContext extends AbstractTest {
    @Before
    public void before() throws Exception {
        super.before();
        scriptObject = engineInstance.require("/test/dist/core/19SpringContext");
    }

    @Test
    public void t01() {
        scriptObject.callMember("t01");
        log.info("### ---------------------------------------------------------------------------> END");
    }
}