package org.crazyit.helloworld;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.app.AlertDialog;
import android.content.DialogInterface;


public class HelloWorld extends Activity
{
	Button ok;
	TextView tv;
	Button alertid;
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        // 根据组件ID来获取目标组件
       
        alertid	=	(Button) findViewById(R.id.alertid);
		// 获取UI界面中ID为R.id.show的文本框
		
        alertid.setOnClickListener(new OnClickListener(){
        	
        	public void onClick(View v)
			{
        		AlertDialog.Builder alert	=	new AlertDialog.Builder(HelloWorld.this);
        		alert.setIcon(android.R.drawable.btn_star).setTitle("超级调查").setMessage("克昭是SB？").setPositiveButton("是的", new DialogInterface.OnClickListener() {
					
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						AlertDialog.Builder alert2	=	new AlertDialog.Builder(HelloWorld.this);
						alert2.setTitle("提示信息").setMessage("恭喜你答对了");
						alert2.create().show();
					}
				});
        		alert.setNegativeButton("不是", new DialogInterface.OnClickListener() {
					
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						AlertDialog.Builder alert2	=	new AlertDialog.Builder(HelloWorld.this);
						alert2.setTitle("提示信息").setMessage("FUCK YOU");
						alert2.create().show();
						
					}
				});
        		alert.create().show();
        		
			}
        	
        });
    }
}
