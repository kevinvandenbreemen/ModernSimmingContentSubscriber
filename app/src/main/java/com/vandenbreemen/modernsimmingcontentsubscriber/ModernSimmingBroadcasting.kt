package com.vandenbreemen.modernsimmingcontentsubscriber

/**
 * Specialist for handling broadcasts to and from the client
 */
class ModernSimmingBroadcasting {

    companion object {
        const val NEW_POST_IN_GROUP = "NewPostInGroup"
        const val PARAM_GROUP_NAME = "groupName"
        const val PARAM_TTS_CURRENT_POSITION = "position"
        const val PARAM_TTS_TOTAL_STRINGS_TO_SPEAK = "totalStringsToSpeak"
        const val TTS_SEEK_TO = "TTSSeekTo"
        const val TTS_STOP = "TTSStop"
    }

}