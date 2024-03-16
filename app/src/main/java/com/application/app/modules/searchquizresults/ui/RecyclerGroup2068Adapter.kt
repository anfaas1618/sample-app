package com.application.app.modules.searchquizresults.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowSearchQuizResults1Binding
import com.application.app.modules.searchquizresults.`data`.model.SearchQuizResults1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerGroup2068Adapter(
  public var list: List<SearchQuizResults1RowModel>
) : RecyclerView.Adapter<RecyclerGroup2068Adapter.RowSearchQuizResults1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      RowSearchQuizResults1VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_search_quiz_results1,parent,false)
    return RowSearchQuizResults1VH(view)
  }

  public override fun onBindViewHolder(holder: RowSearchQuizResults1VH, position: Int): Unit {
    val searchQuizResults1RowModel = SearchQuizResults1RowModel()
    // TODO uncomment following line after integration with data source
    // val searchQuizResults1RowModel = list[position]
    holder.binding.searchQuizResults1RowModel = searchQuizResults1RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<SearchQuizResults1RowModel>): Unit {
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
      item: SearchQuizResults1RowModel
    ): Unit {
    }
  }

  public inner class RowSearchQuizResults1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowSearchQuizResults1Binding = RowSearchQuizResults1Binding.bind(itemView)
  }
}
