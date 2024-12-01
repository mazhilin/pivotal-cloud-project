package com.pivotal.cloud.common.domain.object.model;

import com.pivotal.cloud.common.domain.Model;
import lombok.*;

import java.util.Date;

/**
 * @className: com.pivotal.cloud.common.domain.object.model.BaseModel
 * @projectName: PivotalCloud项目
 * @module: PivotalCloud项目-BaseModel类，主要位于统一对象操作模型基类模块
 * @content: BaseModel-统一对象操作模型基类
 * @author: Powered by Marklin
 * @datetime: 2024-12-01 20:43
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2024 PivotalCloud Systems Incorporated. All rights reserved.
 */
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class BaseModel implements Model {

    private static final long serialVersionUID = 6086841418522871351L;

    /**
     * 版本号
     */
    @Getter
    @Setter
    private Integer version;

    /**
     * 创建人
     */
    @Getter
    @Setter
    private Long creatorId;

    /**
     * 创建时间
     */
    @Getter
    @Setter
    private Date createdTime;


    /**
     * 更新人
     */
    @Getter
    @Setter
    private Long updatorId;


    /**
     * 更新时间
     */
    @Getter
    @Setter
    private Date updatedTime;

    /**
     * 是否删除[0-否 1-是]
     */
    @Getter
    @Setter
    private Integer deleted;

    /**
     * 状态[0-无效 1-有效]
     */
    @Getter
    @Setter
    private Integer status;

    /**
     * 备注
     */
    @Getter
    @Setter
    private String remark;
}
