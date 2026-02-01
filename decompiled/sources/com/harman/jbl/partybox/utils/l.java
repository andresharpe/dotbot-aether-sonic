package com.harman.jbl.partybox.utils;

import android.content.Context;
import com.harman.sdk.device.HmDevice;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;

/* loaded from: classes2.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private static final String f46191a = "l";

    public static String a(HmDevice hmDevice) {
        if (hmDevice == null) {
            return "";
        }
        return hmDevice.w();
    }

    public static String b(Context context, String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            InputStream open = context.getAssets().open(str);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = open.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            byteArrayOutputStream.close();
            open.close();
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        return byteArrayOutputStream.toString();
    }

    public static String c(Context context, String str) {
        try {
            FileInputStream openFileInput = context.openFileInput(str);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = openFileInput.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    return byteArrayOutputStream.toString();
                }
            }
        } catch (Exception e4) {
            e4.printStackTrace();
            return "";
        }
    }

    public static String d(HmDevice hmDevice) {
        if (hmDevice == null) {
            return "";
        }
        return com.harman.sdk.utils.d.v(hmDevice.q());
    }

    public static boolean e(Context context) {
        String g4 = com.harman.jbl.partybox.persistence.b.g("SELECTED_LANGUAGE", context.getResources().getConfiguration().locale.getLanguage());
        if (!g4.equals("zh") && !g4.equals("zh-rCN") && !g4.equals("zh-rTW")) {
            return false;
        }
        return true;
    }
}
