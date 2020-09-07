package com.dcits.core.sys.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author lidw3
 * @since 2020-09-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("SYS_DICT")
@ApiModel(value="SysDict对象", description="")
public class SysDict implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("ID")
    private String id;

    @TableField("VALUE")
    private String value;

    @TableField("LABEL")
    private String label;

    @TableField("TYPE")
    private String type;

    @TableField("DESCRIPTION")
    private String description;

    @TableField("SORT")
    private Long sort;

    @TableField("PARENT_ID")
    private String parentId;

    @TableField("CREATE_BY")
    private String createBy;

    @TableField("CREATE_DATE")
    private LocalDateTime createDate;

    @TableField("UPDATE_BY")
    private String updateBy;

    @TableField("UPDATE_DATE")
    private LocalDateTime updateDate;

    @TableField("REMARKS")
    private String remarks;

    @TableField("DEL_FLAG")
    private String delFlag;


}
