package com.application.app.modules.createquizchoosecategory.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowCreateQuizChooseCategory1Binding
import com.application.app.modules.createquizchoosecategory.`data`.model.CreateQuizChooseCategory1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerGroup1969Adapter(
  public var list: List<CreateQuizChooseCategory1RowModel>
) : RecyclerView.Adapter<RecyclerGroup1969Adapter.RowCreateQuizChooseCategory1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      RowCreateQuizChooseCategory1VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_create_quiz_choose_category1,parent,false)
    return RowCreateQuizChooseCategory1VH(view)
  }

  public override fun onBindViewHolder(holder: RowCreateQuizChooseCategory1VH, position: Int):
      Unit {
    val createQuizChooseCategory1RowModel = CreateQuizChooseCategory1RowModel()
    // TODO uncomment following line after integration with data source
    // val createQuizChooseCategory1RowModel = list[position]
    holder.binding.createQuizChooseCategory1RowModel = createQuizChooseCategory1RowModel
  }

  public override fun getItemCount(): Int = 8
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<CreateQuizChooseCategory1RowModel>): Unit {
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
      item: CreateQuizChooseCategory1RowModel
    ): Unit {
    }
  }

  public inner class RowCreateQuizChooseCategory1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowCreateQuizChooseCategory1Binding =
        RowCreateQuizChooseCategory1Binding.bind(itemView)
  }
}
