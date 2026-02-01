package com.harman.jbl.cd_biz_comm.utils;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private static final Handler f37865a = new Handler(Looper.getMainLooper());

    public static final void a(@l3.d Runnable r4) {
        F.p(r4, "r");
        f37865a.post(r4);
    }
}
