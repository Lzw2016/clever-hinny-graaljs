package org.clever.hinny.graal.test.base;

import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;

/**
 * 作者：lizw <br/>
 * 创建时间：2020/07/31 21:52 <br/>
 */
@Slf4j
public class T01JObjectTest extends AbstractJdbcDataSourceTest {
    @Before
    public void before() throws Exception {
        super.before();
        scriptObject = engineInstance.require("/test/dist/base/01JObject");
    }

    @Test
    public void t01() {
        scriptObject.callMember("t01");
        log.info("--------------------------------------------------------------------------------------------");
    }

    @Test
    public void t02() {
        scriptObject.callMember("t02");
        log.info("--------------------------------------------------------------------------------------------");
    }
}
