package com.application.app.modules.reviewquizsummaryanswers.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowReviewQuizSummaryAnswers2Binding
import com.application.app.modules.reviewquizsummaryanswers.`data`.model.ReviewQuizSummaryAnswers2RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerGroup1781Adapter(
  public var list: List<ReviewQuizSummaryAnswers2RowModel>
) : RecyclerView.Adapter<RecyclerGroup1781Adapter.RowReviewQuizSummaryAnswers2VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      RowReviewQuizSummaryAnswers2VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_review_quiz_summary_answers2,parent,false)
    return RowReviewQuizSummaryAnswers2VH(view)
  }

  public override fun onBindViewHolder(holder: RowReviewQuizSummaryAnswers2VH, position: Int):
      Unit {
    val reviewQuizSummaryAnswers2RowModel = ReviewQuizSummaryAnswers2RowModel()
    // TODO uncomment following line after integration with data source
    // val reviewQuizSummaryAnswers2RowModel = list[position]
    holder.binding.reviewQuizSummaryAnswers2RowModel = reviewQuizSummaryAnswers2RowModel
  }

  public override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ReviewQuizSummaryAnswers2RowModel>): Unit {
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
      item: ReviewQuizSummaryAnswers2RowModel
    ): Unit {
    }
  }

  public inner class RowReviewQuizSummaryAnswers2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowReviewQuizSummaryAnswers2Binding =
        RowReviewQuizSummaryAnswers2Binding.bind(itemView)
  }
}
