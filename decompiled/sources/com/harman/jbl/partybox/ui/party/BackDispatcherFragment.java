package com.harman.jbl.partybox.ui.party;

import android.os.Bundle;
import android.view.View;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.j;
import androidx.annotation.I;
import androidx.annotation.InterfaceC0566i;
import androidx.fragment.app.ActivityC0889g;
import androidx.fragment.app.Fragment;
import com.google.android.gms.analytics.ecommerce.c;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$3;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$4;
import com.harman.jbl.partybox.ui.dashboard.UiPage;
import com.harman.jbl.partybox.ui.main.o;
import com.harman.log.f;
import com.harman.sdk.device.HmDevice;
import kotlin.A;
import kotlin.E;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.U;
import l3.d;
import l3.e;

@E(d1 = {"\u0000K\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003*\u0001$\b&\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b-\u0010\u0004B\u0013\b\u0016\u0012\b\b\u0001\u0010/\u001a\u00020.¢\u0006\u0004\b-\u00100J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0004J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0004J\u000f\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0002H&¢\u0006\u0004\b\u001a\u0010\u0004J\u0017\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001e8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010,\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u00061"}, d2 = {"Lcom/harman/jbl/partybox/ui/party/BackDispatcherFragment;", "Landroidx/fragment/app/Fragment;", "Lkotlin/H0;", "l0", "()V", "Lcom/harman/jbl/partybox/ui/dashboard/UiPage;", "", "m0", "(Lcom/harman/jbl/partybox/ui/dashboard/UiPage;)Z", "", "macAddress", "isA2DPConnected", "n0", "(Ljava/lang/String;Z)Z", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", c.f27782c, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "onPause", "tag", "()Ljava/lang/String;", "handleOnBackPressed", "page", "onMainDeviceA2DPDisconnected", "(Lcom/harman/jbl/partybox/ui/dashboard/UiPage;)V", "Lcom/harman/jbl/partybox/ui/main/o;", "N0", "Lkotlin/A;", "k0", "()Lcom/harman/jbl/partybox/ui/main/o;", "_mainViewModel", "com/harman/jbl/partybox/ui/party/BackDispatcherFragment$b", "O0", "Lcom/harman/jbl/partybox/ui/party/BackDispatcherFragment$b;", "backPressedCallback", "P0", "Z", "getBackToDesktop", "()Z", "backToDesktop", "<init>", "", "contentLayoutId", "(I)V", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nBackDispatcherFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackDispatcherFragment.kt\ncom/harman/jbl/partybox/ui/party/BackDispatcherFragment\n+ 2 ApplicationViewModelLazy.kt\ncom/harman/jbl/partybox/ApplicationViewModelLazyKt\n*L\n1#1,127:1\n66#2,4:128\n*S KotlinDebug\n*F\n+ 1 BackDispatcherFragment.kt\ncom/harman/jbl/partybox/ui/party/BackDispatcherFragment\n*L\n21#1:128,4\n*E\n"})
/* loaded from: classes2.dex */
public abstract class BackDispatcherFragment extends Fragment {

    /* renamed from: N0, reason: collision with root package name */
    @d
    private final A f44698N0;

    /* renamed from: O0, reason: collision with root package name */
    @d
    private final b f44699O0;

    /* renamed from: P0, reason: collision with root package name */
    private final boolean f44700P0;

    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44701a;

        static {
            int[] iArr = new int[UiPage.values().length];
            try {
                iArr[UiPage.BLUETOOTH_PERMISSION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UiPage.LOCATION_PERMISSION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f44701a = iArr;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends j {
        b() {
            super(false);
        }

        @Override // androidx.activity.j
        public void e() {
            f.b("BackDispatcherFragment", "handleOnBackPressed " + BackDispatcherFragment.this.getClass().getName());
            BackDispatcherFragment.this.handleOnBackPressed();
        }
    }

    public BackDispatcherFragment() {
        this.f44698N0 = ApplicationViewModelLazyKt.f(this, N.d(o.class), new ApplicationViewModelLazyKt$applicationViewModels$3(this), new ApplicationViewModelLazyKt$applicationViewModels$4(this));
        this.f44699O0 = new b();
    }

    private final void l0() {
    }

    private final boolean m0(UiPage uiPage) {
        int i4 = a.f44701a[uiPage.ordinal()];
        if (i4 == 1 || i4 == 2) {
            return true;
        }
        return false;
    }

    private final boolean n0(String str, boolean z3) {
        String n4;
        if (z3) {
            return false;
        }
        HmDevice k12 = k0().k1();
        if (k12 != null && (n4 = k12.n()) != null) {
            return com.harman.jbl.partybox.ui.party.b.f44881a.p(n4, str);
        }
        return true;
    }

    public boolean getBackToDesktop() {
        return this.f44700P0;
    }

    public abstract void handleOnBackPressed();

    @d
    protected final o k0() {
        return (o) this.f44698N0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@e Bundle bundle) {
        OnBackPressedDispatcher d4;
        super.onCreate(bundle);
        ActivityC0889g activity = getActivity();
        if (activity != null && (d4 = activity.d()) != null) {
            d4.b(this.f44699O0);
        }
        T1.a.a("page = " + getClass().getSimpleName());
        l0();
    }

    public void onMainDeviceA2DPDisconnected(@d UiPage page) {
        F.p(page, "page");
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        f.b("BackDispatcherFragment", "onPause " + this);
        this.f44699O0.i(false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        f.b("BackDispatcherFragment", "onResume " + this);
        this.f44699O0.i(true);
    }

    @Override // androidx.fragment.app.Fragment
    @InterfaceC0566i
    public void onViewCreated(@d View view, @e Bundle bundle) {
        F.p(view, "view");
        super.onViewCreated(view, bundle);
    }

    @d
    public String tag() {
        return "BackDispatcherFragment";
    }

    public BackDispatcherFragment(@I int i4) {
        super(i4);
        this.f44698N0 = ApplicationViewModelLazyKt.f(this, N.d(o.class), new ApplicationViewModelLazyKt$applicationViewModels$3(this), new ApplicationViewModelLazyKt$applicationViewModels$4(this));
        this.f44699O0 = new b();
    }
}
