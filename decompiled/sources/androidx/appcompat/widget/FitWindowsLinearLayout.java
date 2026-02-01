package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.O;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class FitWindowsLinearLayout extends LinearLayout implements O {

    /* renamed from: E, reason: collision with root package name */
    private O.a f5658E;

    public FitWindowsLinearLayout(@androidx.annotation.N Context context) {
        super(context);
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        O.a aVar = this.f5658E;
        if (aVar != null) {
            aVar.a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.O
    public void setOnFitSystemWindowsListener(O.a aVar) {
        this.f5658E = aVar;
    }

    public FitWindowsLinearLayout(@androidx.annotation.N Context context, @androidx.annotation.P AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
