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
@TableName("SYS_ROLE")
@ApiModel(value="SysRole对象", description="")
public class SysRole implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("ID")
    private String id;

    @TableField("OFFICE_ID")
    private String officeId;

    @TableField("NAME")
    private String name;

    @TableField("ENNAME")
    private String enname;

    @TableField("ROLE_TYPE")
    private String roleType;

    @TableField("DATA_SCOPE")
    private String dataScope;

    @TableField("IS_SYS")
    private String isSys;

    @TableField("USEABLE")
    private String useable;

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
