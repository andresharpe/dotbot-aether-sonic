package m2;

import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.N;
import androidx.annotation.P;
import com.harman.jbl.partylight.lib.g;
import i0.C2067c;
import i0.InterfaceC2066b;

/* renamed from: m2.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2369i implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @N
    private final FrameLayout f55134E;

    /* renamed from: F, reason: collision with root package name */
    @N
    public final TextView f55135F;

    /* renamed from: G, reason: collision with root package name */
    @N
    public final FrameLayout f55136G;

    /* renamed from: H, reason: collision with root package name */
    @N
    public final TextView f55137H;

    /* renamed from: I, reason: collision with root package name */
    @N
    public final ImageView f55138I;

    /* renamed from: J, reason: collision with root package name */
    @N
    public final TextureView f55139J;

    /* renamed from: K, reason: collision with root package name */
    @N
    public final TextView f55140K;

    private C2369i(@N FrameLayout frameLayout, @N TextView textView, @N FrameLayout frameLayout2, @N TextView textView2, @N ImageView imageView, @N TextureView textureView, @N TextView textView3) {
        this.f55134E = frameLayout;
        this.f55135F = textView;
        this.f55136G = frameLayout2;
        this.f55137H = textView2;
        this.f55138I = imageView;
        this.f55139J = textureView;
        this.f55140K = textView3;
    }

    @N
    public static C2369i a(@N View view) {
        int i4 = g.C0418g.f46966s;
        TextView textView = (TextView) C2067c.a(view, i4);
        if (textView != null) {
            FrameLayout frameLayout = (FrameLayout) view;
            i4 = g.C0418g.f46849L;
            TextView textView2 = (TextView) C2067c.a(view, i4);
            if (textView2 != null) {
                i4 = g.C0418g.f46907d0;
                ImageView imageView = (ImageView) C2067c.a(view, i4);
                if (imageView != null) {
                    i4 = g.C0418g.f46936k1;
                    TextureView textureView = (TextureView) C2067c.a(view, i4);
                    if (textureView != null) {
                        i4 = g.C0418g.f46944m1;
                        TextView textView3 = (TextView) C2067c.a(view, i4);
                        if (textView3 != null) {
                            return new C2369i(frameLayout, textView, frameLayout, textView2, imageView, textureView, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @N
    public static C2369i c(@N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @N
    public static C2369i e(@N LayoutInflater layoutInflater, @P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(g.h.f47009i, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout d() {
        return this.f55134E;
    }
}
