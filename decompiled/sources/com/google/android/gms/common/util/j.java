package com.google.android.gms.common.util;

import android.database.CharArrayBuffer;
import android.graphics.Bitmap;
import android.text.TextUtils;
import androidx.annotation.N;
import androidx.annotation.P;
import java.io.ByteArrayOutputStream;

@I0.a
/* loaded from: classes.dex */
public final class j {
    @I0.a
    public static void a(@P String str, @N CharArrayBuffer charArrayBuffer) {
        if (TextUtils.isEmpty(str)) {
            charArrayBuffer.sizeCopied = 0;
            return;
        }
        char[] cArr = charArrayBuffer.data;
        if (cArr != null && cArr.length >= str.length()) {
            str.getChars(0, str.length(), charArrayBuffer.data, 0);
        } else {
            charArrayBuffer.data = str.toCharArray();
        }
        charArrayBuffer.sizeCopied = str.length();
    }

    @I0.a
    @N
    public static byte[] b(@N Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
