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
public final class I implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @N
    private final View f55066E;

    /* renamed from: F, reason: collision with root package name */
    @N
    public final ImageView f55067F;

    /* renamed from: G, reason: collision with root package name */
    @N
    public final ImageView f55068G;

    /* renamed from: H, reason: collision with root package name */
    @N
    public final TextView f55069H;

    private I(@N View view, @N ImageView imageView, @N ImageView imageView2, @N TextView textView) {
        this.f55066E = view;
        this.f55067F = imageView;
        this.f55068G = imageView2;
        this.f55069H = textView;
    }

    @N
    public static I a(@N View view) {
        int i4 = g.C0418g.f46947n0;
        ImageView imageView = (ImageView) C2067c.a(view, i4);
        if (imageView != null) {
            i4 = g.C0418g.f46951o0;
            ImageView imageView2 = (ImageView) C2067c.a(view, i4);
            if (imageView2 != null) {
                i4 = g.C0418g.f46921g2;
                TextView textView = (TextView) C2067c.a(view, i4);
                if (textView != null) {
                    return new I(view, imageView, imageView2, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @N
    public static I b(@N LayoutInflater layoutInflater, @N ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(g.h.f46999I, viewGroup);
            return a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // i0.InterfaceC2066b
    @N
    public View d() {
        return this.f55066E;
    }
}
