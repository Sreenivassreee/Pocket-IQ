package com.stevebrains.sreenivask.iq;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class Quations_adaptor extends RecyclerView.Adapter<Quations_adaptor.ProductViewHolder> {

        //this context we will use to inflate the layout
        private Context mCtx;

        //we are storing all the products in a list
        private List<Quations_java> Quations_java ;

        //getting the context and product list with constructor
        public Quations_adaptor(Context mCtx, List<Quations_java> productList) {
            this.mCtx = mCtx;
            this.Quations_java = productList;
        }

        @Override
        public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            //inflating and returning our view holder
            LayoutInflater inflater = LayoutInflater.from(mCtx);
            View view = inflater.inflate(R.layout.quations_list, null);
            return new ProductViewHolder(view);
        }

        @Override
        public void onBindViewHolder(ProductViewHolder holder, int position) {
            //getting the product of the specified position
            Quations_java product = Quations_java.get(position);

            //binding the data with the viewholder views
            holder.textViewQuation.setText(product.getQuestion());
//            holder.textViewQNo.setText(product.getQNo());
            holder.textViewAnswer.setText(product.getAnswer());
            holder.textViewQuaNo.setText(product.getQuaNo());
//            holder.textViewRating.setText(String.valueOf(product.getRating()));
//            holder.textViewPrice.setText(String.valueOf(product.getPrice()));



        }


        @Override
        public int getItemCount() {
            return Quations_java.size();
        }


        class ProductViewHolder extends RecyclerView.ViewHolder {

            TextView textViewQuation, textViewAnswer,textViewQuaNo;


            public ProductViewHolder(View itemView) {
                super(itemView);

                textViewQuaNo = itemView.findViewById(R.id.QNo);
                textViewAnswer = itemView.findViewById(R.id.Answer);
                textViewQuation = itemView.findViewById(R.id.Question);
            }
        }

    }

