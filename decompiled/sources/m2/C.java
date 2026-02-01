package m2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.N;
import androidx.annotation.P;
import com.harman.jbl.partylight.lib.g;
import i0.C2067c;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class C implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @N
    private final LinearLayout f55038E;

    /* renamed from: F, reason: collision with root package name */
    @N
    public final ImageView f55039F;

    /* renamed from: G, reason: collision with root package name */
    @N
    public final ImageView f55040G;

    /* renamed from: H, reason: collision with root package name */
    @N
    public final LinearLayout f55041H;

    /* renamed from: I, reason: collision with root package name */
    @N
    public final TextView f55042I;

    private C(@N LinearLayout linearLayout, @N ImageView imageView, @N ImageView imageView2, @N LinearLayout linearLayout2, @N TextView textView) {
        this.f55038E = linearLayout;
        this.f55039F = imageView;
        this.f55040G = imageView2;
        this.f55041H = linearLayout2;
        this.f55042I = textView;
    }

    @N
    public static C a(@N View view) {
        int i4 = g.C0418g.f46947n0;
        ImageView imageView = (ImageView) C2067c.a(view, i4);
        if (imageView != null) {
            i4 = g.C0418g.f46955p0;
            ImageView imageView2 = (ImageView) C2067c.a(view, i4);
            if (imageView2 != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                i4 = g.C0418g.f46917f2;
                TextView textView = (TextView) C2067c.a(view, i4);
                if (textView != null) {
                    return new C(linearLayout, imageView, imageView2, linearLayout, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @N
    public static C c(@N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @N
    public static C e(@N LayoutInflater layoutInflater, @P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(g.h.f46993C, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout d() {
        return this.f55038E;
    }
}
