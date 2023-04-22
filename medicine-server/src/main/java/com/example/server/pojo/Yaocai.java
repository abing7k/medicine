package com.example.server.pojo;

import com.baomidou.mybatisplus.annotation.*;

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
 * @author hanbing
 * @since 2023-04-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Yaocai对象", description="")
public class Yaocai implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "学名：当归")
    private String name;

    @ApiModelProperty(value = "药材图片链接")
    private String img;

    @ApiModelProperty(value = "别名")
    private String alais;

    @ApiModelProperty(value = "分布区域")
    private String area;

    @ApiModelProperty(value = "药材分类:动物/植物")
    private String classificaion;

    @ApiModelProperty(value = "采收时间")
    private String harvest;

    @ApiModelProperty(value = "功效")
    private String effect;

    @ApiModelProperty(value = "主治")
    private String indication;

    @ApiModelProperty(value = "百度链接")
    private String url;

    @TableField(value = "del_flg", updateStrategy = FieldStrategy.NOT_EMPTY)
    @TableLogic
    private Integer delFlg;

}
