package X0;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.N;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class a implements View.OnTouchListener {

    /* renamed from: E, reason: collision with root package name */
    @N
    private final Dialog f3810E;

    /* renamed from: F, reason: collision with root package name */
    private final int f3811F;

    /* renamed from: G, reason: collision with root package name */
    private final int f3812G;

    /* renamed from: H, reason: collision with root package name */
    private final int f3813H;

    public a(@N Dialog dialog, @N Rect rect) {
        this.f3810E = dialog;
        this.f3811F = rect.left;
        this.f3812G = rect.top;
        this.f3813H = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(@N View view, @N MotionEvent motionEvent) {
        View findViewById = view.findViewById(R.id.content);
        int left = this.f3811F + findViewById.getLeft();
        int width = findViewById.getWidth() + left;
        if (new RectF(left, this.f3812G + findViewById.getTop(), width, findViewById.getHeight() + r3).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i4 = this.f3813H;
            obtain.setLocation((-i4) - 1, (-i4) - 1);
        }
        view.performClick();
        return this.f3810E.onTouchEvent(obtain);
    }
}
