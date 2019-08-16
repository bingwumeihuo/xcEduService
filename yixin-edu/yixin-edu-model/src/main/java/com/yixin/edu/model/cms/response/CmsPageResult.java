package com.yixin.edu.model.cms.response;

import com.yixin.edu.common.model.response.ResponseResult;
import com.yixin.edu.common.model.response.ResultCode;
import com.yixin.edu.model.cms.CmsPage;
import lombok.Data;

/**
 * Created by mrt on 2018/3/31.
 */
@Data
public class CmsPageResult extends ResponseResult {
    CmsPage cmsPage;
    public CmsPageResult(ResultCode resultCode, CmsPage cmsPage) {
        super(resultCode);
        this.cmsPage = cmsPage;
    }
}
