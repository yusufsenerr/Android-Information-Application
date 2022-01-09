package Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.hr200036_yusuf_emre_sener_final.R;
import java.util.List;

import Model.Kisiler;
import Util.GlideUtil;

public class DataAdapter extends RecyclerView.Adapter<KisilerViewHolder> {

     List<Kisiler> kisilers;
     Context context;
    OnItemClickListener onItemClickListener;
    public DataAdapter(List<Kisiler> kisilers,Context context,OnItemClickListener onItemClickListener) {
        this.kisilers = kisilers;
        this.context = context;
        this.onItemClickListener = onItemClickListener;
    }
    @NonNull
    @Override
    public KisilerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_layout, parent,false);

        KisilerViewHolder kisilerViewHolder = new KisilerViewHolder(view);
        view.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                onItemClickListener.onItemClick(kisilers.get(kisilerViewHolder.getAdapterPosition()));
            }
        });

        return  kisilerViewHolder;
    }

    @Override
    public void onBindViewHolder(KisilerViewHolder holder, int position) {
        holder.txtAd.setText(kisilers.get(position).getAd());
        holder.txtDogumTarihi.setText(kisilers.get(position).getDogumTarihi());
        holder.txtOzet.setText(kisilers.get(position).getOzet());
        GlideUtil.resmiIndiripGoster(context,kisilers.get(position).getFotograf(),holder.ImgKisi);
    }

    @Override
    public int getItemCount()
    {
        return kisilers.size();
    }
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
    public interface OnItemClickListener
    {
        void onItemClick(Kisiler TiklananKisi);
    }
}
