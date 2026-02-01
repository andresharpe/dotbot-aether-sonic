package m2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.harman.jbl.partylight.lib.g;
import i0.C2067c;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class H implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @N
    private final ConstraintLayout f55060E;

    /* renamed from: F, reason: collision with root package name */
    @N
    public final TextView f55061F;

    /* renamed from: G, reason: collision with root package name */
    @N
    public final AppCompatImageView f55062G;

    /* renamed from: H, reason: collision with root package name */
    @N
    public final ImageView f55063H;

    /* renamed from: I, reason: collision with root package name */
    @N
    public final TextView f55064I;

    /* renamed from: J, reason: collision with root package name */
    @N
    public final TextView f55065J;

    private H(@N ConstraintLayout constraintLayout, @N TextView textView, @N AppCompatImageView appCompatImageView, @N ImageView imageView, @N TextView textView2, @N TextView textView3) {
        this.f55060E = constraintLayout;
        this.f55061F = textView;
        this.f55062G = appCompatImageView;
        this.f55063H = imageView;
        this.f55064I = textView2;
        this.f55065J = textView3;
    }

    @N
    public static H a(@N View view) {
        int i4 = g.C0418g.f46982x;
        TextView textView = (TextView) C2067c.a(view, i4);
        if (textView != null) {
            i4 = g.C0418g.f46985y;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C2067c.a(view, i4);
            if (appCompatImageView != null) {
                i4 = g.C0418g.f46988z;
                ImageView imageView = (ImageView) C2067c.a(view, i4);
                if (imageView != null) {
                    i4 = g.C0418g.f46816A;
                    TextView textView2 = (TextView) C2067c.a(view, i4);
                    if (textView2 != null) {
                        i4 = g.C0418g.f46819B;
                        TextView textView3 = (TextView) C2067c.a(view, i4);
                        if (textView3 != null) {
                            return new H((ConstraintLayout) view, textView, appCompatImageView, imageView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @N
    public static H c(@N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @N
    public static H e(@N LayoutInflater layoutInflater, @P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(g.h.f46998H, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f55060E;
    }
}
