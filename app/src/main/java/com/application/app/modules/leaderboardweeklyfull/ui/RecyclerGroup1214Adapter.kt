package com.application.app.modules.leaderboardweeklyfull.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowLeaderboardWeeklyFull1Binding
import com.application.app.modules.leaderboardweeklyfull.`data`.model.LeaderboardWeeklyFull1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerGroup1214Adapter(
  public var list: List<LeaderboardWeeklyFull1RowModel>
) : RecyclerView.Adapter<RecyclerGroup1214Adapter.RowLeaderboardWeeklyFull1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      RowLeaderboardWeeklyFull1VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_leaderboard_weekly_full1,parent,false)
    return RowLeaderboardWeeklyFull1VH(view)
  }

  public override fun onBindViewHolder(holder: RowLeaderboardWeeklyFull1VH, position: Int): Unit {
    val leaderboardWeeklyFull1RowModel = LeaderboardWeeklyFull1RowModel()
    // TODO uncomment following line after integration with data source
    // val leaderboardWeeklyFull1RowModel = list[position]
    holder.binding.leaderboardWeeklyFull1RowModel = leaderboardWeeklyFull1RowModel
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<LeaderboardWeeklyFull1RowModel>): Unit {
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
      item: LeaderboardWeeklyFull1RowModel
    ): Unit {
    }
  }

  public inner class RowLeaderboardWeeklyFull1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowLeaderboardWeeklyFull1Binding =
        RowLeaderboardWeeklyFull1Binding.bind(itemView)
  }
}
