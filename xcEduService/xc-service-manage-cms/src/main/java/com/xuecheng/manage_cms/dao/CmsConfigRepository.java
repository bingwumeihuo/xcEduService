package com.xuecheng.manage_cms.dao;

import com.xuecheng.framework.domain.cms.CmsConfig;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @Package: com.xuecheng.manage_cms.dao
 * @ClassName: CmsConfigRepository
 * @Description: Java类作用
 * @Author: 式神
 * @CreateDate: 2019/8/19 23:40
 */
public interface CmsConfigRepository extends MongoRepository<CmsConfig,String> {

}
