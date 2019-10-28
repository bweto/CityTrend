package co.konrad.citytrend;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class EventListAdapter extends RecyclerView.Adapter<EventListAdapter.ViewHolder> {


    private List<EventListObject> eventListObjects;
    private Context context;

    public EventListAdapter(List<EventListObject> eventListObjects, Context context) {
        this.eventListObjects = eventListObjects;
        this.context = context;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.event_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        EventListObject event = eventListObjects.get(position);

        holder.eventbutton.setText(event.getEventButton());
        //holder.eventbutton.setOnClickListener();
        holder.eventname.setText(event.getEventName());
        holder.eventlocation.setText(event.getEventLocation());
        holder.eventdate.setText(event.getEventDate());
        holder.eventtype.setText(event.getEventType());
    }

    @Override
    public int getItemCount() {

        return eventListObjects.size();

    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public Button eventbutton;
        public TextView eventname;
        public TextView eventlocation;
        public TextView eventdate;
        public TextView eventtype;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            eventbutton = (Button) itemView.findViewById(R.id.buttonshowmoreevent);
            eventname = (TextView) itemView.findViewById(R.id.eventname);
            eventlocation = (TextView) itemView.findViewById(R.id.eventlocation);
            eventdate = (TextView) itemView.findViewById(R.id.eventdate);
            eventtype = (TextView) itemView.findViewById(R.id.eventtype);
        }


    }

}