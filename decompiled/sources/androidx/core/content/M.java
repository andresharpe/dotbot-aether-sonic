package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import kotlin.H0;

/* loaded from: classes.dex */
public final class M {
    @SuppressLint({"ApplySharedPref"})
    public static final void a(@l3.d SharedPreferences sharedPreferences, boolean z3, @l3.d X2.l<? super SharedPreferences.Editor, H0> action) {
        kotlin.jvm.internal.F.p(sharedPreferences, "<this>");
        kotlin.jvm.internal.F.p(action, "action");
        SharedPreferences.Editor editor = sharedPreferences.edit();
        kotlin.jvm.internal.F.o(editor, "editor");
        action.C(editor);
        if (z3) {
            editor.commit();
        } else {
            editor.apply();
        }
    }

    public static /* synthetic */ void b(SharedPreferences sharedPreferences, boolean z3, X2.l action, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z3 = false;
        }
        kotlin.jvm.internal.F.p(sharedPreferences, "<this>");
        kotlin.jvm.internal.F.p(action, "action");
        SharedPreferences.Editor editor = sharedPreferences.edit();
        kotlin.jvm.internal.F.o(editor, "editor");
        action.C(editor);
        if (z3) {
            editor.commit();
        } else {
            editor.apply();
        }
    }
}
