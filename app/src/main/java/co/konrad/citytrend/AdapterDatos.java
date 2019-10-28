package co.konrad.citytrend;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class AdapterDatos  extends RecyclerView.Adapter<AdapterDatos.ViewHolder>{


    private List<ListItem> listitems;
    private Context context;

    public AdapterDatos(List<ListItem> listitems, Context context) {
        this.listitems = listitems;
        this.context = context;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view  = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false    );
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        ListItem listItem = listitems.get(position);

        /* we will then pass the data to every object we are transfering to
         * the recycle view from the list view which come from the cardview
         *  */

        holder.textViewHead.setText(listItem.getHead());
        holder.textViewDesc.setText(listItem.getDesc());
    }

    @Override
    public int getItemCount() {
            return listitems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView textViewHead;
        public TextView textViewDesc;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewDesc = (TextView) itemView.findViewById(R.id.textdes);
            textViewHead = (TextView) itemView.findViewById(R.id.texth);
        }
    }
}
