package com.crybz.telegga

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.crybz.telegga.databinding.ActivityMainBinding
import com.crybz.telegga.ui.fargments.ChatFragment
import com.crybz.telegga.ui.objects.AppDrawer


class MainActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMainBinding
    private lateinit var mAppDrawer: AppDrawer

    private lateinit var mToolBar: androidx.appcompat.widget.Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
    }

    override fun onStart() {
        super.onStart()
        initFields()
        initFunc()
        mAppDrawer.create()
    }

    private fun initFunc() {
        setSupportActionBar(mToolBar)

        supportFragmentManager.beginTransaction()
            .replace(R.id.dataContainer, ChatFragment()).commit()

    }



    private fun initFields() {
        mToolBar = mBinding.mainToolBar
        mAppDrawer = AppDrawer(this,mToolBar)
    }
}