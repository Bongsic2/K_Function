package org.techtown.k_function

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 4. 반환값이 있는 함수 square 사용하기

        var squareResult = square(30)
        Log.d("fun", "30의 제곱은 ${squareResult}입니다.")

        // 5. 반환값이 없는 함수는 그냥 실행한다.
        printSum(3, 5)

        // 6. 입력값이 없는 함수 사용하기기
        var PI = getPi()
        Log.d("fun", "지름이 10인 원의 둘레는 ${10 * PI}입니다.")
    }

    // 1. 반환값이 있는 함수
    fun square(x: Int): Int {
        return x * x
    }

    // 2. 반환값이 없는 함수
    fun printSum(x: Int, y: Int) {
        Log.d("fun", "x + y = ${x + y}")
    }

    // 3. 입력값이 없이 반환값만 있는 함수
    fun getPi(): Double {
        return 3.14
    }

    // 7. 기본값을 갖는 함수
    fun newFuntion(name: String, age: Int = 29, weight: Double = 65.5) {
        Log.d("fun", "name의 값은 ${name}입니다.")
        Log.d("fun", "age 값은 ${age}입니다.")
        Log.d("fun", "weight 값은 ${weight}입니다.")
    }
}