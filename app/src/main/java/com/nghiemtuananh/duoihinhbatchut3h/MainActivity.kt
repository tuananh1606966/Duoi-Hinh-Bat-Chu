package com.nghiemtuananh.duoihinhbatchut3h

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.core.view.get
import androidx.core.view.isInvisible
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private val listHinhAnh: MutableList<HinhAnh>
    private var random: Random
    private var check = 0
    private lateinit var btnHang1: Button
    private lateinit var btnHang2: Button
    private lateinit var btnHang3: Button
    private lateinit var btnHang4: Button
    private lateinit var btnAdd: Button
    private var temp = 0
    private var ketQua = ""
    private var strResult = ""
    private var isDone = true
    private var score = 0
    private var heart = 5
    private val listCheckBack: MutableList<Int>

    init {
        listHinhAnh = mutableListOf()
        listHinhAnh.add(HinhAnh(R.drawable.aomua, "AOMUA", "CIANHUGTLOQXAKMV"))
        listHinhAnh.add(HinhAnh(R.drawable.baocao, "BAOCAO", "RIANHOGBAOQADCOV"))
        listHinhAnh.add(HinhAnh(R.drawable.canthiep, "CANTHIEP", "WIACHPNTAOQHDEMV"))
        listHinhAnh.add(HinhAnh(R.drawable.cattuong, "CATTUONG", "QIANHUGTACQXDTMO"))
        listHinhAnh.add(HinhAnh(R.drawable.chieutre, "CHIEUTRE", "HEANCUGTAEQXRKIV"))
        listHinhAnh.add(HinhAnh(R.drawable.danhlua, "DANHLUA", "NIACHUGTALQXDKMU"))
        listHinhAnh.add(HinhAnh(R.drawable.danong, "DANONG", "GIANHUGTAOQXDNMV"))
        listHinhAnh.add(HinhAnh(R.drawable.giandiep, "GIANDIEP", "PIGNHUGTAOQIDKME"))
        listHinhAnh.add(HinhAnh(R.drawable.giangmai, "GIANGMAI", "MGANHUGTAOQXDIMI"))
        listHinhAnh.add(HinhAnh(R.drawable.hoidong, "HOIDONG", "IOANHUGTAOQXDKMV"))
        listHinhAnh.add(HinhAnh(R.drawable.hongtam, "HONGTAM", "CIANHUGTAOQXDKMV"))
        listHinhAnh.add(HinhAnh(R.drawable.khoailang, "KHOAILANG", "CIANHUGTAOQXDKML"))
        listHinhAnh.add(HinhAnh(R.drawable.kiemchuyen, "KIEMCHUYEN", "EIANHUGCAOQXKEMY"))
        listHinhAnh.add(HinhAnh(R.drawable.lancan, "LANCAN", "GCSNQNVHDLZOAFAB"))
        listHinhAnh.add(HinhAnh(R.drawable.masat, "MASAT", "VTEBANMARWXIYAHS"))
        listHinhAnh.add(HinhAnh(R.drawable.nambancau, "NAMBANCAU", "WMEBASNOCUANLAKT"))
        listHinhAnh.add(HinhAnh(R.drawable.oto, "OTO", "XANGOURNTVARMGOR"))
        listHinhAnh.add(HinhAnh(R.drawable.quyhang, "QUYHANG", "NFGQMLYDUAGSHCET"))
        listHinhAnh.add(HinhAnh(R.drawable.songsong, "SONGSONG", "AVJINKOSHGGNORSE"))
        listHinhAnh.add(HinhAnh(R.drawable.thattinh, "THATTINH", "GHMTIFAENYTPHTDB"))
        listHinhAnh.add(HinhAnh(R.drawable.thothe, "THOTHE", "FOGETCSHVHRXLTZP"))
        listHinhAnh.add(HinhAnh(R.drawable.tichphan, "TICHPHAN", "BDPNTEHYIGADSHZC"))
        listHinhAnh.add(HinhAnh(R.drawable.tohoai, "TOHOAI", "MONIWTBSHFHEALLO"))
        listHinhAnh.add(HinhAnh(R.drawable.totien, "TOTIEN", "SOWIFRVTVANENBTL"))
        listHinhAnh.add(HinhAnh(R.drawable.tranhthu, "TRANHTHU", "BHSNUTMEHCRNIATO"))
        listHinhAnh.add(HinhAnh(R.drawable.vuaphaluoi, "VUAPHALUOI", "ATPUAHEROLVCUBIH"))
        listHinhAnh.add(HinhAnh(R.drawable.vuonbachthu, "VUONBACHTHU", "LTKBVPUAOHUCRONH"))
        listHinhAnh.add(HinhAnh(R.drawable.xakep, "XAKEP", "MEGRKYDNAXQIBPAL"))
        listHinhAnh.add(HinhAnh(R.drawable.xaphong, "XAPHONG", "AGEAJHBTOCXLVPNM"))
        listHinhAnh.add(HinhAnh(R.drawable.xedapdien, "XEDAPDIEN", "DPSXADBIKWDUENLE"))

        random = Random()

        listCheckBack = mutableListOf()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_next.isInvisible = true
        btn_return.isInvisible = true

        temp = random.nextInt(listHinhAnh.size)
        ketQua = listHinhAnh[temp].dapAn

        batDau()

        setOnClick()
    }

    override fun onClick(v: View) {
        when (v) {
            btn_1 -> {
                action(btn_1)
                listCheckBack.add(1)
            }
            btn_2 -> {
                action(btn_2)
                listCheckBack.add(2)
            }
            btn_3 -> {
                action(btn_3)
                listCheckBack.add(3)
            }
            btn_4 -> {
                action(btn_4)
                listCheckBack.add(4)
            }
            btn_5 -> {
                action(btn_5)
                listCheckBack.add(5)
            }
            btn_6 -> {
                action(btn_6)
                listCheckBack.add(6)
            }
            btn_7 -> {
                action(btn_7)
                listCheckBack.add(7)
            }
            btn_8 -> {
                action(btn_8)
                listCheckBack.add(8)
            }
            btn_9 -> {
                action(btn_9)
                listCheckBack.add(9)
            }
            btn_10 -> {
                action(btn_10)
                listCheckBack.add(10)
            }
            btn_11 -> {
                action(btn_11)
                listCheckBack.add(11)
            }
            btn_12 -> {
                action(btn_12)
                listCheckBack.add(12)
            }
            btn_13 -> {
                action(btn_13)
                listCheckBack.add(13)
            }
            btn_14 -> {
                action(btn_14)
                listCheckBack.add(14)
            }
            btn_15 -> {
                action(btn_15)
                listCheckBack.add(15)
            }
            btn_16 -> {
                action(btn_16)
                listCheckBack.add(16)
            }
            btn_next -> {
                actionNext()
            }
            btn_return -> {
                actionReturn()
            }
        }
    }

    private fun action(btn: Button) {
        if (isDone) {
            if (check <= 7) {
                btnHang1 = ll_hang1.getChildAt(check) as Button
                btnHang1.setText(btn.text.toString())
            } else {
                btnHang2 = ll_hang2.getChildAt(check - 8) as Button
                btnHang2.setText(btn.text.toString())
            }
            btn.isInvisible = true
            check++
            checkResult()
            if (heart == 0) {
                finish()
                Toast.makeText(this, "Game over", Toast.LENGTH_LONG).show()
            }
        }
    }

    private fun setOnVisibleAfterBack() {
        when (listCheckBack.last()) {
            1 -> {
                btn_1.isInvisible = false
                listCheckBack.removeLast()
            }
            2 -> {
                btn_2.isInvisible = false
                listCheckBack.removeLast()
            }
            3 -> {
                btn_3.isInvisible = false
                listCheckBack.removeLast()
            }
            4 -> {
                btn_4.isInvisible = false
                listCheckBack.removeLast()
            }
            5 -> {
                btn_5.isInvisible = false
                listCheckBack.removeLast()
            }
            6 -> {
                btn_6.isInvisible = false
                listCheckBack.removeLast()
            }
            7 -> {
                btn_7.isInvisible = false
                listCheckBack.removeLast()
            }
            8 -> {
                btn_8.isInvisible = false
                listCheckBack.removeLast()
            }
            9 -> {
                btn_9.isInvisible = false
                listCheckBack.removeLast()
            }
            10 -> {
                btn_10.isInvisible = false
                listCheckBack.removeLast()
            }
            11 -> {
                btn_11.isInvisible = false
                listCheckBack.removeLast()
            }
            12 -> {
                btn_12.isInvisible = false
                listCheckBack.removeLast()
            }
            13 -> {
                btn_13.isInvisible = false
                listCheckBack.removeLast()
            }
            14 -> {
                btn_14.isInvisible = false
                listCheckBack.removeLast()
            }
            15 -> {
                btn_15.isInvisible = false
                listCheckBack.removeLast()
            }
            16 -> {
                btn_16.isInvisible = false
                listCheckBack.removeLast()
            }
        }
    }

    private fun actionNext() {
        temp = random.nextInt(listHinhAnh.size)
        ketQua = listHinhAnh[temp].dapAn
        isDone = true
        check = 0
        listCheckBack.clear()
        strResult = ""
        tv_ketqua.setText("")
        btn_next.isInvisible = true
        ll_hang1.removeAllViews()
        ll_hang2.removeAllViews()
        setOnVisible()
        batDau()
    }

    private fun actionReturn() {
        isDone = true
        strResult = ""
        setOnVisible()
        listCheckBack.clear()
        tv_ketqua.setText("")
        btn_return.isInvisible = true
        if (check <= 8) {
            for (i in 0..ketQua.length - 1) {
                btnHang1 = ll_hang1.getChildAt(i) as Button
                btnHang1.setText("")
                btnHang1.setBackgroundResource(R.drawable.tile_normal)
            }
        } else {
            for (i in 0..7) {
                btnHang1 = ll_hang1.getChildAt(i) as Button
                btnHang1.setText("")
                btnHang1.setBackgroundResource(R.drawable.tile_normal)
            }
            for (i in 0..check - 9) {
                btnHang2 = ll_hang2.getChildAt(i) as Button
                btnHang2.setText("")
                btnHang2.setBackgroundResource(R.drawable.tile_normal)
            }
        }
        check = 0
    }

    private fun checkResult() {
        if (check == ketQua.length && check <= 8) {
            for (i in 0..ketQua.length - 1) {
                btnHang1 = ll_hang1.getChildAt(i) as Button
                strResult += btnHang1.text.toString()
            }
            if (ketQua.equals(strResult)) {
                actionWin()
            } else {
                actionLoser()
            }
            isDone = false
        } else if (check == ketQua.length && check > 8) {
            for (i in 0..7) {
                btnHang1 = ll_hang1.getChildAt(i) as Button
                strResult += btnHang1.text.toString()
            }
            for (i in 0..ketQua.length - 9) {
                btnHang2 = ll_hang2.getChildAt(i) as Button
                strResult += btnHang2.text.toString()
            }
            if (ketQua.equals(strResult)) {
                actionWin()
            } else {
                actionLoser()
            }
            isDone = false
        }
    }

    private fun actionWin() {
        tv_ketqua.setText("Bạn đã tìm ra đáp án!")
        btn_next.isInvisible = false
        score += 100
        iv_coin_icon.setText(score.toString())
        if (check <= 8) {
            for (i in 0..ketQua.length - 1) {
                btnHang1 = ll_hang1.getChildAt(i) as Button
                btnHang1.setTextColor(Color.BLACK)
                btnHang1.setBackgroundResource(R.drawable.tile_true)
            }
        } else {
            for (i in 0..7) {
                btnHang1 = ll_hang1.getChildAt(i) as Button
                btnHang1.setTextColor(Color.BLACK)
                btnHang1.setBackgroundResource(R.drawable.tile_true)
            }
            for (i in 0..ketQua.length - 9) {
                btnHang2 = ll_hang2.getChildAt(i) as Button
                btnHang2.setTextColor(Color.BLACK)
                btnHang2.setBackgroundResource(R.drawable.tile_true)
            }
        }
    }

    private fun actionLoser() {
        tv_ketqua.setText("Bạn đã chọn sai đáp án rồi!")
        btn_return.isInvisible = false
        heart -= 1
        btn_heart.setText(heart.toString())
        if (check <= 8) {
            for (i in 0..ketQua.length - 1) {
                btnHang1 = ll_hang1.getChildAt(i) as Button
                btnHang1.setBackgroundResource(R.drawable.tile_false)
            }
        } else {
            for (i in 0..7) {
                btnHang1 = ll_hang1.getChildAt(i) as Button
                btnHang1.setBackgroundResource(R.drawable.tile_false)
            }
            for (i in 0..ketQua.length - 9) {
                btnHang2 = ll_hang2.getChildAt(i) as Button
                btnHang2.setBackgroundResource(R.drawable.tile_false)
            }
        }
    }

    private fun setOnClick() {
        btn_return.setOnClickListener(this)
        btn_next.setOnClickListener(this)
        btn_1.setOnClickListener(this)
        btn_2.setOnClickListener(this)
        btn_3.setOnClickListener(this)
        btn_4.setOnClickListener(this)
        btn_5.setOnClickListener(this)
        btn_6.setOnClickListener(this)
        btn_7.setOnClickListener(this)
        btn_8.setOnClickListener(this)
        btn_9.setOnClickListener(this)
        btn_10.setOnClickListener(this)
        btn_11.setOnClickListener(this)
        btn_12.setOnClickListener(this)
        btn_13.setOnClickListener(this)
        btn_14.setOnClickListener(this)
        btn_15.setOnClickListener(this)
        btn_16.setOnClickListener(this)
    }

    private fun setOnVisible() {
        btn_1.isInvisible = false
        btn_2.isInvisible = false
        btn_3.isInvisible = false
        btn_4.isInvisible = false
        btn_5.isInvisible = false
        btn_6.isInvisible = false
        btn_7.isInvisible = false
        btn_8.isInvisible = false
        btn_9.isInvisible = false
        btn_10.isInvisible = false
        btn_11.isInvisible = false
        btn_12.isInvisible = false
        btn_13.isInvisible = false
        btn_14.isInvisible = false
        btn_15.isInvisible = false
        btn_16.isInvisible = false
    }

    private fun batDau() {
        fl_anh.setBackgroundResource(listHinhAnh[temp].anh)

        for (i in 0..7) {
            btnHang4 = ll_hang4.getChildAt(i) as Button
            btnHang4.setText(listHinhAnh[temp].chuoiDapAn[i].toString())
            btnHang3 = ll_hang3.getChildAt(i) as Button
            btnHang3.setText(listHinhAnh[temp].chuoiDapAn[i + 8].toString())
        }

        if (ketQua.length > 8) {
            for (i in 0..7) {
                btnAdd =
                    LayoutInflater.from(this).inflate(R.layout.btn_add, ll_hang1, false) as Button
                ll_hang1.addView(btnAdd)
                btnAdd = ll_hang1.getChildAt(i) as Button
                btnAdd.setOnClickListener {
                    Toast.makeText(this, i.toString(), Toast.LENGTH_LONG).show()
                    if (i == check - 1 && isDone) {
                        btnAdd = ll_hang1.getChildAt(i) as Button
                        btnAdd.setText("")
                        check--
                        setOnVisibleAfterBack()
                    }
                }
            }
            for (i in 8..ketQua.length - 1) {
                btnAdd =
                    LayoutInflater.from(this).inflate(R.layout.btn_add, ll_hang2, false) as Button
                ll_hang2.addView(btnAdd)
                btnAdd = ll_hang2.getChildAt(i - 8) as Button
                btnAdd.setOnClickListener {
                    if (i == check - 1 && isDone) {
                        btnAdd = ll_hang2.getChildAt(i - 8) as Button
                        btnAdd.setText("")
                        check--
                        setOnVisibleAfterBack()
                    }
                    Toast.makeText(this, i.toString(), Toast.LENGTH_LONG).show()
                }
            }
        } else {
            for (i in 0..ketQua.length - 1) {
                btnAdd =
                    LayoutInflater.from(this).inflate(R.layout.btn_add, ll_hang1, false) as Button
                ll_hang1.addView(btnAdd)
                btnAdd.setOnClickListener {
                    if (i == check - 1 && isDone) {
                        btnAdd = ll_hang1.getChildAt(i) as Button
                        btnAdd.setText("")
                        check--
                        setOnVisibleAfterBack()
                    }
                    Toast.makeText(this, i.toString(), Toast.LENGTH_LONG).show()
                }
            }
        }
        listHinhAnh.removeAt(temp)
    }
}