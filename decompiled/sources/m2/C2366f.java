package m2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.appcompat.widget.AppCompatTextView;
import com.harman.jbl.partylight.lib.g;
import i0.C2067c;
import i0.InterfaceC2066b;

/* renamed from: m2.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2366f implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @N
    private final FrameLayout f55115E;

    /* renamed from: F, reason: collision with root package name */
    @N
    public final FrameLayout f55116F;

    /* renamed from: G, reason: collision with root package name */
    @N
    public final ImageView f55117G;

    /* renamed from: H, reason: collision with root package name */
    @N
    public final AppCompatTextView f55118H;

    /* renamed from: I, reason: collision with root package name */
    @N
    public final TextView f55119I;

    /* renamed from: J, reason: collision with root package name */
    @N
    public final TextView f55120J;

    private C2366f(@N FrameLayout frameLayout, @N FrameLayout frameLayout2, @N ImageView imageView, @N AppCompatTextView appCompatTextView, @N TextView textView, @N TextView textView2) {
        this.f55115E = frameLayout;
        this.f55116F = frameLayout2;
        this.f55117G = imageView;
        this.f55118H = appCompatTextView;
        this.f55119I = textView;
        this.f55120J = textView2;
    }

    @N
    public static C2366f a(@N View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        int i4 = g.C0418g.f46907d0;
        ImageView imageView = (ImageView) C2067c.a(view, i4);
        if (imageView != null) {
            i4 = g.C0418g.f46944m1;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C2067c.a(view, i4);
            if (appCompatTextView != null) {
                i4 = g.C0418g.f46984x1;
                TextView textView = (TextView) C2067c.a(view, i4);
                if (textView != null) {
                    i4 = g.C0418g.f46990z1;
                    TextView textView2 = (TextView) C2067c.a(view, i4);
                    if (textView2 != null) {
                        return new C2366f(frameLayout, frameLayout, imageView, appCompatTextView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @N
    public static C2366f c(@N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @N
    public static C2366f e(@N LayoutInflater layoutInflater, @P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(g.h.f47006f, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout d() {
        return this.f55115E;
    }
}
