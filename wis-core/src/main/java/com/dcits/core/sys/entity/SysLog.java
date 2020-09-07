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
@TableName("SYS_LOG")
@ApiModel(value="SysLog对象", description="")
public class SysLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("ID")
    private String id;

    @TableField("TYPE")
    private String type;

    @TableField("TITLE")
    private String title;

    @TableField("CREATE_BY")
    private String createBy;

    @TableField("CREATE_DATE")
    private LocalDateTime createDate;

    @TableField("REMOTE_ADDR")
    private String remoteAddr;

    @TableField("USER_AGENT")
    private String userAgent;

    @TableField("REQUEST_URI")
    private String requestUri;

    @TableField("METHOD")
    private String method;

    @TableField("PARAMS")
    private String params;

    @TableField("EXCEPTION")
    private String exception;


}
