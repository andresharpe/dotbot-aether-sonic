package androidx.preference;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.preference.n;
import androidx.preference.q;

/* loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {

    /* renamed from: H0, reason: collision with root package name */
    private boolean f16816H0;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PreferenceScreen(@N Context context, @P AttributeSet attributeSet) {
        super(context, attributeSet, androidx.core.content.res.n.a(context, q.a.f16986P, R.attr.preferenceScreenStyle));
        this.f16816H0 = true;
    }

    public void F1(boolean z3) {
        if (!t1()) {
            this.f16816H0 = z3;
            return;
        }
        throw new IllegalStateException("Cannot change the usage of generated IDs while attached to the preference hierarchy");
    }

    public boolean G1() {
        return this.f16816H0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public void e0() {
        n.b j4;
        if (t() == null && q() == null && s1() != 0 && (j4 = H().j()) != null) {
            j4.onNavigateToScreen(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.PreferenceGroup
    public boolean u1() {
        return false;
    }
}
