package androidx.preference;

import android.R;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.preference.q;

/* loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(@N Context context, @P AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
    }

    @Override // androidx.preference.Preference
    public boolean Q() {
        return false;
    }

    @Override // androidx.preference.Preference
    public void d0(@N p pVar) {
        super.d0(pVar);
        if (Build.VERSION.SDK_INT >= 28) {
            pVar.f17770a.setAccessibilityHeading(true);
        }
    }

    @Override // androidx.preference.Preference
    public boolean g1() {
        return !super.Q();
    }

    public PreferenceCategory(@N Context context, @P AttributeSet attributeSet, int i4) {
        this(context, attributeSet, i4, 0);
    }

    public PreferenceCategory(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, androidx.core.content.res.n.a(context, q.a.f16979I, R.attr.preferenceCategoryStyle));
    }

    public PreferenceCategory(@N Context context) {
        this(context, null);
    }
}
