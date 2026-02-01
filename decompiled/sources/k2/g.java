package K2;

import J2.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.appcompat.widget.AppCompatTextView;
import i0.C2067c;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class g implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @N
    private final LinearLayout f1424E;

    /* renamed from: F, reason: collision with root package name */
    @N
    public final LinearLayout f1425F;

    /* renamed from: G, reason: collision with root package name */
    @N
    public final AppCompatTextView f1426G;

    /* renamed from: H, reason: collision with root package name */
    @N
    public final AppCompatTextView f1427H;

    private g(@N LinearLayout linearLayout, @N LinearLayout linearLayout2, @N AppCompatTextView appCompatTextView, @N AppCompatTextView appCompatTextView2) {
        this.f1424E = linearLayout;
        this.f1425F = linearLayout2;
        this.f1426G = appCompatTextView;
        this.f1427H = appCompatTextView2;
    }

    @N
    public static g a(@N View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i4 = a.e.f1316z;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C2067c.a(view, i4);
        if (appCompatTextView != null) {
            i4 = a.e.f1288A;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) C2067c.a(view, i4);
            if (appCompatTextView2 != null) {
                return new g(linearLayout, linearLayout, appCompatTextView, appCompatTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @N
    public static g c(@N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @N
    public static g e(@N LayoutInflater layoutInflater, @P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(a.f.f1323g, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout d() {
        return this.f1424E;
    }
}
