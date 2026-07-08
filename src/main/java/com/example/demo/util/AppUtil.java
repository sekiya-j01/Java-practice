package com.example.demo.util;

import java.util.Locale;

import org.springframework.context.MessageSource;

/**
 * アプロケーション共通クラス
 * 
 * @author sekiya
 * 
 */
public class AppUtil {
	/**
	 * メッセーIDからメッセージを取得する
	 * 
	 * @param messageSource メッセージソース
	 * @param key メッセージキー
	 * @param params 置換文字群
	 * @return メッセージ
	 */
	public static String getMessage(MessageSource messageSource, String key, Object...params) {
		return messageSource.getMessage(key, params, Locale.JAPAN);
	}
}
