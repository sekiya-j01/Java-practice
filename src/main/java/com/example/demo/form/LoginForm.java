package com.example.demo.form;

import lombok.Data;

/**
 * ログイン画面
 * 
 * @author sekiya
 * 
 */
@Data
public class LoginForm {
	
	/** ログインID */
	private String loginId;
	
	/** パスワード */
	private String password;
}
