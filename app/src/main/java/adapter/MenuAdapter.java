package adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import e.wolfsoft1.menu_book_your_show.R;
import model.MenuModel;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MyViewHolder> {

    Context context;
    private ArrayList<MenuModel> homeModelArrayList;

    public MenuAdapter(Context context, ArrayList<MenuModel> homeModelArrayList) {
        this.context = context;
        this.homeModelArrayList = homeModelArrayList;
    }

    @NonNull
    @Override
    public MenuAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_menu, parent, false);
        return new MenuAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MenuAdapter.MyViewHolder holder, int position) {
        MenuModel modelfoodrecycler = homeModelArrayList.get(position);


        holder.hometext1.setText((CharSequence) modelfoodrecycler.getHometext1());
        holder.hometext2.setText((CharSequence) modelfoodrecycler.getHometext2());

        holder.homeimage.setImageResource(modelfoodrecycler.getHomeimage());
    }

    @Override
    public int getItemCount() {
        return homeModelArrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView homeimage;
        TextView hometext1,hometext2;

        public MyViewHolder(View itemView) {
            super(itemView);


            homeimage = itemView.findViewById(R.id.homeimage);
            hometext1 = itemView.findViewById(R.id.hometext1);
            hometext2 = itemView.findViewById(R.id.hometext2);

        }
    }
}
