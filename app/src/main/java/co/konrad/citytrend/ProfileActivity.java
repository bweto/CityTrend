package co.konrad.citytrend;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.content.Intent;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, SearchItemActivity.class);
        startActivity(intent);
    }


}
