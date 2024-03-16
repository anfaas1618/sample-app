package com.application.app.modules.leaderboardweekly.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowLeaderboardWeekly1Binding
import com.application.app.modules.leaderboardweekly.`data`.model.LeaderboardWeekly1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerGroup1451Adapter(
  public var list: List<LeaderboardWeekly1RowModel>
) : RecyclerView.Adapter<RecyclerGroup1451Adapter.RowLeaderboardWeekly1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      RowLeaderboardWeekly1VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_leaderboard_weekly1,parent,false)
    return RowLeaderboardWeekly1VH(view)
  }

  public override fun onBindViewHolder(holder: RowLeaderboardWeekly1VH, position: Int): Unit {
    val leaderboardWeekly1RowModel = LeaderboardWeekly1RowModel()
    // TODO uncomment following line after integration with data source
    // val leaderboardWeekly1RowModel = list[position]
    holder.binding.leaderboardWeekly1RowModel = leaderboardWeekly1RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<LeaderboardWeekly1RowModel>): Unit {
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
      item: LeaderboardWeekly1RowModel
    ): Unit {
    }
  }

  public inner class RowLeaderboardWeekly1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowLeaderboardWeekly1Binding = RowLeaderboardWeekly1Binding.bind(itemView)
  }
}
