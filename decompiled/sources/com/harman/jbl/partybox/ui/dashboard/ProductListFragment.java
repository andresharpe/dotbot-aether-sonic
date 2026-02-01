package com.harman.jbl.partybox.ui.dashboard;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.core.os.C0741d;
import androidx.fragment.app.ActivityC0889g;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.m0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.C;
import com.google.firebase.messaging.C1821f;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$3;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$4;
import com.harman.jbl.partybox.databinding.Y0;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.connection.model.HmMultiDeviceModel;
import com.harman.jbl.partybox.ui.customviews.DialogType;
import com.harman.jbl.partybox.ui.customviews.HmTurnOnSpeakerDialogFragment;
import com.harman.jbl.partybox.ui.dashboard.Q;
import com.harman.jbl.partybox.ui.delegate.FragmentViewBindingDelegate;
import com.harman.jbl.partybox.ui.main.MainActivityNav;
import com.harman.jbl.partybox.ui.main.o;
import com.harman.jbl.partylight.lib.core.PLGroup;
import com.harman.jbl.partylight.lib.f;
import com.harman.sdk.command.OrigCommand;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.device.PartyBoxDevice;
import com.harman.sdk.device.PartyLightDevice;
import com.harman.sdk.message.BaseMessage;
import com.harman.sdk.message.BatteryInfo;
import com.harman.sdk.message.TWSInfo;
import com.harman.sdk.utils.AudioChannel;
import com.harman.sdk.utils.DeviceProtocol;
import com.harman.sdk.utils.DeviceRole;
import com.harman.sdk.utils.MusicControlSettings;
import com.harman.sdk.utils.PartyConnectStatus;
import com.harman.sdk.utils.PlayerStatus;
import com.harman.sdk.utils.StatusCode;
import com.harman.sdk.utils.UsbStatus;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;
import kotlin.C2122h0;
import kotlin.InterfaceC2229v;
import kotlin.Pair;
import kotlin.collections.C2109w;
import kotlin.collections.C2112z;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlinx.coroutines.C2323l;
import kotlinx.coroutines.InterfaceC2350z;
import y2.InterfaceC2445a;

@kotlin.E(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u0089\u00012\u00020\u00012\u00020\u0002:\u0002\u008a\u0001B\b¢\u0006\u0005\b\u0088\u0001\u0010\u0005J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\fJ\u001f\u0010\u0013\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u001d\u0010\u0019\u001a\u00020\u00032\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001b\u0010\u0005J\u0017\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0017H\u0002¢\u0006\u0004\b!\u0010\"J\u001d\u0010$\u001a\u00020\u00032\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002¢\u0006\u0004\b$\u0010\u001aJ\u0017\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020'2\u0006\u0010&\u001a\u00020*H\u0002¢\u0006\u0004\b+\u0010,J\u001d\u0010.\u001a\u00020\u00032\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00060\u0016H\u0002¢\u0006\u0004\b.\u0010\u001aJ\u001f\u00102\u001a\u00020\u00032\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020'H\u0002¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0003H\u0002¢\u0006\u0004\b4\u0010\u0005J\u001f\u00106\u001a\u00020\u00032\u0006\u00100\u001a\u00020/2\u0006\u00105\u001a\u00020'H\u0002¢\u0006\u0004\b6\u00103J\u000f\u00107\u001a\u00020\u0003H\u0002¢\u0006\u0004\b7\u0010\u0005J\u000f\u00108\u001a\u00020\u0003H\u0002¢\u0006\u0004\b8\u0010\u0005J\u001f\u0010:\u001a\u00020\u00032\u0006\u00100\u001a\u00020/2\u0006\u00109\u001a\u00020\u0011H\u0002¢\u0006\u0004\b:\u0010;J\u001f\u0010=\u001a\u00020\u00032\u0006\u00100\u001a\u00020/2\u0006\u0010<\u001a\u00020'H\u0002¢\u0006\u0004\b=\u00103J\u001d\u0010>\u001a\u00020\u00032\f\u0010#\u001a\b\u0012\u0004\u0012\u00020'0\u0016H\u0002¢\u0006\u0004\b>\u0010\u001aJ+\u0010A\u001a\u00020\u00112\f\u0010?\u001a\b\u0012\u0004\u0012\u00020'0\u00162\f\u0010@\u001a\b\u0012\u0004\u0012\u00020'0\u0016H\u0002¢\u0006\u0004\bA\u0010BJ\u0017\u0010C\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\bC\u0010\fJ\u000f\u0010D\u001a\u00020\u0003H\u0016¢\u0006\u0004\bD\u0010\u0005J\u0019\u0010G\u001a\u00020\u00032\b\u0010F\u001a\u0004\u0018\u00010EH\u0016¢\u0006\u0004\bG\u0010HJ!\u0010K\u001a\u00020\u00032\u0006\u0010J\u001a\u00020I2\b\u0010F\u001a\u0004\u0018\u00010EH\u0016¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020\u0003H\u0016¢\u0006\u0004\bM\u0010\u0005J\r\u0010N\u001a\u00020\u0003¢\u0006\u0004\bN\u0010\u0005J\u0017\u0010P\u001a\u00020\u00032\u0006\u0010O\u001a\u00020IH\u0016¢\u0006\u0004\bP\u0010QJ\r\u0010R\u001a\u00020\u0003¢\u0006\u0004\bR\u0010\u0005J\r\u0010S\u001a\u00020\u0003¢\u0006\u0004\bS\u0010\u0005R\u0014\u0010V\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010UR\u001b\u0010[\u001a\u00020W8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010X\u001a\u0004\bY\u0010ZR\u001b\u0010`\u001a\u00020\\8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010]\u001a\u0004\b^\u0010_R\u001b\u0010d\u001a\u00020a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010]\u001a\u0004\bb\u0010cR'\u0010k\u001a\u0012\u0012\u0004\u0012\u00020'0ej\b\u0012\u0004\u0012\u00020'`f8\u0006¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR$\u0010s\u001a\u0004\u0018\u00010l8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bm\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR\"\u0010v\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bt\u0010u\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR\"\u0010{\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bz\u0010u\u001a\u0004\b{\u0010w\"\u0004\b|\u0010yR\"\u0010~\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b}\u0010u\u001a\u0004\b~\u0010w\"\u0004\b\u007f\u0010yR\u001c\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0080\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001c\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0084\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001¨\u0006\u008b\u0001"}, d2 = {"Lcom/harman/jbl/partybox/ui/dashboard/ProductListFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/View$OnClickListener;", "Lkotlin/H0;", "z0", "()V", "", "deviceMAC", "renameText", "Q0", "(Ljava/lang/String;Ljava/lang/String;)V", "L0", "(Ljava/lang/String;)V", "deviceMac", "K0", "M0", "A0", "", "isConnected", "H0", "(Ljava/lang/String;Z)V", "I0", "", "Lcom/harman/sdk/device/HmDevice;", "list", "B0", "(Ljava/util/List;)V", "P0", "Lcom/harman/jbl/partybox/ui/musiccontrol/g;", C1821f.C0339f.a.f37006R, "O0", "(Lcom/harman/jbl/partybox/ui/musiccontrol/g;)V", "hmDevice", "G0", "(Lcom/harman/sdk/device/HmDevice;)V", "deviceList", "t0", "Lcom/harman/sdk/device/PartyBoxDevice;", "harmanDevice", "Lcom/harman/jbl/partybox/ui/connection/model/HmMultiDeviceModel;", "o0", "(Lcom/harman/sdk/device/PartyBoxDevice;)Lcom/harman/jbl/partybox/ui/connection/model/HmMultiDeviceModel;", "Lcom/harman/sdk/device/PartyLightDevice;", "p0", "(Lcom/harman/sdk/device/PartyLightDevice;)Lcom/harman/jbl/partybox/ui/connection/model/HmMultiDeviceModel;", "macStringList", "n0", "", "position", "device", "m0", "(ILcom/harman/jbl/partybox/ui/connection/model/HmMultiDeviceModel;)V", "E0", "dev", "r0", "D0", "J0", "isConnecting", "C0", "(IZ)V", "selectedModel", "q0", "N0", "currentList", "updatedList", "s0", "(Ljava/util/List;Ljava/util/List;)Z", "F0", "onDestroy", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", com.google.android.gms.analytics.ecommerce.c.f27782c, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "handleConnectFail", "v", "onClick", "(Landroid/view/View;)V", "resetConnectState", "showTurnOnSpeakerDialog", "Lcom/harman/jbl/partybox/ui/customviews/HmTurnOnSpeakerDialogFragment;", "Lcom/harman/jbl/partybox/ui/customviews/HmTurnOnSpeakerDialogFragment;", "mTurnOnSpeakerDialog", "Lcom/harman/jbl/partybox/databinding/Y0;", "Lcom/harman/jbl/partybox/ui/delegate/FragmentViewBindingDelegate;", "w0", "()Lcom/harman/jbl/partybox/databinding/Y0;", "binding", "Lcom/harman/jbl/partybox/ui/main/o;", "Lkotlin/A;", "x0", "()Lcom/harman/jbl/partybox/ui/main/o;", "mainViewModel", "Lcom/harman/jbl/partybox/ui/musiccontrol/h;", "y0", "()Lcom/harman/jbl/partybox/ui/musiccontrol/h;", "musicControlViewModel", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "R0", "Ljava/util/ArrayList;", "getMasterDeviceList", "()Ljava/util/ArrayList;", "masterDeviceList", "Lcom/harman/jbl/partybox/ui/dashboard/adapter/e;", "S0", "Lcom/harman/jbl/partybox/ui/dashboard/adapter/e;", "getProductListDeviceAdapter", "()Lcom/harman/jbl/partybox/ui/dashboard/adapter/e;", "setProductListDeviceAdapter", "(Lcom/harman/jbl/partybox/ui/dashboard/adapter/e;)V", "productListDeviceAdapter", "T0", "Z", "isConnectionInProgress", "()Z", "setConnectionInProgress", "(Z)V", "U0", "isFirstTimeAutoScroll", "setFirstTimeAutoScroll", "V0", ProductListFragment.f43007Z0, "setFromSwitchSpeaker", "Lcom/harman/jbl/partybox/ui/dashboard/StereoEffectDialog;", "W0", "Lcom/harman/jbl/partybox/ui/dashboard/StereoEffectDialog;", "stereoEffectDialog", "Lcom/harman/jbl/partybox/ui/dashboard/RemoveProductDialogFragment;", "X0", "Lcom/harman/jbl/partybox/ui/dashboard/RemoveProductDialogFragment;", "removeProductDialogFragment", "<init>", "Companion", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@kotlin.jvm.internal.U({"SMAP\nProductListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductListFragment.kt\ncom/harman/jbl/partybox/ui/dashboard/ProductListFragment\n+ 2 ApplicationViewModelLazy.kt\ncom/harman/jbl/partybox/ApplicationViewModelLazyKt\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 7 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,1197:1\n66#2,4:1198\n84#3,6:1202\n350#4,7:1208\n350#4,7:1215\n350#4,7:1222\n350#4,7:1229\n350#4,7:1236\n350#4,7:1243\n350#4,7:1250\n288#4,2:1258\n350#4,7:1260\n350#4,7:1267\n1477#4:1274\n1502#4,3:1275\n1505#4,3:1285\n1549#4:1296\n1620#4,3:1297\n1549#4:1301\n1620#4,3:1302\n1549#4:1305\n1620#4,3:1306\n350#4,7:1309\n766#4:1316\n857#4,2:1317\n1855#4,2:1319\n350#4,7:1321\n1549#4:1328\n1620#4,3:1329\n1549#4:1332\n1620#4,3:1333\n1#5:1257\n372#6,7:1278\n526#6:1288\n511#6,6:1289\n215#7:1295\n216#7:1300\n*S KotlinDebug\n*F\n+ 1 ProductListFragment.kt\ncom/harman/jbl/partybox/ui/dashboard/ProductListFragment\n*L\n73#1:1198,4\n74#1:1202,6\n223#1:1208,7\n236#1:1215,7\n247#1:1222,7\n257#1:1229,7\n268#1:1236,7\n290#1:1243,7\n309#1:1250,7\n351#1:1258,2\n425#1:1260,7\n441#1:1267,7\n512#1:1274\n512#1:1275,3\n512#1:1285,3\n516#1:1296\n516#1:1297,3\n558#1:1301\n558#1:1302,3\n590#1:1305\n590#1:1306,3\n610#1:1309,7\n719#1:1316\n719#1:1317,2\n722#1:1319,2\n976#1:1321,7\n1162#1:1328\n1162#1:1329,3\n1163#1:1332\n1163#1:1333,3\n512#1:1278,7\n512#1:1288\n512#1:1289,6\n513#1:1295\n513#1:1300\n*E\n"})
/* loaded from: classes2.dex */
public final class ProductListFragment extends Fragment implements View.OnClickListener {

    @l3.d
    public static final String TAG = "ProductListFragment";

    /* renamed from: Z0, reason: collision with root package name */
    @l3.d
    private static final String f43007Z0 = "isFromSwitchSpeaker";

    /* renamed from: N0, reason: collision with root package name */
    @l3.d
    private final HmTurnOnSpeakerDialogFragment f43008N0;

    /* renamed from: O0, reason: collision with root package name */
    @l3.d
    private final FragmentViewBindingDelegate f43009O0;

    /* renamed from: P0, reason: collision with root package name */
    @l3.d
    private final kotlin.A f43010P0;

    /* renamed from: Q0, reason: collision with root package name */
    @l3.d
    private final kotlin.A f43011Q0;

    /* renamed from: R0, reason: collision with root package name */
    @l3.d
    private final ArrayList<HmMultiDeviceModel> f43012R0;

    /* renamed from: S0, reason: collision with root package name */
    @l3.e
    private com.harman.jbl.partybox.ui.dashboard.adapter.e f43013S0;

    /* renamed from: T0, reason: collision with root package name */
    private boolean f43014T0;

    /* renamed from: U0, reason: collision with root package name */
    private boolean f43015U0;

    /* renamed from: V0, reason: collision with root package name */
    private boolean f43016V0;

    /* renamed from: W0, reason: collision with root package name */
    @l3.e
    private StereoEffectDialog f43017W0;

    /* renamed from: X0, reason: collision with root package name */
    @l3.e
    private RemoveProductDialogFragment f43018X0;

    /* renamed from: Y0, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.n<Object>[] f43006Y0 = {kotlin.jvm.internal.N.u(new PropertyReference1Impl(ProductListFragment.class, "binding", "getBinding()Lcom/harman/jbl/partybox/databinding/FragmentProductListBinding;", 0))};

    @l3.d
    public static final a Companion = new a(null);

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @W2.n
        @l3.d
        public final ProductListFragment a(boolean z3) {
            ProductListFragment productListFragment = new ProductListFragment();
            productListFragment.setArguments(C0741d.b(C2122h0.a(ProductListFragment.f43007Z0, Boolean.valueOf(z3))));
            return productListFragment;
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    /* synthetic */ class b extends FunctionReferenceImpl implements X2.l<View, Y0> {

        /* renamed from: N, reason: collision with root package name */
        public static final b f43021N = new b();

        b() {
            super(1, Y0.class, "bind", "bind(Landroid/view/View;)Lcom/harman/jbl/partybox/databinding/FragmentProductListBinding;", 0);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: C0, reason: merged with bridge method [inline-methods] */
        public final Y0 C(@l3.d View p02) {
            kotlin.jvm.internal.F.p(p02, "p0");
            return Y0.a(p02);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.dashboard.ProductListFragment$doConnectPartyBox$1", f = "ProductListFragment.kt", i = {0, 0}, l = {1101}, m = "invokeSuspend", n = {"targetDevice", C.a.f28602a}, s = {"L$0", "L$1"})
    /* loaded from: classes2.dex */
    public static final class c extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super kotlin.H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        Object f43022I;

        /* renamed from: J, reason: collision with root package name */
        Object f43023J;

        /* renamed from: K, reason: collision with root package name */
        int f43024K;

        /* renamed from: M, reason: collision with root package name */
        final /* synthetic */ int f43026M;

        /* renamed from: N, reason: collision with root package name */
        final /* synthetic */ HmMultiDeviceModel f43027N;

        /* loaded from: classes2.dex */
        public static final class a implements InterfaceC2445a.InterfaceC0551a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ HmDevice f43028a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ HmMultiDeviceModel f43029b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ProductListFragment f43030c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f43031d;

            a(HmDevice hmDevice, HmMultiDeviceModel hmMultiDeviceModel, ProductListFragment productListFragment, int i4) {
                this.f43028a = hmDevice;
                this.f43029b = hmMultiDeviceModel;
                this.f43030c = productListFragment;
                this.f43031d = i4;
            }

            @Override // y2.InterfaceC2445a.InterfaceC0551a
            public void a(@l3.e HmDevice hmDevice, int i4, @l3.d DeviceProtocol protocol) {
                kotlin.jvm.internal.F.p(protocol, "protocol");
                if (!com.harman.jbl.partybox.ui.party.b.f44881a.o(this.f43028a, hmDevice) || 2 != i4) {
                    return;
                }
                this.f43029b.e0(true);
                com.harman.log.f.a(ProductListFragment.TAG, " BLE_LOG The selected currentItem is : onStatusChanged");
                com.harman.sdk.impl.connect.i c4 = com.harman.sdk.b.f47608a.c(this.f43028a);
                if (c4 != null) {
                    c4.d(this);
                }
                this.f43030c.C0(this.f43031d, true);
            }

            @Override // y2.InterfaceC2445a.InterfaceC0551a
            public void b(@l3.d HmDevice hmDevice) {
                InterfaceC2445a.InterfaceC0551a.C0552a.a(this, hmDevice);
            }

            @Override // y2.InterfaceC2445a.InterfaceC0551a
            public void c(@l3.d HmDevice device) {
                kotlin.jvm.internal.F.p(device, "device");
                if (!com.harman.jbl.partybox.ui.party.b.f44881a.o(this.f43028a, device)) {
                    return;
                }
                this.f43029b.e0(true);
                com.harman.log.f.a(ProductListFragment.TAG, " BLE_LOG The selected currentItem is : onStandbyDeviceBLEConnected");
                com.harman.sdk.impl.connect.i c4 = com.harman.sdk.b.f47608a.c(this.f43028a);
                if (c4 != null) {
                    c4.d(this);
                }
                this.f43030c.C0(this.f43031d, true);
            }

            @Override // y2.InterfaceC2445a.InterfaceC0551a
            public void d(@l3.d BaseMessage deviceMessage) {
                kotlin.jvm.internal.F.p(deviceMessage, "deviceMessage");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i4, HmMultiDeviceModel hmMultiDeviceModel, kotlin.coroutines.c<? super c> cVar) {
            super(2, cVar);
            this.f43026M = i4;
            this.f43027N = hmMultiDeviceModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            HmDevice A12;
            a aVar;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f43024K;
            if (i4 != 0) {
                if (i4 == 1) {
                    aVar = (a) this.f43023J;
                    A12 = (HmDevice) this.f43022I;
                    kotlin.W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.W.n(obj);
                com.harman.log.f.a(ProductListFragment.TAG, " BLE_LOG The selected currentItem is : selectedModel");
                ProductListFragment.this.setConnectionInProgress(true);
                ProductListFragment.this.C0(this.f43026M, true);
                ProductListFragment.this.x0().N0(this.f43027N.F());
                A12 = ProductListFragment.this.x0().A1(this.f43027N.F());
                if (A12 != null) {
                    a aVar2 = new a(A12, this.f43027N, ProductListFragment.this, this.f43026M);
                    com.harman.sdk.impl.connect.i c4 = com.harman.sdk.b.f47608a.c(A12);
                    if (c4 != null) {
                        c4.c(aVar2);
                    }
                    com.harman.jbl.partybox.ui.business.a aVar3 = com.harman.jbl.partybox.ui.business.a.f42135a;
                    this.f43022I = A12;
                    this.f43023J = aVar2;
                    this.f43024K = 1;
                    Object h4 = aVar3.h(A12, this);
                    if (h4 == l4) {
                        return l4;
                    }
                    aVar = aVar2;
                    obj = h4;
                }
                ProductListFragment.this.setConnectionInProgress(false);
                ProductListFragment.this.C0(this.f43026M, false);
                return kotlin.H0.f51801a;
            }
            if (((Boolean) obj).booleanValue()) {
                ProductListFragment.this.x0().P0(this.f43027N.F());
                ProductListFragment.this.x0().z0();
            } else {
                this.f43027N.e0(false);
                ProductListFragment.this.x0().O0(this.f43027N.F());
            }
            com.harman.sdk.impl.connect.i c5 = com.harman.sdk.b.f47608a.c(A12);
            if (c5 != null) {
                c5.d(aVar);
            }
            ProductListFragment.this.setConnectionInProgress(false);
            ProductListFragment.this.C0(this.f43026M, false);
            return kotlin.H0.f51801a;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super kotlin.H0> cVar) {
            return ((c) v(u3, cVar)).D(kotlin.H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<kotlin.H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new c(this.f43026M, this.f43027N, cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.dashboard.ProductListFragment$doConnectPartyLight$1", f = "ProductListFragment.kt", i = {}, l = {915}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class d extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super kotlin.H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f43032I;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ int f43034K;

        /* renamed from: L, reason: collision with root package name */
        final /* synthetic */ HmMultiDeviceModel f43035L;

        /* loaded from: classes2.dex */
        public static final class a implements com.harman.jbl.partylight.lib.d {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ HmDevice f43036a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ProductListFragment f43037b;

            /* renamed from: com.harman.jbl.partybox.ui.dashboard.ProductListFragment$d$a$a, reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0371a implements z2.d {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ HmDevice f43038a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC2350z<byte[]> f43039b;

                C0371a(HmDevice hmDevice, InterfaceC2350z<byte[]> interfaceC2350z) {
                    this.f43038a = hmDevice;
                    this.f43039b = interfaceC2350z;
                }

                @Override // z2.d
                public void a(@l3.d HmDevice device, @l3.d StatusCode code, @l3.d BaseMessage msg) {
                    byte[] bArr;
                    String str;
                    kotlin.jvm.internal.F.p(device, "device");
                    kotlin.jvm.internal.F.p(code, "code");
                    kotlin.jvm.internal.F.p(msg, "msg");
                    String n4 = this.f43038a.n();
                    Object a4 = msg.a();
                    byte[] bArr2 = null;
                    if (a4 instanceof byte[]) {
                        bArr = (byte[]) a4;
                    } else {
                        bArr = null;
                    }
                    if (bArr != null) {
                        str = com.harman.jbl.cd_biz_comm.utils.i.f(bArr);
                    } else {
                        str = null;
                    }
                    com.harman.jbl.cd_biz_comm.logger.d.a(ProductListFragment.TAG, "MainSpeakerMutual onRead:device = " + n4 + ", msg = " + str);
                    InterfaceC2350z<byte[]> interfaceC2350z = this.f43039b;
                    Object a5 = msg.a();
                    if (a5 instanceof byte[]) {
                        bArr2 = (byte[]) a5;
                    }
                    interfaceC2350z.F0(bArr2);
                }

                @Override // z2.d
                public void b(@l3.d HmDevice device, @l3.d StatusCode code, @l3.d BaseMessage msg) {
                    byte[] bArr;
                    kotlin.jvm.internal.F.p(device, "device");
                    kotlin.jvm.internal.F.p(code, "code");
                    kotlin.jvm.internal.F.p(msg, "msg");
                    String n4 = this.f43038a.n();
                    Object a4 = msg.a();
                    String str = null;
                    if (a4 instanceof byte[]) {
                        bArr = (byte[]) a4;
                    } else {
                        bArr = null;
                    }
                    if (bArr != null) {
                        str = com.harman.jbl.cd_biz_comm.utils.i.f(bArr);
                    }
                    com.harman.jbl.cd_biz_comm.logger.d.a(ProductListFragment.TAG, "MainSpeakerMutual onRead:device = " + n4 + ", msg = " + str);
                }
            }

            a(HmDevice hmDevice, ProductListFragment productListFragment) {
                this.f43036a = hmDevice;
                this.f43037b = productListFragment;
            }

            @Override // com.harman.jbl.partylight.lib.d
            @l3.e
            public Object a(@l3.d byte[] bArr, @l3.d kotlin.coroutines.c<? super byte[]> cVar) {
                com.harman.jbl.cd_biz_comm.logger.d.a(ProductListFragment.TAG, "MainSpeakerMutual writeData:device = " + this.f43036a.n() + ", data = " + com.harman.jbl.cd_biz_comm.utils.i.f(bArr));
                InterfaceC2350z c4 = kotlinx.coroutines.B.c(null, 1, null);
                com.harman.sdk.impl.connect.i c5 = com.harman.sdk.b.f47608a.c(this.f43036a);
                if (c5 != null) {
                    c5.G(this.f43036a, new OrigCommand(bArr), new C0371a(this.f43036a, c4));
                }
                return c4.c0(cVar);
            }

            @Override // com.harman.jbl.partylight.lib.d
            @l3.e
            public Object b(@l3.d kotlin.coroutines.c<? super Boolean> cVar) {
                boolean z3;
                HmDevice k12 = this.f43037b.x0().k1();
                if (k12 != null) {
                    z3 = k12.R();
                } else {
                    z3 = false;
                }
                return kotlin.coroutines.jvm.internal.a.a(z3);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i4, HmMultiDeviceModel hmMultiDeviceModel, kotlin.coroutines.c<? super d> cVar) {
            super(2, cVar);
            this.f43034K = i4;
            this.f43035L = hmMultiDeviceModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            a aVar;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f43032I;
            if (i4 != 0) {
                if (i4 == 1) {
                    kotlin.W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.W.n(obj);
                ProductListFragment.this.setConnectionInProgress(true);
                ProductListFragment.this.C0(this.f43034K, true);
                com.harman.jbl.partylight.lib.f a4 = com.harman.jbl.partylight.lib.f.f46571a.a();
                PLGroup O3 = this.f43035L.O();
                kotlin.jvm.internal.F.m(O3);
                HmDevice k12 = ProductListFragment.this.x0().k1();
                if (k12 != null) {
                    aVar = new a(k12, ProductListFragment.this);
                } else {
                    aVar = null;
                }
                this.f43032I = 1;
                obj = f.b.b(a4, O3, null, aVar, this, 2, null);
                if (obj == l4) {
                    return l4;
                }
            }
            ProductListFragment.this.setConnectionInProgress(false);
            ProductListFragment.this.C0(this.f43034K, false);
            return kotlin.H0.f51801a;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super kotlin.H0> cVar) {
            return ((d) v(u3, cVar)).D(kotlin.H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<kotlin.H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new d(this.f43034K, this.f43035L, cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class e extends Lambda implements X2.p<HmDevice, HmDevice, Integer> {

        /* renamed from: F, reason: collision with root package name */
        public static final e f43040F = new e();

        e() {
            super(2);
        }

        @Override // X2.p
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Integer c0(HmDevice hmDevice, HmDevice hmDevice2) {
            int u3;
            if (hmDevice2.J() != hmDevice.J()) {
                if (hmDevice2.J() == DeviceRole.MASTER) {
                    u3 = 1;
                } else {
                    u3 = -1;
                }
            } else if (hmDevice2.R() != hmDevice.R()) {
                u3 = Boolean.compare(hmDevice2.R(), hmDevice.R());
            } else if (hmDevice2.O() != hmDevice.O()) {
                u3 = Boolean.compare(hmDevice2.O(), hmDevice.O());
            } else {
                u3 = kotlin.jvm.internal.F.u(hmDevice2.x(), hmDevice.x());
            }
            return Integer.valueOf(u3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class f extends Lambda implements X2.l<Pair<? extends String, ? extends Boolean>, kotlin.H0> {
        f() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ kotlin.H0 C(Pair<? extends String, ? extends Boolean> pair) {
            c(pair);
            return kotlin.H0.f51801a;
        }

        public final void c(Pair<String, Boolean> pair) {
            com.harman.log.f.a(ProductListFragment.TAG, "ProductListFragment,bleConnectStatusLiveData " + pair);
            com.harman.log.f.a(ProductListFragment.TAG, "BLE_LOG connectAndCheckInfo connect success:" + pair);
            ProductListFragment.this.H0(pair.e(), pair.f().booleanValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class g extends Lambda implements X2.l<String, kotlin.H0> {
        g() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ kotlin.H0 C(String str) {
            c(str);
            return kotlin.H0.f51801a;
        }

        public final void c(String str) {
            com.harman.log.f.a(ProductListFragment.TAG, "ProductListFragment,removeOfflineDeviceLiveData " + str);
            ProductListFragment.this.A0(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class h extends Lambda implements X2.l<String, kotlin.H0> {
        h() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ kotlin.H0 C(String str) {
            c(str);
            return kotlin.H0.f51801a;
        }

        public final void c(String str) {
            com.harman.log.f.a(ProductListFragment.TAG, "ProductListFragment,deviceGroupInfoChangedLiveData called: " + str);
            ProductListFragment productListFragment = ProductListFragment.this;
            kotlin.jvm.internal.F.m(str);
            productListFragment.K0(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class i extends Lambda implements X2.l<List<? extends HmDevice>, kotlin.H0> {
        i() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ kotlin.H0 C(List<? extends HmDevice> list) {
            c(list);
            return kotlin.H0.f51801a;
        }

        public final void c(List<? extends HmDevice> list) {
            if (list != null) {
                ProductListFragment productListFragment = ProductListFragment.this;
                com.harman.log.f.a(ProductListFragment.TAG, "BLE_LOG ProductListFragment deviceList Observer called and size is : " + list.size());
                try {
                    productListFragment.t0(list);
                } catch (Exception e4) {
                    T1.a.b("ProductListFragment fetchDeviceList " + e4.getMessage());
                    e4.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class j extends Lambda implements X2.l<UiPage, kotlin.H0> {

        /* loaded from: classes2.dex */
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f43046a;

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
                try {
                    iArr[UiPage.DISCOVERY.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f43046a = iArr;
            }
        }

        j() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ kotlin.H0 C(UiPage uiPage) {
            c(uiPage);
            return kotlin.H0.f51801a;
        }

        public final void c(UiPage uiPage) {
            if (uiPage != null) {
                ProductListFragment productListFragment = ProductListFragment.this;
                com.harman.log.f.a(ProductListFragment.TAG, "BLE_LOG ProductListFragment updateUiPage and page is : " + uiPage);
                if (productListFragment.isAdded()) {
                    int i4 = a.f43046a[uiPage.ordinal()];
                    if (i4 != 1 && i4 != 2) {
                        if (i4 == 3) {
                            androidx.navigation.I c4 = Q.c();
                            kotlin.jvm.internal.F.o(c4, "actionToDiscoveryFragment(...)");
                            com.harman.jbl.partybox.utils.q.f(productListFragment, c4);
                            return;
                        }
                        return;
                    }
                    productListFragment.x0().c3(false);
                    Q.b d4 = Q.d();
                    kotlin.jvm.internal.F.o(d4, "actionToPermissionsGrantFragment(...)");
                    com.harman.jbl.partybox.utils.q.f(productListFragment, d4);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class k extends Lambda implements X2.l<Boolean, kotlin.H0> {
        k() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ kotlin.H0 C(Boolean bool) {
            c(bool);
            return kotlin.H0.f51801a;
        }

        public final void c(Boolean bool) {
            kotlin.jvm.internal.F.m(bool);
            if (bool.booleanValue()) {
                com.harman.log.f.a(ProductListFragment.TAG, "BLE_LOG ProductListFragment resetProductList observer called");
                ProductListFragment.this.resetConnectState();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class l extends Lambda implements X2.l<Boolean, kotlin.H0> {
        l() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ kotlin.H0 C(Boolean bool) {
            c(bool);
            return kotlin.H0.f51801a;
        }

        public final void c(Boolean bool) {
            float f4;
            int a4 = com.harman.jbl.partybox.utils.j.a(ProductListFragment.this.getContext(), 70.0f);
            int a5 = com.harman.jbl.partybox.utils.j.a(ProductListFragment.this.getContext(), 16.0f);
            Context context = ProductListFragment.this.getContext();
            kotlin.jvm.internal.F.m(bool);
            if (bool.booleanValue()) {
                f4 = 90.0f;
            } else {
                f4 = 0.0f;
            }
            ProductListFragment.this.w0().f39243F.setPadding(a5, a4, a5, com.harman.jbl.partybox.utils.j.a(context, f4));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class m extends Lambda implements X2.l<HmDevice, kotlin.H0> {
        m() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ kotlin.H0 C(HmDevice hmDevice) {
            c(hmDevice);
            return kotlin.H0.f51801a;
        }

        public final void c(HmDevice hmDevice) {
            com.harman.log.f.a(ProductListFragment.TAG, "ProductListFragment connectDeviceLiveData observe call");
            HmDevice k12 = ProductListFragment.this.x0().k1();
            if (k12 != null) {
                ProductListFragment.this.G0(k12);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class n extends Lambda implements X2.l<PartyBoxDevice, kotlin.H0> {
        n() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ kotlin.H0 C(PartyBoxDevice partyBoxDevice) {
            c(partyBoxDevice);
            return kotlin.H0.f51801a;
        }

        public final void c(PartyBoxDevice partyBoxDevice) {
            com.harman.log.f.a(ProductListFragment.TAG, "ProductListFragment connectDeviceLiveData observe call");
            ProductListFragment.this.P0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class o extends Lambda implements X2.l<Boolean, kotlin.H0> {
        o() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ kotlin.H0 C(Boolean bool) {
            c(bool);
            return kotlin.H0.f51801a;
        }

        public final void c(Boolean bool) {
            HmDevice k12;
            com.harman.log.f.a(ProductListFragment.TAG, "ProductListFragment,wakeupDeviceResult result :" + bool);
            if (bool.booleanValue() && (k12 = ProductListFragment.this.x0().k1()) != null) {
                ProductListFragment productListFragment = ProductListFragment.this;
                com.harman.log.f.a(ProductListFragment.TAG, "ProductListFragment,wakeupDeviceResult " + k12.f());
                productListFragment.G0(k12);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class p extends Lambda implements X2.l<List<? extends HmDevice>, kotlin.H0> {

        /* renamed from: F, reason: collision with root package name */
        public static final p f43052F = new p();

        p() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ kotlin.H0 C(List<? extends HmDevice> list) {
            c(list);
            return kotlin.H0.f51801a;
        }

        public final void c(List<? extends HmDevice> list) {
            com.harman.log.f.a(ProductListFragment.TAG, "ProductListFragment,sameBTConnectedEffectDeviceList " + list.size());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class q extends Lambda implements X2.l<Pair<? extends String, ? extends Boolean>, kotlin.H0> {
        q() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ kotlin.H0 C(Pair<? extends String, ? extends Boolean> pair) {
            c(pair);
            return kotlin.H0.f51801a;
        }

        public final void c(Pair<String, Boolean> pair) {
            com.harman.log.f.a(ProductListFragment.TAG, "ProductListFragment,btConnectStatusLiveData " + pair);
            ProductListFragment.this.I0(pair.e(), pair.f().booleanValue());
        }
    }

    /* loaded from: classes2.dex */
    static final class r extends Lambda implements X2.a<kotlin.H0> {

        /* renamed from: F, reason: collision with root package name */
        public static final r f43054F = new r();

        r() {
            super(0);
        }

        public final void c() {
        }

        @Override // X2.a
        public /* bridge */ /* synthetic */ kotlin.H0 n() {
            c();
            return kotlin.H0.f51801a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class s implements androidx.lifecycle.Q, kotlin.jvm.internal.A {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ X2.l f43055a;

        s(X2.l function) {
            kotlin.jvm.internal.F.p(function, "function");
            this.f43055a = function;
        }

        @Override // kotlin.jvm.internal.A
        @l3.d
        public final InterfaceC2229v<?> a() {
            return this.f43055a;
        }

        public final boolean equals(@l3.e Object obj) {
            if ((obj instanceof androidx.lifecycle.Q) && (obj instanceof kotlin.jvm.internal.A)) {
                return kotlin.jvm.internal.F.g(a(), ((kotlin.jvm.internal.A) obj).a());
            }
            return false;
        }

        @Override // androidx.lifecycle.Q
        public final /* synthetic */ void f(Object obj) {
            this.f43055a.C(obj);
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class t extends Lambda implements X2.p<Integer, HmMultiDeviceModel, kotlin.H0> {

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.dashboard.ProductListFragment$setupView$1$1$1", f = "ProductListFragment.kt", i = {}, l = {804}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: classes2.dex */
        public static final class a extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super kotlin.H0>, Object> {

            /* renamed from: I, reason: collision with root package name */
            int f43057I;

            /* renamed from: J, reason: collision with root package name */
            final /* synthetic */ ProductListFragment f43058J;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ProductListFragment productListFragment, kotlin.coroutines.c<? super a> cVar) {
                super(2, cVar);
                this.f43058J = productListFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                Object l4;
                l4 = kotlin.coroutines.intrinsics.b.l();
                int i4 = this.f43057I;
                if (i4 != 0) {
                    if (i4 == 1) {
                        kotlin.W.n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    kotlin.W.n(obj);
                    HmDevice k12 = this.f43058J.x0().k1();
                    if (k12 != null) {
                        this.f43057I = 1;
                        if (com.harman.jbl.partybox.ui.a.f42082a.a().b((PartyBoxDevice) k12, this) == l4) {
                            return l4;
                        }
                    }
                }
                return kotlin.H0.f51801a;
            }

            @Override // X2.p
            @l3.e
            /* renamed from: R, reason: merged with bridge method [inline-methods] */
            public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super kotlin.H0> cVar) {
                return ((a) v(u3, cVar)).D(kotlin.H0.f51801a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.d
            public final kotlin.coroutines.c<kotlin.H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
                return new a(this.f43058J, cVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.dashboard.ProductListFragment$setupView$1$2$1", f = "ProductListFragment.kt", i = {}, l = {819}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: classes2.dex */
        public static final class b extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super kotlin.H0>, Object> {

            /* renamed from: I, reason: collision with root package name */
            int f43059I;

            /* renamed from: J, reason: collision with root package name */
            final /* synthetic */ ProductListFragment f43060J;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(ProductListFragment productListFragment, kotlin.coroutines.c<? super b> cVar) {
                super(2, cVar);
                this.f43060J = productListFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                Object l4;
                l4 = kotlin.coroutines.intrinsics.b.l();
                int i4 = this.f43059I;
                if (i4 != 0) {
                    if (i4 == 1) {
                        kotlin.W.n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    kotlin.W.n(obj);
                    HmDevice k12 = this.f43060J.x0().k1();
                    if (k12 != null) {
                        this.f43059I = 1;
                        if (com.harman.jbl.partybox.ui.a.f42082a.a().b((PartyBoxDevice) k12, this) == l4) {
                            return l4;
                        }
                    }
                }
                return kotlin.H0.f51801a;
            }

            @Override // X2.p
            @l3.e
            /* renamed from: R, reason: merged with bridge method [inline-methods] */
            public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super kotlin.H0> cVar) {
                return ((b) v(u3, cVar)).D(kotlin.H0.f51801a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.d
            public final kotlin.coroutines.c<kotlin.H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
                return new b(this.f43060J, cVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.dashboard.ProductListFragment$setupView$1$3", f = "ProductListFragment.kt", i = {}, l = {839}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: classes2.dex */
        public static final class c extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super kotlin.H0>, Object> {

            /* renamed from: I, reason: collision with root package name */
            int f43061I;

            /* renamed from: J, reason: collision with root package name */
            final /* synthetic */ ProductListFragment f43062J;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(ProductListFragment productListFragment, kotlin.coroutines.c<? super c> cVar) {
                super(2, cVar);
                this.f43062J = productListFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                Object l4;
                l4 = kotlin.coroutines.intrinsics.b.l();
                int i4 = this.f43061I;
                if (i4 != 0) {
                    if (i4 == 1) {
                        kotlin.W.n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    kotlin.W.n(obj);
                    HmDevice k12 = this.f43062J.x0().k1();
                    if (k12 != null) {
                        this.f43061I = 1;
                        if (com.harman.jbl.partybox.ui.a.f42082a.a().b((PartyBoxDevice) k12, this) == l4) {
                            return l4;
                        }
                    }
                }
                return kotlin.H0.f51801a;
            }

            @Override // X2.p
            @l3.e
            /* renamed from: R, reason: merged with bridge method [inline-methods] */
            public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super kotlin.H0> cVar) {
                return ((c) v(u3, cVar)).D(kotlin.H0.f51801a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.d
            public final kotlin.coroutines.c<kotlin.H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
                return new c(this.f43062J, cVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.dashboard.ProductListFragment$setupView$1$4", f = "ProductListFragment.kt", i = {}, l = {850}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: classes2.dex */
        public static final class d extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super kotlin.H0>, Object> {

            /* renamed from: I, reason: collision with root package name */
            int f43063I;

            /* renamed from: J, reason: collision with root package name */
            final /* synthetic */ ProductListFragment f43064J;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(ProductListFragment productListFragment, kotlin.coroutines.c<? super d> cVar) {
                super(2, cVar);
                this.f43064J = productListFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                Object l4;
                l4 = kotlin.coroutines.intrinsics.b.l();
                int i4 = this.f43063I;
                if (i4 != 0) {
                    if (i4 == 1) {
                        kotlin.W.n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    kotlin.W.n(obj);
                    HmDevice k12 = this.f43064J.x0().k1();
                    if (k12 != null) {
                        this.f43063I = 1;
                        if (com.harman.jbl.partybox.ui.a.f42082a.a().b((PartyBoxDevice) k12, this) == l4) {
                            return l4;
                        }
                    }
                }
                return kotlin.H0.f51801a;
            }

            @Override // X2.p
            @l3.e
            /* renamed from: R, reason: merged with bridge method [inline-methods] */
            public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super kotlin.H0> cVar) {
                return ((d) v(u3, cVar)).D(kotlin.H0.f51801a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.d
            public final kotlin.coroutines.c<kotlin.H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
                return new d(this.f43064J, cVar);
            }
        }

        t() {
            super(2);
        }

        public final void c(int i4, @l3.d HmMultiDeviceModel device) {
            HmDevice A12;
            kotlin.jvm.internal.F.p(device, "device");
            if (i4 > ProductListFragment.this.getMasterDeviceList().size() - 1) {
                return;
            }
            com.harman.log.f.a(ProductListFragment.TAG, "BLE_LOG ProductListFragment on click device:" + device);
            com.harman.log.f.a(ProductListFragment.TAG, "BLE_LOG connectAndCheckInfo onClick");
            if (ProductListFragment.this.isConnectionInProgress()) {
                com.harman.log.f.a(ProductListFragment.TAG, "BLE_LOG ProductListFragment on click status:" + ProductListFragment.this.isConnectionInProgress());
                return;
            }
            if (device.O() != null) {
                ProductListFragment.this.r0(i4, device);
                return;
            }
            HmDevice k12 = ProductListFragment.this.x0().k1();
            if (k12 != null) {
                ProductListFragment productListFragment = ProductListFragment.this;
                if ((k12 instanceof PartyBoxDevice) && kotlin.jvm.internal.F.g(k12.n(), device.F()) && k12.R() && k12.O() && !((PartyBoxDevice) k12).F1()) {
                    com.harman.log.f.a(ProductListFragment.TAG, "ProductListFragment updateUIPage:UiPage.DASHBOARD>>>2");
                    C2323l.f(androidx.lifecycle.F.a(productListFragment), null, null, new a(productListFragment, null), 3, null);
                    return;
                }
            }
            if (device.a0() && (A12 = ProductListFragment.this.x0().A1(device.F())) != null) {
                ProductListFragment productListFragment2 = ProductListFragment.this;
                productListFragment2.x0().k3(A12);
                com.harman.log.f.a(ProductListFragment.TAG, "ProductListFragment updateUIPage:UiPage.DASHBOARD>>>4");
                C2323l.f(androidx.lifecycle.F.a(productListFragment2), null, null, new b(productListFragment2, null), 3, null);
                return;
            }
            if (!device.a0() && device.Y()) {
                com.harman.log.f.a(ProductListFragment.TAG, " BLE_LOG current device offline ");
                HmDevice e4 = U1.a.e(device.F());
                if (e4 != null && (e4 instanceof PartyBoxDevice)) {
                    PartyBoxDevice partyBoxDevice = (PartyBoxDevice) e4;
                    partyBoxDevice.g0(false);
                    partyBoxDevice.y2(false);
                    ProductListFragment.this.x0().k3(e4);
                    com.harman.log.f.a(ProductListFragment.TAG, "ProductListFragment updateUIPage:UiPage.DASHBOARD>>>3");
                    C2323l.f(androidx.lifecycle.F.a(ProductListFragment.this), null, null, new c(ProductListFragment.this, null), 3, null);
                    return;
                }
            } else if (device.W()) {
                ProductListFragment.this.x0().k3(ProductListFragment.this.x0().A1(device.F()));
                com.harman.log.f.a(ProductListFragment.TAG, "updateUIPage:UiPage.DASHBOARD>>>3");
                C2323l.f(androidx.lifecycle.F.a(ProductListFragment.this), null, null, new d(ProductListFragment.this, null), 3, null);
                return;
            }
            ProductListFragment.this.q0(i4, device);
        }

        @Override // X2.p
        public /* bridge */ /* synthetic */ kotlin.H0 c0(Integer num, HmMultiDeviceModel hmMultiDeviceModel) {
            c(num.intValue(), hmMultiDeviceModel);
            return kotlin.H0.f51801a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class u implements com.harman.jbl.partybox.ui.dashboard.adapter.b {
        u() {
        }

        @Override // com.harman.jbl.partybox.ui.dashboard.adapter.b
        public void a(@l3.d String deviceMac) {
            kotlin.jvm.internal.F.p(deviceMac, "deviceMac");
            HmDevice k12 = ProductListFragment.this.x0().k1();
            if (k12 != null) {
                ProductListFragment productListFragment = ProductListFragment.this;
                if (!(k12 instanceof PartyBoxDevice)) {
                    return;
                }
                if (!TextUtils.equals(deviceMac, k12.n())) {
                    com.harman.log.f.a(ProductListFragment.TAG, " BLE_LOG ProductListFragment setPlayStateListener not equals : " + k12.n() + ", " + deviceMac);
                    return;
                }
                PartyBoxDevice partyBoxDevice = (PartyBoxDevice) k12;
                if (partyBoxDevice.e1() == null) {
                    return;
                }
                MusicControlSettings e12 = partyBoxDevice.e1();
                kotlin.jvm.internal.F.m(e12);
                PlayerStatus f4 = e12.f();
                PlayerStatus playerStatus = PlayerStatus.PLAYER_STATE_PAUSE;
                if (f4 != playerStatus && e12.f() != PlayerStatus.PLAYER_STATE_OFF && e12.f() != PlayerStatus.UNKNOWN) {
                    productListFragment.y0().W(L1.a.f1559a2, L1.a.f1572d0);
                } else {
                    playerStatus = PlayerStatus.PLAYER_STATE_PLAY;
                    productListFragment.y0().W(L1.a.f1559a2, L1.a.f1567c0);
                }
                MusicControlSettings e13 = partyBoxDevice.e1();
                if (e13 != null) {
                    e13.m(playerStatus);
                }
                productListFragment.y0().b0(k12, playerStatus);
            }
        }
    }

    @kotlin.jvm.internal.U({"SMAP\nProductListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductListFragment.kt\ncom/harman/jbl/partybox/ui/dashboard/ProductListFragment$setupView$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1197:1\n288#2,2:1198\n*S KotlinDebug\n*F\n+ 1 ProductListFragment.kt\ncom/harman/jbl/partybox/ui/dashboard/ProductListFragment$setupView$3\n*L\n895#1:1198,2\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class v implements com.harman.jbl.partybox.ui.dashboard.adapter.a {
        v() {
        }

        @Override // com.harman.jbl.partybox.ui.dashboard.adapter.a
        public void a(@l3.d String deviceMac) {
            Object obj;
            kotlin.jvm.internal.F.p(deviceMac, "deviceMac");
            if (deviceMac.length() == 0) {
                return;
            }
            com.harman.log.f.a(ProductListFragment.TAG, "ProductListFragment itemLongClickListener :" + deviceMac);
            Iterator<T> it = ProductListFragment.this.getMasterDeviceList().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (kotlin.jvm.internal.F.g(((HmMultiDeviceModel) obj).F(), deviceMac)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            HmMultiDeviceModel hmMultiDeviceModel = (HmMultiDeviceModel) obj;
            if (hmMultiDeviceModel != null && hmMultiDeviceModel.Y()) {
                ProductListFragment.this.F0(deviceMac);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class w extends Lambda implements X2.a<kotlin.H0> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ String f43067F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ ProductListFragment f43068G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(String str, ProductListFragment productListFragment) {
            super(0);
            this.f43067F = str;
            this.f43068G = productListFragment;
        }

        public final void c() {
            com.harman.log.f.a(ProductListFragment.TAG, "BLE_LOG ProductListFragment RemoveProductDialogFragment :click remove");
            U1.a.k(this.f43067F);
            this.f43068G.x0().K2(this.f43067F);
        }

        @Override // X2.a
        public /* bridge */ /* synthetic */ kotlin.H0 n() {
            c();
            return kotlin.H0.f51801a;
        }
    }

    public ProductListFragment() {
        super(j.i.f41415M0);
        this.f43008N0 = HmTurnOnSpeakerDialogFragment.Companion.a(DialogType.DISCOVERY);
        this.f43009O0 = com.harman.jbl.partybox.ui.delegate.b.a(this, b.f43021N);
        this.f43010P0 = ApplicationViewModelLazyKt.f(this, kotlin.jvm.internal.N.d(com.harman.jbl.partybox.ui.main.o.class), new ApplicationViewModelLazyKt$applicationViewModels$3(this), new ApplicationViewModelLazyKt$applicationViewModels$4(this));
        this.f43011Q0 = FragmentViewModelLazyKt.c(this, kotlin.jvm.internal.N.d(com.harman.jbl.partybox.ui.musiccontrol.h.class), new X2.a<androidx.lifecycle.p0>() { // from class: com.harman.jbl.partybox.ui.dashboard.ProductListFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // X2.a
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final androidx.lifecycle.p0 n() {
                androidx.lifecycle.p0 viewModelStore = Fragment.this.requireActivity().getViewModelStore();
                kotlin.jvm.internal.F.o(viewModelStore, "requireActivity().viewModelStore");
                return viewModelStore;
            }
        }, new X2.a<m0.b>() { // from class: com.harman.jbl.partybox.ui.dashboard.ProductListFragment$special$$inlined$activityViewModels$default$2
            {
                super(0);
            }

            @Override // X2.a
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final m0.b n() {
                m0.b defaultViewModelProviderFactory = Fragment.this.requireActivity().getDefaultViewModelProviderFactory();
                kotlin.jvm.internal.F.o(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
        this.f43012R0 = new ArrayList<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A0(String str) {
        com.harman.jbl.partybox.ui.dashboard.adapter.e eVar = this.f43013S0;
        if (eVar != null) {
            Iterator<HmMultiDeviceModel> it = eVar.Q().iterator();
            int i4 = 0;
            while (true) {
                if (it.hasNext()) {
                    if (kotlin.jvm.internal.F.g(it.next().F(), str)) {
                        break;
                    } else {
                        i4++;
                    }
                } else {
                    i4 = -1;
                    break;
                }
            }
            if (i4 >= 0) {
                com.harman.log.f.a(TAG, "ProductListFragment,removeOfflineDeviceLiveData index: " + i4);
                eVar.Q().remove(i4);
                eVar.A(i4);
            }
        }
    }

    private final void B0(List<? extends HmDevice> list) {
        Object obj;
        StereoEffectDialog stereoEffectDialog;
        HmDevice hmDevice;
        Dialog dialog;
        ActivityC0889g activity = getActivity();
        kotlin.jvm.internal.F.n(activity, "null cannot be cast to non-null type com.harman.jbl.partybox.ui.main.MainActivityNav");
        ActivityC0889g activity2 = getActivity();
        kotlin.jvm.internal.F.n(activity2, "null cannot be cast to non-null type com.harman.jbl.partybox.ui.main.MainActivityNav");
        int Y02 = ((MainActivityNav) activity2).Y0();
        if (Y02 != 0) {
            com.harman.log.f.a(TAG, "ProductListFragment Stereo Effect pageIndex=" + Y02);
            return;
        }
        HmDevice k12 = x0().k1();
        if (k12 == null) {
            com.harman.log.f.a(TAG, "Stereo Effect currentDevice is null");
            return;
        }
        if (com.harman.jbl.partybox.ui.party.stereo.D.f45020a.l(k12)) {
            com.harman.log.f.a(TAG, "Stereo Effect currentDevice is tws group");
            return;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (kotlin.jvm.internal.F.g(((HmDevice) obj).n(), k12.n())) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        HmDevice hmDevice2 = (HmDevice) obj;
        com.harman.log.f.a(TAG, "Stereo Effect  currentDeviceInList" + hmDevice2);
        if (hmDevice2 == null) {
            com.harman.log.f.a(TAG, "Stereo Effect currentDeviceInList is tws group");
            return;
        }
        if (list.size() < 2) {
            com.harman.log.f.a(TAG, "Stereo Effect " + list.size());
            return;
        }
        StereoEffectDialog stereoEffectDialog2 = this.f43017W0;
        if ((stereoEffectDialog2 != null && stereoEffectDialog2.isAdded()) || ((stereoEffectDialog = this.f43017W0) != null && (dialog = stereoEffectDialog.getDialog()) != null && true == dialog.isShowing())) {
            com.harman.log.f.a(TAG, "Stereo Effect return");
            return;
        }
        String str = list.get(0).n() + " " + list.get(1).n();
        if (x0().N1()) {
            com.harman.log.f.a(TAG, "Stereo Effect  has pop:true,macs:" + str);
            return;
        }
        if (kotlin.jvm.internal.F.g(list.get(0).n(), k12.n())) {
            hmDevice = list.get(1);
        } else {
            hmDevice = list.get(0);
        }
        HmDevice hmDevice3 = hmDevice;
        this.f43017W0 = new StereoEffectDialog(hmDevice3.q(), hmDevice3.o(), r.f43054F);
        com.harman.log.f.a(TAG, "ProductListFragment,Stereo Effect dialog shown");
        StereoEffectDialog stereoEffectDialog3 = this.f43017W0;
        if (stereoEffectDialog3 != null) {
            stereoEffectDialog3.show(getChildFragmentManager(), StereoEffectDialog.TAG);
        }
        x0().q3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C0(int i4, boolean z3) {
        Object W22;
        com.harman.log.f.a(TAG, " BLE_LOG ProductListFragment setConnectState and position selectedModel : " + i4 + ",:isConnecting:" + z3 + "}");
        com.harman.jbl.partybox.ui.dashboard.adapter.e eVar = this.f43013S0;
        if (eVar != null) {
            W22 = kotlin.collections.D.W2(eVar.Q(), i4);
            HmMultiDeviceModel hmMultiDeviceModel = (HmMultiDeviceModel) W22;
            if (hmMultiDeviceModel != null) {
                hmMultiDeviceModel.h0(z3);
                hmMultiDeviceModel.o0(z3);
                eVar.s(i4);
            }
        }
    }

    private final void D0() {
        Object obj;
        Bundle arguments = getArguments();
        if (arguments != null && arguments.containsKey(f43007Z0)) {
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                obj = arguments2.get(f43007Z0);
            } else {
                obj = null;
            }
            kotlin.jvm.internal.F.n(obj, "null cannot be cast to non-null type kotlin.Int");
            boolean z3 = true;
            if (((Integer) obj).intValue() != 1) {
                z3 = false;
            }
            this.f43016V0 = z3;
            com.harman.log.f.a(TAG, "BLE_LOG isFromSwitchSpeaker is " + z3);
        }
    }

    private final void E0() {
        this.f43014T0 = false;
        com.harman.jbl.partybox.ui.dashboard.adapter.e eVar = new com.harman.jbl.partybox.ui.dashboard.adapter.e(getActivity(), new t());
        this.f43013S0 = eVar;
        eVar.a0(new u());
        com.harman.jbl.partybox.ui.dashboard.adapter.e eVar2 = this.f43013S0;
        if (eVar2 != null) {
            eVar2.Z(new v());
        }
        w0().f39243F.setItemAnimator(null);
        RecyclerView recyclerView = w0().f39243F;
        recyclerView.setAdapter(this.f43013S0);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), 1, false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F0(String str) {
        RemoveProductDialogFragment removeProductDialogFragment;
        Dialog dialog;
        Boolean bool;
        Dialog dialog2;
        RemoveProductDialogFragment removeProductDialogFragment2 = this.f43018X0;
        if ((removeProductDialogFragment2 != null && removeProductDialogFragment2.isAdded()) || ((removeProductDialogFragment = this.f43018X0) != null && (dialog = removeProductDialogFragment.getDialog()) != null && dialog.isShowing())) {
            RemoveProductDialogFragment removeProductDialogFragment3 = this.f43018X0;
            if (removeProductDialogFragment3 != null && (dialog2 = removeProductDialogFragment3.getDialog()) != null) {
                bool = Boolean.valueOf(dialog2.isShowing());
            } else {
                bool = null;
            }
            com.harman.log.f.a(TAG, "BLE_LOG ProductListFragment showRemoveProductDialog :" + bool);
            return;
        }
        RemoveProductDialogFragment removeProductDialogFragment4 = new RemoveProductDialogFragment(new w(str, this));
        this.f43018X0 = removeProductDialogFragment4;
        removeProductDialogFragment4.show(getChildFragmentManager(), RemoveProductDialogFragment.class.getSimpleName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G0(HmDevice hmDevice) {
        TWSInfo tWSInfo;
        BatteryInfo batteryInfo;
        com.harman.jbl.partybox.ui.dashboard.adapter.e eVar = this.f43013S0;
        if (eVar != null) {
            com.harman.log.f.a(TAG, "ProductListFragment updateBatteryAndDeviceName " + hmDevice.n());
            com.harman.log.f.a(TAG, "ProductListFragment updateBatteryAndDeviceName " + hmDevice.f());
            String n4 = hmDevice.n();
            Iterator<HmMultiDeviceModel> it = eVar.Q().iterator();
            int i4 = 0;
            while (true) {
                if (it.hasNext()) {
                    if (kotlin.jvm.internal.F.g(it.next().F(), n4)) {
                        break;
                    } else {
                        i4++;
                    }
                } else {
                    i4 = -1;
                    break;
                }
            }
            boolean z3 = hmDevice instanceof PartyBoxDevice;
            BatteryInfo batteryInfo2 = null;
            TWSInfo tWSInfo2 = null;
            if (z3) {
                Object obj = ((PartyBoxDevice) hmDevice).l1().get("Device_Battery");
                if (obj != null) {
                    batteryInfo = (BatteryInfo) obj;
                } else {
                    batteryInfo = null;
                }
                if (com.harman.jbl.partybox.ui.party.stereo.D.f45020a.l(hmDevice)) {
                    tWSInfo2 = hmDevice.M();
                }
                BatteryInfo batteryInfo3 = batteryInfo;
                tWSInfo = tWSInfo2;
                batteryInfo2 = batteryInfo3;
            } else {
                tWSInfo = null;
            }
            com.harman.log.f.a(TAG, "ProductListFragment updateBatteryAndDeviceName secondary battery:" + batteryInfo2);
            com.harman.log.f.a(TAG, "ProductListFragment updateBatteryAndDeviceName position:" + i4);
            if (i4 >= 0) {
                eVar.Q().get(i4).e0(hmDevice.R());
                eVar.Q().get(i4).f0(hmDevice.f());
                if (z3) {
                    eVar.Q().get(i4).l0(((PartyBoxDevice) hmDevice).i1());
                }
                eVar.Q().get(i4).g0(hmDevice.i());
                if (tWSInfo != null) {
                    String b4 = tWSInfo.b();
                    if (b4 != null && b4.length() != 0) {
                        x0().r3(hmDevice);
                    } else {
                        tWSInfo.d(x0().E1(hmDevice));
                    }
                }
                eVar.Q().get(i4).q0(tWSInfo);
                com.harman.log.f.a(TAG, "ProductListFragment updateBatteryAndDeviceName tws:" + tWSInfo);
                if (batteryInfo2 != null) {
                    com.harman.log.f.a(TAG, "ProductListFragment updateBatteryAndDeviceName  secondary:" + batteryInfo2);
                    eVar.Q().get(i4).n0(batteryInfo2);
                }
                eVar.s(i4);
                com.harman.log.f.a(TAG, "ProductListFragment updateBatteryAndDeviceName device:" + eVar.Q().get(i4));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H0(String str, boolean z3) {
        if (this.f43014T0) {
            com.harman.log.f.a(TAG, "ProductListFragment,updateDeviceBleConnectStatus isConnectionInProgress:true");
            return;
        }
        HmDevice k12 = x0().k1();
        if (k12 != null && kotlin.jvm.internal.F.g(k12.n(), str)) {
            this.f43014T0 = false;
        }
        com.harman.jbl.partybox.ui.dashboard.adapter.e eVar = this.f43013S0;
        if (eVar != null) {
            Iterator<HmMultiDeviceModel> it = eVar.Q().iterator();
            int i4 = 0;
            while (true) {
                if (it.hasNext()) {
                    if (kotlin.jvm.internal.F.g(it.next().F(), str)) {
                        break;
                    } else {
                        i4++;
                    }
                } else {
                    i4 = -1;
                    break;
                }
            }
            if (i4 >= 0) {
                eVar.Q().get(i4).e0(z3);
                if (!z3) {
                    eVar.Q().get(i4).o0(false);
                    HmDevice k13 = x0().k1();
                    if (k13 != null && kotlin.jvm.internal.F.g(k13.n(), str) && (k13 instanceof PartyBoxDevice)) {
                        eVar.Q().get(i4).p0(((PartyBoxDevice) k13).F1());
                    }
                }
                eVar.s(i4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I0(String str, boolean z3) {
        com.harman.jbl.partybox.ui.dashboard.adapter.e eVar = this.f43013S0;
        if (eVar != null) {
            Iterator<HmMultiDeviceModel> it = eVar.Q().iterator();
            int i4 = 0;
            while (true) {
                if (it.hasNext()) {
                    if (kotlin.jvm.internal.F.g(it.next().F(), str)) {
                        break;
                    } else {
                        i4++;
                    }
                } else {
                    i4 = -1;
                    break;
                }
            }
            if (i4 >= 0) {
                eVar.Q().get(i4).c0(z3);
                BatteryInfo A3 = eVar.Q().get(i4).A();
                if (A3 != null && A3.d()) {
                    eVar.Q().get(i4).p0(!z3);
                } else {
                    eVar.Q().get(i4).p0(false);
                }
                if (!z3) {
                    eVar.Q().get(i4).e0(false);
                }
                eVar.s(i4);
                return;
            }
            List<HmDevice> f4 = x0().K0().f();
            if (f4 != null) {
                kotlin.jvm.internal.F.m(f4);
                t0(f4);
            }
        }
    }

    private final void J0() {
        HmDevice k12;
        com.harman.jbl.partybox.ui.dashboard.adapter.e eVar = this.f43013S0;
        if (eVar != null && (k12 = x0().k1()) != null) {
            Iterator<HmMultiDeviceModel> it = eVar.Q().iterator();
            int i4 = 0;
            while (true) {
                if (it.hasNext()) {
                    if (kotlin.jvm.internal.F.g(it.next().F(), k12.n())) {
                        break;
                    } else {
                        i4++;
                    }
                } else {
                    i4 = -1;
                    break;
                }
            }
            if (i4 != -1 && eVar.Q().size() == 1 && k12.R()) {
                this.f43014T0 = false;
                eVar.Q().get(i4).h0(false);
                eVar.Q().get(i4).o0(false);
                eVar.t(i4, Integer.valueOf(j.h.f41332r3));
                eVar.t(i4, Integer.valueOf(j.h.f41210R2));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K0(String str) {
        com.harman.jbl.partybox.ui.dashboard.adapter.e eVar = this.f43013S0;
        if (eVar != null) {
            Iterator<HmMultiDeviceModel> it = eVar.Q().iterator();
            int i4 = 0;
            while (true) {
                if (it.hasNext()) {
                    if (kotlin.jvm.internal.F.g(it.next().F(), str)) {
                        break;
                    } else {
                        i4++;
                    }
                } else {
                    i4 = -1;
                    break;
                }
            }
            if (i4 >= 0) {
                eVar.Q().get(i4).q0(null);
                eVar.s(i4);
            }
        }
    }

    private final void L0(String str) {
        com.harman.jbl.partybox.ui.dashboard.adapter.e eVar = this.f43013S0;
        if (eVar != null) {
            Iterator<HmMultiDeviceModel> it = eVar.Q().iterator();
            int i4 = 0;
            while (true) {
                if (it.hasNext()) {
                    if (kotlin.jvm.internal.F.g(it.next().F(), str)) {
                        break;
                    } else {
                        i4++;
                    }
                } else {
                    i4 = -1;
                    break;
                }
            }
            if (i4 >= 0) {
                eVar.Q().get(i4).n0(null);
                eVar.Q().get(i4).q0(null);
                eVar.s(i4);
            }
        }
    }

    private final void M0(String str) {
        com.harman.jbl.partybox.ui.dashboard.adapter.e eVar = this.f43013S0;
        if (eVar != null) {
            Iterator<HmMultiDeviceModel> it = eVar.Q().iterator();
            int i4 = 0;
            while (true) {
                if (it.hasNext()) {
                    if (kotlin.jvm.internal.F.g(it.next().F(), str)) {
                        break;
                    } else {
                        i4++;
                    }
                } else {
                    i4 = -1;
                    break;
                }
            }
            if (i4 >= 0) {
                com.harman.log.f.a(TAG, "ProductListFragment,updateDeviceRole index: " + i4);
                eVar.Q().get(i4).p0(false);
                eVar.s(i4);
            }
        }
    }

    private final void N0(List<HmMultiDeviceModel> list) {
        com.harman.jbl.partybox.ui.dashboard.adapter.e eVar = this.f43013S0;
        kotlin.jvm.internal.F.m(eVar);
        if (!s0(new ArrayList(eVar.Q()), list)) {
            com.harman.log.f.a(TAG, "updateList() is called as list size differs.");
            com.harman.jbl.partybox.ui.dashboard.adapter.e eVar2 = this.f43013S0;
            kotlin.jvm.internal.F.m(eVar2);
            eVar2.b0(list);
            return;
        }
        com.harman.log.f.a(TAG, "updateList() => No change in device list. Skipping update.");
    }

    private final void O0(com.harman.jbl.partybox.ui.musiccontrol.g gVar) {
        com.harman.jbl.partybox.ui.dashboard.adapter.e eVar;
        com.harman.log.f.a(TAG, "ProductListFragment updateMiniPlayer audioSource is " + gVar);
        if ("".length() > 0) {
            o.a aVar = com.harman.jbl.partybox.ui.main.o.f44128m1;
            if (!kotlin.jvm.internal.F.g("", aVar.a())) {
                aVar.f("");
                y0().W(L1.a.f1579e2, aVar.a() + L1.a.f1594h2);
            }
        }
        HmDevice k12 = x0().k1();
        if (k12 != null && (eVar = this.f43013S0) != null) {
            Iterator<HmMultiDeviceModel> it = eVar.Q().iterator();
            int i4 = 0;
            while (true) {
                if (it.hasNext()) {
                    if (kotlin.jvm.internal.F.g(it.next().F(), k12.n())) {
                        break;
                    } else {
                        i4++;
                    }
                } else {
                    i4 = -1;
                    break;
                }
            }
            if (i4 >= 0) {
                eVar.Q().get(i4).k0(gVar);
                eVar.t(i4, Integer.valueOf(j.h.ib));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P0() {
        HmDevice k12 = x0().k1();
        if (k12 != null && (k12 instanceof PartyBoxDevice)) {
            PartyBoxDevice partyBoxDevice = (PartyBoxDevice) k12;
            if (partyBoxDevice.e1() == null) {
                com.harman.log.f.a(TAG, "ProductListFragment updateMusicControlModel is null, so return");
                return;
            }
            int c4 = k12.c();
            int q12 = partyBoxDevice.q1();
            DeviceRole J3 = k12.J();
            PartyConnectStatus a4 = PartyConnectStatus.Companion.a(partyBoxDevice.i1().j());
            UsbStatus a5 = UsbStatus.Companion.a(partyBoxDevice.s1().j());
            MusicControlSettings e12 = partyBoxDevice.e1();
            kotlin.jvm.internal.F.m(e12);
            com.harman.jbl.partybox.ui.musiccontrol.g gVar = new com.harman.jbl.partybox.ui.musiccontrol.g(c4, q12, J3, a4, a5, e12);
            O0(gVar);
            x0().c2(gVar.k());
        }
    }

    private final void Q0(String str, String str2) {
        com.harman.jbl.partybox.ui.dashboard.adapter.e eVar = this.f43013S0;
        if (eVar != null) {
            Iterator<HmMultiDeviceModel> it = eVar.Q().iterator();
            int i4 = 0;
            while (true) {
                if (it.hasNext()) {
                    if (kotlin.jvm.internal.F.g(it.next().F(), str)) {
                        break;
                    } else {
                        i4++;
                    }
                } else {
                    i4 = -1;
                    break;
                }
            }
            if (i4 >= 0) {
                TWSInfo R3 = eVar.Q().get(i4).R();
                if (R3 != null) {
                    R3.d(str2);
                }
                eVar.t(i4, Integer.valueOf(j.h.f41337s3));
            }
        }
    }

    private final void m0(int i4, HmMultiDeviceModel hmMultiDeviceModel) {
        com.harman.log.f.a(TAG, " BLE_LOG ProductListFragment autoConnectDevice called position = " + i4);
        if (hmMultiDeviceModel.O() != null) {
            r0(i4, hmMultiDeviceModel);
        } else {
            q0(i4, hmMultiDeviceModel);
        }
    }

    private final void n0(List<String> list) {
        List<HmDevice> V5;
        String str;
        String str2;
        TWSInfo tWSInfo;
        boolean W12;
        com.harman.log.f.a(TAG, " BLE_LOG ProductListFragment deviceReceived createDeviceFromCache masterDeviceList list:" + list);
        List<HmDevice> f4 = U1.a.f();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = f4.iterator();
        while (true) {
            String str3 = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            HmDevice hmDevice = (HmDevice) next;
            if (hmDevice != null) {
                str3 = hmDevice.n();
            }
            W12 = kotlin.collections.D.W1(list, str3);
            if (!W12) {
                arrayList.add(next);
            }
        }
        V5 = kotlin.collections.D.V5(arrayList);
        com.harman.log.f.a(TAG, " BLE_LOG ProductListFragment deviceReceived createDeviceFromCache localDeviceList list:" + V5);
        for (HmDevice hmDevice2 : V5) {
            if (hmDevice2 instanceof PartyBoxDevice) {
                PartyBoxDevice partyBoxDevice = (PartyBoxDevice) hmDevice2;
                String p4 = partyBoxDevice.p();
                String n4 = partyBoxDevice.n();
                String q4 = partyBoxDevice.q();
                String o4 = partyBoxDevice.o();
                if (o4 == null) {
                    str = "";
                } else {
                    str = o4;
                }
                String k4 = partyBoxDevice.k();
                if (k4 == null) {
                    str2 = "";
                } else {
                    str2 = k4;
                }
                boolean B12 = partyBoxDevice.B1();
                PartyConnectStatus partyConnectStatus = PartyConnectStatus.UNKNOWN;
                if (com.harman.jbl.partybox.ui.party.stereo.D.f45020a.l(hmDevice2)) {
                    tWSInfo = partyBoxDevice.M();
                } else {
                    tWSInfo = null;
                }
                this.f43012R0.add(new HmMultiDeviceModel(p4, n4, q4, str, str2, false, B12, false, false, true, false, partyConnectStatus, tWSInfo, null, null, partyBoxDevice.i(), null, partyBoxDevice.x(), null, 352256, null));
            }
        }
    }

    @W2.n
    @l3.d
    public static final ProductListFragment newInstance(boolean z3) {
        return Companion.a(z3);
    }

    private final HmMultiDeviceModel o0(PartyBoxDevice partyBoxDevice) {
        String str;
        String str2;
        HmMultiDeviceModel hmMultiDeviceModel;
        TWSInfo tWSInfo;
        String b4;
        String p4 = partyBoxDevice.p();
        String n4 = partyBoxDevice.n();
        String q4 = partyBoxDevice.q();
        String o4 = partyBoxDevice.o();
        if (o4 == null) {
            str = "";
        } else {
            str = o4;
        }
        String k4 = partyBoxDevice.k();
        if (k4 == null) {
            str2 = "";
        } else {
            str2 = k4;
        }
        HmMultiDeviceModel hmMultiDeviceModel2 = new HmMultiDeviceModel(p4, n4, q4, str, str2, partyBoxDevice.F1(), partyBoxDevice.B1(), partyBoxDevice.O(), partyBoxDevice.R(), true, false, partyBoxDevice.i1(), null, null, null, partyBoxDevice.i(), Boolean.valueOf(com.harman.jbl.partybox.ui.party.auracast.o.f44854a.p(partyBoxDevice)), partyBoxDevice.x(), null, 290816, null);
        MusicControlSettings e12 = partyBoxDevice.e1();
        if (e12 != null) {
            hmMultiDeviceModel = hmMultiDeviceModel2;
            hmMultiDeviceModel.k0(new com.harman.jbl.partybox.ui.musiccontrol.g(partyBoxDevice.c(), partyBoxDevice.q1(), partyBoxDevice.J(), PartyConnectStatus.Companion.a(partyBoxDevice.i1().j()), UsbStatus.Companion.a(partyBoxDevice.s1().j()), e12));
        } else {
            hmMultiDeviceModel = hmMultiDeviceModel2;
        }
        BatteryInfo f4 = partyBoxDevice.f();
        if (f4 != null) {
            hmMultiDeviceModel.f0(f4);
        }
        Object obj = partyBoxDevice.l1().get("Device_Battery");
        if (obj != null) {
            hmMultiDeviceModel.n0((BatteryInfo) obj);
        }
        if (com.harman.jbl.partybox.ui.party.stereo.D.f45020a.l(partyBoxDevice)) {
            tWSInfo = partyBoxDevice.M();
            if (tWSInfo != null && ((b4 = tWSInfo.b()) == null || b4.length() == 0)) {
                tWSInfo.d(x0().E1(partyBoxDevice));
            }
        } else {
            tWSInfo = null;
        }
        hmMultiDeviceModel.q0(tWSInfo);
        return hmMultiDeviceModel;
    }

    private final HmMultiDeviceModel p0(PartyLightDevice partyLightDevice) {
        String str;
        String str2;
        String p4 = partyLightDevice.p();
        String n4 = partyLightDevice.n();
        String q4 = partyLightDevice.q();
        String o4 = partyLightDevice.o();
        if (o4 == null) {
            str = "";
        } else {
            str = o4;
        }
        String k4 = partyLightDevice.k();
        if (k4 == null) {
            str2 = "";
        } else {
            str2 = k4;
        }
        boolean R3 = partyLightDevice.R();
        PartyConnectStatus partyConnectStatus = PartyConnectStatus.UNKNOWN;
        long x3 = partyLightDevice.x();
        AudioChannel i4 = partyLightDevice.i();
        boolean p5 = com.harman.jbl.partybox.ui.party.auracast.o.f44854a.p(partyLightDevice);
        String str3 = str;
        String str4 = str2;
        HmMultiDeviceModel hmMultiDeviceModel = new HmMultiDeviceModel(p4, n4, q4, str3, str4, false, false, true, R3, true, false, partyConnectStatus, null, null, null, i4, Boolean.valueOf(p5), x3, partyLightDevice.N0(), 28672, null);
        BatteryInfo f4 = partyLightDevice.f();
        if (f4 != null) {
            hmMultiDeviceModel.f0(f4);
        }
        return hmMultiDeviceModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q0(int i4, HmMultiDeviceModel hmMultiDeviceModel) {
        FragmentManager S3;
        com.harman.log.f.a(TAG, " BLE_LOG The selected currentItem is : selectedModel");
        com.harman.log.f.a(TAG, " BLE_LOG The isEverConnected of selected model is : " + hmMultiDeviceModel.X());
        com.harman.log.f.a(TAG, " BLE_LOG The isStandbyMode of selected model is : " + hmMultiDeviceModel.a0());
        com.harman.log.f.a(TAG, " BLE_LOG The isBTConnected of selected model is : " + hmMultiDeviceModel.U());
        com.harman.log.f.a(TAG, " BLE_LOG The Mac Address of selected model is : " + hmMultiDeviceModel.F());
        Fragment fragment = null;
        if (!hmMultiDeviceModel.X() || com.harman.sdk.utils.d.L(hmMultiDeviceModel.H())) {
            if (hmMultiDeviceModel.a0()) {
                com.harman.log.f.a(TAG, " BLE_LOG The device is in standby and never connected to App. Show the turn On BT dialog");
                showTurnOnSpeakerDialog();
                return;
            }
            if (!hmMultiDeviceModel.U()) {
                ActivityC0889g activity = getActivity();
                if (activity != null && (S3 = activity.S()) != null) {
                    fragment = S3.n0(j.h.f41238Y2);
                }
                com.harman.log.f.a(TAG, " BLE_LOG The fr is : " + fragment);
                this.f43014T0 = false;
                Q.a c4 = Q.a("").c(1);
                kotlin.jvm.internal.F.o(c4, "setIsFromProductList(...)");
                com.harman.jbl.partybox.utils.q.f(this, c4);
                return;
            }
        }
        C2323l.f(androidx.lifecycle.F.a(this), null, null, new c(i4, hmMultiDeviceModel, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r0(int i4, HmMultiDeviceModel hmMultiDeviceModel) {
        C2323l.f(androidx.lifecycle.F.a(this), null, null, new d(i4, hmMultiDeviceModel, null), 3, null);
    }

    private final boolean s0(List<HmMultiDeviceModel> list, List<HmMultiDeviceModel> list2) {
        int b02;
        List V5;
        int b03;
        List V52;
        if (list == null && list2 == null) {
            return true;
        }
        if (list != null && list2 != null && list.size() == list2.size()) {
            ArrayList arrayList = new ArrayList(list);
            ArrayList arrayList2 = new ArrayList(list2);
            b02 = C2109w.b0(arrayList, 10);
            ArrayList arrayList3 = new ArrayList(b02);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList3.add(((HmMultiDeviceModel) it.next()).F());
            }
            V5 = kotlin.collections.D.V5(arrayList3);
            com.harman.log.f.a(TAG, "ProductListFragment equalLists:currentList1" + V5);
            b03 = C2109w.b0(arrayList2, 10);
            ArrayList arrayList4 = new ArrayList(b03);
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((HmMultiDeviceModel) it2.next()).F());
            }
            V52 = kotlin.collections.D.V5(arrayList4);
            com.harman.log.f.a(TAG, "ProductListFragment equalLists:updatedList2" + V52);
            return kotlin.jvm.internal.F.g(arrayList, arrayList2);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t0(List<? extends HmDevice> list) {
        String str;
        int i4;
        int b02;
        boolean z3;
        int b03;
        int b04;
        List V5;
        String str2;
        String a4;
        com.harman.log.f.a(TAG, " BLE_LOG ProductListFragment deviceReceived fetchDeviceList called:" + this.f43014T0 + " ");
        synchronized (this.f43012R0) {
            try {
                if (!this.f43014T0) {
                    this.f43012R0.clear();
                    ArrayList arrayList = new ArrayList();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator<T> it = list.iterator();
                    while (true) {
                        str = null;
                        i4 = 0;
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        TWSInfo M3 = ((HmDevice) next).M();
                        if (M3 != null && (a4 = M3.a()) != null) {
                            str = a4.substring(0, 2);
                            kotlin.jvm.internal.F.o(str, "substring(...)");
                        }
                        Object obj = linkedHashMap.get(str);
                        if (obj == null) {
                            obj = new ArrayList();
                            linkedHashMap.put(str, obj);
                        }
                        ((List) obj).add(next);
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        if (entry.getKey() != null) {
                            linkedHashMap2.put(entry.getKey(), entry.getValue());
                        }
                    }
                    for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                        Object key = entry2.getKey();
                        Iterable<HmDevice> iterable = (Iterable) entry2.getValue();
                        b04 = C2109w.b0(iterable, 10);
                        ArrayList arrayList2 = new ArrayList(b04);
                        for (HmDevice hmDevice : iterable) {
                            if (hmDevice instanceof PartyBoxDevice) {
                                str2 = hmDevice.n() + " " + hmDevice.x();
                            } else {
                                str2 = "";
                            }
                            arrayList2.add(str2);
                        }
                        V5 = kotlin.collections.D.V5(arrayList2);
                        com.harman.log.f.a(TAG, "BLE_LOG ProductListFragment deviceReceived groupMap: " + key + " :same group id list:" + V5);
                        Stream stream = ((List) entry2.getValue()).stream();
                        final e eVar = e.f43040F;
                        Optional findFirst = stream.sorted(new Comparator() { // from class: com.harman.jbl.partybox.ui.dashboard.L
                            @Override // java.util.Comparator
                            public final int compare(Object obj2, Object obj3) {
                                int u02;
                                u02 = ProductListFragment.u0(X2.p.this, obj2, obj3);
                                return u02;
                            }
                        }).findFirst();
                        if (findFirst.isPresent()) {
                            arrayList.add(findFirst.get());
                            com.harman.log.f.a(TAG, "BLE_LOG ProductListFragment deviceReceived  groupMap firstGroupedDevice: " + ((HmDevice) findFirst.get()).n());
                        }
                    }
                    b02 = C2109w.b0(arrayList, 10);
                    ArrayList arrayList3 = new ArrayList(b02);
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(((HmDevice) it2.next()).n());
                    }
                    Iterator<? extends HmDevice> it3 = list.iterator();
                    while (true) {
                        z3 = true;
                        if (!it3.hasNext()) {
                            break;
                        }
                        HmDevice next2 = it3.next();
                        if (com.harman.jbl.partybox.ui.party.stereo.D.f45020a.l(next2) && (true ^ arrayList3.isEmpty()) && !arrayList3.contains(next2.n())) {
                            com.harman.log.f.a(TAG, "BLE_LOG ProductListFragment deviceReceived filter out slave device:" + next2.n() + ",tws " + next2.M());
                        } else if (next2 instanceof PartyBoxDevice) {
                            HmMultiDeviceModel o02 = o0((PartyBoxDevice) next2);
                            com.harman.log.f.a(TAG, " BLE_LOG ProductListFragment deviceReceived <<<< createDeviceFromMasterList:" + o02);
                            this.f43012R0.add(o02);
                        } else if (next2 instanceof PartyLightDevice) {
                            HmMultiDeviceModel p02 = p0((PartyLightDevice) next2);
                            com.harman.log.f.a(TAG, " BLE_LOG ProductListFragment deviceReceived <<<< createDeviceFromMasterList:" + p02);
                            this.f43012R0.add(p02);
                        }
                    }
                    C2112z.p0(this.f43012R0, new Comparator() { // from class: com.harman.jbl.partybox.ui.dashboard.M
                        @Override // java.util.Comparator
                        public final int compare(Object obj2, Object obj3) {
                            int v02;
                            v02 = ProductListFragment.v0((HmMultiDeviceModel) obj2, (HmMultiDeviceModel) obj3);
                            return v02;
                        }
                    });
                    b03 = C2109w.b0(list, 10);
                    ArrayList arrayList4 = new ArrayList(b03);
                    Iterator<T> it4 = list.iterator();
                    while (it4.hasNext()) {
                        arrayList4.add(((HmDevice) it4.next()).n());
                    }
                    n0(arrayList4);
                    N0(this.f43012R0);
                    int size = list.size();
                    boolean Y12 = x0().Y1();
                    HmDevice k12 = x0().k1();
                    if (k12 != null) {
                        str = k12.n();
                    }
                    com.harman.log.f.a(TAG, " BLE_LOG ProductListFragment deviceReceived found and deviceList.size = " + size + ", manualClose = " + Y12 + "mainViewModel.getMainDevice() = " + str + ", isConnectionInProgress = " + this.f43014T0);
                    if (list.size() != 1 || x0().Y1() || x0().k1() != null || this.f43014T0) {
                        z3 = false;
                    }
                    com.harman.log.f.a(TAG, " BLE_LOG ProductListFragment deviceReceived Single Device found and and Auto Connect:" + z3);
                    if (z3) {
                        HmDevice hmDevice2 = list.get(0);
                        if ((hmDevice2 instanceof PartyBoxDevice) && !((PartyBoxDevice) hmDevice2).F1() && hmDevice2.O() && !hmDevice2.R() && !x0().V1()) {
                            com.harman.log.f.a(TAG, "ProductListFragment BLE_LOG Single device found which is not in Standby and BT Connected after 5 sec timer expired. So try to connect.");
                            Iterator<HmMultiDeviceModel> it5 = this.f43012R0.iterator();
                            while (true) {
                                if (it5.hasNext()) {
                                    if (kotlin.jvm.internal.F.g(it5.next().F(), hmDevice2.n())) {
                                        break;
                                    } else {
                                        i4++;
                                    }
                                } else {
                                    i4 = -1;
                                    break;
                                }
                            }
                            if (i4 != -1) {
                                HmMultiDeviceModel hmMultiDeviceModel = this.f43012R0.get(i4);
                                kotlin.jvm.internal.F.o(hmMultiDeviceModel, "get(...)");
                                m0(i4, hmMultiDeviceModel);
                            }
                        } else {
                            com.harman.log.f.a(TAG, "ProductListFragment BLE_LOG Single device found after 5 sec timer expired but not in normal mode");
                        }
                    }
                }
                kotlin.H0 h02 = kotlin.H0.f51801a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int u0(X2.p tmp0, Object obj, Object obj2) {
        kotlin.jvm.internal.F.p(tmp0, "$tmp0");
        return ((Number) tmp0.c0(obj, obj2)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int v0(HmMultiDeviceModel hmMultiDeviceModel, HmMultiDeviceModel hmMultiDeviceModel2) {
        if (hmMultiDeviceModel.U() != hmMultiDeviceModel2.U()) {
            return Boolean.compare(hmMultiDeviceModel2.U(), hmMultiDeviceModel.U());
        }
        return kotlin.jvm.internal.F.u(hmMultiDeviceModel2.L(), hmMultiDeviceModel.L());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Y0 w0() {
        return (Y0) this.f43009O0.a(this, f43006Y0[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.harman.jbl.partybox.ui.main.o x0() {
        return (com.harman.jbl.partybox.ui.main.o) this.f43010P0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.harman.jbl.partybox.ui.musiccontrol.h y0() {
        return (com.harman.jbl.partybox.ui.musiccontrol.h) this.f43011Q0.getValue();
    }

    private final void z0() {
        x0().K0().k(getViewLifecycleOwner(), new s(new i()));
        x0().G1().k(getViewLifecycleOwner(), new s(new j()));
        x0().w1().k(getViewLifecycleOwner(), new s(new k()));
        x0().I1().k(getViewLifecycleOwner(), new s(new l()));
        x0().Y0().k(getViewLifecycleOwner(), new s(new m()));
        y0().X().k(getViewLifecycleOwner(), new s(new n()));
        x0().H1().k(getViewLifecycleOwner(), new s(new o()));
        x0().y1().k(getViewLifecycleOwner(), new s(p.f43052F));
        x0().W0().k(getViewLifecycleOwner(), new s(new q()));
        x0().V0().k(getViewLifecycleOwner(), new s(new f()));
        x0().r1().k(getViewLifecycleOwner(), new s(new g()));
        x0().b1().k(getViewLifecycleOwner(), new s(new h()));
    }

    @l3.d
    public final ArrayList<HmMultiDeviceModel> getMasterDeviceList() {
        return this.f43012R0;
    }

    @l3.e
    public final com.harman.jbl.partybox.ui.dashboard.adapter.e getProductListDeviceAdapter() {
        return this.f43013S0;
    }

    public final void handleConnectFail() {
        com.harman.log.f.a(TAG, " BLE_LOG ProductListFragment CONNECTION_FAIL");
        com.harman.jbl.partybox.utils.k kVar = new com.harman.jbl.partybox.utils.k();
        Context requireContext = requireContext();
        kotlin.jvm.internal.F.o(requireContext, "requireContext(...)");
        String string = getString(j.m.c7);
        kotlin.jvm.internal.F.o(string, "getString(...)");
        kVar.f(requireContext, string);
        this.f43014T0 = false;
        resetConnectState();
    }

    public final boolean isConnectionInProgress() {
        return this.f43014T0;
    }

    public final boolean isFirstTimeAutoScroll() {
        return this.f43015U0;
    }

    public final boolean isFromSwitchSpeaker() {
        return this.f43016V0;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@l3.d View v3) {
        kotlin.jvm.internal.F.p(v3, "v");
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@l3.e Bundle bundle) {
        com.harman.log.f.a(TAG, " BLE_LOG ProductListFragment onCreate called ");
        super.onCreate(bundle);
        x0().M2(false);
        this.f43014T0 = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        Dialog dialog;
        RemoveProductDialogFragment removeProductDialogFragment;
        this.f43015U0 = false;
        super.onDestroy();
        this.f43013S0 = null;
        RemoveProductDialogFragment removeProductDialogFragment2 = this.f43018X0;
        if (removeProductDialogFragment2 != null && (dialog = removeProductDialogFragment2.getDialog()) != null && dialog.isShowing() && (removeProductDialogFragment = this.f43018X0) != null) {
            removeProductDialogFragment.dismiss();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        com.harman.log.f.a(TAG, " BLE_LOG ProductListFragment onResume ");
        x0().T2(true);
        x0().c3(true);
        J0();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@l3.d View view, @l3.e Bundle bundle) {
        kotlin.jvm.internal.F.p(view, "view");
        com.harman.log.f.a(TAG, "BLE_LOG ProductListFragment onCreate");
        com.harman.log.f.a(TAG, " BLE_LOG ProductListFragment onViewCreated called ");
        super.onViewCreated(view, bundle);
        z0();
        E0();
        D0();
    }

    public final void resetConnectState() {
        ArrayList arrayList = new ArrayList();
        com.harman.log.f.a(TAG, " BLE_LOG resetConnectState masterDeviceList size is : " + this.f43012R0.size());
        int size = this.f43012R0.size();
        for (int i4 = 0; i4 < size; i4++) {
            com.harman.log.f.a(TAG, " BLE_LOG resetConnectState device is : " + this.f43012R0.get(i4).F());
            this.f43012R0.get(i4).h0(true);
            this.f43012R0.get(i4).o0(false);
            arrayList.add(this.f43012R0.get(i4));
        }
        N0(arrayList);
    }

    public final void setConnectionInProgress(boolean z3) {
        this.f43014T0 = z3;
    }

    public final void setFirstTimeAutoScroll(boolean z3) {
        this.f43015U0 = z3;
    }

    public final void setFromSwitchSpeaker(boolean z3) {
        this.f43016V0 = z3;
    }

    public final void setProductListDeviceAdapter(@l3.e com.harman.jbl.partybox.ui.dashboard.adapter.e eVar) {
        this.f43013S0 = eVar;
    }

    public final void showTurnOnSpeakerDialog() {
        Dialog dialog;
        com.harman.log.f.a(TAG, "BLE_LOG showTurnOnSpeakerDialog called");
        HmTurnOnSpeakerDialogFragment hmTurnOnSpeakerDialogFragment = this.f43008N0;
        if (hmTurnOnSpeakerDialogFragment != null && (dialog = hmTurnOnSpeakerDialogFragment.getDialog()) != null && dialog.isShowing()) {
            return;
        }
        this.f43008N0.show(getChildFragmentManager(), HmTurnOnSpeakerDialogFragment.class.getSimpleName());
    }
}
