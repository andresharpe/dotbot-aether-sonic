package com.harman.jbl.partybox.utils;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.N;
import androidx.annotation.P;
import com.harman.sdk.device.HmDevice;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private static final String f46179a = "i";

    /* renamed from: b, reason: collision with root package name */
    private static final String f46180b = "preset_eq_on_the_go2.json";

    /* renamed from: c, reason: collision with root package name */
    private static final String f46181c = "preset_eq_720.json";

    /* renamed from: d, reason: collision with root package name */
    private static final String f46182d = "preset_eq_520.json";

    /* renamed from: e, reason: collision with root package name */
    private static final String f46183e = "preset_eq_320.json";

    /* renamed from: f, reason: collision with root package name */
    private static final String f46184f = "preset_eq_120.json";

    /* renamed from: g, reason: collision with root package name */
    private static final String f46185g = "preset_eq_encore2.json";

    /* renamed from: h, reason: collision with root package name */
    private static final String f46186h = "preset_eq_encore_essential2.json";

    /* renamed from: i, reason: collision with root package name */
    private static final Map<String, List<com.harman.jbl.partybox.model.d>> f46187i = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    private static final Map<String, ArrayList<com.harman.jbl.partybox.model.a>> f46188j = new HashMap();

    @P
    public static List<com.harman.jbl.partybox.model.d> a(@N HmDevice hmDevice) {
        return f46187i.get(hmDevice.q());
    }

    @l3.d
    public static String b(@N HmDevice hmDevice) {
        return com.harman.sdk.utils.d.q(hmDevice.q());
    }

    public static ArrayList<com.harman.jbl.partybox.model.a> c(@N HmDevice hmDevice) {
        return f46188j.get(hmDevice.q());
    }

    @P
    public static String d(@N Context context, @N HmDevice hmDevice) {
        String e4 = s3.c.f57654a.e(context, context.getPackageName() + "_3.12.20" + b(hmDevice), "");
        if (TextUtils.isEmpty(e4)) {
            return null;
        }
        return e4;
    }

    public static void e(@N HmDevice hmDevice, @N List<com.harman.jbl.partybox.model.d> list) {
        f46187i.put(hmDevice.q(), list);
    }

    public static void f(@N Context context, @N HmDevice hmDevice, @N ArrayList<com.harman.jbl.partybox.model.a> arrayList) {
        f46188j.put(hmDevice.q(), arrayList);
        g(context, hmDevice, arrayList);
    }

    private static void g(@N Context context, @N HmDevice hmDevice, @N ArrayList<com.harman.jbl.partybox.model.a> arrayList) {
        try {
            s3.c.f57654a.i(context, context.getPackageName() + "_3.12.20" + b(hmDevice), com.harman.sdk.utils.h.a().toJson(arrayList));
        } catch (Throwable unused) {
            com.harman.log.f.b(f46179a, "write preset eq error");
        }
    }
}
