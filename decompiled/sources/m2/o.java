package m2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.harman.jbl.cd_biz_comm.widget.ElasticScrollView;
import com.harman.jbl.cd_biz_comm.widget.ForegroundMaskLayout;
import com.harman.jbl.cd_biz_comm.widget.MatchWidthCardView;
import com.harman.jbl.cd_biz_comm.widget.MenuSwitchView;
import com.harman.jbl.partylight.lib.dashboard.widget.LightColorSelectView;
import com.harman.jbl.partylight.lib.dashboard.widget.LightShowPanelView;
import com.harman.jbl.partylight.lib.dashboard.widget.MenuPartyBoxSwitchView;
import com.harman.jbl.partylight.lib.dashboard.widget.MenuSliderView2;
import com.harman.jbl.partylight.lib.dashboard.widget.PartyLightGroupCountView;
import com.harman.jbl.partylight.lib.g;
import i0.C2067c;
import i0.InterfaceC2066b;

/* loaded from: classes2.dex */
public final class o implements InterfaceC2066b {

    /* renamed from: E, reason: collision with root package name */
    @N
    private final ConstraintLayout f55178E;

    /* renamed from: F, reason: collision with root package name */
    @N
    public final MenuSwitchView f55179F;

    /* renamed from: G, reason: collision with root package name */
    @N
    public final MenuSwitchView f55180G;

    /* renamed from: H, reason: collision with root package name */
    @N
    public final MenuSliderView2 f55181H;

    /* renamed from: I, reason: collision with root package name */
    @N
    public final CardView f55182I;

    /* renamed from: J, reason: collision with root package name */
    @N
    public final C2360A f55183J;

    /* renamed from: K, reason: collision with root package name */
    @N
    public final ImageView f55184K;

    /* renamed from: L, reason: collision with root package name */
    @N
    public final ForegroundMaskLayout f55185L;

    /* renamed from: M, reason: collision with root package name */
    @N
    public final PartyLightGroupCountView f55186M;

    /* renamed from: N, reason: collision with root package name */
    @N
    public final ImageView f55187N;

    /* renamed from: O, reason: collision with root package name */
    @N
    public final LinearLayout f55188O;

    /* renamed from: P, reason: collision with root package name */
    @N
    public final LinearLayout f55189P;

    /* renamed from: Q, reason: collision with root package name */
    @N
    public final C f55190Q;

    /* renamed from: R, reason: collision with root package name */
    @N
    public final MenuPartyBoxSwitchView f55191R;

    /* renamed from: S, reason: collision with root package name */
    @N
    public final MatchWidthCardView f55192S;

    /* renamed from: T, reason: collision with root package name */
    @N
    public final LightColorSelectView f55193T;

    /* renamed from: U, reason: collision with root package name */
    @N
    public final LightShowPanelView f55194U;

    /* renamed from: V, reason: collision with root package name */
    @N
    public final ElasticScrollView f55195V;

    /* renamed from: W, reason: collision with root package name */
    @N
    public final MatchWidthCardView f55196W;

    /* renamed from: X, reason: collision with root package name */
    @N
    public final MenuSwitchView f55197X;

    /* renamed from: Y, reason: collision with root package name */
    @N
    public final MenuSliderView2 f55198Y;

    /* renamed from: Z, reason: collision with root package name */
    @N
    public final TextView f55199Z;

    /* renamed from: a0, reason: collision with root package name */
    @N
    public final TextView f55200a0;

    /* renamed from: b0, reason: collision with root package name */
    @N
    public final TextView f55201b0;

    /* renamed from: c0, reason: collision with root package name */
    @N
    public final TextView f55202c0;

    /* renamed from: d0, reason: collision with root package name */
    @N
    public final TextView f55203d0;

    private o(@N ConstraintLayout constraintLayout, @N MenuSwitchView menuSwitchView, @N MenuSwitchView menuSwitchView2, @N MenuSliderView2 menuSliderView2, @N CardView cardView, @N C2360A c2360a, @N ImageView imageView, @N ForegroundMaskLayout foregroundMaskLayout, @N PartyLightGroupCountView partyLightGroupCountView, @N ImageView imageView2, @N LinearLayout linearLayout, @N LinearLayout linearLayout2, @N C c4, @N MenuPartyBoxSwitchView menuPartyBoxSwitchView, @N MatchWidthCardView matchWidthCardView, @N LightColorSelectView lightColorSelectView, @N LightShowPanelView lightShowPanelView, @N ElasticScrollView elasticScrollView, @N MatchWidthCardView matchWidthCardView2, @N MenuSwitchView menuSwitchView3, @N MenuSliderView2 menuSliderView22, @N TextView textView, @N TextView textView2, @N TextView textView3, @N TextView textView4, @N TextView textView5) {
        this.f55178E = constraintLayout;
        this.f55179F = menuSwitchView;
        this.f55180G = menuSwitchView2;
        this.f55181H = menuSliderView2;
        this.f55182I = cardView;
        this.f55183J = c2360a;
        this.f55184K = imageView;
        this.f55185L = foregroundMaskLayout;
        this.f55186M = partyLightGroupCountView;
        this.f55187N = imageView2;
        this.f55188O = linearLayout;
        this.f55189P = linearLayout2;
        this.f55190Q = c4;
        this.f55191R = menuPartyBoxSwitchView;
        this.f55192S = matchWidthCardView;
        this.f55193T = lightColorSelectView;
        this.f55194U = lightShowPanelView;
        this.f55195V = elasticScrollView;
        this.f55196W = matchWidthCardView2;
        this.f55197X = menuSwitchView3;
        this.f55198Y = menuSliderView22;
        this.f55199Z = textView;
        this.f55200a0 = textView2;
        this.f55201b0 = textView3;
        this.f55202c0 = textView4;
        this.f55203d0 = textView5;
    }

    @N
    public static o a(@N View view) {
        View a4;
        View a5;
        int i4 = g.C0418g.f46930j;
        MenuSwitchView menuSwitchView = (MenuSwitchView) C2067c.a(view, i4);
        if (menuSwitchView != null) {
            i4 = g.C0418g.f46942m;
            MenuSwitchView menuSwitchView2 = (MenuSwitchView) C2067c.a(view, i4);
            if (menuSwitchView2 != null) {
                i4 = g.C0418g.f46950o;
                MenuSliderView2 menuSliderView2 = (MenuSliderView2) C2067c.a(view, i4);
                if (menuSliderView2 != null) {
                    i4 = g.C0418g.f46843J;
                    CardView cardView = (CardView) C2067c.a(view, i4);
                    if (cardView != null && (a4 = C2067c.a(view, (i4 = g.C0418g.f46846K))) != null) {
                        C2360A a6 = C2360A.a(a4);
                        i4 = g.C0418g.f46852M;
                        ImageView imageView = (ImageView) C2067c.a(view, i4);
                        if (imageView != null) {
                            i4 = g.C0418g.f46870S;
                            ForegroundMaskLayout foregroundMaskLayout = (ForegroundMaskLayout) C2067c.a(view, i4);
                            if (foregroundMaskLayout != null) {
                                i4 = g.C0418g.f46888Y;
                                PartyLightGroupCountView partyLightGroupCountView = (PartyLightGroupCountView) C2067c.a(view, i4);
                                if (partyLightGroupCountView != null) {
                                    i4 = g.C0418g.f46927i0;
                                    ImageView imageView2 = (ImageView) C2067c.a(view, i4);
                                    if (imageView2 != null) {
                                        i4 = g.C0418g.f46989z0;
                                        LinearLayout linearLayout = (LinearLayout) C2067c.a(view, i4);
                                        if (linearLayout != null) {
                                            i4 = g.C0418g.f46817A0;
                                            LinearLayout linearLayout2 = (LinearLayout) C2067c.a(view, i4);
                                            if (linearLayout2 != null && (a5 = C2067c.a(view, (i4 = g.C0418g.f46823C0))) != null) {
                                                C a7 = C.a(a5);
                                                i4 = g.C0418g.f46856N0;
                                                MenuPartyBoxSwitchView menuPartyBoxSwitchView = (MenuPartyBoxSwitchView) C2067c.a(view, i4);
                                                if (menuPartyBoxSwitchView != null) {
                                                    i4 = g.C0418g.f46871S0;
                                                    MatchWidthCardView matchWidthCardView = (MatchWidthCardView) C2067c.a(view, i4);
                                                    if (matchWidthCardView != null) {
                                                        i4 = g.C0418g.f46889Y0;
                                                        LightColorSelectView lightColorSelectView = (LightColorSelectView) C2067c.a(view, i4);
                                                        if (lightColorSelectView != null) {
                                                            i4 = g.C0418g.f46892Z0;
                                                            LightShowPanelView lightShowPanelView = (LightShowPanelView) C2067c.a(view, i4);
                                                            if (lightShowPanelView != null) {
                                                                i4 = g.C0418g.f46912e1;
                                                                ElasticScrollView elasticScrollView = (ElasticScrollView) C2067c.a(view, i4);
                                                                if (elasticScrollView != null) {
                                                                    i4 = g.C0418g.f46916f1;
                                                                    MatchWidthCardView matchWidthCardView2 = (MatchWidthCardView) C2067c.a(view, i4);
                                                                    if (matchWidthCardView2 != null) {
                                                                        i4 = g.C0418g.f46920g1;
                                                                        MenuSwitchView menuSwitchView3 = (MenuSwitchView) C2067c.a(view, i4);
                                                                        if (menuSwitchView3 != null) {
                                                                            i4 = g.C0418g.f46924h1;
                                                                            MenuSliderView2 menuSliderView22 = (MenuSliderView2) C2067c.a(view, i4);
                                                                            if (menuSliderView22 != null) {
                                                                                i4 = g.C0418g.f46972t1;
                                                                                TextView textView = (TextView) C2067c.a(view, i4);
                                                                                if (textView != null) {
                                                                                    i4 = g.C0418g.f46975u1;
                                                                                    TextView textView2 = (TextView) C2067c.a(view, i4);
                                                                                    if (textView2 != null) {
                                                                                        i4 = g.C0418g.f46848K1;
                                                                                        TextView textView3 = (TextView) C2067c.a(view, i4);
                                                                                        if (textView3 != null) {
                                                                                            i4 = g.C0418g.f46860O1;
                                                                                            TextView textView4 = (TextView) C2067c.a(view, i4);
                                                                                            if (textView4 != null) {
                                                                                                i4 = g.C0418g.f46863P1;
                                                                                                TextView textView5 = (TextView) C2067c.a(view, i4);
                                                                                                if (textView5 != null) {
                                                                                                    return new o((ConstraintLayout) view, menuSwitchView, menuSwitchView2, menuSliderView2, cardView, a6, imageView, foregroundMaskLayout, partyLightGroupCountView, imageView2, linearLayout, linearLayout2, a7, menuPartyBoxSwitchView, matchWidthCardView, lightColorSelectView, lightShowPanelView, elasticScrollView, matchWidthCardView2, menuSwitchView3, menuSliderView22, textView, textView2, textView3, textView4, textView5);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @N
    public static o c(@N LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @N
    public static o e(@N LayoutInflater layoutInflater, @P ViewGroup viewGroup, boolean z3) {
        View inflate = layoutInflater.inflate(g.h.f47015o, viewGroup, false);
        if (z3) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // i0.InterfaceC2066b
    @N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout d() {
        return this.f55178E;
    }
}
