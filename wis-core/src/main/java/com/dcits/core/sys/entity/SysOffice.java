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
@TableName("SYS_OFFICE")
@ApiModel(value="SysOffice对象", description="")
public class SysOffice implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("ID")
    private String id;

    @TableField("PARENT_ID")
    private String parentId;

    @TableField("PARENT_IDS")
    private String parentIds;

    @TableField("NAME")
    private String name;

    @TableField("SORT")
    private Long sort;

    @TableField("AREA_ID")
    private String areaId;

    @TableField("CODE")
    private String code;

    @TableField("TYPE")
    private String type;

    @TableField("GRADE")
    private String grade;

    @TableField("ADDRESS")
    private String address;

    @TableField("ZIP_CODE")
    private String zipCode;

    @TableField("MASTER")
    private String master;

    @TableField("PHONE")
    private String phone;

    @TableField("FAX")
    private String fax;

    @TableField("EMAIL")
    private String email;

    @TableField("USEABLE")
    private String useable;

    @TableField("PRIMARY_PERSON")
    private String primaryPerson;

    @TableField("DEPUTY_PERSON")
    private String deputyPerson;

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
