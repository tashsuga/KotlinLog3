
package com.onespan.takeshisugai.kotlinlog3


import android.util.Log

//package com.example.progressthread

//package jp.techacademy.taro.kirameki.kotlinlog

// package jp.techacademy.taro.kirameki.kotlinlog

abstract class Animal {
    // プロパティ
    var name: String
    var age: Int

    // 引数付きコンストラクタ
    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

   //  abstract fun say()

    // メソッド
    open fun say() {
       // Log.d("kotlintest", "「私の名前は" + this.name  + "です")
        // Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "「ワンワン」")
    }


}

