package com.example.administrator.qqlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.graphics.Paint;

public class MainActivity extends AppCompatActivity {

    public static final class Data {
        public static final String[][] USER={
                {"1001","111","0"},
                {"1002","111","1"},
                {"1003","111","2"}
        };
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button= (Button) findViewById(R.id.TIJIAO);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String UserName=((EditText)findViewById(R.id.username)).getText().toString();
                String Pwd=((EditText)findViewById(R.id.pwd)).getText().toString();

                boolean flag=false;
                String index="";

                for (int i=0;i<Data.USER.length;i++)
                {
                    if (UserName.equals(Data.USER[i][0]))
                    {
                        if (Pwd.equals(Data.USER[i][1]))
                        {
                            index=Data.USER[i][2];
                            flag=true;
                            break;

                        }
                    }
                }
                if (flag)
                {
                    Intent intent=new Intent(MainActivity.this,LoginInActivity.class);
                    Bundle bundle=new Bundle();
                    bundle.putInt("index",Integer.parseInt(index));
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                else
                {
                    Toast toast=Toast.makeText(MainActivity.this,"您输入的账号或密码错误！",Toast.LENGTH_SHORT);
                    //toast.setGravity(Gravity.BOTTOM.,0,0);
                    toast.show();
                }
            }
        });
    }
}
