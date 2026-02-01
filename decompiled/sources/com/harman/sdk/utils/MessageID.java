package com.harman.sdk.utils;

import androidx.core.view.C0805e0;
import androidx.core.view.D;
import com.google.android.gms.location.C1576l;
import kotlin.E;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@E(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b[\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\ba¨\u0006b"}, d2 = {"Lcom/harman/sdk/utils/MessageID;", "", "", "value", "I", "g", "()I", "", "cmdName", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "UNKNOWN", "TIMEOUT_STATUS", "DEVICE_LIST_INFO", "DEVICE_NAME", "ANC_STATUS", "AUTO_PAUSE", "AUTO_POWER_OFF", "MULTI_AI_STATUS", "A2DP_STATUS", "FIND_ME_STATUS", "TWS_STATUS", "SEALING_STATUS", "GESTURE_STATUS", "SYNC_CRC_STATUS", "DEVICE_INFO", "BATTERY_STATUS", "IN_EAR_STATUS", "SMART_SWITCH_STATUS", "AUDIO_CHANNEL_STATUS", "FIRMWARE_STATUS", "REQUEST_SET_CHANNEL", "RET_LED_PATTERN_INFO", "LED_NOTIFY_PATTERN", "LED_INTENSITY_LEVEL", "LED_COLOR_SNIFFER", "NOTIFY_LED_PATTERN_CUSTOM", "DEVICE_FEATURE_INFO", "ANALYTICS_INFO_DATA", "ANALYTICS_INFO_DEVICE_DATA", "ANALYTICS_INFO_PLAY_DATA", "MFB_STATUS", "HFP_STATUS", "FEEDBACK_TONE_STATUS", "EQ_MODE_STATUS", "BASS_VOLUME_STATUS", "BRIGHTNESS_STATUS", "LINK_MODE_STATUS", "LIGHT_STATUS", "RET_ROLE_INFO", "KARAOKE_STATUS", "PLAYER_INFO", "DJ_STATUS", "LIGHT_SHOW_BUTTON_STATUS", "LIGHT_ACTIVE_PATTERN_STATUS", "PHONE_MAC_ADDRESS_STATUS", "RET_PHONE_MAC_ADDRESS_STATUS", "BASS_BOOST_STATUS", "SECONDARY_MAC_STATUS", "UPDATE_CANCEL_STATUS", "RET_ADVANCED_EQ_STATUS", "AURACAST_STATUS", "STEREO_FLOW", "STEREO_GROUP_NAME", "IDENTIFY_DEVICE", "RET_MIC_CONNECTION_INFO", "SYNC_ON_OFF", "RET_ONE_TOUCH_MUSIC_BUTTON_STATUS", "RET_ONE_TOUCH_MUSIC_TRIGGERED", "RET_EFFECT_LAB", "RET_LE_AUDIO", "RET_OPTION_MIC_OTA_RESULT", "RET_MIC_OTA_RESULT", "RET_SQ_RESULT", "RET_VOLUME_BOOST_RESULT", "RET_LOCK_PANEL_RESULT", "RET_SET_LIGHT_RESULT", "RET_SET_TONE_SHIFTER_RESULT", "RET_POWER_ON_RESULT", "RET_VOCAL_REMOVAL_STATUS", "RET_VOCAL_REMOVAL_VALUE", "RET_ESAYSING_MIC_INFO", "OTA_STATUS", "EQ_STATUS", "RUNNING_EQ_STATUS", "COMBINED_EQ_STATUS", "DFU_INFO", "DFU_STATUS_CHANGED", "DFU_ACK", "APPLY_DFU_ACK", "PARTY_STAGE_ACK", "ASSIGN_SPEAKER_ACK", "SET_STAGE_NUM_ACK", "SET_LIGHT_INFO_ACK", "ORIG_COMMAND", "0_fundermental_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class MessageID {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ MessageID[] $VALUES;

    @l3.d
    private final String cmdName;
    private final int value;
    public static final MessageID UNKNOWN = new MessageID("UNKNOWN", 0, -1, "UnknownCommand");
    public static final MessageID TIMEOUT_STATUS = new MessageID("TIMEOUT_STATUS", 1, 999, "TIMEOUT_STATUS");
    public static final MessageID DEVICE_LIST_INFO = new MessageID("DEVICE_LIST_INFO", 2, 1001, "DEVICE_LIST_INFO");
    public static final MessageID DEVICE_NAME = new MessageID("DEVICE_NAME", 3, 1002, "DEVICE_NAME");
    public static final MessageID ANC_STATUS = new MessageID("ANC_STATUS", 4, C0805e0.f13470f, "ANC_STATUS");
    public static final MessageID AUTO_PAUSE = new MessageID("AUTO_PAUSE", 5, 1004, "AUTO_PAUSE");
    public static final MessageID AUTO_POWER_OFF = new MessageID("AUTO_POWER_OFF", 6, C1576l.f30029x, "AUTO_POWER_OFF");
    public static final MessageID MULTI_AI_STATUS = new MessageID("MULTI_AI_STATUS", 7, C0805e0.f13472h, "MULTI_AI_STATUS");
    public static final MessageID A2DP_STATUS = new MessageID("A2DP_STATUS", 8, C0805e0.f13473i, "A2DP_STATUS");
    public static final MessageID FIND_ME_STATUS = new MessageID("FIND_ME_STATUS", 9, C0805e0.f13474j, "FIND_ME_STATUS");
    public static final MessageID TWS_STATUS = new MessageID("TWS_STATUS", 10, C0805e0.f13475k, "TWS_STATUS");
    public static final MessageID SEALING_STATUS = new MessageID("SEALING_STATUS", 11, C0805e0.f13476l, "SEALING_STATUS");
    public static final MessageID GESTURE_STATUS = new MessageID("GESTURE_STATUS", 12, C0805e0.f13477m, "GESTURE_STATUS");
    public static final MessageID SYNC_CRC_STATUS = new MessageID("SYNC_CRC_STATUS", 13, C0805e0.f13478n, "SYNC_CRC_STATUS");
    public static final MessageID DEVICE_INFO = new MessageID("DEVICE_INFO", 14, C0805e0.f13479o, "DEVICE_INFO");
    public static final MessageID BATTERY_STATUS = new MessageID("BATTERY_STATUS", 15, C0805e0.f13480p, "BATTERY_STATUS");
    public static final MessageID IN_EAR_STATUS = new MessageID("IN_EAR_STATUS", 16, C0805e0.f13481q, "IN_EAR_STATUS");
    public static final MessageID SMART_SWITCH_STATUS = new MessageID("SMART_SWITCH_STATUS", 17, C0805e0.f13482r, "SMART_SWITCH_STATUS");
    public static final MessageID AUDIO_CHANNEL_STATUS = new MessageID("AUDIO_CHANNEL_STATUS", 18, C0805e0.f13483s, "AUDIO_CHANNEL_STATUS");
    public static final MessageID FIRMWARE_STATUS = new MessageID("FIRMWARE_STATUS", 19, C0805e0.f13484t, "FIRMWARE_STATUS");
    public static final MessageID REQUEST_SET_CHANNEL = new MessageID("REQUEST_SET_CHANNEL", 20, C0805e0.f13485u, "REQUEST_SET_CHANNEL");
    public static final MessageID RET_LED_PATTERN_INFO = new MessageID("RET_LED_PATTERN_INFO", 21, C0805e0.f13486v, "RET_LED_PATTERN_INFO");
    public static final MessageID LED_NOTIFY_PATTERN = new MessageID("LED_NOTIFY_PATTERN", 22, C0805e0.f13487w, "LED_NOTIFY_PATTERN");
    public static final MessageID LED_INTENSITY_LEVEL = new MessageID("LED_INTENSITY_LEVEL", 23, 1022, "LED_INTENSITY_LEVEL");
    public static final MessageID LED_COLOR_SNIFFER = new MessageID("LED_COLOR_SNIFFER", 24, 1023, "LED_COLOR_SNIFFER");
    public static final MessageID NOTIFY_LED_PATTERN_CUSTOM = new MessageID("NOTIFY_LED_PATTERN_CUSTOM", 25, 1024, "NOTIFY_LED_PATTERN_CUSTOM");
    public static final MessageID DEVICE_FEATURE_INFO = new MessageID("DEVICE_FEATURE_INFO", 26, D.f13114k, "DEVICE_FEATURE_INFO");
    public static final MessageID ANALYTICS_INFO_DATA = new MessageID("ANALYTICS_INFO_DATA", 27, 1033, "ANALYTICS_INFO_DATA");
    public static final MessageID ANALYTICS_INFO_DEVICE_DATA = new MessageID("ANALYTICS_INFO_DEVICE_DATA", 28, 1034, "ANALYTICS_INFO_DEVICE_DATA");
    public static final MessageID ANALYTICS_INFO_PLAY_DATA = new MessageID("ANALYTICS_INFO_PLAY_DATA", 29, 1035, "ANALYTICS_INFO_PLAY_DATA");
    public static final MessageID MFB_STATUS = new MessageID("MFB_STATUS", 30, 1501, "MFB_STATUS");
    public static final MessageID HFP_STATUS = new MessageID("HFP_STATUS", 31, 1502, "HFP_STATUS");
    public static final MessageID FEEDBACK_TONE_STATUS = new MessageID("FEEDBACK_TONE_STATUS", 32, 1503, "FEEDBACK_TONE_STATUS");
    public static final MessageID EQ_MODE_STATUS = new MessageID("EQ_MODE_STATUS", 33, 1504, "EQ_MODE_STATUS");
    public static final MessageID BASS_VOLUME_STATUS = new MessageID("BASS_VOLUME_STATUS", 34, 1505, "BASS_VOLUME_STATUS");
    public static final MessageID BRIGHTNESS_STATUS = new MessageID("BRIGHTNESS_STATUS", 35, 1506, "BRIGHTNESS_STATUS");
    public static final MessageID LINK_MODE_STATUS = new MessageID("LINK_MODE_STATUS", 36, 1507, "LINK_MODE_STATUS");
    public static final MessageID LIGHT_STATUS = new MessageID("LIGHT_STATUS", 37, 1508, "LIGHT_STATUS");
    public static final MessageID RET_ROLE_INFO = new MessageID("RET_ROLE_INFO", 38, 1509, "RET_ROLE_INFO");
    public static final MessageID KARAOKE_STATUS = new MessageID("KARAOKE_STATUS", 39, 1510, "KARAOKE_STATUS");
    public static final MessageID PLAYER_INFO = new MessageID("PLAYER_INFO", 40, 1511, "PLAYER_INFO");
    public static final MessageID DJ_STATUS = new MessageID("DJ_STATUS", 41, 1512, "DJ_STATUS");
    public static final MessageID LIGHT_SHOW_BUTTON_STATUS = new MessageID("LIGHT_SHOW_BUTTON_STATUS", 42, 1513, "LIGHT_SHOW_BUTTON_STATUS");
    public static final MessageID LIGHT_ACTIVE_PATTERN_STATUS = new MessageID("LIGHT_ACTIVE_PATTERN_STATUS", 43, 1514, "LIGHT_ACTIVE_PATTERN_STATUS");
    public static final MessageID PHONE_MAC_ADDRESS_STATUS = new MessageID("PHONE_MAC_ADDRESS_STATUS", 44, 1515, "PHONE_MAC_ADDRESS_STATUS");
    public static final MessageID RET_PHONE_MAC_ADDRESS_STATUS = new MessageID("RET_PHONE_MAC_ADDRESS_STATUS", 45, 1516, "RET_PHONE_MAC_ADDRESS_STATUS");
    public static final MessageID BASS_BOOST_STATUS = new MessageID("BASS_BOOST_STATUS", 46, 1517, "BASS_BOOST_STATUS");
    public static final MessageID SECONDARY_MAC_STATUS = new MessageID("SECONDARY_MAC_STATUS", 47, 1518, "SECONDARY_MAC_STATUS");
    public static final MessageID UPDATE_CANCEL_STATUS = new MessageID("UPDATE_CANCEL_STATUS", 48, 1519, "UPDATE_CANCEL_STATUS");
    public static final MessageID RET_ADVANCED_EQ_STATUS = new MessageID("RET_ADVANCED_EQ_STATUS", 49, 1521, "RET_ADVANCED_EQ_STATUS");
    public static final MessageID AURACAST_STATUS = new MessageID("AURACAST_STATUS", 50, 1522, "AURACAST_STATUS");
    public static final MessageID STEREO_FLOW = new MessageID("STEREO_FLOW", 51, 1523, "STEREO_FLOW");
    public static final MessageID STEREO_GROUP_NAME = new MessageID("STEREO_GROUP_NAME", 52, 1524, "STEREO_GROUP_NAME");
    public static final MessageID IDENTIFY_DEVICE = new MessageID("IDENTIFY_DEVICE", 53, 1525, "IDENTIFY_DEVICE");
    public static final MessageID RET_MIC_CONNECTION_INFO = new MessageID("RET_MIC_CONNECTION_INFO", 54, 1526, "RET_MIC_CONNECTION_INFO");
    public static final MessageID SYNC_ON_OFF = new MessageID("SYNC_ON_OFF", 55, 1527, "SYNC_ON_OFF");
    public static final MessageID RET_ONE_TOUCH_MUSIC_BUTTON_STATUS = new MessageID("RET_ONE_TOUCH_MUSIC_BUTTON_STATUS", 56, 1528, "RET_ONE_TOUCH_MUSIC_BUTTON_STATUS");
    public static final MessageID RET_ONE_TOUCH_MUSIC_TRIGGERED = new MessageID("RET_ONE_TOUCH_MUSIC_TRIGGERED", 57, 1529, "RET_ONE_TOUCH_MUSIC_TRIGGERED");
    public static final MessageID RET_EFFECT_LAB = new MessageID("RET_EFFECT_LAB", 58, 1530, "RET_EFFECT_LAB");
    public static final MessageID RET_LE_AUDIO = new MessageID("RET_LE_AUDIO", 59, 1531, "RET_LE_AUDIO");
    public static final MessageID RET_OPTION_MIC_OTA_RESULT = new MessageID("RET_OPTION_MIC_OTA_RESULT", 60, 1532, "RET_Option_Mic_OTA_Result");
    public static final MessageID RET_MIC_OTA_RESULT = new MessageID("RET_MIC_OTA_RESULT", 61, 1533, "RET_Mic_OTA_Result");
    public static final MessageID RET_SQ_RESULT = new MessageID("RET_SQ_RESULT", 62, 1534, "RET_SQ_Result");
    public static final MessageID RET_VOLUME_BOOST_RESULT = new MessageID("RET_VOLUME_BOOST_RESULT", 63, 1535, "RET_VOLUME_BOOST_RESULT");
    public static final MessageID RET_LOCK_PANEL_RESULT = new MessageID("RET_LOCK_PANEL_RESULT", 64, 1536, "RET_LOCK_PANEL_RESULT");
    public static final MessageID RET_SET_LIGHT_RESULT = new MessageID("RET_SET_LIGHT_RESULT", 65, 1537, "RET_SET_LIGHT_RESULT");
    public static final MessageID RET_SET_TONE_SHIFTER_RESULT = new MessageID("RET_SET_TONE_SHIFTER_RESULT", 66, 1538, "RET_SET_TONE_SHIFTER_RESULT");
    public static final MessageID RET_POWER_ON_RESULT = new MessageID("RET_POWER_ON_RESULT", 67, 1539, "RET_POWER_ON_RESULT");
    public static final MessageID RET_VOCAL_REMOVAL_STATUS = new MessageID("RET_VOCAL_REMOVAL_STATUS", 68, 1540, "RET_VOCAL_REMOVAL_STATUS");
    public static final MessageID RET_VOCAL_REMOVAL_VALUE = new MessageID("RET_VOCAL_REMOVAL_VALUE", 69, 1541, "RET_VOCAL_REMOVAL_VALUE");
    public static final MessageID RET_ESAYSING_MIC_INFO = new MessageID("RET_ESAYSING_MIC_INFO", 70, 1542, "RET_ESAYSING_MIC_INFO");
    public static final MessageID OTA_STATUS = new MessageID("OTA_STATUS", 71, 2001, "OTA_STATUS");
    public static final MessageID EQ_STATUS = new MessageID("EQ_STATUS", 72, 3001, "EQ_STATUS");
    public static final MessageID RUNNING_EQ_STATUS = new MessageID("RUNNING_EQ_STATUS", 73, 3002, "RUNNING_EQ_STATUS");
    public static final MessageID COMBINED_EQ_STATUS = new MessageID("COMBINED_EQ_STATUS", 74, 3003, "COMBINED_EQ_STATUS");
    public static final MessageID DFU_INFO = new MessageID("DFU_INFO", 75, 4000, "DFU_INFO");
    public static final MessageID DFU_STATUS_CHANGED = new MessageID("DFU_STATUS_CHANGED", 76, 4001, "DFU_STATUS_CHANGED");
    public static final MessageID DFU_ACK = new MessageID("DFU_ACK", 77, 4002, "DFU_ACK");
    public static final MessageID APPLY_DFU_ACK = new MessageID("APPLY_DFU_ACK", 78, 4003, "APPLY_DFU_ACK");
    public static final MessageID PARTY_STAGE_ACK = new MessageID("PARTY_STAGE_ACK", 79, 4004, "PARTY_STAGE_ACK");
    public static final MessageID ASSIGN_SPEAKER_ACK = new MessageID("ASSIGN_SPEAKER_ACK", 80, 4005, "ASSIGN_SPEAKER_ACK");
    public static final MessageID SET_STAGE_NUM_ACK = new MessageID("SET_STAGE_NUM_ACK", 81, 4006, "ASSIGN_SPEAKER_ACKSET_STAGE_NUM_ACK");
    public static final MessageID SET_LIGHT_INFO_ACK = new MessageID("SET_LIGHT_INFO_ACK", 82, 4007, "ASSIGN_SPEAKER_ACKSET_LIGHT_INFO_ACK");
    public static final MessageID ORIG_COMMAND = new MessageID("ORIG_COMMAND", 83, 4008, "ORIG_COMMAND");

    static {
        MessageID[] b4 = b();
        $VALUES = b4;
        $ENTRIES = kotlin.enums.c.c(b4);
    }

    private MessageID(String str, int i4, int i5, String str2) {
        this.value = i5;
        this.cmdName = str2;
    }

    private static final /* synthetic */ MessageID[] b() {
        return new MessageID[]{UNKNOWN, TIMEOUT_STATUS, DEVICE_LIST_INFO, DEVICE_NAME, ANC_STATUS, AUTO_PAUSE, AUTO_POWER_OFF, MULTI_AI_STATUS, A2DP_STATUS, FIND_ME_STATUS, TWS_STATUS, SEALING_STATUS, GESTURE_STATUS, SYNC_CRC_STATUS, DEVICE_INFO, BATTERY_STATUS, IN_EAR_STATUS, SMART_SWITCH_STATUS, AUDIO_CHANNEL_STATUS, FIRMWARE_STATUS, REQUEST_SET_CHANNEL, RET_LED_PATTERN_INFO, LED_NOTIFY_PATTERN, LED_INTENSITY_LEVEL, LED_COLOR_SNIFFER, NOTIFY_LED_PATTERN_CUSTOM, DEVICE_FEATURE_INFO, ANALYTICS_INFO_DATA, ANALYTICS_INFO_DEVICE_DATA, ANALYTICS_INFO_PLAY_DATA, MFB_STATUS, HFP_STATUS, FEEDBACK_TONE_STATUS, EQ_MODE_STATUS, BASS_VOLUME_STATUS, BRIGHTNESS_STATUS, LINK_MODE_STATUS, LIGHT_STATUS, RET_ROLE_INFO, KARAOKE_STATUS, PLAYER_INFO, DJ_STATUS, LIGHT_SHOW_BUTTON_STATUS, LIGHT_ACTIVE_PATTERN_STATUS, PHONE_MAC_ADDRESS_STATUS, RET_PHONE_MAC_ADDRESS_STATUS, BASS_BOOST_STATUS, SECONDARY_MAC_STATUS, UPDATE_CANCEL_STATUS, RET_ADVANCED_EQ_STATUS, AURACAST_STATUS, STEREO_FLOW, STEREO_GROUP_NAME, IDENTIFY_DEVICE, RET_MIC_CONNECTION_INFO, SYNC_ON_OFF, RET_ONE_TOUCH_MUSIC_BUTTON_STATUS, RET_ONE_TOUCH_MUSIC_TRIGGERED, RET_EFFECT_LAB, RET_LE_AUDIO, RET_OPTION_MIC_OTA_RESULT, RET_MIC_OTA_RESULT, RET_SQ_RESULT, RET_VOLUME_BOOST_RESULT, RET_LOCK_PANEL_RESULT, RET_SET_LIGHT_RESULT, RET_SET_TONE_SHIFTER_RESULT, RET_POWER_ON_RESULT, RET_VOCAL_REMOVAL_STATUS, RET_VOCAL_REMOVAL_VALUE, RET_ESAYSING_MIC_INFO, OTA_STATUS, EQ_STATUS, RUNNING_EQ_STATUS, COMBINED_EQ_STATUS, DFU_INFO, DFU_STATUS_CHANGED, DFU_ACK, APPLY_DFU_ACK, PARTY_STAGE_ACK, ASSIGN_SPEAKER_ACK, SET_STAGE_NUM_ACK, SET_LIGHT_INFO_ACK, ORIG_COMMAND};
    }

    @l3.d
    public static kotlin.enums.a<MessageID> f() {
        return $ENTRIES;
    }

    public static MessageID valueOf(String str) {
        return (MessageID) Enum.valueOf(MessageID.class, str);
    }

    public static MessageID[] values() {
        return (MessageID[]) $VALUES.clone();
    }

    @l3.d
    public final String e() {
        return this.cmdName;
    }

    public final int g() {
        return this.value;
    }
}
