package co.konrad.citytrend;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.os.Bundle;
import android.content.Intent;


public class SearchItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_item);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, EventDescriptionActivity.class);
        startActivity(intent);
    }

}
