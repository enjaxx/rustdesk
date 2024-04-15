// ffi.kt

package ffi

import android.content.Context
import java.nio.ByteBuffer

init {
    System.loadLibrary("rustdesk")
}

external fun init(ctx: Context)
external fun startServer(app_dir: String)
external fun startService()
external fun onVideoFrameUpdate(buf: ByteBuffer)
external fun onAudioFrameUpdate(buf: ByteBuffer)
external fun translateLocale(localeName: String, input: String): String
external fun refreshScreen()
external fun setFrameRawEnable(name: String, value: Boolean)