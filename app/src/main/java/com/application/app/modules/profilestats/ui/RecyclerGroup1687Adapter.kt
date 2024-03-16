package com.application.app.modules.profilestats.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowProfileStats1Binding
import com.application.app.modules.profilestats.`data`.model.ProfileStats1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerGroup1687Adapter(
  public var list: List<ProfileStats1RowModel>
) : RecyclerView.Adapter<RecyclerGroup1687Adapter.RowProfileStats1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowProfileStats1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_profile_stats1,parent,false)
    return RowProfileStats1VH(view)
  }

  public override fun onBindViewHolder(holder: RowProfileStats1VH, position: Int): Unit {
    val profileStats1RowModel = ProfileStats1RowModel()
    // TODO uncomment following line after integration with data source
    // val profileStats1RowModel = list[position]
    holder.binding.profileStats1RowModel = profileStats1RowModel
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ProfileStats1RowModel>): Unit {
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
      item: ProfileStats1RowModel
    ): Unit {
    }
  }

  public inner class RowProfileStats1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowProfileStats1Binding = RowProfileStats1Binding.bind(itemView)
  }
}
