package com.pxxy.service.search.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pxxy.service.search.api.SearchService;
import com.pxxy.service.search.domain.TbItemResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author YZJ
 * @date 2019/5/15 - 16:15
 */
@RestController
public class SearchController {

    @Reference(version = "${services.versions.search.v1}")
    private SearchService searchService;

    @RequestMapping(value = "search/{query}/{page}/{size}", method = RequestMethod.GET)
    public List<TbItemResult> search(
            @PathVariable(required = true) String query,
            @PathVariable(required = true) int page,
            @PathVariable(required = true) int size) {
        List<TbItemResult> tbItemResults = searchService.search(query, page, size);
        return tbItemResults;
    }
}