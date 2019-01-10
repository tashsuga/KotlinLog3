package com.onespan.takeshisugai.kotlinlog3

import android.util.Log
//import android.util.Log.*

//import com.onespan.takeshisugai.Animal.Animal

open class Human: Animal,Thinkable   {

    private var hobby = "哲学"
    // hobby = "哲学";

    // superで親クラスのコンストラクタを呼ぶ
    constructor(name: String, age: Int) : super(name, age) {
    }

    override fun say() {
        super.say()
        Log.d("kotlintest", "私の名前は" + this.name + "です。")
        Log.d("kotlintest", "私の歳は" + this.age + "です。")
        // Log.d("kotlintest", "私の名前は〜〜です。年は〜〜歳です。")

        // 「私の名前は〜〜です。年は〜〜歳です。」
    }

    override fun think() {
        super.say()
        Log.d("kotlintest", "私は" + hobby + "について考える。")
    }


}