package cn.edu.upc.qzw.myapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.support.v4.os.LocaleListCompat.create;

public class MainActivity extends AppCompatActivity {
    @Override               //重写
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//绑定xml文件
        initevent();
        //Button btn=(Button)findViewById(R.id.button);//用ID找xml中控件

        /*btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"用户名或密码错误！",Toast.LENGTH_SHORT).show();
            }
        });*/
    }
    private void initevent(){
        Button exitbtn=(Button)findViewById(R.id.button2);
        exitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showdialog();
            }
        });
    }
    private void showdialog(){
                AlertDialog.Builder builder=new AlertDialog.Builder(this);
                builder.setTitle("再问你一次");
                builder.setIcon(R.mipmap.ic_launcher);
                builder.setMessage("是否退出应用？");
                builder.setPositiveButton("确定",dialistener);
                builder.setNegativeButton("让我想想",dialistener);
                builder.show();
        }
    DialogInterface.OnClickListener dialistener=new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int buttonId) {
            // TODO Auto-generated method stub
            switch (buttonId) {
                case AlertDialog.BUTTON_POSITIVE:// "确认"按钮退出程序
                    finish();
                    break;
                case AlertDialog.BUTTON_NEGATIVE:// "确认"按钮退出程序
                    //什么都不做
                    break;
                default:
                    break;
            }
        }
    };

    public void click(View v){
        Toast.makeText(MainActivity.this,"用户名或密码错误！",Toast.LENGTH_SHORT).show();
    }
    public void click1(View v){
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
}
