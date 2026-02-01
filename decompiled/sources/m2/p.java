package m2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.harman.jbl.cd_biz_comm.widget.ElasticScrollView;
import com.harman.jbl.cd_biz_comm.widget.MatchWidthCardView;
import com.harman.jbl.cd_biz_comm.widget.MenuItemView;
import com.harman.jbl.partylight.lib.g;
import i0.C2067c;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class p implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @N
    private final ConstraintLayout f55204E;

    /* renamed from: F, reason: collision with root package name */
    @N
    public final MenuItemView f55205F;

    /* renamed from: G, reason: collision with root package name */
    @N
    public final Group f55206G;

    /* renamed from: H, reason: collision with root package name */
    @N
    public final C2360A f55207H;

    /* renamed from: I, reason: collision with root package name */
    @N
    public final MatchWidthCardView f55208I;

    /* renamed from: J, reason: collision with root package name */
    @N
    public final MatchWidthCardView f55209J;

    /* renamed from: K, reason: collision with root package name */
    @N
    public final MenuItemView f55210K;

    /* renamed from: L, reason: collision with root package name */
    @N
    public final MenuItemView f55211L;

    /* renamed from: M, reason: collision with root package name */
    @N
    public final MenuItemView f55212M;

    /* renamed from: N, reason: collision with root package name */
    @N
    public final ElasticScrollView f55213N;

    /* renamed from: O, reason: collision with root package name */
    @N
    public final TextView f55214O;

    /* renamed from: P, reason: collision with root package name */
    @N
    public final TextView f55215P;

    private p(@N ConstraintLayout constraintLayout, @N MenuItemView menuItemView, @N Group group, @N C2360A c2360a, @N MatchWidthCardView matchWidthCardView, @N MatchWidthCardView matchWidthCardView2, @N MenuItemView menuItemView2, @N MenuItemView menuItemView3, @N MenuItemView menuItemView4, @N ElasticScrollView elasticScrollView, @N TextView textView, @N TextView textView2) {
        this.f55204E = constraintLayout;
        this.f55205F = menuItemView;
        this.f55206G = group;
        this.f55207H = c2360a;
        this.f55208I = matchWidthCardView;
        this.f55209J = matchWidthCardView2;
        this.f55210K = menuItemView2;
        this.f55211L = menuItemView3;
        this.f55212M = menuItemView4;
        this.f55213N = elasticScrollView;
        this.f55214O = textView;
        this.f55215P = textView2;
    }

    @N
    public static p a(@N View view) {
        View a4;
        int i4 = g.C0418g.f46864Q;
        MenuItemView menuItemView = (MenuItemView) C2067c.a(view, i4);
        if (menuItemView != null) {
            i4 = g.C0418g.f46885X;
            Group group = (Group) C2067c.a(view, i4);
            if (group != null && (a4 = C2067c.a(view, (i4 = g.C0418g.f46891Z))) != null) {
                C2360A a5 = C2360A.a(a4);
                i4 = g.C0418g.f46838H0;
                MatchWidthCardView matchWidthCardView = (MatchWidthCardView) C2067c.a(view, i4);
                if (matchWidthCardView != null) {
                    i4 = g.C0418g.f46841I0;
                    MatchWidthCardView matchWidthCardView2 = (MatchWidthCardView) C2067c.a(view, i4);
                    if (matchWidthCardView2 != null) {
                        i4 = g.C0418g.f46877U0;
                        MenuItemView menuItemView2 = (MenuItemView) C2067c.a(view, i4);
                        if (menuItemView2 != null) {
                            i4 = g.C0418g.f46880V0;
                            MenuItemView menuItemView3 = (MenuItemView) C2067c.a(view, i4);
                            if (menuItemView3 != null) {
                                i4 = g.C0418g.f46886X0;
                                MenuItemView menuItemView4 = (MenuItemView) C2067c.a(view, i4);
                                if (menuItemView4 != null) {
                                    i4 = g.C0418g.f46932j1;
                                    ElasticScrollView elasticScrollView = (ElasticScrollView) C2067c.a(view, i4);
                                    if (elasticScrollView != null) {
                                        i4 = g.C0418g.f46845J1;
                                        TextView textView = (TextView) C2067c.a(view, i4);
                                        if (textView != null) {
                                            i4 = g.C0418g.f46897a2;
                                            TextView textView2 = (TextView) C2067c.a(view, i4);
                                            if (textView2 != null) {
                                                return new p((ConstraintLayout) view, menuItemView, group, a5, matchWidthCardView, matchWidthCardView2, menuItemView2, menuItemView3, menuItemView4, elasticScrollView, textView, textView2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @N
    public static p c(@N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @N
    public static p e(@N LayoutInflater layoutInflater, @P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(g.h.f47016p, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f55204E;
    }
}
