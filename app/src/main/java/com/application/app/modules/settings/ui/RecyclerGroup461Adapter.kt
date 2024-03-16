package com.application.app.modules.settings.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowSettings1Binding
import com.application.app.modules.settings.`data`.model.Settings1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerGroup461Adapter(
  public var list: List<Settings1RowModel>
) : RecyclerView.Adapter<RecyclerGroup461Adapter.RowSettings1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowSettings1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_settings1,parent,false)
    return RowSettings1VH(view)
  }

  public override fun onBindViewHolder(holder: RowSettings1VH, position: Int): Unit {
    val settings1RowModel = Settings1RowModel()
    // TODO uncomment following line after integration with data source
    // val settings1RowModel = list[position]
    holder.binding.settings1RowModel = settings1RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Settings1RowModel>): Unit {
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
      item: Settings1RowModel
    ): Unit {
    }
  }

  public inner class RowSettings1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowSettings1Binding = RowSettings1Binding.bind(itemView)
  }
}
