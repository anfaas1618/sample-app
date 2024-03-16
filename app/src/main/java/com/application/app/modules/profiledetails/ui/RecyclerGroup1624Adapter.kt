package com.application.app.modules.profiledetails.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowProfileDetails2Binding
import com.application.app.modules.profiledetails.`data`.model.ProfileDetails2RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerGroup1624Adapter(
  public var list: List<ProfileDetails2RowModel>
) : RecyclerView.Adapter<RecyclerGroup1624Adapter.RowProfileDetails2VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowProfileDetails2VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_profile_details2,parent,false)
    return RowProfileDetails2VH(view)
  }

  public override fun onBindViewHolder(holder: RowProfileDetails2VH, position: Int): Unit {
    val profileDetails2RowModel = ProfileDetails2RowModel()
    // TODO uncomment following line after integration with data source
    // val profileDetails2RowModel = list[position]
    holder.binding.profileDetails2RowModel = profileDetails2RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ProfileDetails2RowModel>): Unit {
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
      item: ProfileDetails2RowModel
    ): Unit {
    }
  }

  public inner class RowProfileDetails2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowProfileDetails2Binding = RowProfileDetails2Binding.bind(itemView)
  }
}
