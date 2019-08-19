package com.xuecheng.api.cms;

import com.xuecheng.framework.domain.cms.CmsConfig;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @Package: com.xuecheng.api.cms
 * @ClassName: CmsConfigControllerApi
 * @Description: Java类作用
 * @Author: 式神
 * @CreateDate: 2019/8/19 23:37
 */
@Api(value="cms配置管理接口",description ="cms配置管理接口，提供数据模型的管理、查询接口")
public interface CmsConfigControllerApi {
    @ApiOperation("根据id查询CMS配置信息")
    public CmsConfig getmodel(String id);
}
