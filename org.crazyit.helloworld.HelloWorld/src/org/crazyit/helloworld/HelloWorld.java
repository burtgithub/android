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
        // �������ID����ȡĿ�����
       
        alertid	=	(Button) findViewById(R.id.alertid);
		// ��ȡUI������IDΪR.id.show���ı���
		
        alertid.setOnClickListener(new OnClickListener(){
        	
        	public void onClick(View v)
			{
        		AlertDialog.Builder alert	=	new AlertDialog.Builder(HelloWorld.this);
        		alert.setIcon(android.R.drawable.btn_star).setTitle("��������").setMessage("������SB��").setPositiveButton("�ǵ�", new DialogInterface.OnClickListener() {
					
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						AlertDialog.Builder alert2	=	new AlertDialog.Builder(HelloWorld.this);
						alert2.setTitle("��ʾ��Ϣ").setMessage("��ϲ������");
						alert2.create().show();
					}
				});
        		alert.setNegativeButton("����", new DialogInterface.OnClickListener() {
					
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						AlertDialog.Builder alert2	=	new AlertDialog.Builder(HelloWorld.this);
						alert2.setTitle("��ʾ��Ϣ").setMessage("FUCK YOU");
						alert2.create().show();
						
					}
				});
        		alert.create().show();
        		
			}
        	
        });
    }
}
