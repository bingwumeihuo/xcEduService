package com.xuecheng.manage_cms.controller;

import com.xuecheng.api.cms.CmsConfigControllerApi;
import com.xuecheng.framework.domain.cms.CmsConfig;
import com.xuecheng.manage_cms.dao.CmsConfigRepository;
import com.xuecheng.manage_cms.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Package: com.xuecheng.manage_cms.controller
 * @ClassName: CmsConfigController
 * @Description: Java类作用
 * @Author: 式神
 * @CreateDate: 2019/8/19 23:49
 */
@RequestMapping("/cms/config")
@RestController
public class CmsConfigController implements CmsConfigControllerApi {
    @Autowired
    PageService pageService;
    @Override
    @GetMapping("/getmodel/{id}")
    public CmsConfig getmodel(@PathVariable ("id") String id) {
        return pageService.getConfigById(id);
    }
}
