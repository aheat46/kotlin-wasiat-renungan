package wasiat.wasiatnahdlatulwathan.activity

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import wasiat.wasiatnahdlatulwathan.R

/**
 * Created by aheat on 7/28/18.
 */
class SpalshScreen: AppCompatActivity() {

    private val SPLASH_TIME_OUT = 3000;



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)

        Handler().postDelayed({

            val intent = Intent(this@SpalshScreen, MainActivity::class.java)
            startActivity(intent)
            finish()

        }, SPLASH_TIME_OUT.toLong())
    }

}