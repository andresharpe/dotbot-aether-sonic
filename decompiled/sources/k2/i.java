package K2;

import J2.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import i0.C2067c;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class i implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @N
    private final ConstraintLayout f1431E;

    /* renamed from: F, reason: collision with root package name */
    @N
    public final ImageView f1432F;

    /* renamed from: G, reason: collision with root package name */
    @N
    public final AppCompatTextView f1433G;

    private i(@N ConstraintLayout constraintLayout, @N ImageView imageView, @N AppCompatTextView appCompatTextView) {
        this.f1431E = constraintLayout;
        this.f1432F = imageView;
        this.f1433G = appCompatTextView;
    }

    @N
    public static i a(@N View view) {
        int i4 = a.e.f1298h;
        ImageView imageView = (ImageView) C2067c.a(view, i4);
        if (imageView != null) {
            i4 = a.e.f1290C;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C2067c.a(view, i4);
            if (appCompatTextView != null) {
                return new i((ConstraintLayout) view, imageView, appCompatTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @N
    public static i c(@N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @N
    public static i e(@N LayoutInflater layoutInflater, @P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(a.f.f1325i, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f1431E;
    }
}
