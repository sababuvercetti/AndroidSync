package com.vercetti.allyandroidsync

import android.app.Service
import android.content.Intent
import android.os.IBinder


class AuthenticatorService : Service() {

    private var authenticator: AccountAuthenticator? = null

    override fun onCreate() {
        authenticator = AccountAuthenticator(this)
    }

    override fun onBind(intent: Intent?): IBinder? {
        return authenticator!!.iBinder
    }
}
