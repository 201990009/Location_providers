package com.androidapp.myapplication;

import android.app.Activity;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.View;
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
        mButton = findViewById(R.id.button);

        locMgr = (LocationManager) getSystemService(LOCATION_SERVICE);
        locProviders = locMgr.getAllProviders();

        //locMgr = (LocationManager) getSystemService(LOCATION_SERVICE);
        //locProviders = locMgr.getAllProviders();

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                String s = "";
                for (int i = 0; i < locProviders.size(); i++){
                    s += "Loc.Provider: " + locProviders.get(i) + "\n"
                            + "Status" + locMgr.isProviderEnabled(locProviders.get(i)) + "\n\n";
                }
                mTextView.setText(s);

            }
        });


        }


}
