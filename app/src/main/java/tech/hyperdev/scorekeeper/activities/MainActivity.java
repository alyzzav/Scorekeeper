package tech.hyperdev.scorekeeper.activities;

import android.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import tech.hyperdev.scorekeeper.R;
import tech.hyperdev.scorekeeper.fragments.ScoreFragment;

public class MainActivity extends AppCompatActivity {

    FrameLayout frameOne;
    FrameLayout frameTwo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frameOne = (FrameLayout) findViewById(R.id.frame_one);
        frameTwo = (FrameLayout) findViewById(R.id.frame_two);

        Fragment score_one = ScoreFragment.newInstance("TEAM 1");
        Fragment score_two = ScoreFragment.newInstance("TEAM 2");

//        score_one.setArguments(getIntent().getExtras());
        FragmentTransaction one = getSupportFragmentManager().beginTransaction();
        one.add(R.id.frame_one, score_one).commit();


//        score_two.setArguments(getIntent().getExtras());
        getSupportFragmentManager().beginTransaction()
                .add(R.id.frame_two, score_two).commit();

    }
}
