package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private Button answer1Button;
    private Button answer2Button;
    private TextView story;
    private int mStoryTrack=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
            answer1Button=(Button)findViewById(R.id.buttonTop);
            answer2Button=(Button)findViewById(R.id.buttonBottom);
            story=(TextView)findViewById(R.id.storyTextView);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
           answer1Button.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   if(mStoryTrack==1){
                       story.setText(R.string.T3_Story);
                       answer1Button.setText(R.string.T3_Ans1);
                       answer2Button.setText(R.string.T3_Ans2);
                       mStoryTrack=3;
                   }else if(mStoryTrack==2){
                       story.setText(R.string.T3_Story);
                       answer1Button.setText(R.string.T3_Ans1);
                       answer2Button.setText(R.string.T3_Ans2);
                       mStoryTrack=3;
                   }else if(mStoryTrack==3){
                       story.setText(R.string.T6_End);
                       answer1Button.setVisibility(View.GONE);
                       answer2Button.setVisibility(View.GONE);
                   }
               }
           });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
               answer2Button.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       if(mStoryTrack==1){
                           story.setText(R.string.T2_Story);
                           answer1Button.setText(R.string.T2_Ans1);
                           answer2Button.setText(R.string.T2_Ans2);
                           mStoryTrack=2;
                       }else if(mStoryTrack==2){
                           story.setText(R.string.T4_End);
                           answer2Button.setVisibility(View.GONE);
                           answer1Button.setVisibility(View.GONE);
                       }else if(mStoryTrack==3){
                           story.setText(R.string.T5_End);
                           answer1Button.setVisibility(View.GONE);
                           answer2Button.setVisibility(View.GONE);
                       }
                   }
               });
                }
    }


