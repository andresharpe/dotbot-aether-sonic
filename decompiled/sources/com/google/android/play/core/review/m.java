package com.google.android.play.core.review;

import android.os.Bundle;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private static final Set f34462a = new HashSet(Arrays.asList("native", "unity"));

    /* renamed from: b, reason: collision with root package name */
    private static final Map f34463b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.android.play.core.review.internal.i f34464c = new com.google.android.play.core.review.internal.i("PlayCoreVersion");

    public static Bundle a() {
        Bundle bundle = new Bundle();
        Map b4 = b();
        bundle.putInt("playcore_version_code", ((Integer) b4.get("java")).intValue());
        if (b4.containsKey("native")) {
            bundle.putInt("playcore_native_version", ((Integer) b4.get("native")).intValue());
        }
        if (b4.containsKey("unity")) {
            bundle.putInt("playcore_unity_version", ((Integer) b4.get("unity")).intValue());
        }
        return bundle;
    }

    public static synchronized Map b() {
        Map map;
        synchronized (m.class) {
            map = f34463b;
            map.put("java", 11004);
        }
        return map;
    }
}
