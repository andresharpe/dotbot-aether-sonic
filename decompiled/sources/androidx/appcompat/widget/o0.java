package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import d.C2042a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
class o0 {

    /* renamed from: h, reason: collision with root package name */
    private static final String f6293h = "TooltipPopup";

    /* renamed from: a, reason: collision with root package name */
    private final Context f6294a;

    /* renamed from: b, reason: collision with root package name */
    private final View f6295b;

    /* renamed from: c, reason: collision with root package name */
    private final TextView f6296c;

    /* renamed from: d, reason: collision with root package name */
    private final WindowManager.LayoutParams f6297d;

    /* renamed from: e, reason: collision with root package name */
    private final Rect f6298e;

    /* renamed from: f, reason: collision with root package name */
    private final int[] f6299f;

    /* renamed from: g, reason: collision with root package name */
    private final int[] f6300g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o0(@androidx.annotation.N Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f6297d = layoutParams;
        this.f6298e = new Rect();
        this.f6299f = new int[2];
        this.f6300g = new int[2];
        this.f6294a = context;
        View inflate = LayoutInflater.from(context).inflate(C2042a.j.f49680B, (ViewGroup) null);
        this.f6295b = inflate;
        this.f6296c = (TextView) inflate.findViewById(C2042a.g.f49598I);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = C2042a.l.f49863e;
        layoutParams.flags = 24;
    }

    private void a(View view, int i4, int i5, boolean z3, WindowManager.LayoutParams layoutParams) {
        int height;
        int i6;
        int i7;
        int i8;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f6294a.getResources().getDimensionPixelOffset(C2042a.e.f49436Q0);
        if (view.getWidth() < dimensionPixelOffset) {
            i4 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f6294a.getResources().getDimensionPixelOffset(C2042a.e.f49434P0);
            height = i5 + dimensionPixelOffset2;
            i6 = i5 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i6 = 0;
        }
        layoutParams.gravity = 49;
        Resources resources = this.f6294a.getResources();
        if (z3) {
            i7 = C2042a.e.f49442T0;
        } else {
            i7 = C2042a.e.f49440S0;
        }
        int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i7);
        View b4 = b(view);
        if (b4 == null) {
            Log.e(f6293h, "Cannot find app view");
            return;
        }
        b4.getWindowVisibleDisplayFrame(this.f6298e);
        Rect rect = this.f6298e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources2 = this.f6294a.getResources();
            int identifier = resources2.getIdentifier("status_bar_height", "dimen", "android");
            if (identifier != 0) {
                i8 = resources2.getDimensionPixelSize(identifier);
            } else {
                i8 = 0;
            }
            DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
            this.f6298e.set(0, i8, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        b4.getLocationOnScreen(this.f6300g);
        view.getLocationOnScreen(this.f6299f);
        int[] iArr = this.f6299f;
        int i9 = iArr[0];
        int[] iArr2 = this.f6300g;
        int i10 = i9 - iArr2[0];
        iArr[0] = i10;
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (i10 + i4) - (b4.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f6295b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f6295b.getMeasuredHeight();
        int i11 = this.f6299f[1];
        int i12 = ((i6 + i11) - dimensionPixelOffset3) - measuredHeight;
        int i13 = i11 + height + dimensionPixelOffset3;
        if (z3) {
            if (i12 >= 0) {
                layoutParams.y = i12;
                return;
            } else {
                layoutParams.y = i13;
                return;
            }
        }
        if (measuredHeight + i13 <= this.f6298e.height()) {
            layoutParams.y = i13;
        } else {
            layoutParams.y = i12;
        }
    }

    private static View b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        if (!d()) {
            return;
        }
        ((WindowManager) this.f6294a.getSystemService("window")).removeView(this.f6295b);
    }

    boolean d() {
        if (this.f6295b.getParent() != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(View view, int i4, int i5, boolean z3, CharSequence charSequence) {
        if (d()) {
            c();
        }
        this.f6296c.setText(charSequence);
        a(view, i4, i5, z3, this.f6297d);
        ((WindowManager) this.f6294a.getSystemService("window")).addView(this.f6295b, this.f6297d);
    }
}
