package gr.hua.ictapps.android.twoactivitiesapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        findViewById(R.id.previousButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText = findViewById(R.id.edittext1);
                String userinput1 = editText.getText().toString();
                EditText editText2 = findViewById(R.id.edittext2);
                String userinput2 = editText.getText().toString();

                Intent intent = getIntent();
                intent.putExtra("form1",userinput1);
                intent.putExtra("form2",userinput2);

                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }
}
