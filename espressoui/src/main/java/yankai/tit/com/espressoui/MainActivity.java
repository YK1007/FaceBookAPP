package yankai.tit.com.espressoui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView mTextView;
    private EditText mEditText;
    private Button changeTextBt;
    private Button activityChangeTextBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        changeTextBt= (Button) findViewById(R.id.changeTextBt);

        if (changeTextBt != null) {
            changeTextBt.setOnClickListener(this);
        }

        activityChangeTextBtn= (Button) findViewById(R.id.activityChangeTextBtn);
        assert activityChangeTextBtn != null;
        activityChangeTextBtn.setOnClickListener(this);

        mTextView= (TextView) findViewById(R.id.textToBeChanged);
        mEditText= (EditText) findViewById(R.id.editTextUserInput);


    }


    @Override
    public void onClick(View view) {
        final String text=mEditText.getText().toString();

        switch (view.getId()){
            case R.id.changeTextBt:
                mTextView.setText(text);
                break;
            case R.id.activityChangeTextBtn:
                Intent intent=ShowTextActivity.newStartIntent(this,text);
                startActivity(intent);
                break;

        }

    }
}
