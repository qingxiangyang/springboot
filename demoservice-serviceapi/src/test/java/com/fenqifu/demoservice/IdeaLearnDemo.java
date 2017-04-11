package com.fenqifu.demoservice;

import org.junit.Test;

/**
 * Created by yqx on 2017/2/28.
 */
public class IdeaLearnDemo {
    @Test
    public void testNotice() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("123");
        stringBuilder.append("中国");
        System.out.print(stringBuilder.toString() + "-------------------------------------------------------------------------------------------------------------------------------");
        testMethord11();


    }

    public String testMethord11() {
        return "111";
    }


}
