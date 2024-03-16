package com.application.app.modules.reviewquiz.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowReviewQuiz1Binding
import com.application.app.modules.reviewquiz.`data`.model.ReviewQuiz1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerGroup1875Adapter(
  public var list: List<ReviewQuiz1RowModel>
) : RecyclerView.Adapter<RecyclerGroup1875Adapter.RowReviewQuiz1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowReviewQuiz1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_review_quiz1,parent,false)
    return RowReviewQuiz1VH(view)
  }

  public override fun onBindViewHolder(holder: RowReviewQuiz1VH, position: Int): Unit {
    val reviewQuiz1RowModel = ReviewQuiz1RowModel()
    // TODO uncomment following line after integration with data source
    // val reviewQuiz1RowModel = list[position]
    holder.binding.reviewQuiz1RowModel = reviewQuiz1RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ReviewQuiz1RowModel>): Unit {
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
      item: ReviewQuiz1RowModel
    ): Unit {
    }
  }

  public inner class RowReviewQuiz1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowReviewQuiz1Binding = RowReviewQuiz1Binding.bind(itemView)
  }
}
