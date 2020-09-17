//아이디와 버튼 생성
package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main1 extends AppCompatActivity {

    EditText et_id;
    Button bnt_test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_id = findViewById(R.id.et_id); //xml에 연결 한 것
        bnt_test = findViewById(R.id.btn_test);

        bnt_test.setOnClickListener(new View.OnClickListener() { //버툰을 클릭 했을떼 아이디 안에 저걸 적어라
            @Override
            public void onClick(View view) {
                et_id.setText("현령이의 안드로이드");
            }
        });

    }
}