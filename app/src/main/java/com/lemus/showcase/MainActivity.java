package com.lemus.showcase;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import me.toptas.fancyshowcase.FancyShowCaseQueue;
import me.toptas.fancyshowcase.FancyShowCaseView;
import me.toptas.fancyshowcase.OnCompleteListener;
import me.toptas.fancyshowcase.OnViewInflateListener;

public class MainActivity extends AppCompatActivity {

    //FancyShowCaseQueue myqueue = new FancyShowCaseQueue();
    FancyShowCaseView fancy1, fancy2, fancy3, fancy4;
    Button button;
    ArrayList<FancyShowCaseView> myqueue = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        TextView text = (TextView) findViewById(R.id.textView);
        ImageButton imageButton = (ImageButton) findViewById(R.id.imageButton);
        ImageView imageView = (ImageView) findViewById(R.id.imageView);


        fancy1 = new FancyShowCaseView.Builder(MainActivity.this)
                .focusOn(button)
                .customView(R.layout.customshowcase, new OnViewInflateListener() {
                    @Override
                    public void onViewInflated(@NonNull View view) {
                        CardView cardView = (CardView) view.findViewById(R.id.cardfancy);
                        Toast.makeText(MainActivity.this, ">" + MainActivity.this.button.getBottom(), Toast.LENGTH_SHORT).show();
                        cardView.setY(MainActivity.this.button.getBottom());
                        //cardView.setY();
                        Button button = (Button) view.findViewById(R.id.button3);
                        button.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                fancy1.hide();
                                myqueue.get(1).show();
                            }
                        });
                    }
                })
                .closeOnTouch(false)
                .title("Focus on View")
                .build();

        fancy2 = new FancyShowCaseView.Builder(MainActivity.this)
                .focusOn(text)
                .customView(R.layout.customshowcase, new OnViewInflateListener() {
                    @Override
                    public void onViewInflated(@NonNull View view) {
                        Button button = (Button) view.findViewById(R.id.button3);
                        button.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                fancy2.hide();
                                myqueue.get(2).show();
                            }
                        });
                    }
                })
                .closeOnTouch(false)
                .title("Focus on View")
                .build();

        fancy3 = new FancyShowCaseView.Builder(MainActivity.this)
                .focusOn(imageButton)
                .customView(R.layout.customshowcase, new OnViewInflateListener() {
                    @Override
                    public void onViewInflated(@NonNull View view) {
                        Button button = (Button) view.findViewById(R.id.button3);
                        button.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                fancy3.hide();
                                myqueue.get(3).show();
                            }
                        });
                    }
                })
                .closeOnTouch(false)
                .title("Focus on View")
                .build();

        fancy4 = new FancyShowCaseView.Builder(MainActivity.this)
                .focusOn(imageView)
                .customView(R.layout.customshowcase, new OnViewInflateListener() {
                    @Override
                    public void onViewInflated(@NonNull View view) {
                        Button button = (Button) view.findViewById(R.id.button3);
                        button.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                fancy4.hide();
                                myqueue.get(4).show();
                            }
                        });
                    }
                })
                .closeOnTouch(false)
                .title("Focus on View")
                .build();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                myqueue.add(fancy1);
                myqueue.add(fancy2);
                myqueue.add(fancy3);
                myqueue.add(fancy4);
                myqueue.get(0).show();

            }
        });



    }
}
