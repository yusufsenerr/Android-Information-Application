package Model;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hr200036_yusuf_emre_sener_final.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class DataAdapter extends RecyclerView.Adapter<KisilerViewHolder> {

     List<Kisiler> list = new ArrayList<>();
     CustomItemClickListener listener;
    public DataAdapter(List<Kisiler> list,CustomItemClickListener listener) {
        this.list = list;
        this.listener = listener;

    }
    @NonNull
    @Override
    public KisilerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_layout, parent,false);
        return new KisilerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(KisilerViewHolder holder, int position) {
        holder.Adtxt.setText(list.get(position).getAd());
        holder.Soyadtxt.setText(list.get(position).getSoyad());
    }

    @Override
    public int getItemCount()
    {
        return list.size();
    }
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}
