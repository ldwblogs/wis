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
@TableName("SYS_USER")
@ApiModel(value="SysUser对象", description="")
public class SysUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("ID")
    private String id;

    @TableField("COMPANY_ID")
    private String companyId;

    @TableField("OFFICE_ID")
    private String officeId;

    @TableField("LOGIN_NAME")
    private String loginName;

    @TableField("PASSWORD")
    private String password;

    @TableField("NO")
    private String no;

    @TableField("NAME")
    private String name;

    @TableField("EMAIL")
    private String email;

    @TableField("PHONE")
    private String phone;

    @TableField("MOBILE")
    private String mobile;

    @TableField("USER_TYPE")
    private String userType;

    @TableField("PHOTO")
    private String photo;

    @TableField("LOGIN_IP")
    private String loginIp;

    @TableField("LOGIN_DATE")
    private LocalDateTime loginDate;

    @TableField("LOGIN_FLAG")
    private String loginFlag;

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
