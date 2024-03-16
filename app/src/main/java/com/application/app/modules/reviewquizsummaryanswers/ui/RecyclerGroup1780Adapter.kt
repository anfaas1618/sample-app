package com.application.app.modules.reviewquizsummaryanswers.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowReviewQuizSummaryAnswers1Binding
import com.application.app.modules.reviewquizsummaryanswers.`data`.model.ReviewQuizSummaryAnswers1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerGroup1780Adapter(
  public var list: List<ReviewQuizSummaryAnswers1RowModel>
) : RecyclerView.Adapter<RecyclerGroup1780Adapter.RowReviewQuizSummaryAnswers1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      RowReviewQuizSummaryAnswers1VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_review_quiz_summary_answers1,parent,false)
    return RowReviewQuizSummaryAnswers1VH(view)
  }

  public override fun onBindViewHolder(holder: RowReviewQuizSummaryAnswers1VH, position: Int):
      Unit {
    val reviewQuizSummaryAnswers1RowModel = ReviewQuizSummaryAnswers1RowModel()
    // TODO uncomment following line after integration with data source
    // val reviewQuizSummaryAnswers1RowModel = list[position]
    holder.binding.reviewQuizSummaryAnswers1RowModel = reviewQuizSummaryAnswers1RowModel
  }

  public override fun getItemCount(): Int = 6
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ReviewQuizSummaryAnswers1RowModel>): Unit {
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
      item: ReviewQuizSummaryAnswers1RowModel
    ): Unit {
    }
  }

  public inner class RowReviewQuizSummaryAnswers1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowReviewQuizSummaryAnswers1Binding =
        RowReviewQuizSummaryAnswers1Binding.bind(itemView)
  }
}
