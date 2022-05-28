package ir.ariyana.vg_market.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import ir.ariyana.vg_market.databinding.ItemRecyclerViewBinding
import ir.ariyana.vg_market.model.VideoGameList

class AdapterRecycler(private val data: ArrayList<VideoGameList.Result>): RecyclerView.Adapter<AdapterRecycler.ViewHolder>() {

    inner class ViewHolder(private val binding: ItemRecyclerViewBinding): RecyclerView.ViewHolder(binding.root) {

        fun bind(position: Int) {
            binding.itemRecyclerViewNameTextView.text = data[position].name
            binding.itemRecyclerViewPriceTextView.text = data[position].released.toString()
            binding.itemRecyclerViewRating.text = data[position].rating.toString()
            Glide
                .with(binding.root.context)
                .load(data[position].backgroundImage)
                .into(binding.itemRecyclerViewImageView)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemRecyclerViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount(): Int {
        return data.size
    }
}