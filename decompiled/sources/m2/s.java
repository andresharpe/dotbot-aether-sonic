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
public final class s implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @N
    private final ConstraintLayout f55224E;

    /* renamed from: F, reason: collision with root package name */
    @N
    public final C2360A f55225F;

    /* renamed from: G, reason: collision with root package name */
    @N
    public final ImageView f55226G;

    /* renamed from: H, reason: collision with root package name */
    @N
    public final TextView f55227H;

    /* renamed from: I, reason: collision with root package name */
    @N
    public final TextView f55228I;

    /* renamed from: J, reason: collision with root package name */
    @N
    public final TextView f55229J;

    private s(@N ConstraintLayout constraintLayout, @N C2360A c2360a, @N ImageView imageView, @N TextView textView, @N TextView textView2, @N TextView textView3) {
        this.f55224E = constraintLayout;
        this.f55225F = c2360a;
        this.f55226G = imageView;
        this.f55227H = textView;
        this.f55228I = textView2;
        this.f55229J = textView3;
    }

    @N
    public static s a(@N View view) {
        int i4 = g.C0418g.f46891Z;
        View a4 = C2067c.a(view, i4);
        if (a4 != null) {
            C2360A a5 = C2360A.a(a4);
            i4 = g.C0418g.f46919g0;
            ImageView imageView = (ImageView) C2067c.a(view, i4);
            if (imageView != null) {
                i4 = g.C0418g.f46827D1;
                TextView textView = (TextView) C2067c.a(view, i4);
                if (textView != null) {
                    i4 = g.C0418g.f46830E1;
                    TextView textView2 = (TextView) C2067c.a(view, i4);
                    if (textView2 != null) {
                        i4 = g.C0418g.f46839H1;
                        TextView textView3 = (TextView) C2067c.a(view, i4);
                        if (textView3 != null) {
                            return new s((ConstraintLayout) view, a5, imageView, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @N
    public static s c(@N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @N
    public static s e(@N LayoutInflater layoutInflater, @P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(g.h.f47019s, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f55224E;
    }
}
