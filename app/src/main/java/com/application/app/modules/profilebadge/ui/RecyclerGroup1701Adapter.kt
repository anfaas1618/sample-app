package com.application.app.modules.profilebadge.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowProfileBadge2Binding
import com.application.app.modules.profilebadge.`data`.model.ProfileBadge2RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerGroup1701Adapter(
  public var list: List<ProfileBadge2RowModel>
) : RecyclerView.Adapter<RecyclerGroup1701Adapter.RowProfileBadge2VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowProfileBadge2VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_profile_badge2,parent,false)
    return RowProfileBadge2VH(view)
  }

  public override fun onBindViewHolder(holder: RowProfileBadge2VH, position: Int): Unit {
    val profileBadge2RowModel = ProfileBadge2RowModel()
    // TODO uncomment following line after integration with data source
    // val profileBadge2RowModel = list[position]
    holder.binding.profileBadge2RowModel = profileBadge2RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ProfileBadge2RowModel>): Unit {
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
      item: ProfileBadge2RowModel
    ): Unit {
    }
  }

  public inner class RowProfileBadge2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowProfileBadge2Binding = RowProfileBadge2Binding.bind(itemView)
  }
}
