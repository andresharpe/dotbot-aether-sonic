package K2;

import J2.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.constraintlayout.widget.ConstraintLayout;
import i0.C2067c;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class m implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @N
    private final ConstraintLayout f1445E;

    /* renamed from: F, reason: collision with root package name */
    @N
    public final ConstraintLayout f1446F;

    /* renamed from: G, reason: collision with root package name */
    @N
    public final ImageView f1447G;

    /* renamed from: H, reason: collision with root package name */
    @N
    public final ProgressBar f1448H;

    /* renamed from: I, reason: collision with root package name */
    @N
    public final TextView f1449I;

    /* renamed from: J, reason: collision with root package name */
    @N
    public final TextView f1450J;

    private m(@N ConstraintLayout constraintLayout, @N ConstraintLayout constraintLayout2, @N ImageView imageView, @N ProgressBar progressBar, @N TextView textView, @N TextView textView2) {
        this.f1445E = constraintLayout;
        this.f1446F = constraintLayout2;
        this.f1447G = imageView;
        this.f1448H = progressBar;
        this.f1449I = textView;
        this.f1450J = textView2;
    }

    @N
    public static m a(@N View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i4 = a.e.f1303m;
        ImageView imageView = (ImageView) C2067c.a(view, i4);
        if (imageView != null) {
            i4 = a.e.f1310t;
            ProgressBar progressBar = (ProgressBar) C2067c.a(view, i4);
            if (progressBar != null) {
                i4 = a.e.f1313w;
                TextView textView = (TextView) C2067c.a(view, i4);
                if (textView != null) {
                    i4 = a.e.f1314x;
                    TextView textView2 = (TextView) C2067c.a(view, i4);
                    if (textView2 != null) {
                        return new m(constraintLayout, constraintLayout, imageView, progressBar, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @N
    public static m c(@N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @N
    public static m e(@N LayoutInflater layoutInflater, @P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(a.f.f1329m, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f1445E;
    }
}
