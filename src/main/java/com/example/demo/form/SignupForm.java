package com.example.demo.form;

import lombok.Data;

/**
 * ユーザー登録画面
 * 
 * @author sekiya
 * 
 */
@Data
public class SignupForm {
	
	/** ログインID */
	private String loginId;
	
	/** パスワード */
	private String password;
}
