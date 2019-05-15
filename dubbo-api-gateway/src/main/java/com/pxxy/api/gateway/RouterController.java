package com.pxxy.api.gateway;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.rpc.RpcContext;
import com.pxxy.service.content.api.ContentConsumerService;
import com.pxxy.service.user.api.UserConsumerService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author YZJ
 * @date 2019/5/10 - 20:13
 */
@Controller
@RequestMapping("/router")
public class RouterController {
    @Value("${services.ports.user.port}")
    private String userPort;
    @Value("${services.ports.content.port}")
    private String contentPort;
    @Reference(version = "${services.versions.user.v1}")
    private UserConsumerService userConsumerService;
    @Reference(version = "${services.versions.content.v1}")
    private ContentConsumerService contentConsumerService;
    @GetMapping("/user")
    public String redirectUser(String path){
        //远程调用
        userConsumerService.info();
        // 本端是否为消费端，这里会返回true
        return getRequestPath(userPort,path);
    }
    @GetMapping("/content")
    public String redirectContent(String path){
        //远程调用
        contentConsumerService.info();
        // 本端是否为消费端，这里会返回true
        return getRequestPath(contentPort,path);
    }
    /**
     * 获取请求路径
     * @param path
     * @return
     */
    private String getRequestPath(String serverPort,String path){
        boolean isConsumerSide = RpcContext.getContext().isConsumerSide();
        if (isConsumerSide){
            // 获取最后一次调用的提供方IP地址
            String serverIP = RpcContext.getContext().getRemoteHost();
            return String.format("redirect:http://%s:%s%s",serverIP,serverPort,path);
        }
        return null;
    }
}
