package com.pivotal.cloud.common.domain.object.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.pivotal.cloud.common.domain.Entity;
import lombok.*;

import java.util.Date;

/**
 * @className: com.pivotal.cloud.common.domain.object.entity.BaseEntity
 * @projectName: PivotalCloud项目
 * @module: PivotalCloud项目-BaseEntity类，主要位于统一实体对象基类模块
 * @content: BaseEntity-统一实体对象基类
 * @author: Powered by Marklin
 * @datetime: 2024-12-01 17:06
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2024 PivotalCloud Systems Incorporated. All rights reserved.
 */
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class BaseEntity implements Entity {

    private static final long serialVersionUID = 2626519764616790958L;

    /**
     * 版本号
     */
    @Getter
    @Setter
    @TableField(value = Entity.VERSION)
    private Integer version;

    /**
     * 创建人
     */
    @Getter
    @Setter
    @TableField(value = Entity.CREATOR_ID, fill = FieldFill.INSERT)
    private Long creatorId;

    /**
     * 创建时间
     */
    @Getter
    @Setter
    @TableField(value = Entity.CREATED_TIME, fill = FieldFill.INSERT)
    private Date createdTime;


    /**
     * 更新人
     */
    @Getter
    @Setter
    @TableField(value = Entity.UPDATOR_ID, fill = FieldFill.INSERT_UPDATE)
    private Long updatorId;


    /**
     * 更新时间
     */
    @Getter
    @Setter
    @TableField(value = Entity.UPDATED_TIME, fill = FieldFill.INSERT_UPDATE)
    private Date updatedTime;

    /**
     * 是否删除[0-否 1-是]
     */
    @Getter
    @Setter
    @TableField(value = Entity.DELETED)
    private Integer deleted;

    /**
     * 状态[0-无效 1-有效]
     */
    @Getter
    @Setter
    @TableField(value = Entity.STATUS)
    private Integer status;

    /**
     * 备注
     */
    @Getter
    @Setter
    @TableField(value = Entity.REMARK)
    private String remark;
}
