package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.view.KeyEvent
import android.view.MotionEvent
import android.widget.CompoundButton
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.checkbox.setOnCheckedChangeListener(object :
            CompoundButton.OnCheckedChangeListener {
            override fun onCheckedChanged(p0: CompoundButton?, p1: Boolean) {
                Log.d("kkang", "체크박스 클릭")
            }
            })

        binding.button.setOnClickListener {
            Log.d("kkang", "클릭 이벤트")
        }
        binding.button.setOnLongClickListener {
            Log.d("kkang", "롱클릭 이벤트")
            true
        }

    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        when (event?.action){
            MotionEvent.ACTION_DOWN->{
                Log.d("kkang", "Touch down event")
            }
            MotionEvent.ACTION_UP->{
                Log.d("kkang", "Touch up event")
            }
        }
        return super.onTouchEvent(event)
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        when(keyCode){
            KeyEvent.KEYCODE_VOLUME_UP->Log.d("kkang", "Back button을 눌렀네요")
            KeyEvent.KEYCODE_VOLUME_DOWN->Log.d("kkang", "Volume up button을 눌렀네요")
            KeyEvent.KEYCODE_BACK->Log.d("kkang", "Volume down button을 눌렀네요")
        }
        return super.onKeyDown(keyCode, event)
    }



}