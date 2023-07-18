import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.ContactModel;
import com.example.myapplication.R;

import java.util.ArrayList;
public class RecyclerContactAdapter extends RecyclerView.Adapter<RecyclerContactAdapter.ViewHolder> {

    Context context;
    ArrayList<ContactModel> contactModels;
    RecyclerContactAdapter(Context context , ArrayList<ContactModel> contactModels){
        this.context = context;
        this.contactModels = contactModels;

    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(context).inflate(R.layout.contactrow , parent , false);
      ViewHolder  viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    holder.img.setImageResource(contactModels.get(position).img);
    holder.number.setText(contactModels.get(position).number);
    holder.name.setText(contactModels.get(position).name);
    }

    @Override
    public int getItemCount()
    {
        return contactModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
         TextView name , number;
         ImageView img;
        public ViewHolder(@NonNull View itemView)
        {
            super(itemView);

            name = itemView.findViewById(R.id.contactTv);
            number = itemView.findViewById(R.id.numberTv);
            img = itemView.findViewById(R.id.imageView);
        }
    }


}
