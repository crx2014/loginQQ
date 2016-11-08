package com.example.administrator.qqlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class LoginInActivity extends AppCompatActivity {

    int[] ico=new  int[]{R.drawable.ico1,R.drawable.ico2};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_in);
        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        int index=bundle.getInt("index");
        ImageButton ib= (ImageButton) findViewById(R.id.qq);
        ib.setImageResource(ico[index]);
        ImageButton btn= (ImageButton) findViewById(R.id.edit);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
