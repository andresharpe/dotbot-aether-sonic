package com.harman.jbl.partybox.utils;

import android.view.View;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class r {
    public final void a(@l3.d View view) {
        F.p(view, "view");
        try {
            view.performHapticFeedback(1, 2);
        } catch (Exception e4) {
            T1.a.a(" Exception in performHapticFeedback(). Ignore it");
            e4.printStackTrace();
        }
    }
}
