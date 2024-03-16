package com.application.app.modules.quizcategories.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowQuizCategories1Binding
import com.application.app.modules.quizcategories.`data`.model.QuizCategories1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerGroup2132Adapter(
  public var list: List<QuizCategories1RowModel>
) : RecyclerView.Adapter<RecyclerGroup2132Adapter.RowQuizCategories1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowQuizCategories1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_quiz_categories1,parent,false)
    return RowQuizCategories1VH(view)
  }

  public override fun onBindViewHolder(holder: RowQuizCategories1VH, position: Int): Unit {
    val quizCategories1RowModel = QuizCategories1RowModel()
    // TODO uncomment following line after integration with data source
    // val quizCategories1RowModel = list[position]
    holder.binding.quizCategories1RowModel = quizCategories1RowModel
  }

  public override fun getItemCount(): Int = 8
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<QuizCategories1RowModel>): Unit {
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
      item: QuizCategories1RowModel
    ): Unit {
    }
  }

  public inner class RowQuizCategories1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowQuizCategories1Binding = RowQuizCategories1Binding.bind(itemView)
  }
}
