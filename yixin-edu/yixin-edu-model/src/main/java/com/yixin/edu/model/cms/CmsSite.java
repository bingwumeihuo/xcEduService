package com.yixin.edu.model.cms;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * @Author: mrt.
 * @Description:
 * @Date:Created in 2018/1/24 9:46.
 * @Modified By:
 */
@Data
@ToString
@Document(collection = "cms_site")
public class CmsSite {

    @Id
    private String siteId;
    private String siteName;
    private String siteDomain;
    private String sitePort;
    private String siteWebPath;
    private Date siteCreateTime;

}
