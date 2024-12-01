package com.pivotal.cloud.common.domain.object.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.pivotal.cloud.common.domain.Entity;
import lombok.*;

/**
 * @className: com.pivotal.cloud.common.domain.object.entity.ObjectEntiy
 * @projectName: PivotalCloud项目
 * @module: PivotalCloud项目-ObjectEntiy类，主要位于统一对象实体基类模块
 * @content: ObjectEntiy-统一对象实体基类
 * @author: Powered by Marklin
 * @datetime: 2024-12-01 17:40
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2024 PivotalCloud Systems Incorporated. All rights reserved.
 */
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ObjectEntity extends BaseEntity {

    private static final long serialVersionUID = -7706940701856818035L;

    /**
     * 应用Id
     */
    @Getter
    @Setter
    @TableField(value = Entity.APP_ID)
    private Long appId;

    /**
     * 租户Id
     */
    @Getter
    @Setter
    @TableField(value = Entity.TENANT_ID)
    private Long tenantId;
}
