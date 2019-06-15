package com.example.mypiano;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    View d1, d2, d3, d4, d5, d6, d7,d8, d9,d10, d11, d12;
    View t1, t2, t3, t4, t5, t6, t7, t8, t9;
    Switch AdsSwitch;
    ImageButton record, stop, play;
    ImageButton Appsetting, appExit;

    private MediaPlayer mD1, mD2, mD3,mD4,mD5,mD6,mD7,mD8,mD9,mD10,mD11,mD12;
    private MediaPlayer mT1, mT2,mT3,mT4,mT5,mT6,mT7,mT8,mT9;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        mD1 = MediaPlayer.create(this, R.raw.d1);
        mD2 = MediaPlayer.create(this, R.raw.d2);
        mD3 = MediaPlayer.create(this, R.raw.d3);
        mD4 = MediaPlayer.create(this, R.raw.d4);
        mD5 = MediaPlayer.create(this, R.raw.d5);
        mD6 = MediaPlayer.create(this, R.raw.d6);
        mD7 = MediaPlayer.create(this, R.raw.d7);
        mD8 = MediaPlayer.create(this, R.raw.d8);
        mD9 = MediaPlayer.create(this, R.raw.d9);
        mD10 = MediaPlayer.create(this, R.raw.d10);
        mD11 = MediaPlayer.create(this, R.raw.d11);
        mD12 = MediaPlayer.create(this, R.raw.d12);

        mT1 = MediaPlayer.create(this, R.raw.t1);
        mT2 = MediaPlayer.create(this, R.raw.t2);
        mT3 = MediaPlayer.create(this, R.raw.t3);
        mT4 = MediaPlayer.create(this, R.raw.t4);
        mT5 = MediaPlayer.create(this, R.raw.t5);
        mT6 = MediaPlayer.create(this, R.raw.t6);
        mT7 = MediaPlayer.create(this, R.raw.t7);
        mT8 = MediaPlayer.create(this, R.raw.t8);
        mT9 = MediaPlayer.create(this, R.raw.t9);

        d1 = findViewById(R.id.d1);
        d2 = findViewById(R.id.d2);
        d3 = findViewById(R.id.d3);
        d4 = findViewById(R.id.d4);
        d5 = findViewById(R.id.d5);
        d6 = findViewById(R.id.d6);
        d7 = findViewById(R.id.d7);
        d8 = findViewById(R.id.d8);
        d9 = findViewById(R.id.d9);
        d10 = findViewById(R.id.d10);
        d11 = findViewById(R.id.d11);
        d12 = findViewById(R.id.d12);

        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);
        t3 = findViewById(R.id.t3);
        t4 = findViewById(R.id.t4);
        t5 = findViewById(R.id.t5);
        t6 = findViewById(R.id.t6);
        t7 = findViewById(R.id.t7);
        t8 = findViewById(R.id.t8);
        t9 = findViewById(R.id.t9);

        AdsSwitch = findViewById(R.id.adsSwitch);
        record = findViewById(R.id.Btnrecord);
        stop = findViewById(R.id.BtnStop);
        play = findViewById(R.id.BtnPlay);
        Appsetting = findViewById(R.id.BtnSetting);
        appExit = findViewById(R.id.BtnAppExit);

        appExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        Appsetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Piano Setting", Toast.LENGTH_SHORT).show();
            }
        });


        d1.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                mD1.start();
                d1.setBackgroundColor(getColor(R.color.touched));
                new CountDownTimer(1*100, 100){

                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished/100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        d1.setBackgroundColor(getColor(R.color.return_key));
                    }
                }.start();

                return false;
            }
        });

        d2.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                mD2.start();
                d2.setBackgroundColor(getColor(R.color.touched));
                new CountDownTimer(1*100, 100){

                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished/100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        d2.setBackgroundColor(getColor(R.color.return_key));
                    }
                }.start();

                return false;
            }
        });
        d3.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                mD3.start();
                d3.setBackgroundColor(getColor(R.color.touched));
                new CountDownTimer(1*100, 100){

                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished/100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        d3.setBackgroundColor(getColor(R.color.return_key));
                    }
                }.start();

                return false;
            }
        });
        d4.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                mD4.start();
                d4.setBackgroundColor(getColor(R.color.touched));
                new CountDownTimer(1*100, 100){

                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished/100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        d4.setBackgroundColor(getColor(R.color.return_key));
                    }
                }.start();

                return false;
            }
        });
        d5.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                mD5.start();
                d5.setBackgroundColor(getColor(R.color.touched));
                new CountDownTimer(1*100, 100){

                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished/100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        d5.setBackgroundColor(getColor(R.color.return_key));
                    }
                }.start();

                return false;
            }
        });
        d6.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                mD6.start();
                d6.setBackgroundColor(getColor(R.color.touched));
                new CountDownTimer(1*100, 100){

                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished/100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        d6.setBackgroundColor(getColor(R.color.return_key));
                    }
                }.start();

                return false;
            }
        });
        d7.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                mD7.start();
                d7.setBackgroundColor(getColor(R.color.touched));
                new CountDownTimer(1*100, 100){

                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished/100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        d7.setBackgroundColor(getColor(R.color.return_key));
                    }
                }.start();

                return false;
            }
        });
        d8.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                mD8.start();
                d8.setBackgroundColor(getColor(R.color.touched));
                new CountDownTimer(1*100, 100){

                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished/100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        d8.setBackgroundColor(getColor(R.color.return_key));
                    }
                }.start();

                return false;
            }
        });
        d9.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                mD9.start();
                d9.setBackgroundColor(getColor(R.color.touched));
                new CountDownTimer(1*100, 100){

                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished/100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        d9.setBackgroundColor(getColor(R.color.return_key));
                    }
                }.start();

                return false;
            }
        });
        d10.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                mD10.start();
                d10.setBackgroundColor(getColor(R.color.touched));
                new CountDownTimer(1*100, 100){

                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished/100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        d10.setBackgroundColor(getColor(R.color.return_key));
                    }
                }.start();

                return false;
            }
        });
        d11.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                mD11.start();
                d11.setBackgroundColor(getColor(R.color.touched));
                new CountDownTimer(1*100, 100){

                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished/100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        d11.setBackgroundColor(getColor(R.color.return_key));
                    }
                }.start();

                return false;
            }
        });
        d12.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                mD12.start();
                d12.setBackgroundColor(getColor(R.color.touched));
                new CountDownTimer(1*100, 100){

                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished/100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        d12.setBackgroundColor(getColor(R.color.return_key));
                    }
                }.start();

                return false;
            }
        });

        t1.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                mT1.start();
                t1.setBackgroundColor(getColor(R.color.t_toched));

                d1.setEnabled(false);
                new CountDownTimer(1*100, 100){

                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished/100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        d1.setEnabled(true);
                        t1.setBackgroundColor(getColor(R.color.colorPrimaryDark));
                    }
                }.start();

                return false;
            }
        });
        t2.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                mT2.start();
                t2.setBackgroundColor(getColor(R.color.t_toched));
                d2.setEnabled(false);
                new CountDownTimer(1*100, 100){

                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished/100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        d2.setEnabled(true);
                        t2.setBackgroundColor(getColor(R.color.colorPrimaryDark));
                    }
                }.start();

                return false;
            }
        });
        t3.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                mT3.start();
                t3.setBackgroundColor(getColor(R.color.t_toched));
                d3.setEnabled(false);

                new CountDownTimer(1*100, 100){

                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished/100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        d3.setEnabled(true);
                        t3.setBackgroundColor(getColor(R.color.colorPrimaryDark));
                    }
                }.start();

                return false;
            }
        });
        t4.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                mT4.start();
                t4.setBackgroundColor(getColor(R.color.t_toched));
                d4.setEnabled(false);

                new CountDownTimer(1*100, 100){

                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished/100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        d4.setEnabled(true);
                        t4.setBackgroundColor(getColor(R.color.colorPrimaryDark));
                    }
                }.start();

                return false;
            }
        });
        t5.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                mT5.start();
                t5.setBackgroundColor(getColor(R.color.t_toched));
                d5.setEnabled(false);

                new CountDownTimer(1*100, 100){

                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished/100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        d5.setEnabled(true);
                        t5.setBackgroundColor(getColor(R.color.colorPrimaryDark));
                    }
                }.start();

                return false;
            }
        });
        t6.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                mT6.start();
                t6.setBackgroundColor(getColor(R.color.t_toched));
                d6.setEnabled(false);

                new CountDownTimer(1*100, 100){

                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished/100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        d6.setEnabled(true);
                        t6.setBackgroundColor(getColor(R.color.colorPrimaryDark));
                    }
                }.start();

                return false;
            }
        });
        t7.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                mT7.start();
                t7.setBackgroundColor(getColor(R.color.t_toched));
                d7.setEnabled(false);

                new CountDownTimer(1*100, 100){

                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished/100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        d7.setEnabled(true);
                        t7.setBackgroundColor(getColor(R.color.colorPrimaryDark));
                    }
                }.start();

                return false;
            }
        });
        t8.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                mT8.start();
                t8.setBackgroundColor(getColor(R.color.t_toched));
                d8.setEnabled(false);

                new CountDownTimer(1*100, 100){

                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished/100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        d8.setEnabled(false);
                        t8.setBackgroundColor(getColor(R.color.colorPrimaryDark));
                    }
                }.start();

                return false;
            }
        });
        t9.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                mT9.start();
                t9.setBackgroundColor(getColor(R.color.t_toched));
                d9.setEnabled(false);

                new CountDownTimer(1*100, 100){

                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished/100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        d9.setEnabled(true);
                        t9.setBackgroundColor(getColor(R.color.colorPrimaryDark));
                    }
                }.start();

                return false;
            }
        });


    }




}
