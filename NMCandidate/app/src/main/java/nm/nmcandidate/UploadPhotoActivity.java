package nm.nmcandidate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class UploadPhotoActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView imageView3;
    private Button buttonUploadImage;
    private Button buttonUploadLater;


    private void initializeViews() {
        imageView3 = (ImageView)findViewById( R.id.imageView3 );
        buttonUploadImage = (Button)findViewById( R.id.button_upload_image );
        buttonUploadLater = (Button)findViewById( R.id.button_upload_later );

        buttonUploadImage.setOnClickListener( this );
        buttonUploadLater.setOnClickListener( this );
    }

    @Override
    public void onClick(View v) {
        Intent intent ;
        if ( v == buttonUploadImage ) {
            // Handle clicks for buttonUploadImage
        } else if ( v == buttonUploadLater ) {
            // Handle clicks for buttonUploadLater

        }
        intent = new Intent(UploadPhotoActivity.this, UploadResumeActivity.class);
        startActivity(intent);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload_photo);

        initializeViews();
    }
}
