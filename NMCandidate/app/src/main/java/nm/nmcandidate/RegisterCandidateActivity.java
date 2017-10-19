package nm.nmcandidate;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterCandidateActivity extends AppCompatActivity implements  View.OnClickListener{
    private TextInputLayout etCompNameLayout;
    private EditText etCompName;
    private TextInputLayout etEmaiLayout;
    private EditText etEmail;
    private TextInputLayout etPasswordLayout;
    private TextInputEditText etPassword;
    private TextInputLayout etContactPersonMobLayout;
    private EditText etContactPersonMob;
    private TextInputLayout etContactWhatsappMobLayout;
    private EditText etContactWhatappMob;
    private TextInputLayout etAddressLayout;
    private AutoCompleteTextView actvAddress;
    private TextInputLayout etContryLayout;
    private AutoCompleteTextView actvContry;
    private TextInputLayout etStateLayout;
    private AutoCompleteTextView actvState;
    private TextInputLayout etCityLayout;
    private AutoCompleteTextView actvCity;
    private CheckBox checkBox;
    private TextInputLayout etPerAddressLayout;
    private AutoCompleteTextView actvPerAddress;
    private TextInputLayout etPerContryLayout;
    private AutoCompleteTextView actvPerContry;
    private TextInputLayout etPerStateLayout;
    private AutoCompleteTextView actvPerState;
    private TextInputLayout etPerCityLayout;
    private AutoCompleteTextView actvPerCity;
    private TextView textViewTerms;
    private AppCompatButton buttonRegisterComp;


    private void initializeViews() {
        etCompNameLayout = (TextInputLayout)findViewById( R.id.etCompNameLayout );
        etCompName = (EditText)findViewById( R.id.etCompName );
        etEmaiLayout = (TextInputLayout)findViewById( R.id.etEmaiLayout );
        etEmail = (EditText)findViewById( R.id.etEmail );
        etPasswordLayout = (TextInputLayout)findViewById( R.id.etPasswordLayout );
        etPassword = (TextInputEditText)findViewById( R.id.etPassword );
        etContactPersonMobLayout = (TextInputLayout)findViewById( R.id.etContactPersonMobLayout );
        etContactPersonMob = (EditText)findViewById( R.id.etContactPersonMob );
        etContactWhatsappMobLayout = (TextInputLayout)findViewById( R.id.etContactWhatsappMobLayout );
        etContactWhatappMob = (EditText)findViewById( R.id.etContactWhatappMob );
        etAddressLayout = (TextInputLayout)findViewById( R.id.etAddressLayout );
        actvAddress = (AutoCompleteTextView)findViewById( R.id.actvAddress );
        etContryLayout = (TextInputLayout)findViewById( R.id.etContryLayout );
        actvContry = (AutoCompleteTextView)findViewById( R.id.actvContry );
        etStateLayout = (TextInputLayout)findViewById( R.id.etStateLayout );
        actvState = (AutoCompleteTextView)findViewById( R.id.actvState );
        etCityLayout = (TextInputLayout)findViewById( R.id.etCityLayout );
        actvCity = (AutoCompleteTextView)findViewById( R.id.actvCity );
        checkBox = (CheckBox)findViewById( R.id.checkBox );
        etPerAddressLayout = (TextInputLayout)findViewById( R.id.etPerAddressLayout );
        actvPerAddress = (AutoCompleteTextView)findViewById( R.id.actvPerAddress );
        etPerContryLayout = (TextInputLayout)findViewById( R.id.etPerContryLayout );
        actvPerContry = (AutoCompleteTextView)findViewById( R.id.actvPerContry );
        etPerStateLayout = (TextInputLayout)findViewById( R.id.etPerStateLayout );
        actvPerState = (AutoCompleteTextView)findViewById( R.id.actvPerState );
        etPerCityLayout = (TextInputLayout)findViewById( R.id.etPerCityLayout );
        actvPerCity = (AutoCompleteTextView)findViewById( R.id.actvPerCity );
        textViewTerms = (TextView)findViewById( R.id.textViewTerms );
        buttonRegisterComp = (AppCompatButton)findViewById( R.id.buttonRegisterComp );

        buttonRegisterComp.setOnClickListener( this );
    }


    @Override
    public void onClick(View v) {
        if ( v == buttonRegisterComp ) {
            // Handle clicks for buttonRegisterComp
            Intent intent = new Intent(RegisterCandidateActivity.this, UploadPhotoActivity.class);
            startActivity(intent);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_cadidate);
        textViewTerms = (TextView) findViewById(R.id.textViewTerms);
        textViewTerms.setText(Html.fromHtml("By clicking register you agree " +
                "<a href='nm.nmcandidate.TCActivity://Kode'>TERMS AND CONDITIONS</a>"));
        textViewTerms.setClickable(true);
        textViewTerms.setMovementMethod(LinkMovementMethod.getInstance());
        initializeViews();
    }
}
