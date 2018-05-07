package gr.hua.ictapps.android.twoactivitiesapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.nextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,SecondActivity.class);
                startActivityForResult(intent,45);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 45){
            if (resultCode == RESULT_OK){
                String input1 = data.getStringExtra("form1");
                String input2 = data.getStringExtra("form2");
                Toast.makeText(this, "input1:"+input1+" input2:"+input2, Toast.LENGTH_SHORT).show();
            }
        }
    }
}






