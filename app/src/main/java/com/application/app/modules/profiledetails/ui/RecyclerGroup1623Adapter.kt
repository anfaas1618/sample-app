package com.application.app.modules.profiledetails.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowProfileDetails1Binding
import com.application.app.modules.profiledetails.`data`.model.ProfileDetails1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerGroup1623Adapter(
  public var list: List<ProfileDetails1RowModel>
) : RecyclerView.Adapter<RecyclerGroup1623Adapter.RowProfileDetails1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowProfileDetails1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_profile_details1,parent,false)
    return RowProfileDetails1VH(view)
  }

  public override fun onBindViewHolder(holder: RowProfileDetails1VH, position: Int): Unit {
    val profileDetails1RowModel = ProfileDetails1RowModel()
    // TODO uncomment following line after integration with data source
    // val profileDetails1RowModel = list[position]
    holder.binding.profileDetails1RowModel = profileDetails1RowModel
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ProfileDetails1RowModel>): Unit {
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
      item: ProfileDetails1RowModel
    ): Unit {
    }
  }

  public inner class RowProfileDetails1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowProfileDetails1Binding = RowProfileDetails1Binding.bind(itemView)
  }
}
