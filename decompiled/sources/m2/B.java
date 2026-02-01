package m2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.harman.jbl.partylight.lib.g;
import i0.C2067c;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class B implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @N
    private final ConstraintLayout f55034E;

    /* renamed from: F, reason: collision with root package name */
    @N
    public final ImageView f55035F;

    /* renamed from: G, reason: collision with root package name */
    @N
    public final TextView f55036G;

    /* renamed from: H, reason: collision with root package name */
    @N
    public final ImageView f55037H;

    private B(@N ConstraintLayout constraintLayout, @N ImageView imageView, @N TextView textView, @N ImageView imageView2) {
        this.f55034E = constraintLayout;
        this.f55035F = imageView;
        this.f55036G = textView;
        this.f55037H = imageView2;
    }

    @N
    public static B a(@N View view) {
        int i4 = g.C0418g.f46906d;
        ImageView imageView = (ImageView) C2067c.a(view, i4);
        if (imageView != null) {
            i4 = g.C0418g.f46855N;
            TextView textView = (TextView) C2067c.a(view, i4);
            if (textView != null) {
                i4 = g.C0418g.f46968s1;
                ImageView imageView2 = (ImageView) C2067c.a(view, i4);
                if (imageView2 != null) {
                    return new B((ConstraintLayout) view, imageView, textView, imageView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @N
    public static B c(@N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @N
    public static B e(@N LayoutInflater layoutInflater, @P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(g.h.f46992B, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f55034E;
    }
}
