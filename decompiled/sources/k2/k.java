package K2;

import J2.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.viewpager2.widget.ViewPager2;
import i0.C2067c;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class k implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @N
    private final FrameLayout f1438E;

    /* renamed from: F, reason: collision with root package name */
    @N
    public final TextView f1439F;

    /* renamed from: G, reason: collision with root package name */
    @N
    public final FrameLayout f1440G;

    /* renamed from: H, reason: collision with root package name */
    @N
    public final ImageView f1441H;

    /* renamed from: I, reason: collision with root package name */
    @N
    public final LinearLayout f1442I;

    /* renamed from: J, reason: collision with root package name */
    @N
    public final ViewPager2 f1443J;

    private k(@N FrameLayout frameLayout, @N TextView textView, @N FrameLayout frameLayout2, @N ImageView imageView, @N LinearLayout linearLayout, @N ViewPager2 viewPager2) {
        this.f1438E = frameLayout;
        this.f1439F = textView;
        this.f1440G = frameLayout2;
        this.f1441H = imageView;
        this.f1442I = linearLayout;
        this.f1443J = viewPager2;
    }

    @N
    public static k a(@N View view) {
        int i4 = a.e.f1293c;
        TextView textView = (TextView) C2067c.a(view, i4);
        if (textView != null) {
            FrameLayout frameLayout = (FrameLayout) view;
            i4 = a.e.f1300j;
            ImageView imageView = (ImageView) C2067c.a(view, i4);
            if (imageView != null) {
                i4 = a.e.f1302l;
                LinearLayout linearLayout = (LinearLayout) C2067c.a(view, i4);
                if (linearLayout != null) {
                    i4 = a.e.f1308r;
                    ViewPager2 viewPager2 = (ViewPager2) C2067c.a(view, i4);
                    if (viewPager2 != null) {
                        return new k(frameLayout, textView, frameLayout, imageView, linearLayout, viewPager2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @N
    public static k c(@N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @N
    public static k e(@N LayoutInflater layoutInflater, @P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(a.f.f1327k, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout d() {
        return this.f1438E;
    }
}
