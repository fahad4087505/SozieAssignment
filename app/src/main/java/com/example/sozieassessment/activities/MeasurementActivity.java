package com.example.sozieassessment.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.example.sozieassessment.R;

public class MeasurementActivity extends BaseActivity implements View.OnClickListener{
    TextView mNextTextView,mSkipTextView,mBraSizeTextView;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_measurement);
        init();
    }
    private void init(){
        mNextTextView=findViewById(R.id.next_textview);
        mBraSizeTextView=findViewById(R.id.bra_size_textview);
        mSkipTextView=findViewById(R.id.skip_textview);
        if(getIntent().hasExtra("type"))
        {
            if(getIntent().getStringExtra("type").equals("Male")){
                mBraSizeTextView.setText("Chest");
                mSkipTextView.setBackgroundColor(ContextCompat.getColor(this,R.color.blue_color));
            }
        }
        mNextTextView.setOnClickListener(this);
        mSkipTextView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.next_textview:
                startActivity(new Intent(MeasurementActivity.this, MeasurementSecondStepActivity.class).putExtra("type", getIntent().getStringExtra("type")));
                break;
            case R.id.skip_textview:
                startActivity(new Intent(MeasurementActivity.this, MeasurementSecondStepActivity.class).putExtra("type", getIntent().getStringExtra("type")));
                break;
        }
    }
}