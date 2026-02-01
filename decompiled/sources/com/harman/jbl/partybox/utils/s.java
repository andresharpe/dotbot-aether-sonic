package com.harman.jbl.partybox.utils;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C0838o0;
import java.util.Iterator;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;

@U({"SMAP\nViewUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewUtils.kt\ncom/harman/jbl/partybox/utils/ViewUtilsKt\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,35:1\n1313#2,2:36\n*S KotlinDebug\n*F\n+ 1 ViewUtils.kt\ncom/harman/jbl/partybox/utils/ViewUtilsKt\n*L\n30#1:36,2\n*E\n"})
/* loaded from: classes2.dex */
public final class s {
    public static final void a(@l3.d View view, boolean z3) {
        F.p(view, "view");
        if (view.hasOnClickListeners()) {
            view.setClickable(z3);
        }
        if (view instanceof ViewGroup) {
            Iterator<View> it = C0838o0.e((ViewGroup) view).iterator();
            while (it.hasNext()) {
                a(it.next(), z3);
            }
        }
    }
}
