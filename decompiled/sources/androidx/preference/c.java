package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.N;
import androidx.preference.q;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class c extends Preference {

    /* renamed from: x0, reason: collision with root package name */
    private long f16856x0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(@N Context context, List<Preference> list, long j4) {
        super(context);
        m1();
        n1(list);
        this.f16856x0 = j4 + 1000000;
    }

    private void m1() {
        O0(q.h.f17055a);
        J0(q.e.f17042a);
        b1(q.i.f17074b);
        S0(999);
    }

    private void n1(List<Preference> list) {
        ArrayList arrayList = new ArrayList();
        CharSequence charSequence = null;
        for (Preference preference : list) {
            CharSequence M3 = preference.M();
            boolean z3 = preference instanceof PreferenceGroup;
            if (z3 && !TextUtils.isEmpty(M3)) {
                arrayList.add((PreferenceGroup) preference);
            }
            if (arrayList.contains(preference.z())) {
                if (z3) {
                    arrayList.add((PreferenceGroup) preference);
                }
            } else if (!TextUtils.isEmpty(M3)) {
                if (charSequence == null) {
                    charSequence = M3;
                } else {
                    charSequence = m().getString(q.i.f17077e, charSequence, M3);
                }
            }
        }
        Z0(charSequence);
    }

    @Override // androidx.preference.Preference
    public void d0(@N p pVar) {
        super.d0(pVar);
        pVar.W(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.preference.Preference
    public long s() {
        return this.f16856x0;
    }
}
