package com.example.server.pojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @PROJECT_NAME: medicine
 * @DESCRIPTION:
 * @USER: 韩冰
 * @DATE: 2023/4/22 0022 11:48
 */
@Data
public class YaocaiLike {

    @ApiModelProperty(value = "学名：当归")
    private String name;

    @ApiModelProperty(value = "分布区域")
    private String area;


    @ApiModelProperty(value = "药材分类:动物/植物")
    private String classificaion;
}
