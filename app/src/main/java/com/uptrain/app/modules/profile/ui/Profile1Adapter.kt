package com.uptrain.app.modules.profile.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.uptrain.app.R
import com.uptrain.app.databinding.RowProfile1Binding
import com.uptrain.app.modules.profile.`data`.model.Profile1RowModel
import kotlin.Int
import kotlin.collections.List

class Profile1Adapter(
  var list: List<Profile1RowModel>
) : RecyclerView.Adapter<Profile1Adapter.RowProfile1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowProfile1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_profile1,parent,false)
    return RowProfile1VH(view)
  }

  override fun onBindViewHolder(holder: RowProfile1VH, position: Int) {
    val profile1RowModel = Profile1RowModel()
    // TODO uncomment following line after integration with data source
    // val profile1RowModel = list[position]
    holder.binding.profile1RowModel = profile1RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Profile1RowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: Profile1RowModel
    ) {
    }
  }

  inner class RowProfile1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowProfile1Binding = RowProfile1Binding.bind(itemView)
  }
}
