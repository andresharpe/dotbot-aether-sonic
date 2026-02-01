package m2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.N;
import androidx.annotation.P;
import com.harman.jbl.cd_biz_comm.widget.HmTextViewWithImage;
import com.harman.jbl.partylight.lib.g;
import i0.C2067c;
import i0.InterfaceC2066b;

/* renamed from: m2.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2367g implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @N
    private final FrameLayout f55121E;

    /* renamed from: F, reason: collision with root package name */
    @N
    public final TextView f55122F;

    /* renamed from: G, reason: collision with root package name */
    @N
    public final FrameLayout f55123G;

    /* renamed from: H, reason: collision with root package name */
    @N
    public final ImageView f55124H;

    /* renamed from: I, reason: collision with root package name */
    @N
    public final HmTextViewWithImage f55125I;

    /* renamed from: J, reason: collision with root package name */
    @N
    public final TextView f55126J;

    private C2367g(@N FrameLayout frameLayout, @N TextView textView, @N FrameLayout frameLayout2, @N ImageView imageView, @N HmTextViewWithImage hmTextViewWithImage, @N TextView textView2) {
        this.f55121E = frameLayout;
        this.f55122F = textView;
        this.f55123G = frameLayout2;
        this.f55124H = imageView;
        this.f55125I = hmTextViewWithImage;
        this.f55126J = textView2;
    }

    @N
    public static C2367g a(@N View view) {
        int i4 = g.C0418g.f46966s;
        TextView textView = (TextView) C2067c.a(view, i4);
        if (textView != null) {
            FrameLayout frameLayout = (FrameLayout) view;
            i4 = g.C0418g.f46907d0;
            ImageView imageView = (ImageView) C2067c.a(view, i4);
            if (imageView != null) {
                i4 = g.C0418g.f46944m1;
                HmTextViewWithImage hmTextViewWithImage = (HmTextViewWithImage) C2067c.a(view, i4);
                if (hmTextViewWithImage != null) {
                    i4 = g.C0418g.f46887X1;
                    TextView textView2 = (TextView) C2067c.a(view, i4);
                    if (textView2 != null) {
                        return new C2367g(frameLayout, textView, frameLayout, imageView, hmTextViewWithImage, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @N
    public static C2367g c(@N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @N
    public static C2367g e(@N LayoutInflater layoutInflater, @P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(g.h.f47007g, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout d() {
        return this.f55121E;
    }
}
