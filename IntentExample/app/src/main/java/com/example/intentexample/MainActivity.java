//2개의  화면을 통해 화면 전환
package com.example.intentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button bnt_move;
    private EditText et_test;
    private String str;
    private ImageView iv_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_test = findViewById(R.id.et_test);

        bnt_move = findViewById(R.id.bnt_move); //bnt_move로 연결해서 찾아와라
        bnt_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { //22번줄부터 끝나는 지점까지 실행
                str = et_test.getText().toString(); //get 값을 string 형태로 변환
                Intent intent = new Intent(MainActivity.this, SubActivity2.class);
                intent.putExtra("str", str);
                startActivity(intent); //액티비티 이동
            }
        });

        iv_img = (ImageView)findViewById(R.id.iv_img);
        iv_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "도영이는 예쁘다",Toast.LENGTH_LONG).show();
            }
        });




    }
}