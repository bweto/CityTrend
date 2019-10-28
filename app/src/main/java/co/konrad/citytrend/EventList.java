package co.konrad.citytrend;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.os.Bundle;
import android.content.Intent;
import java.util.ArrayList;
import java.util.List;

public class EventList extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<EventListObject> eventsList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_list);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerViewEvent);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        eventsList = new ArrayList<>();

        for (int i = 0; i<10; i++) {
            EventListObject event = new EventListObject("Evento # " + (i+1),
                    "Location # "+ (i+1), "Fecha # "+ (i+1), "Evento Tipo # "+ (i+1),
                     "Ver Más");

            eventsList.add(event);
        }

        adapter = new EventListAdapter(eventsList, getApplicationContext());
        recyclerView.setAdapter(adapter);
    }


    public void sendMessage(View view) {
        Intent intent = new Intent(this, EventDescriptionActivity.class);
        startActivity(intent);
    }
}
