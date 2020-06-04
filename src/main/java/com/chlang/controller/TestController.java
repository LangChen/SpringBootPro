package com.chlang.controller;

import com.chlang.common.annotation.ControllerWebLog;
import com.chlang.common.constant.CommonConstants;
import com.chlang.common.resp.common.PlatformHttpResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 接口测试
 */
@RestController
@RequestMapping("test/")
public class TestController {

    @ControllerWebLog(apiName = "test/exception")
    @GetMapping("exception")
    public PlatformHttpResult exceptionTest(){
        int c = 1/0;
        return PlatformHttpResult.successWithMsg("测试！！！");
    }

    @ControllerWebLog(apiName = "test/datePattern")
    @GetMapping("login")
    public PlatformHttpResult loginTest(HttpServletRequest request){
        String userAccount = (String)request.getAttribute(CommonConstants.CURRENT_USER_ID);

        return PlatformHttpResult.successWithObj(userAccount);
    }

    @ControllerWebLog(apiName = "test/datePattern")
    @GetMapping("datePattern")
    public PlatformHttpResult datePatternTest(){
        LocalDateTime now1 = LocalDateTime.now();
        Date now2 = new Date();

        Map<String,Object> result = new HashMap<>();
        result.put("localDateTime",now1);
        result.put("date",now2);

        return PlatformHttpResult.successWithObj(result);
    }

}
