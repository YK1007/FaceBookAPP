package yankai.tit.com.espressoui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.google.common.base.Strings;

/**
 * Created by dell on 2016/5/30.
 */
public class ShowTextActivity extends AppCompatActivity {
    private TextView show_text_view;
    public final static String KEY_EXTRA_MESSAGE = "yankai.tit.com.espressoui.message";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_text);
        Intent intent=getIntent();
        String message= Strings.nullToEmpty(intent.getStringExtra(KEY_EXTRA_MESSAGE));
        show_text_view= (TextView) findViewById(R.id.show_text_view);
        if (show_text_view != null) {
            show_text_view.setText(message);
        }

    }
    static  protected Intent newStartIntent(Context context,String message){
        Intent newIntent=new Intent(context,ShowTextActivity.class);
        newIntent.putExtra(KEY_EXTRA_MESSAGE,message);
        return newIntent;

    }
}
