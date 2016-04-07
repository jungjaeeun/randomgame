package kr.hs.emirim.wodms5772.monchicken;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by appcreate29 on 2016. 3. 28..
 */
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by appcreator29 on 2016. 3. 28..
 */
public class ResultActivity extends AppCompatActivity {

    static String TAG="먼치킨:ResultActivity";
    TextView mResult;
    ImageView mimageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Log.d(TAG, "결과 액티비티 시작!");
        mResult = (TextView) findViewById(R.id.result);
        mimageView = (ImageView) findViewById(R.id.imageView);
        Log.d(TAG, "택스트뷰 연결 성공!");

        Random r = new Random();
        int result = r.nextInt(3);
        Log.d(TAG, "랜덤값 생성! : "+result);

        mimageView.setImageResource(R.drawable.c01+result);

        //if

        /*if(result==0){
            mimageView.setImageResource(R.drawable.c01);
        }else if(result==1){
            mimageView.setImageResource(R.drawable.c02);
        }else if(result==2){
            mimageView.setImageResource(R.drawable.c03);
        }*/

        //switch
        switch(result){
            case 0:
                mimageView.setImageResource(R.drawable.c01); break;
            case 1:
                mimageView.setImageResource(R.drawable.c02); break;
            case 2:
                mimageView.setImageResource(R.drawable.c03); break;

        }

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        Log.d(TAG, "인텐트값 읽기<name> : "+name);
        int age = intent.getIntExtra("age", -1);


        Log.d(TAG, "인텐트값 읽기<age> : "+age);
        mResult.setText(name+"님 안녕하세요");
    }
}