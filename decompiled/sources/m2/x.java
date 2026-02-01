package m2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.N;
import androidx.annotation.P;
import com.harman.jbl.partylight.lib.g;
import i0.C2067c;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class x implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @N
    private final FrameLayout f55255E;

    /* renamed from: F, reason: collision with root package name */
    @N
    public final ImageView f55256F;

    /* renamed from: G, reason: collision with root package name */
    @N
    public final ImageView f55257G;

    private x(@N FrameLayout frameLayout, @N ImageView imageView, @N ImageView imageView2) {
        this.f55255E = frameLayout;
        this.f55256F = imageView;
        this.f55257G = imageView2;
    }

    @N
    public static x a(@N View view) {
        int i4 = g.C0418g.f46959q0;
        ImageView imageView = (ImageView) C2067c.a(view, i4);
        if (imageView != null) {
            i4 = g.C0418g.f46963r0;
            ImageView imageView2 = (ImageView) C2067c.a(view, i4);
            if (imageView2 != null) {
                return new x((FrameLayout) view, imageView, imageView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @N
    public static x c(@N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @N
    public static x e(@N LayoutInflater layoutInflater, @P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(g.h.f47024x, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout d() {
        return this.f55255E;
    }
}
