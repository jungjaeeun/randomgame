package kr.hs.emirim.wodms5772.monchicken;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText mName;
    Button mButton;//art+enter하면 자동으로 import

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mName = (EditText)findViewById(R.id.name);
        mButton = (Button) findViewById(R.id.btn_show_me_the_chicken); //한 xml 에서는 id 한개만
        mButton.setOnClickListener(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mName.setText("");
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {

        String name = mName.getText().toString();//toString()으로 변환해서 해야한다

//        if(name==null){
//            (Toast.makeText(this,"이름을 입력해 주세요!",Toast.LENGTH_LONG)).show();
//        }else{
//            (Toast.makeText(this,name+"씨, 배고파요!",Toast.LENGTH_LONG)).show();
//            Intent intent = new Intent(this,ResultActivity.class);
//            startActivity(intent);
//        }

        try{ //if else 비슷한거

            (Toast.makeText(this,name+"씨, 배고파요!",Toast.LENGTH_LONG)).show();
            Intent intent = new Intent(this,ResultActivity.class);
            intent.putExtra("name",name);
            intent.putExtra("age",10);
            startActivity(intent);

        }catch(NullPointerException e){
            (Toast.makeText(this,"이름을 입력해 주세요!",Toast.LENGTH_LONG)).show();

        }catch(Exception e){
            (Toast.makeText(this,"뭔지 모르지만 잘 안되네요!",Toast.LENGTH_LONG)).show();
        }

    }
}
