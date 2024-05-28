package com.airbnb.lottie.issues

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.lottie.issues.databinding.IssueReproActivityBinding

class IssueReproActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = IssueReproActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // Reproduce any issues here.

        binding.animationView.addLottieOnCompositionLoadedListener {
            Log.i("IssueReproActivity", "Lottie composition loaded")
            binding.animationView.playAnimation()
        }

        binding.cancelButton.setOnClickListener {
            binding.animationView.cancelAnimation()
        }

        binding.loadButton.setOnClickListener {
            binding.animationView.setAnimation(R.raw.heart)
        }
    }
}
