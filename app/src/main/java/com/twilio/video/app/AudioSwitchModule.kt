package com.twilio.video.app

import android.app.Application
import com.twilio.audioswitch.AudioSwitch
import dagger.Module
import dagger.Provides

@Module(includes = [ ApplicationModule::class ])
class AudioSwitchModule {

    @Provides
    fun providesAudioDeviceSelector(application: Application): AudioSwitch =
            AudioSwitch(application, loggingEnabled = true)
}
