package androidx.appcompat.app;

import android.os.LocaleList;
import androidx.annotation.W;
import androidx.core.os.C0750m;
import java.util.LinkedHashSet;
import java.util.Locale;

@W(24)
/* loaded from: classes.dex */
final class y {
    private y() {
    }

    private static C0750m a(C0750m c0750m, C0750m c0750m2) {
        Locale d4;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (int i4 = 0; i4 < c0750m.l() + c0750m2.l(); i4++) {
            if (i4 < c0750m.l()) {
                d4 = c0750m.d(i4);
            } else {
                d4 = c0750m2.d(i4 - c0750m.l());
            }
            if (d4 != null) {
                linkedHashSet.add(d4);
            }
        }
        return C0750m.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
    }

    static C0750m b(LocaleList localeList, LocaleList localeList2) {
        if (localeList != null && !localeList.isEmpty()) {
            return a(C0750m.o(localeList), C0750m.o(localeList2));
        }
        return C0750m.g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C0750m c(C0750m c0750m, C0750m c0750m2) {
        if (c0750m != null && !c0750m.j()) {
            return a(c0750m, c0750m2);
        }
        return C0750m.g();
    }
}
