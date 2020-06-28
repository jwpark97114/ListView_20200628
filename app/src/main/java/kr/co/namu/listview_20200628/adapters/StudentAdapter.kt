package kr.co.namu.listview_20200628.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kr.co.namu.listview_20200628.R
import kr.co.namu.listview_20200628.datas.Student

class StudentAdapter(val mContext:Context, val resId:Int, val mList:ArrayList<Student>): ArrayAdapter<Student>(mContext, resId, mList) {

    val inf = LayoutInflater.from(mContext)

//    한줄씩 직접 그려두는 함수
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

//        convertView : 기존에 그려둔 줄이 있는지(재활용 할게 있는지) 판단하는 재료
        var tempRow = convertView

//    재활용 할 view가 없는가? 없다면 xml을 새로 그려서 tempRow에 대입
        if(tempRow == null){
            tempRow = inf.inflate(R.layout.student_list_item, null)
        }

//    재활용 여부와 관계없이 이제 무조건 tempRow안에 무엇인가 들어있다.

//    row에는 절대 null이 있을 리가 없다고 말하며 대입
    val row = tempRow!!

    return row
    }
}