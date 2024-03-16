package com.application.app.modules.quizcompleted.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowQuizCompleted1Binding
import com.application.app.modules.quizcompleted.`data`.model.QuizCompleted1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerGroup1792Adapter(
  public var list: List<QuizCompleted1RowModel>
) : RecyclerView.Adapter<RecyclerGroup1792Adapter.RowQuizCompleted1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowQuizCompleted1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_quiz_completed1,parent,false)
    return RowQuizCompleted1VH(view)
  }

  public override fun onBindViewHolder(holder: RowQuizCompleted1VH, position: Int): Unit {
    val quizCompleted1RowModel = QuizCompleted1RowModel()
    // TODO uncomment following line after integration with data source
    // val quizCompleted1RowModel = list[position]
    holder.binding.quizCompleted1RowModel = quizCompleted1RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<QuizCompleted1RowModel>): Unit {
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
      item: QuizCompleted1RowModel
    ): Unit {
    }
  }

  public inner class RowQuizCompleted1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowQuizCompleted1Binding = RowQuizCompleted1Binding.bind(itemView)
  }
}
