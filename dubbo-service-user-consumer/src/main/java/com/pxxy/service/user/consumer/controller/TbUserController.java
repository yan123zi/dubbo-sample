package com.pxxy.service.user.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.github.pagehelper.PageInfo;
import com.pxxy.beans.TbUser;
import com.pxxy.service.user.api.TbUserService;
import com.pxxy.statics.dto.DataTableDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author YZJ
 * @date 2019/5/6 - 19:36
 */
@Controller
@RequestMapping("/user")
public class TbUserController {
    @Reference(version = "${services.versions.user.v1}")
    private TbUserService tbUserService;
    /**
     * 跳转到列表页
     *
     * @return
     */
    @RequestMapping(value = "list", method = RequestMethod.GET)
    public String list() {
        return "/list";
    }

    @ResponseBody
    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public DataTableDTO<TbUser> page(HttpServletRequest request) {
        String strDraw = request.getParameter("draw");
        String strStart = request.getParameter("start");
        String strLength = request.getParameter("length");

        int draw = strDraw == null ? 0 : Integer.parseInt(strDraw);
        int start = strStart == null ? 0 : Integer.parseInt(strStart);
        int length = strLength == null ? 10 : Integer.parseInt(strLength);
        System.out.println(3);
        // 封装 Datatables 需要的结果
        PageInfo<TbUser> pageInfo = tbUserService.page(start, length);
        System.out.println(8);
        DataTableDTO<TbUser> dataTableDTO = new DataTableDTO<>();
        dataTableDTO.setData(pageInfo.getList());
        dataTableDTO.setDraw(draw);
        dataTableDTO.setRecordsTotal(pageInfo.getTotal());
        dataTableDTO.setRecordsFiltered(pageInfo.getTotal());
        System.out.println(2);
        return dataTableDTO;
    }
}
