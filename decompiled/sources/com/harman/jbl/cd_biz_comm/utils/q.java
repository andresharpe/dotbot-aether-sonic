package com.harman.jbl.cd_biz_comm.utils;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final a f37940a = new a(null);

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        public final float a(@l3.e Context context, float f4) {
            DisplayMetrics displayMetrics;
            Resources resources;
            if (context != null && (resources = context.getResources()) != null) {
                displayMetrics = resources.getDisplayMetrics();
            } else {
                displayMetrics = null;
            }
            return TypedValue.applyDimension(1, f4, displayMetrics);
        }

        private a() {
        }
    }

    public final void a(@l3.d View view) {
        F.p(view, "view");
        try {
            view.performHapticFeedback(1, 2);
        } catch (Exception e4) {
            com.harman.jbl.cd_biz_comm.logger.a.a(" Exception in performHapticFeedback(). Ignore it");
            e4.printStackTrace();
        }
    }
}
