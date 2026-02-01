package m2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.N;
import androidx.annotation.P;
import com.harman.jbl.partylight.lib.dashboard.widget.ColorPickerView;
import com.harman.jbl.partylight.lib.g;
import i0.C2067c;
import i0.InterfaceC2066b;

/* renamed from: m2.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2370j implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @N
    private final FrameLayout f55141E;

    /* renamed from: F, reason: collision with root package name */
    @N
    public final ColorPickerView f55142F;

    /* renamed from: G, reason: collision with root package name */
    @N
    public final FrameLayout f55143G;

    /* renamed from: H, reason: collision with root package name */
    @N
    public final ImageView f55144H;

    /* renamed from: I, reason: collision with root package name */
    @N
    public final TextView f55145I;

    /* renamed from: J, reason: collision with root package name */
    @N
    public final TextView f55146J;

    private C2370j(@N FrameLayout frameLayout, @N ColorPickerView colorPickerView, @N FrameLayout frameLayout2, @N ImageView imageView, @N TextView textView, @N TextView textView2) {
        this.f55141E = frameLayout;
        this.f55142F = colorPickerView;
        this.f55143G = frameLayout2;
        this.f55144H = imageView;
        this.f55145I = textView;
        this.f55146J = textView2;
    }

    @N
    public static C2370j a(@N View view) {
        int i4 = g.C0418g.f46831F;
        ColorPickerView colorPickerView = (ColorPickerView) C2067c.a(view, i4);
        if (colorPickerView != null) {
            FrameLayout frameLayout = (FrameLayout) view;
            i4 = g.C0418g.f46907d0;
            ImageView imageView = (ImageView) C2067c.a(view, i4);
            if (imageView != null) {
                i4 = g.C0418g.f46944m1;
                TextView textView = (TextView) C2067c.a(view, i4);
                if (textView != null) {
                    i4 = g.C0418g.f46909d2;
                    TextView textView2 = (TextView) C2067c.a(view, i4);
                    if (textView2 != null) {
                        return new C2370j(frameLayout, colorPickerView, frameLayout, imageView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @N
    public static C2370j c(@N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @N
    public static C2370j e(@N LayoutInflater layoutInflater, @P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(g.h.f47010j, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout d() {
        return this.f55141E;
    }
}
