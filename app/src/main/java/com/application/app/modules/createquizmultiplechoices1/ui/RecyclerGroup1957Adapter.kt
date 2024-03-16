package com.application.app.modules.createquizmultiplechoices1.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowCreateQuizMultipleChoices2Binding
import com.application.app.modules.createquizmultiplechoices1.`data`.model.CreateQuizMultipleChoices2RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerGroup1957Adapter(
  public var list: List<CreateQuizMultipleChoices2RowModel>
) : RecyclerView.Adapter<RecyclerGroup1957Adapter.RowCreateQuizMultipleChoices2VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      RowCreateQuizMultipleChoices2VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_create_quiz_multiple_choices2,parent,false)
    return RowCreateQuizMultipleChoices2VH(view)
  }

  public override fun onBindViewHolder(holder: RowCreateQuizMultipleChoices2VH, position: Int):
      Unit {
    val createQuizMultipleChoices2RowModel = CreateQuizMultipleChoices2RowModel()
    // TODO uncomment following line after integration with data source
    // val createQuizMultipleChoices2RowModel = list[position]
    holder.binding.createQuizMultipleChoices2RowModel = createQuizMultipleChoices2RowModel
  }

  public override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<CreateQuizMultipleChoices2RowModel>): Unit {
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
      item: CreateQuizMultipleChoices2RowModel
    ): Unit {
    }
  }

  public inner class RowCreateQuizMultipleChoices2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowCreateQuizMultipleChoices2Binding =
        RowCreateQuizMultipleChoices2Binding.bind(itemView)
  }
}
