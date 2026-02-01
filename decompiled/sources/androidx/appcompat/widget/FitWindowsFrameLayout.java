package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.O;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class FitWindowsFrameLayout extends FrameLayout implements O {

    /* renamed from: E, reason: collision with root package name */
    private O.a f5657E;

    public FitWindowsFrameLayout(@androidx.annotation.N Context context) {
        super(context);
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        O.a aVar = this.f5657E;
        if (aVar != null) {
            aVar.a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.O
    public void setOnFitSystemWindowsListener(O.a aVar) {
        this.f5657E = aVar;
    }

    public FitWindowsFrameLayout(@androidx.annotation.N Context context, @androidx.annotation.P AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
