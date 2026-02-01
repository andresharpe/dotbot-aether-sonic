package com.harman.jbl.partybox.ui.party.auracast;

import B2.c;
import androidx.annotation.InterfaceC0561d;
import androidx.annotation.K;
import androidx.databinding.ObservableArrayList;
import androidx.lifecycle.A;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.N;
import androidx.lifecycle.P;
import androidx.lifecycle.Q;
import androidx.lifecycle.h0;
import androidx.lifecycle.k0;
import com.harman.jbl.partybox.ui.party.auracast.define.EnumJoinPartyResult;
import com.harman.jbl.partybox.ui.party.auracast.define.EnumPartyStyle;
import com.harman.jbl.partybox.ui.party.stereo.D;
import com.harman.jbl.partybox.utils.LiveEvent;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.utils.PlayerStatus;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.E;
import kotlin.H0;
import kotlin.InterfaceC2229v;
import kotlin.W;
import kotlin.collections.C2112z;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.U;
import kotlin.text.z;
import kotlinx.coroutines.C2322k0;
import kotlinx.coroutines.C2323l;

@E(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u000e*\u0002\u0091\u0001\u0018\u0000 \u0097\u00012\u00020\u00012\u00020\u0002:\u0002\u009d\u0001B\b¢\u0006\u0005\b\u009c\u0001\u0010\u0005J\u000f\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0004\u0010\u0005J3\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0003¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0012\u0010\u0005Ji\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00132\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0007H\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0019\u0010\u0005J\u000f\u0010\u001a\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u001a\u0010\u0005J\u000f\u0010\u001b\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u001b\u0010\u0005J\u000f\u0010\u001c\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u001e\u0010\u0005J\u000f\u0010\u001f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001f\u0010\u0005J\u000f\u0010 \u001a\u00020\u0003H\u0002¢\u0006\u0004\b \u0010\u0005J\u000f\u0010!\u001a\u00020\u0003H\u0003¢\u0006\u0004\b!\u0010\u0005J\u0017\u0010#\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u0007H\u0003¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u0007H\u0003¢\u0006\u0004\b%\u0010$J\u001d\u0010'\u001a\u00020\u00032\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00070\u0013H\u0003¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020)2\u0006\u0010\"\u001a\u00020\u0007H\u0007¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u0007H\u0007¢\u0006\u0004\b,\u0010$J\u0019\u0010-\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b-\u0010$J\u0019\u0010.\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b.\u0010$J\u000f\u0010/\u001a\u00020\u0003H\u0007¢\u0006\u0004\b/\u0010\u0005J\u000f\u00100\u001a\u00020\u0003H\u0007¢\u0006\u0004\b0\u0010\u0005J\u0019\u00101\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b1\u0010$J\u000f\u00102\u001a\u00020\u0003H\u0007¢\u0006\u0004\b2\u0010\u0005J\u001f\u00107\u001a\u00020\u00032\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020\u00032\u0006\u00109\u001a\u00020\u000fH\u0017¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\u00032\u0006\u00109\u001a\u00020\u000fH\u0017¢\u0006\u0004\b<\u0010;J!\u0010@\u001a\u00020\u00032\b\u0010>\u001a\u0004\u0018\u00010=2\u0006\u0010?\u001a\u00020\u000fH\u0017¢\u0006\u0004\b@\u0010AJ%\u0010C\u001a\u00020\u000f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\bC\u0010DJ\u0017\u0010F\u001a\u00020\u00032\u0006\u0010E\u001a\u00020\tH\u0007¢\u0006\u0004\bF\u0010GR \u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR \u0010O\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u001f\u0010S\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070H8\u0006¢\u0006\f\n\u0004\bP\u0010J\u001a\u0004\bQ\u0010RR#\u0010V\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060H8\u0006¢\u0006\f\n\u0004\bT\u0010J\u001a\u0004\bU\u0010RR\u001f\u0010Y\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070H8\u0006¢\u0006\f\n\u0004\bW\u0010J\u001a\u0004\bX\u0010RR\u001c\u0010[\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010JR\u001f\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\\8\u0006¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R\u0018\u0010c\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u001d\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00070d8\u0006¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010hR\u001d\u0010l\u001a\b\u0012\u0004\u0012\u00020\u00070d8\u0006¢\u0006\f\n\u0004\bj\u0010f\u001a\u0004\bk\u0010hR\u001d\u0010o\u001a\b\u0012\u0004\u0012\u00020\u00070d8\u0006¢\u0006\f\n\u0004\bm\u0010f\u001a\u0004\bn\u0010hR\u001d\u0010v\u001a\b\u0012\u0004\u0012\u00020q0p8\u0006¢\u0006\f\n\u0004\br\u0010s\u001a\u0004\bt\u0010uR\u001d\u0010z\u001a\b\u0012\u0004\u0012\u00020w0p8\u0006¢\u0006\f\n\u0004\bx\u0010s\u001a\u0004\by\u0010uR\u001f\u0010}\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010w0p8\u0006¢\u0006\f\n\u0004\b{\u0010s\u001a\u0004\b|\u0010uR\u001b\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020~0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u007f\u0010JR\u001c\u0010\u0082\u0001\u001a\t\u0012\u0005\u0012\u00030\u0081\u00010H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010JR\u001f\u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070H8\u0006¢\u0006\r\n\u0004\b_\u0010J\u001a\u0005\b\u0083\u0001\u0010RR\u001f\u0010\u0086\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070H8\u0006¢\u0006\r\n\u0004\bk\u0010J\u001a\u0005\b\u0085\u0001\u0010RR\u001b\u0010\u0087\u0001\u001a\b\u0012\u0004\u0012\u00020\t0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010JR'\u0010\u008b\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060L8\u0006¢\u0006\u000f\n\u0005\b\u0088\u0001\u0010N\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R \u0010\u008c\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0L8\u0006¢\u0006\u000e\n\u0004\by\u0010N\u001a\u0006\b\u0088\u0001\u0010\u008a\u0001R$\u0010\u0090\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u008d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0017\u0010\u0093\u0001\u001a\u00030\u0091\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b|\u0010\u0092\u0001R\u001f\u0010\u0095\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\\8F¢\u0006\u0007\u001a\u0005\b\u0094\u0001\u0010`R\u001f\u0010\u0096\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\\8F¢\u0006\u0007\u001a\u0005\b\u008e\u0001\u0010`R\u0019\u0010\u0098\u0001\u001a\b\u0012\u0004\u0012\u00020~0\\8F¢\u0006\u0007\u001a\u0005\b\u0097\u0001\u0010`R\u001a\u0010\u009a\u0001\u001a\t\u0012\u0005\u0012\u00030\u0081\u00010\\8F¢\u0006\u0007\u001a\u0005\b\u0099\u0001\u0010`R\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\\8F¢\u0006\u0007\u001a\u0005\b\u009b\u0001\u0010`¨\u0006\u009e\u0001"}, d2 = {"Lcom/harman/jbl/partybox/ui/party/auracast/AuracastViewModel;", "Lcom/harman/jbl/partybox/c;", "Landroidx/lifecycle/A;", "Lkotlin/H0;", "I0", "()V", "", "Lcom/harman/sdk/device/HmDevice;", "list", "Lcom/harman/jbl/partybox/ui/party/mode/c;", "provider", "d1", "(Ljava/util/List;Lcom/harman/jbl/partybox/ui/party/mode/c;)Ljava/util/List;", "broadcaster", "receivers", "", "A0", "(Lcom/harman/sdk/device/HmDevice;Ljava/util/List;)Z", "C0", "", "snapshots", "twsMain", "twsCo", "b1", "(Ljava/util/Collection;Lcom/harman/jbl/partybox/ui/party/mode/c;Lcom/harman/sdk/device/HmDevice;Ljava/util/List;Lcom/harman/sdk/device/HmDevice;Lcom/harman/sdk/device/HmDevice;)Ljava/util/List;", "L0", "K0", "J0", "x0", "()Lcom/harman/jbl/partybox/ui/party/mode/c;", "U0", "W0", "X0", "S0", "device", "G0", "(Lcom/harman/sdk/device/HmDevice;)V", "F0", "devices", "Z0", "(Ljava/util/Collection;)V", "Lcom/harman/jbl/partybox/ui/party/auracast/define/EnumJoinPartyResult;", "M0", "(Lcom/harman/sdk/device/HmDevice;)Lcom/harman/jbl/partybox/ui/party/auracast/define/EnumJoinPartyResult;", "R0", "D0", "N0", "O0", "P0", "Q0", "E0", "Landroidx/lifecycle/E;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "f", "(Landroidx/lifecycle/E;Landroidx/lifecycle/Lifecycle$Event;)V", "isEnable", "onBtEnabled", "(Z)V", "onLocationEnabled", "", "address", "isConnected", "onA2DPConnected", "(Ljava/lang/String;Z)V", "btConnectDevice", "y0", "(Lcom/harman/sdk/device/HmDevice;Lcom/harman/sdk/device/HmDevice;)Z", "newProvider", "Y0", "(Lcom/harman/jbl/partybox/ui/party/mode/c;)V", "Landroidx/lifecycle/P;", "P", "Landroidx/lifecycle/P;", "_snapshotDevices", "Landroidx/lifecycle/N;", "Q", "Landroidx/lifecycle/N;", "_nearbyDevices", "R", "e0", "()Landroidx/lifecycle/P;", "broadcasterDevice", androidx.exifinterface.media.a.T4, "r0", "receiverDevices", androidx.exifinterface.media.a.f5, "s0", "selectedDeviceInParty", "U", "_btConnectDevice", "Landroidx/lifecycle/LiveData;", androidx.exifinterface.media.a.Z4, "Landroidx/lifecycle/LiveData;", "f0", "()Landroidx/lifecycle/LiveData;", androidx.exifinterface.media.a.V4, "Lcom/harman/sdk/device/HmDevice;", "lastBtDevice", "Landroidx/databinding/ObservableArrayList;", "X", "Landroidx/databinding/ObservableArrayList;", "h0", "()Landroidx/databinding/ObservableArrayList;", "connectingDevices", "Y", "g0", "connectedDevices", "Z", "q0", "quitingDevices", "Lcom/harman/jbl/partybox/utils/LiveEvent;", "Lcom/harman/jbl/partybox/utils/LiveEvent$QuitEvent;", "a0", "Lcom/harman/jbl/partybox/utils/LiveEvent;", "p0", "()Lcom/harman/jbl/partybox/utils/LiveEvent;", "quitGuideShow", "Lcom/harman/jbl/partybox/utils/LiveEvent$Event;", "b0", "j0", "forceNearby", "c0", "l0", "otherDevicesBtnClick", "Lcom/harman/sdk/utils/PlayerStatus;", "d0", "_playState", "", "_volume", "v0", "twsMainDevice", "u0", "twsCoDevice", "_provider", "i0", "n0", "()Landroidx/lifecycle/N;", "popupNearbyDevice", "deviceListEmpty", "Landroidx/lifecycle/Q;", "k0", "Landroidx/lifecycle/Q;", "snapshotsObserver", "com/harman/jbl/partybox/ui/party/auracast/AuracastViewModel$t", "Lcom/harman/jbl/partybox/ui/party/auracast/AuracastViewModel$t;", "scanListener", "t0", "snapshotDevices", "nearbyDevices", "m0", "playState", "w0", "volume", "o0", "<init>", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nAuracastViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuracastViewModel.kt\ncom/harman/jbl/partybox/ui/party/auracast/AuracastViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,922:1\n1655#2,8:923\n766#2:931\n857#2,2:932\n1655#2,8:934\n766#2:942\n857#2,2:943\n288#2,2:945\n1655#2,8:947\n766#2:955\n857#2,2:956\n*S KotlinDebug\n*F\n+ 1 AuracastViewModel.kt\ncom/harman/jbl/partybox/ui/party/auracast/AuracastViewModel\n*L\n368#1:923,8\n370#1:931\n370#1:932,2\n595#1:934,8\n597#1:942\n597#1:943,2\n608#1:945,2\n620#1:947,8\n622#1:955\n622#1:956,2\n*E\n"})
/* loaded from: classes2.dex */
public final class AuracastViewModel extends com.harman.jbl.partybox.c implements A {

    /* renamed from: m0, reason: collision with root package name */
    @l3.d
    public static final a f44776m0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @l3.d
    private static final String f44777n0 = "Party.Auracast.ViewModel";

    /* renamed from: o0, reason: collision with root package name */
    private static final long f44778o0 = 5000;

    /* renamed from: P, reason: collision with root package name */
    @l3.d
    private final P<List<HmDevice>> f44779P = new P<>();

    /* renamed from: Q, reason: collision with root package name */
    @l3.d
    private final N<List<HmDevice>> f44780Q = new N<>();

    /* renamed from: R, reason: collision with root package name */
    @l3.d
    private final P<HmDevice> f44781R = new P<>();

    /* renamed from: S, reason: collision with root package name */
    @l3.d
    private final P<List<HmDevice>> f44782S = new P<>();

    /* renamed from: T, reason: collision with root package name */
    @l3.d
    private final P<HmDevice> f44783T = new P<>();

    /* renamed from: U, reason: collision with root package name */
    @l3.d
    private final P<HmDevice> f44784U;

    /* renamed from: V, reason: collision with root package name */
    @l3.d
    private final LiveData<HmDevice> f44785V;

    /* renamed from: W, reason: collision with root package name */
    @l3.e
    private HmDevice f44786W;

    /* renamed from: X, reason: collision with root package name */
    @l3.d
    private final ObservableArrayList<HmDevice> f44787X;

    /* renamed from: Y, reason: collision with root package name */
    @l3.d
    private final ObservableArrayList<HmDevice> f44788Y;

    /* renamed from: Z, reason: collision with root package name */
    @l3.d
    private final ObservableArrayList<HmDevice> f44789Z;

    /* renamed from: a0, reason: collision with root package name */
    @l3.d
    private final LiveEvent<LiveEvent.QuitEvent> f44790a0;

    /* renamed from: b0, reason: collision with root package name */
    @l3.d
    private final LiveEvent<LiveEvent.Event> f44791b0;

    /* renamed from: c0, reason: collision with root package name */
    @l3.d
    private final LiveEvent<LiveEvent.Event> f44792c0;

    /* renamed from: d0, reason: collision with root package name */
    @l3.d
    private final P<PlayerStatus> f44793d0;

    /* renamed from: e0, reason: collision with root package name */
    @l3.d
    private final P<Integer> f44794e0;

    /* renamed from: f0, reason: collision with root package name */
    @l3.d
    private final P<HmDevice> f44795f0;

    /* renamed from: g0, reason: collision with root package name */
    @l3.d
    private final P<HmDevice> f44796g0;

    /* renamed from: h0, reason: collision with root package name */
    @l3.d
    private final P<com.harman.jbl.partybox.ui.party.mode.c> f44797h0;

    /* renamed from: i0, reason: collision with root package name */
    @l3.d
    private final N<List<HmDevice>> f44798i0;

    /* renamed from: j0, reason: collision with root package name */
    @l3.d
    private final N<Boolean> f44799j0;

    /* renamed from: k0, reason: collision with root package name */
    @l3.d
    private final Q<List<HmDevice>> f44800k0;

    /* renamed from: l0, reason: collision with root package name */
    @l3.d
    private final t f44801l0;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44802a;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f44802a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class c extends Lambda implements X2.l<com.harman.jbl.partybox.ui.party.mode.c, H0> {
        c() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(com.harman.jbl.partybox.ui.party.mode.c cVar) {
            c(cVar);
            return H0.f51801a;
        }

        public final void c(@l3.d com.harman.jbl.partybox.ui.party.mode.c provider) {
            F.p(provider, "provider");
            AuracastViewModel.this.f44780Q.r(AuracastViewModel.c1(AuracastViewModel.this, null, provider, null, null, null, null, 61, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class d extends Lambda implements X2.l<List<? extends HmDevice>, H0> {
        d() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(List<? extends HmDevice> list) {
            c(list);
            return H0.f51801a;
        }

        public final void c(List<? extends HmDevice> list) {
            AuracastViewModel.this.f44780Q.r(AuracastViewModel.c1(AuracastViewModel.this, list, null, null, null, null, null, 62, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class e extends Lambda implements X2.l<HmDevice, H0> {
        e() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(HmDevice hmDevice) {
            c(hmDevice);
            return H0.f51801a;
        }

        public final void c(@l3.e HmDevice hmDevice) {
            AuracastViewModel.this.f44780Q.r(AuracastViewModel.c1(AuracastViewModel.this, null, null, hmDevice, null, null, null, 59, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class f extends Lambda implements X2.l<List<? extends HmDevice>, H0> {
        f() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(List<? extends HmDevice> list) {
            c(list);
            return H0.f51801a;
        }

        public final void c(List<? extends HmDevice> list) {
            AuracastViewModel.this.f44780Q.r(AuracastViewModel.c1(AuracastViewModel.this, null, null, null, list, null, null, 55, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class g extends Lambda implements X2.l<HmDevice, H0> {
        g() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(HmDevice hmDevice) {
            c(hmDevice);
            return H0.f51801a;
        }

        public final void c(HmDevice hmDevice) {
            AuracastViewModel.this.f44780Q.r(AuracastViewModel.c1(AuracastViewModel.this, null, null, null, null, hmDevice, null, 47, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class h extends Lambda implements X2.l<HmDevice, H0> {
        h() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(HmDevice hmDevice) {
            c(hmDevice);
            return H0.f51801a;
        }

        public final void c(HmDevice hmDevice) {
            AuracastViewModel.this.f44780Q.r(AuracastViewModel.c1(AuracastViewModel.this, null, null, null, null, null, hmDevice, 31, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.party.auracast.AuracastViewModel$onA2DPConnected$1", f = "AuracastViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @U({"SMAP\nAuracastViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuracastViewModel.kt\ncom/harman/jbl/partybox/ui/party/auracast/AuracastViewModel$onA2DPConnected$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,922:1\n288#2,2:923\n*S KotlinDebug\n*F\n+ 1 AuracastViewModel.kt\ncom/harman/jbl/partybox/ui/party/auracast/AuracastViewModel$onA2DPConnected$1\n*L\n427#1:923,2\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class i extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f44809I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ String f44810J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ boolean f44811K;

        /* renamed from: L, reason: collision with root package name */
        final /* synthetic */ AuracastViewModel f44812L;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, boolean z3, AuracastViewModel auracastViewModel, kotlin.coroutines.c<? super i> cVar) {
            super(2, cVar);
            this.f44810J = str;
            this.f44811K = z3;
            this.f44812L = auracastViewModel;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x006d, code lost:
        
            if (r4 == null) goto L17;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object D(@l3.d java.lang.Object r8) {
            /*
                r7 = this;
                kotlin.coroutines.intrinsics.a.l()
                int r0 = r7.f44809I
                if (r0 != 0) goto Ld9
                kotlin.W.n(r8)
                java.lang.String r8 = r7.f44810J
                boolean r0 = r7.f44811K
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "onA2DPConnected() >>> address["
                r1.append(r2)
                r1.append(r8)
                java.lang.String r8 = "] isConnected["
                r1.append(r8)
                r1.append(r0)
                java.lang.String r8 = "]"
                r1.append(r8)
                java.lang.String r8 = r1.toString()
                java.lang.String r0 = "Party.Auracast.ViewModel"
                com.harman.log.f.a(r0, r8)
                boolean r8 = r7.f44811K
                r1 = 0
                if (r8 == 0) goto L89
                com.harman.jbl.partybox.ui.party.auracast.AuracastViewModel r8 = r7.f44812L
                androidx.lifecycle.P r8 = com.harman.jbl.partybox.ui.party.auracast.AuracastViewModel.Z(r8)
                com.harman.jbl.partybox.ui.party.auracast.AuracastViewModel r2 = r7.f44812L
                androidx.lifecycle.LiveData r2 = r2.t0()
                java.lang.Object r2 = r2.f()
                java.util.List r2 = (java.util.List) r2
                if (r2 == 0) goto L6f
                java.lang.String r3 = r7.f44810J
                java.util.Iterator r2 = r2.iterator()
            L50:
                boolean r4 = r2.hasNext()
                if (r4 == 0) goto L6a
                java.lang.Object r4 = r2.next()
                r5 = r4
                com.harman.sdk.device.HmDevice r5 = (com.harman.sdk.device.HmDevice) r5
                com.harman.jbl.partybox.ui.party.b r6 = com.harman.jbl.partybox.ui.party.b.f44881a
                java.lang.String r5 = r5.n()
                boolean r5 = r6.p(r5, r3)
                if (r5 == 0) goto L50
                goto L6b
            L6a:
                r4 = r1
            L6b:
                com.harman.sdk.device.HmDevice r4 = (com.harman.sdk.device.HmDevice) r4
                if (r4 != 0) goto L85
            L6f:
                com.harman.jbl.partybox.ui.party.auracast.AuracastViewModel r2 = r7.f44812L
                androidx.lifecycle.LiveData r2 = r2.t0()
                java.lang.Object r2 = r2.f()
                java.util.List r2 = (java.util.List) r2
                if (r2 == 0) goto L84
                com.harman.jbl.partybox.ui.party.b r3 = com.harman.jbl.partybox.ui.party.b.f44881a
                com.harman.sdk.device.HmDevice r4 = r3.d(r2)
                goto L85
            L84:
                r4 = r1
            L85:
                r8.r(r4)
                goto Lae
            L89:
                com.harman.jbl.partybox.ui.party.auracast.AuracastViewModel r8 = r7.f44812L
                androidx.lifecycle.P r8 = com.harman.jbl.partybox.ui.party.auracast.AuracastViewModel.Z(r8)
                java.lang.Object r8 = r8.f()
                com.harman.sdk.device.HmDevice r8 = (com.harman.sdk.device.HmDevice) r8
                if (r8 == 0) goto Lae
                com.harman.jbl.partybox.ui.party.b r2 = com.harman.jbl.partybox.ui.party.b.f44881a
                java.lang.String r8 = r8.n()
                java.lang.String r3 = r7.f44810J
                boolean r8 = r2.p(r8, r3)
                if (r8 == 0) goto Lae
                com.harman.jbl.partybox.ui.party.auracast.AuracastViewModel r8 = r7.f44812L
                androidx.lifecycle.P r8 = com.harman.jbl.partybox.ui.party.auracast.AuracastViewModel.Z(r8)
                r8.r(r1)
            Lae:
                com.harman.jbl.partybox.ui.party.auracast.AuracastViewModel r8 = r7.f44812L
                androidx.lifecycle.P r8 = com.harman.jbl.partybox.ui.party.auracast.AuracastViewModel.Z(r8)
                java.lang.Object r8 = r8.f()
                com.harman.sdk.device.HmDevice r8 = (com.harman.sdk.device.HmDevice) r8
                if (r8 == 0) goto Lc2
                com.harman.jbl.partybox.ui.party.b r1 = com.harman.jbl.partybox.ui.party.b.f44881a
                java.lang.String r1 = r1.t(r8)
            Lc2:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r2 = "onA2DPConnected() >>> btDevice "
                r8.append(r2)
                r8.append(r1)
                java.lang.String r8 = r8.toString()
                com.harman.log.f.d(r0, r8)
                kotlin.H0 r8 = kotlin.H0.f51801a
                return r8
            Ld9:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.party.auracast.AuracastViewModel.i.D(java.lang.Object):java.lang.Object");
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((i) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new i(this.f44810J, this.f44811K, this.f44812L, cVar);
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.party.auracast.AuracastViewModel$onBtEnabled$1", f = "AuracastViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    static final class j extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f44813I;

        j(kotlin.coroutines.c<? super j> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f44813I == 0) {
                W.n(obj);
                AuracastViewModel.this.U0();
                return H0.f51801a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((j) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new j(cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class k extends Lambda implements X2.l<HmDevice, Boolean> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ HmDevice f44815F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(HmDevice hmDevice) {
            super(1);
            this.f44815F = hmDevice;
        }

        @Override // X2.l
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean C(@l3.d HmDevice snapshot) {
            F.p(snapshot, "snapshot");
            return Boolean.valueOf(com.harman.jbl.partybox.ui.party.b.f44881a.o(snapshot, this.f44815F));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class l extends Lambda implements X2.l<HmDevice, Boolean> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ HmDevice f44816F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(HmDevice hmDevice) {
            super(1);
            this.f44816F = hmDevice;
        }

        @Override // X2.l
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean C(@l3.d HmDevice snapshot) {
            F.p(snapshot, "snapshot");
            return Boolean.valueOf(com.harman.jbl.partybox.ui.party.b.f44881a.o(snapshot, this.f44816F));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class m extends Lambda implements X2.l<List<? extends HmDevice>, H0> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ N<List<HmDevice>> f44817F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ AuracastViewModel f44818G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(N<List<HmDevice>> n4, AuracastViewModel auracastViewModel) {
            super(1);
            this.f44817F = n4;
            this.f44818G = auracastViewModel;
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(List<? extends HmDevice> list) {
            c(list);
            return H0.f51801a;
        }

        public final void c(List<? extends HmDevice> list) {
            this.f44817F.r(AuracastViewModel.e1(this.f44818G, list, null, 2, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class n extends Lambda implements X2.l<com.harman.jbl.partybox.ui.party.mode.c, H0> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ N<List<HmDevice>> f44819F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ AuracastViewModel f44820G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(N<List<HmDevice>> n4, AuracastViewModel auracastViewModel) {
            super(1);
            this.f44819F = n4;
            this.f44820G = auracastViewModel;
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(com.harman.jbl.partybox.ui.party.mode.c cVar) {
            c(cVar);
            return H0.f51801a;
        }

        public final void c(@l3.d com.harman.jbl.partybox.ui.party.mode.c provider) {
            F.p(provider, "provider");
            this.f44819F.r(AuracastViewModel.e1(this.f44820G, null, provider, 1, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class o extends Lambda implements X2.l<HmDevice, H0> {
        o() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(HmDevice hmDevice) {
            c(hmDevice);
            return H0.f51801a;
        }

        public final void c(@l3.e HmDevice hmDevice) {
            if (!AuracastViewModel.B0(AuracastViewModel.this, hmDevice, null, 2, null)) {
                AuracastViewModel.this.P0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class p extends Lambda implements X2.l<List<? extends HmDevice>, H0> {
        p() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(List<? extends HmDevice> list) {
            c(list);
            return H0.f51801a;
        }

        public final void c(List<? extends HmDevice> list) {
            if (!AuracastViewModel.B0(AuracastViewModel.this, null, list, 1, null)) {
                AuracastViewModel.this.P0();
            }
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.party.auracast.AuracastViewModel$onLocationEnabled$1", f = "AuracastViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    static final class q extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f44823I;

        q(kotlin.coroutines.c<? super q> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f44823I == 0) {
                W.n(obj);
                AuracastViewModel.this.U0();
                return H0.f51801a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((q) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new q(cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @U({"SMAP\nAuracastViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuracastViewModel.kt\ncom/harman/jbl/partybox/ui/party/auracast/AuracastViewModel$refreshDevices$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,922:1\n1747#2,3:923\n*S KotlinDebug\n*F\n+ 1 AuracastViewModel.kt\ncom/harman/jbl/partybox/ui/party/auracast/AuracastViewModel$refreshDevices$1\n*L\n531#1:923,3\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class r extends Lambda implements X2.l<HmDevice, Boolean> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ List<HmDevice> f44825F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        r(List<? extends HmDevice> list) {
            super(1);
            this.f44825F = list;
        }

        @Override // X2.l
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean C(@l3.d HmDevice snapshot) {
            F.p(snapshot, "snapshot");
            List<HmDevice> list = this.f44825F;
            boolean z3 = false;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (com.harman.jbl.partybox.ui.party.b.f44881a.o(snapshot, (HmDevice) it.next())) {
                        z3 = true;
                        break;
                    }
                }
            }
            return Boolean.valueOf(z3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class s implements Q, kotlin.jvm.internal.A {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ X2.l f44826a;

        s(X2.l function) {
            F.p(function, "function");
            this.f44826a = function;
        }

        @Override // kotlin.jvm.internal.A
        @l3.d
        public final InterfaceC2229v<?> a() {
            return this.f44826a;
        }

        public final boolean equals(@l3.e Object obj) {
            if ((obj instanceof Q) && (obj instanceof kotlin.jvm.internal.A)) {
                return F.g(a(), ((kotlin.jvm.internal.A) obj).a());
            }
            return false;
        }

        @Override // androidx.lifecycle.Q
        public final /* synthetic */ void f(Object obj) {
            this.f44826a.C(obj);
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    /* loaded from: classes2.dex */
    public static final class t implements c.b {

        @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.party.auracast.AuracastViewModel$scanListener$1$onDeviceOffline$1", f = "AuracastViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: classes2.dex */
        static final class a extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

            /* renamed from: I, reason: collision with root package name */
            int f44828I;

            /* renamed from: J, reason: collision with root package name */
            final /* synthetic */ AuracastViewModel f44829J;

            /* renamed from: K, reason: collision with root package name */
            final /* synthetic */ HmDevice f44830K;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(AuracastViewModel auracastViewModel, HmDevice hmDevice, kotlin.coroutines.c<? super a> cVar) {
                super(2, cVar);
                this.f44829J = auracastViewModel;
                this.f44830K = hmDevice;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f44828I == 0) {
                    W.n(obj);
                    this.f44829J.F0(this.f44830K);
                    return H0.f51801a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // X2.p
            @l3.e
            /* renamed from: R, reason: merged with bridge method [inline-methods] */
            public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
                return ((a) v(u3, cVar)).D(H0.f51801a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.d
            public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
                return new a(this.f44829J, this.f44830K, cVar);
            }
        }

        @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.party.auracast.AuracastViewModel$scanListener$1$onScanResult$1", f = "AuracastViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: classes2.dex */
        static final class b extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

            /* renamed from: I, reason: collision with root package name */
            int f44831I;

            /* renamed from: J, reason: collision with root package name */
            final /* synthetic */ AuracastViewModel f44832J;

            /* renamed from: K, reason: collision with root package name */
            final /* synthetic */ HmDevice f44833K;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(AuracastViewModel auracastViewModel, HmDevice hmDevice, kotlin.coroutines.c<? super b> cVar) {
                super(2, cVar);
                this.f44832J = auracastViewModel;
                this.f44833K = hmDevice;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f44831I == 0) {
                    W.n(obj);
                    this.f44832J.G0(this.f44833K);
                    return H0.f51801a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // X2.p
            @l3.e
            /* renamed from: R, reason: merged with bridge method [inline-methods] */
            public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
                return ((b) v(u3, cVar)).D(H0.f51801a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.d
            public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
                return new b(this.f44832J, this.f44833K, cVar);
            }
        }

        t() {
        }

        @Override // B2.c.b
        public void b(int i4, @l3.e String str) {
            com.harman.log.f.b(AuracastViewModel.f44777n0, "onScanFailed() >>> code[" + i4 + "] msg[" + str + "]");
        }

        @Override // B2.c.b
        public void c(@l3.d HmDevice device) {
            F.p(device, "device");
        }

        @Override // B2.c.b
        public void d(@l3.d HmDevice device) {
            F.p(device, "device");
            C2323l.f(k0.a(AuracastViewModel.this), C2322k0.e(), null, new a(AuracastViewModel.this, device, null), 2, null);
        }

        @Override // B2.c.b
        public void e(@l3.d HmDevice scannedDevice) {
            F.p(scannedDevice, "scannedDevice");
            C2323l.f(k0.a(AuracastViewModel.this), C2322k0.e(), null, new b(AuracastViewModel.this, scannedDevice, null), 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class u extends Lambda implements X2.l<HmDevice, Boolean> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ HmDevice f44834F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(HmDevice hmDevice) {
            super(1);
            this.f44834F = hmDevice;
        }

        @Override // X2.l
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean C(@l3.d HmDevice device) {
            F.p(device, "device");
            return Boolean.valueOf(com.harman.jbl.partybox.ui.party.b.f44881a.o(device, this.f44834F));
        }
    }

    public AuracastViewModel() {
        P<HmDevice> p4 = new P<>();
        this.f44784U = p4;
        this.f44785V = h0.a(p4);
        this.f44787X = new ObservableArrayList<>();
        this.f44788Y = new ObservableArrayList<>();
        this.f44789Z = new ObservableArrayList<>();
        this.f44790a0 = new LiveEvent<>();
        this.f44791b0 = new LiveEvent<>();
        this.f44792c0 = new LiveEvent<>();
        this.f44793d0 = new P<>(PlayerStatus.PLAYER_STATE_PLAY);
        this.f44794e0 = new P<>();
        this.f44795f0 = new P<>();
        this.f44796g0 = new P<>();
        this.f44797h0 = new P<>();
        this.f44798i0 = new N<>();
        this.f44799j0 = new N<>();
        this.f44800k0 = new Q() { // from class: com.harman.jbl.partybox.ui.party.auracast.q
            @Override // androidx.lifecycle.Q
            public final void f(Object obj) {
                AuracastViewModel.V0(AuracastViewModel.this, (List) obj);
            }
        };
        this.f44801l0 = new t();
    }

    @K
    private final boolean A0(HmDevice hmDevice, List<? extends HmDevice> list) {
        if (hmDevice == null && list != null && !list.isEmpty() && list.size() > 5) {
            return true;
        }
        if (hmDevice != null && list != null && !list.isEmpty() && list.size() > 4) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ boolean B0(AuracastViewModel auracastViewModel, HmDevice hmDevice, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            hmDevice = auracastViewModel.f44781R.f();
        }
        if ((i4 & 2) != 0) {
            list = (List) auracastViewModel.f44782S.f();
        }
        return auracastViewModel.A0(hmDevice, list);
    }

    private final void C0() {
        com.harman.jbl.partybox.ui.party.b bVar = com.harman.jbl.partybox.ui.party.b.f44881a;
        bVar.l(this.f44780Q, o0(), new s(new c()));
        bVar.l(this.f44780Q, this.f44779P, new s(new d()));
        bVar.l(this.f44780Q, this.f44781R, new s(new e()));
        bVar.l(this.f44780Q, this.f44782S, new s(new f()));
        bVar.l(this.f44780Q, this.f44795f0, new s(new g()));
        bVar.l(this.f44780Q, this.f44796g0, new s(new h()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x002d, code lost:
    
        r1 = kotlin.collections.D.Y5(r1);
     */
    @androidx.annotation.K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F0(com.harman.sdk.device.HmDevice r8) {
        /*
            r7 = this;
            com.harman.jbl.partybox.ui.party.b r0 = com.harman.jbl.partybox.ui.party.b.f44881a
            java.lang.String r1 = r0.t(r8)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "onDeviceExpired() >>> device expired["
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = "]"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "Party.Auracast.ViewModel"
            com.harman.log.f.d(r2, r1)
            androidx.lifecycle.LiveData r1 = r7.t0()
            java.lang.Object r1 = r1.f()
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L33
            java.util.List r1 = kotlin.collections.C2107u.Y5(r1)
            if (r1 != 0) goto L38
        L33:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L38:
            com.harman.jbl.partybox.ui.party.auracast.AuracastViewModel$k r4 = new com.harman.jbl.partybox.ui.party.auracast.AuracastViewModel$k
            r4.<init>(r8)
            boolean r4 = kotlin.collections.C2107u.L0(r1, r4)
            if (r4 != 0) goto L44
            return
        L44:
            java.lang.String r4 = r8.n()
            java.lang.String r5 = r0.h(r1)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r3)
            r6.append(r4)
            java.lang.String r3 = "]\nsnapshots\n"
            r6.append(r3)
            r6.append(r5)
            java.lang.String r3 = r6.toString()
            com.harman.log.f.d(r2, r3)
            androidx.lifecycle.P<java.util.List<com.harman.sdk.device.HmDevice>> r2 = r7.f44779P
            r2.r(r1)
            androidx.lifecycle.P<com.harman.sdk.device.HmDevice> r2 = r7.f44783T
            java.lang.Object r2 = r2.f()
            com.harman.sdk.device.HmDevice r2 = (com.harman.sdk.device.HmDevice) r2
            boolean r8 = r0.o(r8, r2)
            if (r8 == 0) goto L7f
            androidx.lifecycle.P<com.harman.sdk.device.HmDevice> r8 = r7.f44783T
            r0 = 0
            r8.r(r0)
        L7f:
            r7.Z0(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.party.auracast.AuracastViewModel.F0(com.harman.sdk.device.HmDevice):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        r0 = kotlin.collections.D.Y5(r0);
     */
    @androidx.annotation.K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G0(com.harman.sdk.device.HmDevice r5) {
        /*
            r4 = this;
            androidx.databinding.ObservableArrayList<com.harman.sdk.device.HmDevice> r0 = r4.f44787X
            boolean r0 = r0.contains(r5)
            if (r0 != 0) goto L66
            androidx.databinding.ObservableArrayList<com.harman.sdk.device.HmDevice> r0 = r4.f44788Y
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L11
            goto L66
        L11:
            androidx.lifecycle.P<java.util.List<com.harman.sdk.device.HmDevice>> r0 = r4.f44779P
            java.lang.Object r0 = r0.f()
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L21
            java.util.List r0 = kotlin.collections.C2107u.Y5(r0)
            if (r0 != 0) goto L26
        L21:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L26:
            com.harman.jbl.partybox.ui.party.auracast.AuracastViewModel$l r1 = new com.harman.jbl.partybox.ui.party.auracast.AuracastViewModel$l
            r1.<init>(r5)
            com.harman.jbl.partybox.ui.party.auracast.s r2 = new com.harman.jbl.partybox.ui.party.auracast.s
            r2.<init>()
            r0.removeIf(r2)
            r0.add(r5)
            androidx.lifecycle.P<java.util.List<com.harman.sdk.device.HmDevice>> r1 = r4.f44779P
            r1.r(r0)
            java.lang.String r5 = r5.n()
            com.harman.jbl.partybox.ui.party.b r1 = com.harman.jbl.partybox.ui.party.b.f44881a
            java.lang.String r1 = r1.h(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "onDeviceScanned() >>> new device detected["
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = "]\nsnapshots:\n"
            r2.append(r5)
            r2.append(r1)
            java.lang.String r5 = r2.toString()
            java.lang.String r1 = "Party.Auracast.ViewModel"
            com.harman.log.f.a(r1, r5)
            r4.Z0(r0)
        L66:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.party.auracast.AuracastViewModel.G0(com.harman.sdk.device.HmDevice):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean H0(X2.l tmp0, Object obj) {
        F.p(tmp0, "$tmp0");
        return ((Boolean) tmp0.C(obj)).booleanValue();
    }

    @K
    private final void I0() {
        C0();
        t0().l(this.f44800k0);
        Y0(x0());
        N<List<HmDevice>> n4 = this.f44798i0;
        com.harman.jbl.partybox.ui.party.b bVar = com.harman.jbl.partybox.ui.party.b.f44881a;
        bVar.l(n4, this.f44782S, new s(new m(n4, this)));
        bVar.l(n4, o0(), new s(new n(n4, this)));
        LiveEvent<LiveEvent.Event> liveEvent = this.f44792c0;
        bVar.l(liveEvent, this.f44781R, new s(new o()));
        bVar.l(liveEvent, this.f44782S, new s(new p()));
    }

    @K
    private final void J0() {
        super.N();
        t0().p(this.f44800k0);
        X0();
    }

    @K
    private final void K0() {
        super.O();
        X0();
    }

    @K
    private final void L0() {
        super.P();
        U0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
    
        r0 = kotlin.collections.D.V5(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        r1 = kotlin.collections.D.Y5(r1);
     */
    @androidx.annotation.K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void S0() {
        /*
            r5 = this;
            com.harman.sdk.b r0 = com.harman.sdk.b.f47608a
            B2.c r0 = r0.k()
            if (r0 == 0) goto L16
            java.util.Collection r0 = r0.i()
            if (r0 == 0) goto L16
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = kotlin.collections.C2107u.V5(r0)
            if (r0 != 0) goto L1a
        L16:
            java.util.List r0 = kotlin.collections.C2107u.H()
        L1a:
            androidx.lifecycle.P<java.util.List<com.harman.sdk.device.HmDevice>> r1 = r5.f44779P
            java.lang.Object r1 = r1.f()
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L2a
            java.util.List r1 = kotlin.collections.C2107u.Y5(r1)
            if (r1 != 0) goto L2f
        L2a:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L2f:
            com.harman.jbl.partybox.ui.party.auracast.AuracastViewModel$r r2 = new com.harman.jbl.partybox.ui.party.auracast.AuracastViewModel$r
            r2.<init>(r0)
            com.harman.jbl.partybox.ui.party.auracast.r r3 = new com.harman.jbl.partybox.ui.party.auracast.r
            r3.<init>()
            r1.removeIf(r3)
            r1.addAll(r0)
            int r0 = r1.size()
            com.harman.jbl.partybox.ui.party.b r2 = com.harman.jbl.partybox.ui.party.b.f44881a
            java.lang.String r2 = r2.h(r1)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "refreshDevices() >>> snapshots.size["
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = "]\n"
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = r3.toString()
            java.lang.String r2 = "Party.Auracast.ViewModel"
            com.harman.log.f.a(r2, r0)
            androidx.lifecycle.P<java.util.List<com.harman.sdk.device.HmDevice>> r0 = r5.f44779P
            r0.r(r1)
            r5.Z0(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.party.auracast.AuracastViewModel.S0():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean T0(X2.l tmp0, Object obj) {
        F.p(tmp0, "$tmp0");
        return ((Boolean) tmp0.C(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @K
    public final void U0() {
        if (I() && J() && H()) {
            S0();
            W0();
        } else {
            X0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V0(AuracastViewModel this$0, List list) {
        F.p(this$0, "this$0");
        F.p(list, "list");
        HmDevice d4 = com.harman.jbl.partybox.ui.party.b.f44881a.d(list);
        if (d4 != null) {
            this$0.f44784U.r(d4);
        }
    }

    private final void W0() {
        com.harman.log.f.d(f44777n0, "observeScanObserver() >>> start");
        com.harman.sdk.b bVar = com.harman.sdk.b.f47608a;
        B2.c k4 = bVar.k();
        if (k4 != null) {
            k4.a(true);
        }
        B2.c k5 = bVar.k();
        if (k5 != null) {
            k5.g(D.f45020a.k(), this.f44801l0, null);
        }
    }

    private final void X0() {
        com.harman.log.f.d(f44777n0, "stopObserveDevices() >>> ");
        com.harman.sdk.b bVar = com.harman.sdk.b.f47608a;
        B2.c k4 = bVar.k();
        if (k4 != null) {
            k4.a(false);
        }
        B2.c k5 = bVar.k();
        if (k5 != null) {
            k5.j(D.f45020a.k(), this.f44801l0);
        }
    }

    @K
    private final void Z0(Collection<? extends HmDevice> collection) {
        List Y5;
        Object obj;
        HmDevice hmDevice;
        Object B22;
        List<HmDevice> Y52;
        Collection<? extends HmDevice> collection2 = collection;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : collection2) {
            if (hashSet.add(((HmDevice) obj2).n())) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : arrayList) {
            HmDevice hmDevice2 = (HmDevice) obj3;
            if (com.harman.jbl.partybox.ui.party.auracast.o.f44854a.c(hmDevice2) && com.harman.sdk.utils.d.a(hmDevice2.q())) {
                arrayList2.add(obj3);
            }
        }
        Y5 = kotlin.collections.D.Y5(arrayList2);
        String str = null;
        if (Y5.isEmpty()) {
            com.harman.log.f.a(f44777n0, "updateBroadcasterAndReceivers() >>> no broadcaster");
            hmDevice = null;
        } else {
            HmDevice f4 = this.f44785V.f();
            C2112z.p0(Y5, com.harman.jbl.partybox.ui.party.auracast.o.f44854a.n());
            Iterator it = Y5.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (com.harman.jbl.partybox.ui.party.b.f44881a.o((HmDevice) obj, f4)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            hmDevice = (HmDevice) obj;
            if (hmDevice == null) {
                B22 = kotlin.collections.D.B2(Y5);
                hmDevice = (HmDevice) B22;
            }
        }
        this.f44781R.r(hmDevice);
        if (hmDevice != null) {
            str = com.harman.jbl.partybox.ui.party.b.f44881a.t(hmDevice);
        }
        com.harman.log.f.d(f44777n0, "updateBroadcasterAndReceivers() >>> set master[" + str + "]");
        final u uVar = new u(hmDevice);
        Y5.removeIf(new Predicate() { // from class: com.harman.jbl.partybox.ui.party.auracast.p
            @Override // java.util.function.Predicate
            public final boolean test(Object obj4) {
                boolean a12;
                a12 = AuracastViewModel.a1(X2.l.this, obj4);
                return a12;
            }
        });
        HashSet hashSet2 = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj4 : collection2) {
            if (hashSet2.add(((HmDevice) obj4).n())) {
                arrayList3.add(obj4);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj5 : arrayList3) {
            HmDevice hmDevice3 = (HmDevice) obj5;
            if (com.harman.jbl.partybox.ui.party.auracast.o.f44854a.d(hmDevice3) && com.harman.sdk.utils.d.a(hmDevice3.q())) {
                arrayList4.add(obj5);
            }
        }
        Y52 = kotlin.collections.D.Y5(arrayList4);
        Y52.addAll(Y5);
        C2112z.p0(Y52, com.harman.jbl.partybox.ui.party.auracast.o.f44854a.n());
        this.f44782S.r(Y52);
        com.harman.log.f.a(f44777n0, "updateReceiverDevices() >>> set receivers:\n" + com.harman.jbl.partybox.ui.party.b.f44881a.h(Y52));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a1(X2.l tmp0, Object obj) {
        F.p(tmp0, "$tmp0");
        return ((Boolean) tmp0.C(obj)).booleanValue();
    }

    @K
    private final List<HmDevice> b1(Collection<? extends HmDevice> collection, com.harman.jbl.partybox.ui.party.mode.c cVar, HmDevice hmDevice, List<? extends HmDevice> list, HmDevice hmDevice2, HmDevice hmDevice3) {
        List<HmDevice> H3;
        List<HmDevice> Y5;
        List<? extends HmDevice> list2;
        List<? extends HmDevice> H4;
        if (collection == null || cVar == null) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (hashSet.add(((HmDevice) obj).n())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            HmDevice hmDevice4 = (HmDevice) obj2;
            if (list == null) {
                H4 = CollectionsKt__CollectionsKt.H();
                list2 = H4;
            } else {
                list2 = list;
            }
            if (cVar.n(hmDevice4, hmDevice, list2, hmDevice2, hmDevice3)) {
                arrayList2.add(obj2);
            }
        }
        Y5 = kotlin.collections.D.Y5(arrayList2);
        C2112z.p0(Y5, com.harman.jbl.partybox.ui.party.auracast.o.f44854a.m());
        return Y5;
    }

    static /* synthetic */ List c1(AuracastViewModel auracastViewModel, Collection collection, com.harman.jbl.partybox.ui.party.mode.c cVar, HmDevice hmDevice, List list, HmDevice hmDevice2, HmDevice hmDevice3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            collection = auracastViewModel.f44779P.f();
        }
        if ((i4 & 2) != 0) {
            cVar = auracastViewModel.f44797h0.f();
        }
        com.harman.jbl.partybox.ui.party.mode.c cVar2 = cVar;
        if ((i4 & 4) != 0) {
            hmDevice = auracastViewModel.f44781R.f();
        }
        HmDevice hmDevice4 = hmDevice;
        if ((i4 & 8) != 0) {
            list = (List) auracastViewModel.f44782S.f();
        }
        List list2 = list;
        if ((i4 & 16) != 0) {
            hmDevice2 = auracastViewModel.f44795f0.f();
        }
        HmDevice hmDevice5 = hmDevice2;
        if ((i4 & 32) != 0) {
            hmDevice3 = auracastViewModel.f44796g0.f();
        }
        return auracastViewModel.b1(collection, cVar2, hmDevice4, list2, hmDevice5, hmDevice3);
    }

    @K
    private final List<HmDevice> d1(List<? extends HmDevice> list, com.harman.jbl.partybox.ui.party.mode.c cVar) {
        EnumPartyStyle enumPartyStyle;
        List<HmDevice> H3;
        List<HmDevice> H4;
        LiveData<EnumPartyStyle> i4;
        if (cVar != null && (i4 = cVar.i()) != null) {
            enumPartyStyle = i4.f();
        } else {
            enumPartyStyle = null;
        }
        if (enumPartyStyle == null || list == null) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        if (list.size() <= enumPartyStyle.g()) {
            H4 = CollectionsKt__CollectionsKt.H();
            return H4;
        }
        return list.subList(enumPartyStyle.g() - 1, list.size());
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ List e1(AuracastViewModel auracastViewModel, List list, com.harman.jbl.partybox.ui.party.mode.c cVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            list = (List) auracastViewModel.f44782S.f();
        }
        if ((i4 & 2) != 0) {
            cVar = auracastViewModel.f44797h0.f();
        }
        return auracastViewModel.d1(list, cVar);
    }

    private final com.harman.jbl.partybox.ui.party.mode.c x0() {
        com.harman.log.f.a(f44777n0, "initProvider() >>> AuracastProvider");
        return new com.harman.jbl.partybox.ui.party.mode.b(this);
    }

    public static /* synthetic */ boolean z0(AuracastViewModel auracastViewModel, HmDevice hmDevice, HmDevice hmDevice2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            hmDevice = auracastViewModel.f44781R.f();
        }
        if ((i4 & 2) != 0) {
            hmDevice2 = auracastViewModel.f44785V.f();
        }
        return auracastViewModel.y0(hmDevice, hmDevice2);
    }

    @K
    public final void D0(@l3.e HmDevice hmDevice) {
        com.harman.jbl.partybox.ui.party.mode.c f4;
        if (hmDevice != null && (f4 = this.f44797h0.f()) != null) {
            f4.f(hmDevice);
        }
    }

    @K
    public final void E0() {
        this.f44791b0.u();
        this.f44783T.r(null);
    }

    @l3.d
    @K
    public final EnumJoinPartyResult M0(@l3.d HmDevice device) {
        F.p(device, "device");
        com.harman.jbl.partybox.ui.party.mode.c f4 = o0().f();
        if (f4 == null) {
            return EnumJoinPartyResult.OK;
        }
        if (com.harman.jbl.partybox.ui.party.b.f44881a.f(device)) {
            return EnumJoinPartyResult.SPEAKER_IN_DAISY_CHAIN;
        }
        EnumJoinPartyResult b4 = f4.b(device, this.f44784U.f(), this.f44795f0.f(), this.f44796g0.f());
        if (EnumJoinPartyResult.OK != b4) {
            com.harman.log.f.g(f44777n0, "onNearbyDeviceClick() >>> device not clickable for some reason[" + b4.e() + "]");
            return b4;
        }
        com.harman.jbl.partybox.ui.party.mode.c a4 = f4.a(device);
        if (a4.getClass() != f4.getClass()) {
            com.harman.log.f.d(f44777n0, "onNearbyDeviceClick() >>> switch provider to " + kotlin.jvm.internal.N.d(a4.getClass()).J());
            a4.a(device);
            Y0(a4);
        }
        return b4;
    }

    @K
    public final void N0(@l3.e HmDevice hmDevice) {
        String str;
        this.f44791b0.u();
        if (hmDevice != null) {
            str = com.harman.jbl.partybox.ui.party.b.f44881a.t(hmDevice);
        } else {
            str = null;
        }
        com.harman.log.f.d(f44777n0, "onPartyLayoutDeviceClick() >>> device selected: " + str);
        this.f44783T.r(hmDevice);
    }

    @K
    public final void O0() {
        this.f44791b0.u();
        this.f44792c0.r(LiveEvent.Event.ON_CLICK);
    }

    @K
    public final void P0() {
        this.f44792c0.u();
    }

    @K
    public final void Q0(@l3.e HmDevice hmDevice) {
        this.f44791b0.u();
        this.f44792c0.r(null);
        this.f44783T.r(hmDevice);
    }

    @K
    public final void R0(@l3.d HmDevice device) {
        F.p(device, "device");
    }

    @K
    public final void Y0(@l3.d com.harman.jbl.partybox.ui.party.mode.c newProvider) {
        String str;
        F.p(newProvider, "newProvider");
        com.harman.jbl.partybox.ui.party.mode.c f4 = this.f44797h0.f();
        if (f4 != null) {
            str = f4.getClass().getSimpleName();
        } else {
            str = null;
        }
        com.harman.log.f.d(f44777n0, "switchProvider() >>> from[" + str + "] to[" + newProvider.getClass().getSimpleName() + "]");
        com.harman.jbl.partybox.ui.party.mode.c f5 = this.f44797h0.f();
        if (f5 != null) {
            f5.d();
        }
        newProvider.c();
        this.f44797h0.r(newProvider);
    }

    @l3.d
    public final P<HmDevice> e0() {
        return this.f44781R;
    }

    @Override // androidx.lifecycle.A
    public void f(@l3.d androidx.lifecycle.E source, @l3.d Lifecycle.Event event) {
        F.p(source, "source");
        F.p(event, "event");
        int i4 = b.f44802a[event.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 == 4) {
                        J0();
                        return;
                    }
                    return;
                }
                K0();
                return;
            }
            L0();
            return;
        }
        I0();
    }

    @l3.d
    public final LiveData<HmDevice> f0() {
        return this.f44785V;
    }

    @l3.d
    public final ObservableArrayList<HmDevice> g0() {
        return this.f44788Y;
    }

    @l3.d
    public final ObservableArrayList<HmDevice> h0() {
        return this.f44787X;
    }

    @l3.d
    public final N<Boolean> i0() {
        return this.f44799j0;
    }

    @l3.d
    public final LiveEvent<LiveEvent.Event> j0() {
        return this.f44791b0;
    }

    @l3.d
    public final LiveData<List<HmDevice>> k0() {
        return this.f44780Q;
    }

    @l3.d
    public final LiveEvent<LiveEvent.Event> l0() {
        return this.f44792c0;
    }

    @l3.d
    public final LiveData<PlayerStatus> m0() {
        return this.f44793d0;
    }

    @l3.d
    public final N<List<HmDevice>> n0() {
        return this.f44798i0;
    }

    @l3.d
    public final LiveData<com.harman.jbl.partybox.ui.party.mode.c> o0() {
        return this.f44797h0;
    }

    @Override // com.harman.jbl.partybox.c, com.harman.sdk.c
    @InterfaceC0561d
    public void onA2DPConnected(@l3.e String str, boolean z3) {
        boolean S12;
        if (str != null) {
            S12 = z.S1(str);
            if (!S12) {
                C2323l.f(k0.a(this), C2322k0.e(), null, new i(str, z3, this, null), 2, null);
            }
        }
    }

    @Override // com.harman.jbl.partybox.c, com.harman.sdk.c
    @InterfaceC0561d
    public void onBtEnabled(boolean z3) {
        super.onBtEnabled(z3);
        C2323l.f(k0.a(this), C2322k0.e(), null, new j(null), 2, null);
    }

    @Override // com.harman.jbl.partybox.c, com.harman.sdk.c
    @InterfaceC0561d
    public void onLocationEnabled(boolean z3) {
        super.onLocationEnabled(z3);
        C2323l.f(k0.a(this), C2322k0.e(), null, new q(null), 2, null);
    }

    @l3.d
    public final LiveEvent<LiveEvent.QuitEvent> p0() {
        return this.f44790a0;
    }

    @l3.d
    public final ObservableArrayList<HmDevice> q0() {
        return this.f44789Z;
    }

    @l3.d
    public final P<List<HmDevice>> r0() {
        return this.f44782S;
    }

    @l3.d
    public final P<HmDevice> s0() {
        return this.f44783T;
    }

    @l3.d
    public final LiveData<List<HmDevice>> t0() {
        return this.f44779P;
    }

    @l3.d
    public final P<HmDevice> u0() {
        return this.f44796g0;
    }

    @l3.d
    public final P<HmDevice> v0() {
        return this.f44795f0;
    }

    @l3.d
    public final LiveData<Integer> w0() {
        return this.f44794e0;
    }

    public final boolean y0(@l3.e HmDevice hmDevice, @l3.e HmDevice hmDevice2) {
        if (hmDevice != null && hmDevice.O()) {
            return true;
        }
        return false;
    }
}
