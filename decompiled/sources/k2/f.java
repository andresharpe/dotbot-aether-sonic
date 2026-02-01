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
public final class f implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @N
    private final ConstraintLayout f1419E;

    /* renamed from: F, reason: collision with root package name */
    @N
    public final ImageView f1420F;

    /* renamed from: G, reason: collision with root package name */
    @N
    public final ImageView f1421G;

    /* renamed from: H, reason: collision with root package name */
    @N
    public final ImageView f1422H;

    /* renamed from: I, reason: collision with root package name */
    @N
    public final AppCompatTextView f1423I;

    private f(@N ConstraintLayout constraintLayout, @N ImageView imageView, @N ImageView imageView2, @N ImageView imageView3, @N AppCompatTextView appCompatTextView) {
        this.f1419E = constraintLayout;
        this.f1420F = imageView;
        this.f1421G = imageView2;
        this.f1422H = imageView3;
        this.f1423I = appCompatTextView;
    }

    @N
    public static f a(@N View view) {
        int i4 = a.e.f1297g;
        ImageView imageView = (ImageView) C2067c.a(view, i4);
        if (imageView != null) {
            i4 = a.e.f1304n;
            ImageView imageView2 = (ImageView) C2067c.a(view, i4);
            if (imageView2 != null) {
                i4 = a.e.f1306p;
                ImageView imageView3 = (ImageView) C2067c.a(view, i4);
                if (imageView3 != null) {
                    i4 = a.e.f1315y;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) C2067c.a(view, i4);
                    if (appCompatTextView != null) {
                        return new f((ConstraintLayout) view, imageView, imageView2, imageView3, appCompatTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @N
    public static f c(@N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @N
    public static f e(@N LayoutInflater layoutInflater, @P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(a.f.f1322f, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f1419E;
    }
}
