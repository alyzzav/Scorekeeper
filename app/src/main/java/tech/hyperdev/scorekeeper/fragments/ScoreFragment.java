package tech.hyperdev.scorekeeper.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import tech.hyperdev.scorekeeper.R;
import tech.hyperdev.scorekeeper.activities.MainActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class ScoreFragment extends Fragment {

    public ScoreFragment() {
        // Required empty public constructor
    }

    public View view;
    public String name;
    public String score;
    public String arg;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_score, container, false);

        readBundle(getArguments());


        TextView tvname = (TextView) view.findViewById(R.id.tvTeamName);
        tvname.setText(name+"");

        return view;
    }

    public static ScoreFragment newInstance(String name) {
        Bundle bundle = new Bundle();
        bundle.putString("name", name);

        ScoreFragment fragment = new ScoreFragment();
        fragment.setArguments(bundle);

        return fragment;
    }

    private void readBundle(Bundle bundle) {
        if (bundle != null) {
            name = bundle.getString("name");

        }
    }

}
