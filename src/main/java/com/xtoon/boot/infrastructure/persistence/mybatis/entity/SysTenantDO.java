package com.xtoon.boot.infrastructure.persistence.mybatis.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 租户DO
 *
 * @author haoxin
 * @date 2021-02-14
 **/
@Data
@TableName("sys_tenant")
public class SysTenantDO extends BaseDO {

    /**
     * 租户编码
     */
    private String tenantCode;

    /**
     * 租户名称
     */
    private String tenantName;

    /**
     * 租户创建者
     */
    private String creatorId;

    /**
     * 租户状态
     */
    private String status;
}
