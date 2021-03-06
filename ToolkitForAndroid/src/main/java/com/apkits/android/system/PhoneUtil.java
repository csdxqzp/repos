/**
 * Copyright (C) 2012 ToolkitForAndroid Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
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
package com.apkits.android.system;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.telephony.TelephonyManager;

/**
 * </br><b>name : </b>		PhoneCall
 * </br><b>description :</b>TODO
 * </br>@author : 			桥下一粒砂
 * </br><b>e-mail : </b>	chenyoca@gmail.com
 * </br><b>weibo : </b>		@桥下一粒砂
 * </br><b>date : </b>		2012-7-21 上午8:41:34
 *
 */
public class PhoneUtil {

	/**
	 * </br><b>title : </b>		打电话
	 * </br><b>description :</b>打电话
	 * </br><b>time :</b>		2012-7-21 上午8:43:02
	 * @param activity
	 * @param phoneNumber
	 */
	public static void call(Activity activity, String phoneNumber){
		Intent dialIntent = new Intent(Intent.ACTION_CALL,Uri.parse(String.format("tel:%s", phoneNumber)));
		activity.startActivity(dialIntent);
	}
	 
	/**
	 * </br><b>title : </b>		发信息
	 * </br><b>description :</b>发信息
	 * </br><b>time :</b>		2012-7-21 上午8:54:28
	 * @param activity
	 * @param recver
	 * @param content
	 */
	public static void sms(Activity activity, String recver, String content){
		Intent sendIntent = new Intent(Intent.ACTION_SENDTO, Uri.parse("sms://")); 
		sendIntent.putExtra("address", recver); 
		sendIntent.putExtra("sms_body", content); 
		activity.startActivity(sendIntent);
	}
	
	/**
	 * <b>title : 	</b>		获取手机号码
	 * </br><b>description :</b>获取手机号码
	 * </br><b>time :</b>		2012-7-29 下午4:17:29
	 * @param context
	 */
	public static String getPhoneNum(Context context){
		TelephonyManager tm = (TelephonyManager)context.getSystemService(Context.TELEPHONY_SERVICE);
		return tm.getLine1Number();
	}
	
	public static void sendSms(String addr,String content){
//		SmsManager smsManager = SmsManager.getDefault();
//		smsManager.sendTextMessage(addr, null, content, il, null); 
	}
}
