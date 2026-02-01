package com.google.android.gms.tagmanager;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* loaded from: classes2.dex */
final class zzfx {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zza(String str) throws UnsupportedEncodingException {
        return URLEncoder.encode(str, "UTF-8").replaceAll("\\+", "%20");
    }
}
