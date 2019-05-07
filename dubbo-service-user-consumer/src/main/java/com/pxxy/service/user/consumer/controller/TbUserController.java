package com.pxxy.service.user.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pxxy.beans.TbUser;
import com.pxxy.service.user.api.TbUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author YZJ
 * @date 2019/5/6 - 19:36
 */
@Controller
public class TbUserController {
    @Reference(version = "${services.versions.user.v1}")
    private TbUserService tbUserService;
    @GetMapping("/list")
    public String list(Model model){
        List<TbUser> tbUsers = tbUserService.selectAll();
        model.addAttribute("tbUsers",tbUsers);
        return "list";
    }
}
