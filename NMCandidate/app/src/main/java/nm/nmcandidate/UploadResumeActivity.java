package nm.nmcandidate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UploadResumeActivity extends AppCompatActivity implements View.OnClickListener {
    private Button buttonUploadResume;
    private Button buttonUploadResumeLater;


    private void initializeViews() {
        buttonUploadResume = (Button) findViewById(R.id.button_upload_resume);
        buttonUploadResumeLater = (Button) findViewById(R.id.button_upload_resume_later);
        buttonUploadResume.setOnClickListener(UploadResumeActivity.this);
        buttonUploadResumeLater.setOnClickListener(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload_resume);
        initializeViews();

    }
    @Override
    public void onClick(View v) {
        if ( v == buttonUploadResume ) {
            // Handle clicks for buttonUploadResume

        } else if ( v == buttonUploadResumeLater ) {
            // Handle clicks for buttonUploadResumeLater
        }
        Intent intent = new Intent(UploadResumeActivity.this, EducationalDetailsActivity.class);
        startActivity(intent);
    }


}
