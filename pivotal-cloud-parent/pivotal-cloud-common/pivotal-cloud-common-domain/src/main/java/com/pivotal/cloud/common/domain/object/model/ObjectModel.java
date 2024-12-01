package com.pivotal.cloud.common.domain.object.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.pivotal.cloud.common.domain.Entity;
import lombok.*;

/**
 * @className: com.pivotal.cloud.common.domain.object.model.ObjectModel
 * @projectName: PivotalCloud项目
 * @module: PivotalCloud项目-ObjectModel类，主要位于统一操作模型对象模块
 * @content: ObjectModel-统一操作模型对象
 * @author: Powered by Marklin
 * @datetime: 2024-12-01 20:44
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2024 PivotalCloud Systems Incorporated. All rights reserved.
 */
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class ObjectModel extends BaseModel {

    private static final long serialVersionUID = 9152679994568893125L;

    /**
     * 应用Id
     */
    @Getter
    @Setter
    private Long appId;

    /**
     * 租户Id
     */
    @Getter
    @Setter
    private Long tenantId;
}
