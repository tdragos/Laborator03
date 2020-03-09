package ro.pub.cs.systems.eim.lab03.phonedialer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class PhoneDialerActivity extends AppCompatActivity {

    private EditText phoneNumberEditText;
    private ImageButton callImageButton;
    private ImageButton hangupImageButton;
    private ImageButton backspaceImageButton;
    private Button genericButton;

    private BackspaceButtonClickListener backspaceButtonClickListener = new BackspaceButtonClickListener();
    private class BackspaceButtonClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            String phoneNumber = phoneNumberEditText.getText().toString();
            if (phoneNumber.length() > 0) {
                phoneNumber = phoneNumber.substring(0, phoneNumber.length() - 1);
                phoneNumberEditText.setText(phoneNumber);
            }
        }
    }

    private GenericButtonClickListener genericButtonClickListener = new GenericButtonClickListener();
    private class GenericButtonClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            phoneNumberEditText.setText(phoneNumberEditText.getText().toString() + ((Button)view).getText().toString());
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        phoneNumberEditText = (EditText)findViewById(R.id.phone_number_edit_text);

        backspaceImageButton = (ImageButton)findViewById(R.id.backspace_image_button);
        backspaceImageButton.setOnClickListener(backspaceButtonClickListener);

        genericButton = (Button)findViewById(R.id.number_0_button);
        genericButton.setOnClickListener(genericButtonClickListener);

        genericButton = (Button)findViewById(R.id.number_1_button);
        genericButton.setOnClickListener(genericButtonClickListener);

        genericButton = (Button)findViewById(R.id.number_2_button);
        genericButton.setOnClickListener(genericButtonClickListener);

        genericButton = (Button)findViewById(R.id.number_3_button);
        genericButton.setOnClickListener(genericButtonClickListener);

        genericButton = (Button)findViewById(R.id.number_4_button);
        genericButton.setOnClickListener(genericButtonClickListener);

        genericButton = (Button)findViewById(R.id.number_5_button);
        genericButton.setOnClickListener(genericButtonClickListener);

        genericButton = (Button)findViewById(R.id.number_6_button);
        genericButton.setOnClickListener(genericButtonClickListener);

        genericButton = (Button)findViewById(R.id.number_7_button);
        genericButton.setOnClickListener(genericButtonClickListener);

        genericButton = (Button)findViewById(R.id.number_8_button);
        genericButton.setOnClickListener(genericButtonClickListener);

        genericButton = (Button)findViewById(R.id.number_9_button);
        genericButton.setOnClickListener(genericButtonClickListener);

        genericButton = (Button)findViewById(R.id.number_10_button);
        genericButton.setOnClickListener(genericButtonClickListener);

        genericButton = (Button)findViewById(R.id.number_11_button);
        genericButton.setOnClickListener(genericButtonClickListener);
    }
}
