package com.example.android.soccerworldcup;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import static com.example.android.soccerworldcup.R.id.England_Score;

public class MainActivity extends AppCompatActivity {
    int england_Goal = 0;
    int brazil_Goal = 0;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t= (TextView) findViewById(R.id.textView1);
        Typeface myCustomFont1=Typeface.createFromAsset(getAssets(),"fonts/Raleway-ExtraBold.ttf");
        t.setTypeface(myCustomFont1);


        t= (TextView) findViewById(R.id.textView2);
        Typeface myCustomFont2=Typeface.createFromAsset(getAssets(),"fonts/Raleway-ExtraBold.ttf");
        t.setTypeface(myCustomFont2);

        t= (TextView) findViewById(R.id.textView3);
        Typeface myCustomFont3=Typeface.createFromAsset(getAssets(),"fonts/Raleway-ExtraBold.ttf");
        t.setTypeface(myCustomFont3);

        t= (TextView) findViewById(R.id.textView4);
        Typeface myCustomFont4=Typeface.createFromAsset(getAssets(),"fonts/Raleway-ExtraBold.ttf");
        t.setTypeface(myCustomFont4);

        t= (TextView) findViewById(R.id.textView5);
        Typeface myCustomFont5=Typeface.createFromAsset(getAssets(),"fonts/Raleway-ExtraBold.ttf");
        t.setTypeface(myCustomFont5);


        t= (TextView) findViewById(R.id.textView6);
        Typeface myCustomFont6=Typeface.createFromAsset(getAssets(),"fonts/Raleway-ExtraBold.ttf");
        t.setTypeface(myCustomFont6);

        t= (TextView) findViewById(England_Score);
        Typeface myCustomFont7=Typeface.createFromAsset(getAssets(),"fonts/Raleway-ExtraBold.ttf");
        t.setTypeface(myCustomFont7);

        t= (TextView) findViewById(R.id.Brazil_Score);
        Typeface myCustomFont8=Typeface.createFromAsset(getAssets(),"fonts/Raleway-ExtraBold.ttf");
        t.setTypeface(myCustomFont8);

        t= (TextView) findViewById(R.id.textView7);
        Typeface myCustomFont9=Typeface.createFromAsset(getAssets(),"fonts/Raleway-ExtraBold.ttf");
        t.setTypeface(myCustomFont9);


    }

public void England_goal(View view){
    england_Goal = england_Goal + 1;
    displayenglandScore(england_Goal);


}
    public void England_Free_Score(View view){
        england_Goal = england_Goal + 1;
        displayenglandFreeKick(england_Goal);


    }

    public void Brazil_goal(View view){
        brazil_Goal = brazil_Goal + 1;
        displaybrazilScore(brazil_Goal);

    }
    public void Brazil_Free_Score(View view){
        brazil_Goal = brazil_Goal + 1;
        displaybrazilFreeKick(brazil_Goal);


    }
    public void ResetScore(View view) {
        england_Goal = 0;
        brazil_Goal = 0;
        displayenglandFreeKick(england_Goal);
        displaybrazilFreeKick(brazil_Goal);

    }
public void displayenglandScore(int scoreEngland){

    TextView scoreView= (TextView) findViewById(England_Score);
    scoreView.setText(String.valueOf(scoreEngland));

}
    public void displayenglandFreeKick(int scoreEngland) {

        TextView scoreView = (TextView) findViewById(England_Score);
        scoreView.setText(String.valueOf(scoreEngland));
    }
    public void displaybrazilScore(int scoreBrazil){

        TextView scoreView= (TextView) findViewById(R.id.Brazil_Score);
        scoreView.setText(String.valueOf(scoreBrazil));

    }
    public void displaybrazilFreeKick(int scorebrazil) {

        TextView scoreView = (TextView) findViewById(R.id.Brazil_Score);
        scoreView.setText(String.valueOf(scorebrazil));
    }
}
