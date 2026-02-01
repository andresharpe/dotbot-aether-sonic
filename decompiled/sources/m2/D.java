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
public final class D implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @N
    private final View f55043E;

    /* renamed from: F, reason: collision with root package name */
    @N
    public final ImageView f55044F;

    /* renamed from: G, reason: collision with root package name */
    @N
    public final TextView f55045G;

    private D(@N View view, @N ImageView imageView, @N TextView textView) {
        this.f55043E = view;
        this.f55044F = imageView;
        this.f55045G = textView;
    }

    @N
    public static D a(@N View view) {
        int i4 = g.C0418g.f46943m0;
        ImageView imageView = (ImageView) C2067c.a(view, i4);
        if (imageView != null) {
            i4 = g.C0418g.f46913e2;
            TextView textView = (TextView) C2067c.a(view, i4);
            if (textView != null) {
                return new D(view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @N
    public static D b(@N LayoutInflater layoutInflater, @N ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(g.h.f46994D, viewGroup);
            return a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // i0.InterfaceC2066b
    @N
    public View d() {
        return this.f55043E;
    }
}
