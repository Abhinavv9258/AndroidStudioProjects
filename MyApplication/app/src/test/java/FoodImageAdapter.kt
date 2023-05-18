import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class FoodImageAdapter(private val mydataSet:ArrayList<FoodData>):RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {
        val circleImage: ImageView =itemView.findViewById(R.id.foodimage)
        val foodname: TextView =itemView.findViewById(R.id.foodtext)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder{
        val view = LayoutInflater.from(parent.context).inflate(R.layout.foodimagecircle, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return mydataSet.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item= mydataSet[position]
//    holder.circleImage
    }


}