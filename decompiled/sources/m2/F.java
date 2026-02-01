package m2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.N;
import com.harman.jbl.partylight.lib.g;
import i0.C2067c;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class F implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @N
    private final View f55053E;

    /* renamed from: F, reason: collision with root package name */
    @N
    public final ImageView f55054F;

    /* renamed from: G, reason: collision with root package name */
    @N
    public final ImageView f55055G;

    /* renamed from: H, reason: collision with root package name */
    @N
    public final TextView f55056H;

    /* renamed from: I, reason: collision with root package name */
    @N
    public final TextView f55057I;

    private F(@N View view, @N ImageView imageView, @N ImageView imageView2, @N TextView textView, @N TextView textView2) {
        this.f55053E = view;
        this.f55054F = imageView;
        this.f55055G = imageView2;
        this.f55056H = textView;
        this.f55057I = textView2;
    }

    @N
    public static F a(@N View view) {
        int i4 = g.C0418g.f46974u0;
        ImageView imageView = (ImageView) C2067c.a(view, i4);
        if (imageView != null) {
            i4 = g.C0418g.f46977v0;
            ImageView imageView2 = (ImageView) C2067c.a(view, i4);
            if (imageView2 != null) {
                i4 = g.C0418g.f46941l2;
                TextView textView = (TextView) C2067c.a(view, i4);
                if (textView != null) {
                    i4 = g.C0418g.f46945m2;
                    TextView textView2 = (TextView) C2067c.a(view, i4);
                    if (textView2 != null) {
                        return new F(view, imageView, imageView2, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @N
    public static F b(@N LayoutInflater layoutInflater, @N ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(g.h.f46996F, viewGroup);
            return a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // i0.InterfaceC2066b
    @N
    public View d() {
        return this.f55053E;
    }
}
