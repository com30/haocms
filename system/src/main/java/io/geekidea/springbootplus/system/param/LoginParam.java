/*
 * Copyright 2019-2029 geekidea(https://github.com/geekidea)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.geekidea.springbootplus.system.param;

import io.geekidea.springbootplus.framework.shiro.service.LoginUsername;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * 登录参数
 *
 * @author geekidea
 * @date 2019-05-15
 **/
@Data
@ApiModel("登录参数")
public class LoginParam implements LoginUsername {
	private static final long serialVersionUID = 2854217576695117356L;

	@NotBlank(message = "请输入账号")
    @ApiModelProperty(value = "账号", example = "admin")
    private String username;

    @NotBlank(message = "请输入密码")
    @ApiModelProperty(value = "密码", example = "123456")
    private String password;

    @ApiModelProperty("验证码Token")
    private String verifyToken;

    @ApiModelProperty("验证码")
    private String code;

}
