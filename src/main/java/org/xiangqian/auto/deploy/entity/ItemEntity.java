package org.xiangqian.auto.deploy.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 项目信息
 *
 * @author xiangqian
 * @date 21:35 2024/03/03
 */
@Data
@TableName("item")
public class ItemEntity {

    private static final long serialVersionUID = 1L;

    // id
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    // 名称
    @TableField("`name`")
    private String name;

    // 所属Git git.id
    private Long gitId;

    // 所属Git名称
    @TableField(exist = false)
    private String gitName;

    // 仓库地址
    private String repoUrl;

    // 分支名
    private String branch;

    // 所属服务器 server.id
    private Long serverId;

    // 所属所属服务器名称
    @TableField(exist = false)
    private String serverName;

    // 自动部署脚本
    private String script;

    // Webhook密钥
    private String secret;

    // 创建时间（时间戳，s）
    private Long addTime;

    // 修改时间（时间戳，单位s）
    private Long updTime;

    // 共享用户数量
    @TableField(exist = false)
    private Integer userCount;

}
