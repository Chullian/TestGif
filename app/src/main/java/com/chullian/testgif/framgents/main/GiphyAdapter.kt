package com.chullian.testgif.framgents.main

import android.os.Build.VERSION.SDK_INT
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import coil.ImageLoader
import coil.decode.GifDecoder
import coil.decode.ImageDecoderDecoder
import coil.load
import com.chullian.testgif.data.GiphyItem
import com.chullian.testgif.databinding.ProductItemBinding
import kotlin.properties.Delegates

/**
 * Created by binMammootty on 27/10/2022.
 */

class GiphyAdapter() :
    RecyclerView.Adapter<GiphyAdapter.ProductHeaderViewHolder>() {

    var itmes: List<GiphyItem> by Delegates.observable(emptyList()) { property, oldValue, newValue ->
        autoNotify(oldValue, newValue) { o, n -> true }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHeaderViewHolder {
        return ProductHeaderViewHolder(
            ProductItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ProductHeaderViewHolder, position: Int) {
        holder.bind(itmes[position] as GiphyItem)
    }

    override fun getItemCount() = itmes.size


    class ProductHeaderViewHolder(
        val binding: ProductItemBinding,
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: GiphyItem) {
            binding.apply {
                title.text = item.title
                image.load(item.gif, ImageLoader.Builder(binding.root.context)
                    .components {
                        if (SDK_INT >= 28) {
                            add(ImageDecoderDecoder.Factory())
                        } else {
                            add(GifDecoder.Factory())
                        }
                    }
                    .build())
            }
        }
    }

}

fun <T> RecyclerView.Adapter<*>.autoNotify(
    oldList: List<T>,
    newList: List<T>,
    compare: (T, T) -> Boolean
) {
    val diff = DiffUtil.calculateDiff(object : DiffUtil.Callback() {
        override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
            return compare(oldList[oldItemPosition], newList[newItemPosition])
        }

        override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
            return oldList[oldItemPosition] == newList[newItemPosition]
        }

        override fun getOldListSize() = oldList.size
        override fun getNewListSize() = newList.size
    })
    diff.dispatchUpdatesTo(this)
}

