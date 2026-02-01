package com.harman.sdk.setting;

import com.harman.sdk.utils.o;
import java.util.HashMap;

/* loaded from: classes2.dex */
public enum Feature {
    NONE,
    LED_SUPPORT,
    MULTI_FUNCTION_BUTTON_SUPPORT,
    IDENTIFY_DEVICE,
    FIRMWARE_UPDATE_SUPPORT,
    RENAME,
    L_R_CHANNEL,
    SCAN_DEVICES,
    BATTERY_STATUS,
    BRIGHTNESS,
    OUTER_IN_DOOR,
    BASS_VOLUME,
    REMOVE_HFP,
    EQ_MODE,
    FEED_BACK_TONE,
    HFP;

    private static HashMap<String, o> urlContainerHashMap = new HashMap<>();

    public static Feature e(String str) {
        str.hashCode();
        char c4 = 65535;
        switch (str.hashCode()) {
            case -2058032407:
                if (str.equals("IDENTIFY_DEVICE")) {
                    c4 = 0;
                    break;
                }
                break;
            case -1881265346:
                if (str.equals("RENAME")) {
                    c4 = 1;
                    break;
                }
                break;
            case -1230258853:
                if (str.equals("LED_SUPPORT")) {
                    c4 = 2;
                    break;
                }
                break;
            case -341426883:
                if (str.equals("FIRMWARE_UPDATE_SUPPORT")) {
                    c4 = 3;
                    break;
                }
                break;
            case 2402104:
                if (str.equals("NONE")) {
                    c4 = 4;
                    break;
                }
                break;
        }
        switch (c4) {
            case 0:
                return IDENTIFY_DEVICE;
            case 1:
                return RENAME;
            case 2:
                return LED_SUPPORT;
            case 3:
                return FIRMWARE_UPDATE_SUPPORT;
            case 4:
                return NONE;
            default:
                return null;
        }
    }

    public static o f(String str) {
        return urlContainerHashMap.get(str);
    }

    public static void g(String str, o oVar) {
        urlContainerHashMap.put(str, oVar);
    }
}
