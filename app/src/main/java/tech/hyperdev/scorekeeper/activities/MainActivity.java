package tech.hyperdev.scorekeeper.activities;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

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

        ScoreFragment score_one = new ScoreFragment();
        ScoreFragment score_two = new ScoreFragment();

        score_one.setArguments(getIntent().getExtras());
        getSupportFragmentManager().beginTransaction()
                .add(R.id.frame_one, score_one).commit();

        score_two.setArguments(getIntent().getExtras());
        getSupportFragmentManager().beginTransaction()
                .add(R.id.frame_two, score_two).commit();

    }
}
