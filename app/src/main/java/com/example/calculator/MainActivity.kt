package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    //result
    lateinit var res: TextView;
    lateinit var resString : String;


    //AC
    lateinit var ac : TextView;
    lateinit var acString : String;


    // 0-9


    // 0-9 bool
    var perbool: Boolean = false;
    var divbool: Boolean = false;
    var mulbool: Boolean = false;
    var minbool: Boolean = false;
    var plusbool: Boolean = false;



    // result
    var result : Double = 0.0;
    var result2 : Double = 0.0;

    lateinit var resultString : String;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // getting res textView
        res = findViewById(R.id.resID)


        // getting AC textView
        ac = findViewById(R.id.acID)

///        res.text = ""

    }
    // AC function
    fun acFun(v: View){
        acString = ac.toString()
        res.setText("")
        result=0.0;
        result2=0.0
    }

    // Operators functions
    fun perFun(v: View){
        perbool = true;
        resString = res.text.toString()
        res.append("%");
        result = resString.toDouble()
    }

    fun divFun(v: View){

        divbool = true;
        resString = res.text.toString()
        res.append("/");
        result = resString.toDouble()


    }

    fun mulFun(v: View){

        mulbool = true;
        resString = res.text.toString()
        res.append("X");
        result = resString.toDouble()


    }

    fun minusFun(v: View){
        minbool = true;
        resString = res.text.toString()
        res.append("-");
        result = resString.toDouble()
    }

    fun plusFun(v: View){
        plusbool = true;
        resString = res.text.toString()
        res.append("+");
        result = resString.toDouble()

    }

    fun equalFun(v: View){

        if(perbool==true){
            result2 %=result;
            res.setText(result2.toString())
            perbool=false;
        }

        if(divbool==true){
            result2 /=result;
            res.setText(result2.toString())
            divbool=false
        }

        if(mulbool==true){
            result2 *=result;
            res.setText(result2.toString())
            mulbool = false
        }

        if(minbool==true){
            result2 -=result;
            res.setText(result2.toString())
            minbool = true
        }

        if(plusbool==true){
            result2 +=result;
            res.setText(result2.toString())
            plusbool =false
        }

    }

    fun oneFun(v: View){

        if(perbool==true and divbool==true and mulbool==true and minbool==true and plusbool==true){
            res.setText("1")
            resString = res.text.toString()
            result2 = resString.toDouble()
        }

        else {
            res.append("1")
        }
    }

    fun twoFun(v: View){
        if(perbool==true and divbool==true and mulbool==true and minbool==true and plusbool==true){
            res.setText("2")
            resString = res.text.toString()
            result2 = resString.toDouble()
        }

        else {
            res.append("2")
        }

    }

    fun threeFun(v: View){
        if(perbool==true and divbool==true and mulbool==true and minbool==true and plusbool==true){
            res.setText("3")
            resString = res.text.toString()
            result2 = resString.toDouble()
        }

        else {
            res.append("3")
        }


    }

    fun fourFun(v: View){
        if(perbool==true and divbool==true and mulbool==true and minbool==true and plusbool==true){

            res.setText("4")
            resString = res.text.toString()
            result2 = resString.toDouble()
        }

        else {
            res.append("4")
        }


    }

    fun fiveFun(v: View){
        if(perbool==true and divbool==true and mulbool==true and minbool==true and plusbool==true){
            res.setText("5")
            resString = res.text.toString()
            result2 = resString.toDouble()
        }

        else {
            res.append("5")
        }


    }

    fun sixFun(v: View){
        if(perbool==true and divbool==true and mulbool==true and minbool==true and plusbool==true){
            res.setText("6")
            resString = res.text.toString()
            result2 = resString.toDouble()
        }

        else {
            res.append("6")
        }


    }


    fun sevenFun(v: View){
        if(perbool==true and divbool==true and mulbool==true and minbool==true and plusbool==true){
            res.setText("7")
            resString = res.text.toString()
            result2 = resString.toDouble()
        }

        else {
            res.append("7")
        }


    }

    fun eightFun(v: View){
        if(perbool==true and divbool==true and mulbool==true and minbool==true and plusbool==true){
            res.setText("8")
            resString = res.text.toString()
            result2 = resString.toDouble()
        }

        else {
            res.append("8")

        }


    }

    fun nineFun(v: View){
        if(perbool==true and divbool==true and mulbool==true and minbool==true and plusbool==true){
            res.setText("9")
            resString = res.text.toString()
            result2 = resString.toDouble()
        }

        else {
            res.append("9")
        }


    }


    fun zeroFun(v: View){
        if(perbool==true and divbool==true and mulbool==true and minbool==true and plusbool==true){
            res.setText("0")
            resString = res.text.toString()
            result2 = resString.toDouble()
        }

        else {
            res.append("0")
        }


    }


}