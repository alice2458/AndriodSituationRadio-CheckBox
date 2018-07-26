package com.example.alice.radiocheckbox;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class MainActivity extends Activity {

    private TextView show;
    private RadioGroup wan;
    private RadioButton lin;
    private RadioButton zha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        show = (TextView)findViewById(R.id.show);
        wan = (RadioGroup)findViewById(R.id.wan);
        lin = (RadioButton)findViewById(R.id.lin);
        zha = (RadioButton)findViewById(R.id.zha);

        wan.setOnCheckedChangeListener(new OnCheckedChangeListenerImpl());
    }

    private class OnCheckedChangeListenerImpl implements RadioGroup.OnCheckedChangeListener {

        @Override
        public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
            String temp = null;
            if (MainActivity.this.lin.getId() == checkedId){
                temp = MainActivity.this.lin.getText().toString();
            }
            if (MainActivity.this.zha.getId() == checkedId){
                temp = MainActivity.this.zha.getText().toString();
            }
            MainActivity.this.show.setText("你喜欢的是：" + temp);
        }
    }
}