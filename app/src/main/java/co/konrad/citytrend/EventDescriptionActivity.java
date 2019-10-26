package co.konrad.citytrend;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.content.Intent;


public class EventDescriptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_description);
    }

    public void getTicketsView(View view) {
        Intent intent = new Intent(this, EventPaymentActivity.class);
        startActivity(intent);
    }


    public void rateEventView(View view) {
        Intent intent = new Intent(this, EventRatingActivity.class);
        startActivity(intent);
    }


}
