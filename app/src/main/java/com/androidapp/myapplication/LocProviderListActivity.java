package com.androidapp.myapplication;

import android.app.Activity;
import android.location.LocationManager;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class LocProviderListActivity extends Activity {
    TextView mTextView;
    LocationManager locMgr;
    List<String> locProviders;
    Button mButton;

    @Override
    protected void onCreate(Bundle savedInstantceState){
        super.onCreate(savedInstantceState);
        setContentView(R.layout.activity_main);

        mTextView = findViewById(R.id.txtOutput);
        locMgr = (LocationManager)getSystemService(LOCATION_SERVICE);
        mButton = findViewById(R.id.button);

        mButton.setOnClickListener(new View.onClickListener(){
            @Override
            public void onClick(View v){
                locMgr = (LocationManager)get.SystemService(LOCATION_SERVICE);
                locProviders = locMgr.getAllProviders();
                String s = "";

            }

        }




        /*for(int i = 0; i < locProviders.size(); i++){
            s += "Loc. Provider " + locProviders.get(i) + "\n"
                    + "Status: " + locMgr.isProviderEnabled(locProviders.get(i)) + "\n\n";
        }*/
        //Enhanced for Loop
                mTextView.setText(s);
    }


}
