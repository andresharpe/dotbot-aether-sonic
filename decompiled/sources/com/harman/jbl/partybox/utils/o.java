package com.harman.jbl.partybox.utils;

import android.widget.ScrollView;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class o {
    public static final void a(@l3.d ScrollView scrollView) {
        F.p(scrollView, "<this>");
        scrollView.smoothScrollBy(0, (scrollView.getChildAt(scrollView.getChildCount() - 1).getBottom() + scrollView.getPaddingBottom()) - (scrollView.getScrollY() + scrollView.getHeight()));
    }
}
