package nm.nmcandidate;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class CandidateTypeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_candidate_type);



    }

    public void onClick(View v) {
        int id = v.getId();
        Intent intentRegisterCandidate;

        switch (id) {
            case R.id.imageView_fresher:
            case R.id.textView_tag_fresher:
            case R.id.textView_title_fresher:
                intentRegisterCandidate = new Intent(CandidateTypeActivity.this, RegisterCandidateActivity.class);
                break;

            case R.id.imageView_experienced:
            case R.id.textView_tag_exp:
            case R.id.textView_title_exp:
                intentRegisterCandidate = new Intent(CandidateTypeActivity.this, RegisterCandidateActivity.class);
                break;

            default:
                intentRegisterCandidate = new Intent(CandidateTypeActivity.this, RegisterCandidateActivity.class);
                break;
        }

        startActivity(intentRegisterCandidate);
    }

}
