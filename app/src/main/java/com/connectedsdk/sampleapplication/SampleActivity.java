package com.connectedsdk.sampleapplication;

import android.os.Bundle;
import android.os.Handler;


import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.gizmeon.connectedsdk.ConnectedAd;
import com.gizmeon.connectedsdk.ConnectedAdBanner;
import com.gizmeon.connectedsdk.ConnectedAdReward;
import com.gizmeon.connectedsdk.ConnectedInterstitial;


import java.util.HashMap;
import java.util.Map;



public class SampleActivity extends AppCompatActivity implements ConnectedInterstitial.OnConnectedInterstitialListener, ConnectedAdBanner.OnSmartAdBannerListener,
        ConnectedAdReward.OnConnectedRewardListener {


    Button btnAdMob;
    Button btnMoPub;
    Button btnConnected;
    Button btnMediation;
    private int btnClicked= ConnectedAd.AD_TYPE_RANDOM;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ConnectedAd.setConnectedAppid("/appbyidnew/135");
        ConnectedAd.ConnectedAdInitListener connectedAdInitListener = new ConnectedAd.ConnectedAdInitListener() {
            @Override
            public void onInitializationFinished() {

                setContentView(R.layout.activity_main2);
                Toolbar toolbar = findViewById(R.id.toolbar);
                setSupportActionBar(toolbar);

                FloatingActionButton fab = findViewById(R.id.fab);
                btnAdMob = (Button) findViewById(R.id.btnAdMob);
                btnMoPub = (Button) findViewById(R.id.btnMoPub);
                btnConnected = (Button) findViewById(R.id.btnConnected);
                btnMediation = (Button) findViewById(R.id.btnMediation);



                ConnectedAdBanner connectedAdBanner = (ConnectedAdBanner) findViewById(R.id.adView);
                HashMap<Integer,String> adUnitIds= new HashMap<>();
                adUnitIds.put(1,"CON-BAN-BYOllS2zLs");
                adUnitIds.put(2,"CON-BAN-xxVYSK5yv7");


                btnAdMob.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        btnAdMob.setEnabled(false);
                        btnMoPub.setEnabled(false);
                        btnConnected.setEnabled(false);
                        btnMediation.setEnabled(false);

                        Toast.makeText(SampleActivity.this,"Loading Banner Ad..",Toast.LENGTH_SHORT).show();

                        btnClicked=ConnectedAd.AD_TYPE_GOOGLE;
                        connectedAdBanner.destroy();
                        HashMap<Integer,String> adMobBanneradUnitIds= new HashMap<>();
                        adMobBanneradUnitIds.put(1,"CON-BAN-n5U1OfoJmd");
                        adMobBanneradUnitIds.put(2,"CON-BAN-td6lEUHxhH");

                        connectedAdBanner.setAdUnitId(adMobBanneradUnitIds,ConnectedAd.AD_TYPE_GOOGLE);
                        connectedAdBanner.setOnSmartAdBannerListener(SampleActivity.this);




                    }
                });

                btnMoPub.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {


                        btnAdMob.setEnabled(false);
                        btnMoPub.setEnabled(false);
                        btnConnected.setEnabled(false);
                        btnMediation.setEnabled(false);

                        Toast.makeText(SampleActivity.this,"Loading Banner Ad..",Toast.LENGTH_SHORT).show();



                        btnClicked=ConnectedAd.AD_TYPE_MOPUB;
                        connectedAdBanner.destroy();
                        HashMap<Integer,String> moPubBanneradUnitIds= new HashMap<>();
                        moPubBanneradUnitIds.put(1,"CON-BAN-n5U1OfoJmd");
                        moPubBanneradUnitIds.put(2,"CON-BAN-td6lEUHxhH");
                        connectedAdBanner.setAdUnitId(moPubBanneradUnitIds,ConnectedAd.AD_TYPE_MOPUB);
                        connectedAdBanner.setOnSmartAdBannerListener(SampleActivity.this);


                    }
                });
                btnConnected.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        btnAdMob.setEnabled(false);
                        btnMoPub.setEnabled(false);
                        btnConnected.setEnabled(false);
                        btnMediation.setEnabled(false);

                        Toast.makeText(SampleActivity.this,"Loading Banner Ad..",Toast.LENGTH_SHORT).show();



                        btnClicked=ConnectedAd.AD_TYPE_CONNECTED_SDK;
                        connectedAdBanner.destroy();
                        HashMap<Integer,String> connectedBannerIds= new HashMap<>();
                        connectedBannerIds.put(1,"CON-BAN-n5U1OfoJmd");
                        connectedBannerIds.put(2,"CON-BAN-td6lEUHxhH");

                        connectedAdBanner.setAdUnitId(connectedBannerIds,ConnectedAd.AD_TYPE_CONNECTED_SDK);
                        connectedAdBanner.setOnSmartAdBannerListener(SampleActivity.this);





                    }
                });

                btnMediation.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {


                        btnAdMob.setEnabled(false);
                        btnMoPub.setEnabled(false);
                        btnConnected.setEnabled(false);
                        btnMediation.setEnabled(false);

                        Toast.makeText(SampleActivity.this,"Loading Banner Ad..",Toast.LENGTH_SHORT).show();

                        btnClicked=ConnectedAd.AD_TYPE_RANDOM;
                        connectedAdBanner.destroy();
                        HashMap<Integer,String> mediationBannerIds= new HashMap<>();
                        mediationBannerIds.put(1,"CON-BAN-n5U1OfoJmd");
                        mediationBannerIds.put(2,"CON-BAN-td6lEUHxhH");
                        connectedAdBanner.setAdUnitId(mediationBannerIds);
                        connectedAdBanner.setOnSmartAdBannerListener(SampleActivity.this);
                        connectedAdBanner.resetOrder();


                    }
                });


                fab.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                                .setAction("Action", null).show();
                    }
                });

            }

            @Override
            public void onInitializationFailed() {

                setContentView(R.layout.activity_main2);
                Toolbar toolbar = findViewById(R.id.toolbar);
                setSupportActionBar(toolbar);

                FloatingActionButton fab = findViewById(R.id.fab);
                btnAdMob = (Button) findViewById(R.id.btnAdMob);
                btnMoPub = (Button) findViewById(R.id.btnMoPub);
                btnConnected = (Button) findViewById(R.id.btnConnected);
                ConnectedAdBanner connectedAdBanner = (ConnectedAdBanner) findViewById(R.id.adView);


            }
        };

        ConnectedAd.connectedAdInit(this, connectedAdInitListener);
    }

    @Override
    public void onConnectedInterstitialDone(int adType) {
        Log.v("ConnInterstitialDone","onConnectedInterstitialDone");



    }

    @Override
    public void onConnectedInterstitialFailed(int adType, String errorCode) {

    }

    @Override
    public void onConnectedInterstitialClosed(int adType) {

         if(btnClicked!=ConnectedAd.AD_TYPE_CONNECTED_SDK) {
             Toast.makeText(SampleActivity.this, "Loading RewardVideoAd...", Toast.LENGTH_SHORT).show();
         }


        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {

                Map<Integer, String> interIds = new HashMap<Integer, String>();
                interIds.put(1,"CON-RWD-SKaICji8tA");
                interIds.put(2,"CON-RWD-k7Vkfg3rCr");


                if(btnClicked==ConnectedAd.AD_TYPE_RANDOM) {
                    ConnectedAdReward cAReward=  ConnectedAdReward.showAd(SampleActivity.this,SampleActivity.this,interIds);

                }else{
                    ConnectedAdReward cAReward= ConnectedAdReward.showAd(SampleActivity.this,SampleActivity.this,interIds,btnClicked);

                }


            }
        }, 1000);



    }






    @Override
    public void onConnectedInterstitialClicked(int adType) {
        Log.v("ConnInterstitialClicked","onConnectedInterstitialClicked");

    }


    @Override
    public void onConnectedBannerDone(int adType) {



        Toast.makeText(SampleActivity.this,"Loading InterstitialAd...",Toast.LENGTH_SHORT).show();


        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {

                Map<Integer, String> rewardIds = new HashMap<Integer, String>();
                rewardIds.put(1,"CON-INT-1cwsCx9jbn");
                rewardIds.put(2,"CON-INT-U4DEd21242");


                if(btnClicked==ConnectedAd.AD_TYPE_RANDOM) {

                    ConnectedInterstitial mAd = ConnectedInterstitial.showAd(SampleActivity.this, true, SampleActivity.this, rewardIds);


                }else{
                    ConnectedInterstitial mAd = ConnectedInterstitial.showAd(SampleActivity.this, true, SampleActivity.this, rewardIds,adType);

                }


                btnAdMob.setEnabled(true);
                btnMoPub.setEnabled(true);
                btnConnected.setEnabled(true);
                btnMediation.setEnabled(true);

            }
        }, 2000);


    }

    @Override
    public void onConnectedBannerFailed(int adType, String errorCode) {

        btnAdMob.setEnabled(true);
        btnMoPub.setEnabled(true);
        btnConnected.setEnabled(true);
        btnMediation.setEnabled(true);

    }

    @Override
    public void onConnectedBannerClicked(int adType) {

    }

    @Override
    public void onConnectedBannerExpanded(int adType) {

    }

    @Override
    public void onConnectedBannerCollapsed(int adType) {

    }


    @Override
    public void onConnectedRewardFail(int adType, String errorCode) {

    }

    @Override
    public void onConnectedRewarded(int adType, Object rewardItem) {

    }


    @Override
    public void onConnectedRewardedVideoCompleted(int adType) {

    }

    @Override
    public void onConnectedRewardVideoClosed(int adType) {

    }

    @Override
    public void onConnectedRewardVideoStarted(int adType) {

    }

    @Override
    public void onConnectedClicked(int adType) {

    }

}
