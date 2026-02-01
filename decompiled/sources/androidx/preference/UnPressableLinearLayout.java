package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class UnPressableLinearLayout extends LinearLayout {
    public UnPressableLinearLayout(@N Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSetPressed(boolean z3) {
    }

    public UnPressableLinearLayout(@N Context context, @P AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
