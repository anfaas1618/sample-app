package com.application.app.modules.profilebadge.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowProfileBadge1Binding
import com.application.app.modules.profilebadge.`data`.model.ProfileBadge1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerGroup1763Adapter(
  public var list: List<ProfileBadge1RowModel>
) : RecyclerView.Adapter<RecyclerGroup1763Adapter.RowProfileBadge1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowProfileBadge1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_profile_badge1,parent,false)
    return RowProfileBadge1VH(view)
  }

  public override fun onBindViewHolder(holder: RowProfileBadge1VH, position: Int): Unit {
    val profileBadge1RowModel = ProfileBadge1RowModel()
    // TODO uncomment following line after integration with data source
    // val profileBadge1RowModel = list[position]
    holder.binding.profileBadge1RowModel = profileBadge1RowModel
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ProfileBadge1RowModel>): Unit {
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
      item: ProfileBadge1RowModel
    ): Unit {
    }
  }

  public inner class RowProfileBadge1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowProfileBadge1Binding = RowProfileBadge1Binding.bind(itemView)
  }
}
