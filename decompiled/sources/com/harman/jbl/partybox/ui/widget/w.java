package com.harman.jbl.partybox.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final a f46160a = new a(null);

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        public final void a(@l3.d View view) {
            F.p(view, "view");
            try {
                view.performHapticFeedback(1, 2);
            } catch (NullPointerException e4) {
                T1.a.a(" Exception in performHapticFeedback(). Ignore it");
                e4.printStackTrace();
            }
        }

        public final float b(@l3.e Context context, float f4) {
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
        f46160a.a(view);
    }
}
