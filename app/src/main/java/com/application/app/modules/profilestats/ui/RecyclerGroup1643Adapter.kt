package com.application.app.modules.profilestats.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowProfileStats2Binding
import com.application.app.modules.profilestats.`data`.model.ProfileStats2RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerGroup1643Adapter(
  public var list: List<ProfileStats2RowModel>
) : RecyclerView.Adapter<RecyclerGroup1643Adapter.RowProfileStats2VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowProfileStats2VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_profile_stats2,parent,false)
    return RowProfileStats2VH(view)
  }

  public override fun onBindViewHolder(holder: RowProfileStats2VH, position: Int): Unit {
    val profileStats2RowModel = ProfileStats2RowModel()
    // TODO uncomment following line after integration with data source
    // val profileStats2RowModel = list[position]
    holder.binding.profileStats2RowModel = profileStats2RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ProfileStats2RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: ProfileStats2RowModel
    ): Unit {
    }
  }

  public inner class RowProfileStats2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowProfileStats2Binding = RowProfileStats2Binding.bind(itemView)
  }
}
