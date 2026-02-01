package com.harman.jbl.partybox.ui.party.auracast;

import J2.a;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.InterfaceC0561d;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.InterfaceC0919v;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.N;
import androidx.lifecycle.P;
import androidx.lifecycle.Q;
import androidx.lifecycle.h0;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$3;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$4;
import com.harman.jbl.partybox.databinding.K1;
import com.harman.jbl.partybox.databinding.O;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.legal.InfoActivity;
import com.harman.jbl.partybox.ui.party.auracast.define.EnumJoinPartyResult;
import com.harman.jbl.partybox.ui.party.auracast.define.EnumPageStyle;
import com.harman.jbl.partybox.ui.party.auracast.define.EnumPanelStyle;
import com.harman.jbl.partybox.ui.party.auracast.define.EnumPartyStyle;
import com.harman.jbl.partybox.ui.party.auracast.define.EnumSelectDeviceTip;
import com.harman.jbl.partybox.ui.party.auracast.define.EnumShowTip;
import com.harman.jbl.partybox.ui.party.auracast.k;
import com.harman.jbl.partybox.ui.party.auracast.ui.AuracastQuitGuideDialog;
import com.harman.jbl.partybox.ui.party.auracast.ui.SelectDeviceTipDialog;
import com.harman.jbl.partybox.utils.LiveEvent;
import com.harman.sdk.device.HmDevice;
import com.xiaoming.party.auracast.dialog.AuracastWelcomeFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.A;
import kotlin.C;
import kotlin.E;
import kotlin.H0;
import kotlin.InterfaceC2229v;
import kotlin.Pair;
import kotlin.collections.D;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.U;
import kotlin.text.z;

@E(d1 = {"\u0000ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 Á\u00012\u00020\u00012\u00020\u0002:\u0002Â\u0001B\b¢\u0006\u0005\bÀ\u0001\u00100J3\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u001a\u001a\u00020\f2\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001d\u001a\u00020\u0014*\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\"\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u001f2\b\u0010!\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\"\u0010#J\u0019\u0010&\u001a\u00020\u00142\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b&\u0010'J+\u0010-\u001a\u00020,2\u0006\u0010)\u001a\u00020(2\b\u0010+\u001a\u0004\u0018\u00010*2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0014H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0014H\u0016¢\u0006\u0004\b1\u00100J\u000f\u00102\u001a\u00020\u0014H\u0016¢\u0006\u0004\b2\u00100J\r\u00103\u001a\u00020\u0014¢\u0006\u0004\b3\u00100J\u0017\u00105\u001a\u00020\u00142\u0006\u00104\u001a\u00020\fH\u0017¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020\u00142\u0006\u00104\u001a\u00020\fH\u0017¢\u0006\u0004\b7\u00106J\u0017\u00108\u001a\u00020\u00142\u0006\u00104\u001a\u00020\fH\u0016¢\u0006\u0004\b8\u00106J!\u0010;\u001a\u00020\u00142\b\u00109\u001a\u0004\u0018\u00010\u001f2\u0006\u0010:\u001a\u00020\fH\u0016¢\u0006\u0004\b;\u0010<J\r\u0010=\u001a\u00020\u0014¢\u0006\u0004\b=\u00100J\r\u0010>\u001a\u00020\u0014¢\u0006\u0004\b>\u00100J\u0017\u0010?\u001a\u00020\u00142\b\u0010!\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u00020\u00142\b\u0010!\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\bA\u0010@J\r\u0010B\u001a\u00020\u0014¢\u0006\u0004\bB\u00100J\u0015\u0010C\u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u0003¢\u0006\u0004\bC\u0010@J\r\u0010D\u001a\u00020\u0014¢\u0006\u0004\bD\u00100J\r\u0010E\u001a\u00020\u0014¢\u0006\u0004\bE\u00100J\r\u0010F\u001a\u00020\u0014¢\u0006\u0004\bF\u00100J\u0017\u0010G\u001a\u00020\u00142\b\u0010!\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\bG\u0010@J\r\u0010H\u001a\u00020\u0014¢\u0006\u0004\bH\u00100J\r\u0010I\u001a\u00020\u0014¢\u0006\u0004\bI\u00100R\u001b\u0010O\u001a\u00020J8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u001b\u0010T\u001a\u00020P8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010L\u001a\u0004\bR\u0010SR\u0018\u0010X\u001a\u0004\u0018\u00010U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0018\u0010[\u001a\u0004\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010ZR\u0018\u0010_\u001a\u0004\u0018\u00010\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R+\u0010f\u001a\u00020\f2\u0006\u0010`\u001a\u00020\f8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u00106R\u001b\u0010k\u001a\u00020g8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bh\u0010L\u001a\u0004\bi\u0010jR\u001b\u0010p\u001a\u00020l8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bm\u0010L\u001a\u0004\bn\u0010oR\u001b\u0010u\u001a\u00020q8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\br\u0010L\u001a\u0004\bs\u0010tR\u001d\u0010{\u001a\b\u0012\u0004\u0012\u00020\u000f0v8\u0006¢\u0006\f\n\u0004\bw\u0010x\u001a\u0004\by\u0010zR\u001f\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020\u001f0|8\u0006¢\u0006\r\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001R\u001b\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\"\u0010\u0087\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030v8\u0006¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010x\u001a\u0005\b\u0086\u0001\u0010zR \u0010\u008b\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0088\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\"\u0010\u008e\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030v8\u0006¢\u0006\u000e\n\u0005\b\u008c\u0001\u0010x\u001a\u0005\b\u008d\u0001\u0010zR \u0010\u0090\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0088\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u008a\u0001R\"\u0010\u0093\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030v8\u0006¢\u0006\u000e\n\u0005\b\u0091\u0001\u0010x\u001a\u0005\b\u0092\u0001\u0010zR \u0010\u0095\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0088\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u008a\u0001R\"\u0010\u0098\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030v8\u0006¢\u0006\u000e\n\u0005\b\u0096\u0001\u0010x\u001a\u0005\b\u0097\u0001\u0010zR \u0010\u009a\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0088\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u008a\u0001R\"\u0010\u009d\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030v8\u0006¢\u0006\u000e\n\u0005\b\u009b\u0001\u0010x\u001a\u0005\b\u009c\u0001\u0010zR \u0010\u009f\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0088\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u008a\u0001R\"\u0010¢\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030v8\u0006¢\u0006\u000e\n\u0005\b \u0001\u0010x\u001a\u0005\b¡\u0001\u0010zR \u0010¤\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0088\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b£\u0001\u0010\u008a\u0001R\u001f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050v8\u0006¢\u0006\u000e\n\u0005\b¥\u0001\u0010x\u001a\u0005\b¦\u0001\u0010zR\u001e\u0010¨\u0001\u001a\t\u0012\u0004\u0012\u00020\u00050\u0088\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b§\u0001\u0010\u008a\u0001R!\u0010¬\u0001\u001a\t\u0012\u0005\u0012\u00030©\u00010v8\u0006¢\u0006\u000e\n\u0005\bª\u0001\u0010x\u001a\u0005\b«\u0001\u0010zR\u001f\u0010®\u0001\u001a\n\u0012\u0005\u0012\u00030©\u00010\u0088\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u00ad\u0001\u0010\u008a\u0001R#\u0010´\u0001\u001a\t\u0012\u0004\u0012\u00020\f0¯\u00018\u0006¢\u0006\u0010\n\u0006\b°\u0001\u0010±\u0001\u001a\u0006\b²\u0001\u0010³\u0001R\u001f\u0010·\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010µ\u00010v8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b¶\u0001\u0010xR#\u0010º\u0001\u001a\t\u0012\u0004\u0012\u00020\f0¯\u00018\u0006¢\u0006\u0010\n\u0006\b¸\u0001\u0010±\u0001\u001a\u0006\b¹\u0001\u0010³\u0001R#\u0010½\u0001\u001a\t\u0012\u0004\u0012\u00020\b0¯\u00018\u0006¢\u0006\u0010\n\u0006\b»\u0001\u0010±\u0001\u001a\u0006\b¼\u0001\u0010³\u0001R\u001d\u0010¿\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010µ\u00010|8F¢\u0006\b\u001a\u0006\b¾\u0001\u0010\u0080\u0001¨\u0006Ã\u0001"}, d2 = {"Lcom/harman/jbl/partybox/ui/party/auracast/AuracastFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/harman/sdk/c;", "Lcom/harman/sdk/device/HmDevice;", "_centerDevice", "Lcom/harman/jbl/partybox/ui/party/auracast/define/EnumPanelStyle;", "_panelStyle", "_sideDeviceTwo", "Lcom/harman/jbl/partybox/ui/party/auracast/define/EnumShowTip;", "w0", "(Lcom/harman/sdk/device/HmDevice;Lcom/harman/jbl/partybox/ui/party/auracast/define/EnumPanelStyle;Lcom/harman/sdk/device/HmDevice;)Lcom/harman/jbl/partybox/ui/party/auracast/define/EnumShowTip;", "btDevice", "", "isBtEnabled", "isLocationEnabled", "Lcom/harman/jbl/partybox/ui/party/auracast/define/EnumPageStyle;", "Q0", "(Lcom/harman/sdk/device/HmDevice;ZZ)Lcom/harman/jbl/partybox/ui/party/auracast/define/EnumPageStyle;", "Lcom/harman/jbl/partybox/ui/party/mode/c;", "iProvider", "Lkotlin/H0;", "H0", "(Lcom/harman/jbl/partybox/ui/party/mode/c;)V", "", "scannedDevices", "panelStyle", "u0", "(Ljava/util/List;Lcom/harman/jbl/partybox/ui/party/auracast/define/EnumPanelStyle;)Z", "Landroidx/fragment/app/DialogFragment;", "J0", "(Landroidx/fragment/app/DialogFragment;)V", "", "actionItem", "device", "I0", "(Ljava/lang/String;Lcom/harman/sdk/device/HmDevice;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onResume", "()V", "onPause", "onDestroy", "onInfoClicked", "isEnable", "onBtEnabled", "(Z)V", "onLocationEnabled", "onNetworkEnabled", "address", "isConnected", "onA2DPConnected", "(Ljava/lang/String;Z)V", "onBtnGrantClick", "onBtnAddClick", "onPartyLayoutDeviceClick", "(Lcom/harman/sdk/device/HmDevice;)V", "onNearbyDeviceClick", "onCloseSelectDeviceTipClick", "onStartNewPartyConfirmClick", "onBtnNearbyDeviceClick", "onBtnAddSpeakNarrowClick", "onDeviceCardBtnNarrowClick", "onBtnQuitPartyClick", "onPartyMoreDevicesClick", "onPartyMoreDevicesCloseClick", "Lcom/harman/jbl/partybox/ui/party/auracast/AuracastViewModel;", "N0", "Lkotlin/A;", "y0", "()Lcom/harman/jbl/partybox/ui/party/auracast/AuracastViewModel;", "auracastViewModel", "Lcom/harman/jbl/partybox/ui/main/o;", "O0", "z0", "()Lcom/harman/jbl/partybox/ui/main/o;", "mainViewModel", "Lcom/harman/jbl/partybox/databinding/O;", "P0", "Lcom/harman/jbl/partybox/databinding/O;", "binding", "Lcom/harman/jbl/partybox/ui/party/auracast/ui/e;", "Lcom/harman/jbl/partybox/ui/party/auracast/ui/e;", "scanDeviceAdapter", "Lcom/harman/jbl/partybox/ui/party/auracast/ui/c;", "R0", "Lcom/harman/jbl/partybox/ui/party/auracast/ui/c;", "moreNearbyDeviceAdapter", "<set-?>", "S0", "Lcom/harman/jbl/partybox/persistence/c;", "C0", "()Z", "K0", "shownWelcome", "Lcom/xiaoming/party/auracast/dialog/AuracastWelcomeFragment;", "T0", "D0", "()Lcom/xiaoming/party/auracast/dialog/AuracastWelcomeFragment;", "welcomeDialog", "Lcom/harman/jbl/partybox/ui/party/auracast/ui/AuracastQuitGuideDialog;", "U0", "A0", "()Lcom/harman/jbl/partybox/ui/party/auracast/ui/AuracastQuitGuideDialog;", "quitGuideDialog", "Lcom/harman/jbl/partybox/ui/party/auracast/ui/SelectDeviceTipDialog;", "V0", "B0", "()Lcom/harman/jbl/partybox/ui/party/auracast/ui/SelectDeviceTipDialog;", "selectDeviceTipDialog", "Landroidx/lifecycle/P;", "W0", "Landroidx/lifecycle/P;", "getPageStyle", "()Landroidx/lifecycle/P;", "pageStyle", "Landroidx/lifecycle/LiveData;", "X0", "Landroidx/lifecycle/LiveData;", "getTitleBarText", "()Landroidx/lifecycle/LiveData;", "titleBarText", "Y0", "Lcom/harman/jbl/partybox/ui/party/mode/c;", "lastProvider", "Z0", "getCenterDevice", "centerDevice", "Landroidx/lifecycle/Q;", com.harman.sdk.utils.k.f48625V, "Landroidx/lifecycle/Q;", "centerDeviceObserver", "b1", "getSideDeviceOne", "sideDeviceOne", com.harman.sdk.utils.k.f48619T, "sideDeviceOneObserver", "d1", "getSideDeviceTwo", "sideDeviceTwo", "e1", "sideDeviceTwoObserver", "f1", "getSideDeviceThree", "sideDeviceThree", "g1", "sideDeviceThreeObserver", "h1", "getSideDeviceFour", "sideDeviceFour", "i1", "sideDeviceFourObserver", "j1", "getSideDeviceFive", "sideDeviceFive", "k1", "sideDeviceFiveObserver", "l1", "getPanelStyle", "m1", "panelStyleObserver", "Lcom/harman/jbl/partybox/ui/party/auracast/define/EnumPartyStyle;", "n1", "getPartyLayoutStyle", "partyLayoutStyle", "o1", "partyLayoutStyleObserver", "Landroidx/lifecycle/N;", "p1", "Landroidx/lifecycle/N;", "getMoreDeviceIcVisible", "()Landroidx/lifecycle/N;", "moreDeviceIcVisible", "Lcom/harman/jbl/partybox/ui/party/auracast/w;", "q1", "_beanSelectDeviceTip", "r1", "getShowNearByExpandMore", "showNearByExpandMore", "s1", "getShowPlayMusicTips", "showPlayMusicTips", "getBeanSelectDeviceTip", "beanSelectDeviceTip", "<init>", "Companion", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nAuracastFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuracastFragment.kt\ncom/harman/jbl/partybox/ui/party/auracast/AuracastFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 ApplicationViewModelLazy.kt\ncom/harman/jbl/partybox/ApplicationViewModelLazyKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,593:1\n56#2,10:594\n66#3,4:604\n262#4,2:608\n262#4,2:610\n*S KotlinDebug\n*F\n+ 1 AuracastFragment.kt\ncom/harman/jbl/partybox/ui/party/auracast/AuracastFragment\n*L\n62#1:594,10\n64#1:604,4\n300#1:608,2\n302#1:610,2\n*E\n"})
/* loaded from: classes2.dex */
public final class AuracastFragment extends Fragment implements com.harman.sdk.c {

    /* renamed from: u1, reason: collision with root package name */
    @l3.d
    private static final String f44708u1 = "Party.Auracast.Fragment";

    /* renamed from: N0, reason: collision with root package name */
    @l3.d
    private final A f44709N0;

    /* renamed from: O0, reason: collision with root package name */
    @l3.d
    private final A f44710O0;

    /* renamed from: P0, reason: collision with root package name */
    @l3.e
    private O f44711P0;

    /* renamed from: Q0, reason: collision with root package name */
    @l3.e
    private com.harman.jbl.partybox.ui.party.auracast.ui.e f44712Q0;

    /* renamed from: R0, reason: collision with root package name */
    @l3.e
    private com.harman.jbl.partybox.ui.party.auracast.ui.c f44713R0;

    /* renamed from: S0, reason: collision with root package name */
    @l3.d
    private final com.harman.jbl.partybox.persistence.c f44714S0;

    /* renamed from: T0, reason: collision with root package name */
    @l3.d
    private final A f44715T0;

    /* renamed from: U0, reason: collision with root package name */
    @l3.d
    private final A f44716U0;

    /* renamed from: V0, reason: collision with root package name */
    @l3.d
    private final A f44717V0;

    /* renamed from: W0, reason: collision with root package name */
    @l3.d
    private final P<EnumPageStyle> f44718W0;

    /* renamed from: X0, reason: collision with root package name */
    @l3.d
    private final LiveData<String> f44719X0;

    /* renamed from: Y0, reason: collision with root package name */
    @l3.e
    private com.harman.jbl.partybox.ui.party.mode.c f44720Y0;

    /* renamed from: Z0, reason: collision with root package name */
    @l3.d
    private final P<HmDevice> f44721Z0;

    /* renamed from: a1, reason: collision with root package name */
    @l3.d
    private final Q<HmDevice> f44722a1;

    /* renamed from: b1, reason: collision with root package name */
    @l3.d
    private final P<HmDevice> f44723b1;

    /* renamed from: c1, reason: collision with root package name */
    @l3.d
    private final Q<HmDevice> f44724c1;

    /* renamed from: d1, reason: collision with root package name */
    @l3.d
    private final P<HmDevice> f44725d1;

    /* renamed from: e1, reason: collision with root package name */
    @l3.d
    private final Q<HmDevice> f44726e1;

    /* renamed from: f1, reason: collision with root package name */
    @l3.d
    private final P<HmDevice> f44727f1;

    /* renamed from: g1, reason: collision with root package name */
    @l3.d
    private final Q<HmDevice> f44728g1;

    /* renamed from: h1, reason: collision with root package name */
    @l3.d
    private final P<HmDevice> f44729h1;

    /* renamed from: i1, reason: collision with root package name */
    @l3.d
    private final Q<HmDevice> f44730i1;

    /* renamed from: j1, reason: collision with root package name */
    @l3.d
    private final P<HmDevice> f44731j1;

    /* renamed from: k1, reason: collision with root package name */
    @l3.d
    private final Q<HmDevice> f44732k1;

    /* renamed from: l1, reason: collision with root package name */
    @l3.d
    private final P<EnumPanelStyle> f44733l1;

    /* renamed from: m1, reason: collision with root package name */
    @l3.d
    private final Q<EnumPanelStyle> f44734m1;

    /* renamed from: n1, reason: collision with root package name */
    @l3.d
    private final P<EnumPartyStyle> f44735n1;

    /* renamed from: o1, reason: collision with root package name */
    @l3.d
    private final Q<EnumPartyStyle> f44736o1;

    /* renamed from: p1, reason: collision with root package name */
    @l3.d
    private final N<Boolean> f44737p1;

    /* renamed from: q1, reason: collision with root package name */
    @l3.d
    private final P<com.harman.jbl.partybox.ui.party.auracast.w> f44738q1;

    /* renamed from: r1, reason: collision with root package name */
    @l3.d
    private final N<Boolean> f44739r1;

    /* renamed from: s1, reason: collision with root package name */
    @l3.d
    private final N<EnumShowTip> f44740s1;

    /* renamed from: t1, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.n<Object>[] f44707t1 = {kotlin.jvm.internal.N.k(new MutablePropertyReference1Impl(AuracastFragment.class, "shownWelcome", "getShownWelcome()Z", 0))};

    @l3.d
    public static final a Companion = new a(null);

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
        public static final /* synthetic */ int[] f44745a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f44746b;

        static {
            int[] iArr = new int[EnumJoinPartyResult.values().length];
            try {
                iArr[EnumJoinPartyResult.NON_COMPATIBLE_TO_CURRENT_PARTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumJoinPartyResult.SPEAKER_IN_OTHER_PARTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumJoinPartyResult.START_NEW_PARTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumJoinPartyResult.SPEAKER_NOT_BT_CONNECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumJoinPartyResult.PARTY_ONLY_SUPPORT_TWO_SPEAKERS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumJoinPartyResult.SPEAKER_IN_DAISY_CHAIN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumJoinPartyResult.OK.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f44745a = iArr;
            int[] iArr2 = new int[EnumPanelStyle.values().length];
            try {
                iArr2[EnumPanelStyle.SHARING_TIPS.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[EnumPanelStyle.RECEIVER_TIPS.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[EnumPanelStyle.PLAY_MUSIC_TIPS.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            f44746b = iArr2;
        }
    }

    @U({"SMAP\nAuracastFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuracastFragment.kt\ncom/harman/jbl/partybox/ui/party/auracast/AuracastFragment$onCreate$10\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,593:1\n262#2,2:594\n*S KotlinDebug\n*F\n+ 1 AuracastFragment.kt\ncom/harman/jbl/partybox/ui/party/auracast/AuracastFragment$onCreate$10\n*L\n270#1:594,2\n*E\n"})
    /* loaded from: classes2.dex */
    static final class c extends Lambda implements X2.l<EnumShowTip, H0> {
        c() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(EnumShowTip enumShowTip) {
            c(enumShowTip);
            return H0.f51801a;
        }

        public final void c(EnumShowTip enumShowTip) {
            LinearLayout linearLayout;
            boolean z3;
            K2.g gVar;
            O o4 = AuracastFragment.this.f44711P0;
            if (o4 != null && (gVar = o4.f38918o0) != null) {
                linearLayout = gVar.f1425F;
            } else {
                linearLayout = null;
            }
            if (linearLayout != null) {
                int i4 = 0;
                if (enumShowTip == EnumShowTip.SHOW_PLAY_MUSIC) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    i4 = 8;
                }
                linearLayout.setVisibility(i4);
            }
        }
    }

    /* loaded from: classes2.dex */
    static final class d extends Lambda implements X2.l<List<? extends HmDevice>, H0> {
        d() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(List<? extends HmDevice> list) {
            c(list);
            return H0.f51801a;
        }

        public final void c(List<? extends HmDevice> list) {
            com.harman.jbl.partybox.ui.party.auracast.ui.c cVar = AuracastFragment.this.f44713R0;
            if (cVar != null) {
                cVar.r();
            }
        }
    }

    /* loaded from: classes2.dex */
    static final class e extends Lambda implements X2.l<LiveEvent.QuitEvent, H0> {

        /* loaded from: classes2.dex */
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f44750a;

            static {
                int[] iArr = new int[LiveEvent.QuitEvent.values().length];
                try {
                    iArr[LiveEvent.QuitEvent.AURACAST.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LiveEvent.QuitEvent.HORIZON.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[LiveEvent.QuitEvent.SOUNDSTICK.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f44750a = iArr;
            }
        }

        e() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(LiveEvent.QuitEvent quitEvent) {
            c(quitEvent);
            return H0.f51801a;
        }

        public final void c(@l3.d LiveEvent.QuitEvent it) {
            String i22;
            String i23;
            String i24;
            F.p(it, "it");
            Bundle bundle = new Bundle();
            int i4 = a.f44750a[it.ordinal()];
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        bundle.putInt(AuracastQuitGuideDialog.MST_IMAGE, a.g.f1336g);
                        String string = AuracastFragment.this.getString(a.i.f1347H);
                        F.o(string, "getString(...)");
                        i24 = z.i2(string, "[img]", "[img src=ic_auracast_play/]", false, 4, null);
                        bundle.putString(AuracastQuitGuideDialog.MST_TITLE, i24);
                    } else {
                        bundle.putInt(AuracastQuitGuideDialog.MST_IMAGE, j.f.f41019c);
                        String string2 = AuracastFragment.this.getString(a.i.f1346G);
                        F.o(string2, "getString(...)");
                        i23 = z.i2(string2, "[img]", "-+", false, 4, null);
                        bundle.putString(AuracastQuitGuideDialog.MST_TITLE, i23);
                    }
                } else {
                    bundle.putInt(AuracastQuitGuideDialog.MST_IMAGE, j.f.f41014b);
                    bundle.putString(AuracastQuitGuideDialog.MST_TITLE, AuracastFragment.this.getString(j.m.La));
                }
            } else {
                bundle.putInt(AuracastQuitGuideDialog.MST_IMAGE, a.g.f1335f);
                String string3 = AuracastFragment.this.getString(a.i.f1346G);
                F.o(string3, "getString(...)");
                i22 = z.i2(string3, "[img]", "[img src=ic_auracast/]", false, 4, null);
                bundle.putString(AuracastQuitGuideDialog.MST_TITLE, i22);
            }
            AuracastFragment.this.A0().setArguments(bundle);
            AuracastFragment auracastFragment = AuracastFragment.this;
            auracastFragment.J0(auracastFragment.A0());
        }
    }

    /* loaded from: classes2.dex */
    static final class f extends Lambda implements X2.l<com.harman.jbl.partybox.ui.party.mode.c, H0> {
        f() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(com.harman.jbl.partybox.ui.party.mode.c cVar) {
            c(cVar);
            return H0.f51801a;
        }

        public final void c(com.harman.jbl.partybox.ui.party.mode.c cVar) {
            AuracastFragment auracastFragment = AuracastFragment.this;
            F.m(cVar);
            auracastFragment.H0(cVar);
        }
    }

    /* loaded from: classes2.dex */
    static final class g extends Lambda implements X2.l<List<? extends HmDevice>, H0> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ N<Boolean> f44752F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ AuracastFragment f44753G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(N<Boolean> n4, AuracastFragment auracastFragment) {
            super(1);
            this.f44752F = n4;
            this.f44753G = auracastFragment;
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(List<? extends HmDevice> list) {
            c(list);
            return H0.f51801a;
        }

        public final void c(@l3.d List<? extends HmDevice> scannedDevices) {
            F.p(scannedDevices, "scannedDevices");
            this.f44752F.r(Boolean.valueOf(AuracastFragment.v0(this.f44753G, scannedDevices, null, 2, null)));
        }
    }

    /* loaded from: classes2.dex */
    static final class h extends Lambda implements X2.l<EnumPanelStyle, H0> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ N<Boolean> f44754F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ AuracastFragment f44755G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(N<Boolean> n4, AuracastFragment auracastFragment) {
            super(1);
            this.f44754F = n4;
            this.f44755G = auracastFragment;
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(EnumPanelStyle enumPanelStyle) {
            c(enumPanelStyle);
            return H0.f51801a;
        }

        public final void c(EnumPanelStyle enumPanelStyle) {
            this.f44754F.r(Boolean.valueOf(AuracastFragment.v0(this.f44755G, null, enumPanelStyle, 1, null)));
        }
    }

    /* loaded from: classes2.dex */
    static final class i extends Lambda implements X2.l<com.harman.jbl.partybox.ui.party.auracast.w, H0> {
        i() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(com.harman.jbl.partybox.ui.party.auracast.w wVar) {
            c(wVar);
            return H0.f51801a;
        }

        public final void c(@l3.e com.harman.jbl.partybox.ui.party.auracast.w wVar) {
            if (wVar != null) {
                AuracastFragment auracastFragment = AuracastFragment.this;
                auracastFragment.J0(auracastFragment.B0());
            } else {
                AuracastFragment.this.B0().dismiss();
            }
        }
    }

    /* loaded from: classes2.dex */
    static final class j extends Lambda implements X2.l<HmDevice, H0> {
        j() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(HmDevice hmDevice) {
            c(hmDevice);
            return H0.f51801a;
        }

        public final void c(@l3.e HmDevice hmDevice) {
            String str;
            if (hmDevice != null) {
                str = hmDevice.n();
            } else {
                str = null;
            }
            com.harman.log.f.a(AuracastFragment.f44708u1, "viewModel.btConnectDevice >>> btDevice[" + str + "]");
            AuracastFragment.this.getPageStyle().r(AuracastFragment.R0(AuracastFragment.this, hmDevice, false, false, 6, null));
        }
    }

    /* loaded from: classes2.dex */
    static final class k extends Lambda implements X2.l<HmDevice, H0> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ N<Boolean> f44758F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ AuracastFragment f44759G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(N<Boolean> n4, AuracastFragment auracastFragment) {
            super(1);
            this.f44758F = n4;
            this.f44759G = auracastFragment;
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(HmDevice hmDevice) {
            c(hmDevice);
            return H0.f51801a;
        }

        public final void c(@l3.e HmDevice hmDevice) {
            this.f44758F.r(Boolean.valueOf(AuracastViewModel.z0(this.f44759G.y0(), hmDevice, null, 2, null)));
        }
    }

    /* loaded from: classes2.dex */
    static final class l extends Lambda implements X2.l<HmDevice, H0> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ N<Boolean> f44760F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ AuracastFragment f44761G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(N<Boolean> n4, AuracastFragment auracastFragment) {
            super(1);
            this.f44760F = n4;
            this.f44761G = auracastFragment;
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(HmDevice hmDevice) {
            c(hmDevice);
            return H0.f51801a;
        }

        public final void c(@l3.e HmDevice hmDevice) {
            this.f44760F.r(Boolean.valueOf(AuracastViewModel.z0(this.f44761G.y0(), null, hmDevice, 1, null)));
        }
    }

    /* loaded from: classes2.dex */
    static final class m extends Lambda implements X2.l<HmDevice, H0> {

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ N<EnumShowTip> f44763G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(N<EnumShowTip> n4) {
            super(1);
            this.f44763G = n4;
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(HmDevice hmDevice) {
            c(hmDevice);
            return H0.f51801a;
        }

        public final void c(@l3.e HmDevice hmDevice) {
            EnumShowTip x02 = AuracastFragment.x0(AuracastFragment.this, hmDevice, null, null, 6, null);
            if (this.f44763G.f() != x02) {
                com.harman.log.f.a(AuracastFragment.f44708u1, "showPlayMusicTips centerDevice.observe >>> " + x02 + "]");
                this.f44763G.r(x02);
            }
        }
    }

    /* loaded from: classes2.dex */
    static final class n extends Lambda implements X2.l<EnumPanelStyle, H0> {

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ N<EnumShowTip> f44765G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(N<EnumShowTip> n4) {
            super(1);
            this.f44765G = n4;
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(EnumPanelStyle enumPanelStyle) {
            c(enumPanelStyle);
            return H0.f51801a;
        }

        public final void c(EnumPanelStyle enumPanelStyle) {
            EnumShowTip x02 = AuracastFragment.x0(AuracastFragment.this, null, enumPanelStyle, null, 5, null);
            if (this.f44765G.f() != x02) {
                com.harman.log.f.a(AuracastFragment.f44708u1, "showPlayMusicTips panelStyle.observe >>> " + x02 + "]");
                this.f44765G.r(x02);
            }
        }
    }

    /* loaded from: classes2.dex */
    static final class o extends Lambda implements X2.l<HmDevice, H0> {

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ N<EnumShowTip> f44767G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(N<EnumShowTip> n4) {
            super(1);
            this.f44767G = n4;
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(HmDevice hmDevice) {
            c(hmDevice);
            return H0.f51801a;
        }

        public final void c(@l3.e HmDevice hmDevice) {
            EnumShowTip x02 = AuracastFragment.x0(AuracastFragment.this, null, null, hmDevice, 3, null);
            if (this.f44767G.f() != x02) {
                com.harman.log.f.a(AuracastFragment.f44708u1, "showPlayMusicTips sideDeviceTwo.observe >>> " + x02 + "]");
                this.f44767G.r(x02);
            }
        }
    }

    @U({"SMAP\nAuracastFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuracastFragment.kt\ncom/harman/jbl/partybox/ui/party/auracast/AuracastFragment$onCreate$9$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,593:1\n766#2:594\n857#2,2:595\n*S KotlinDebug\n*F\n+ 1 AuracastFragment.kt\ncom/harman/jbl/partybox/ui/party/auracast/AuracastFragment$onCreate$9$1\n*L\n253#1:594\n253#1:595,2\n*E\n"})
    /* loaded from: classes2.dex */
    static final class p extends Lambda implements X2.l<List<? extends HmDevice>, H0> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ N<Boolean> f44768F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(N<Boolean> n4) {
            super(1);
            this.f44768F = n4;
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(List<? extends HmDevice> list) {
            c(list);
            return H0.f51801a;
        }

        public final void c(@l3.d List<? extends HmDevice> list) {
            List V5;
            F.p(list, "list");
            com.harman.log.f.a(AuracastFragment.f44708u1, "auracastViewModel.deviceListEmpty mainViewModel.deviceList().observe >>> list = [" + com.harman.jbl.partybox.ui.party.b.f44881a.h(list) + "]");
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((HmDevice) obj).R()) {
                    arrayList.add(obj);
                }
            }
            V5 = D.V5(arrayList);
            boolean isEmpty = V5.isEmpty();
            com.harman.log.f.a(AuracastFragment.f44708u1, "auracastViewModel.deviceListEmpty mainViewModel.deviceList().observe >>> " + isEmpty + "]");
            this.f44768F.r(Boolean.valueOf(isEmpty));
        }
    }

    @U({"SMAP\nAuracastFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuracastFragment.kt\ncom/harman/jbl/partybox/ui/party/auracast/AuracastFragment$onCreate$9$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,593:1\n766#2:594\n857#2,2:595\n*S KotlinDebug\n*F\n+ 1 AuracastFragment.kt\ncom/harman/jbl/partybox/ui/party/auracast/AuracastFragment$onCreate$9$2\n*L\n263#1:594\n263#1:595,2\n*E\n"})
    /* loaded from: classes2.dex */
    static final class q extends Lambda implements X2.l<Pair<? extends String, ? extends Boolean>, H0> {

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ N<Boolean> f44770G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(N<Boolean> n4) {
            super(1);
            this.f44770G = n4;
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Pair<? extends String, ? extends Boolean> pair) {
            c(pair);
            return H0.f51801a;
        }

        public final void c(@l3.d Pair<String, Boolean> pair) {
            String str;
            List V5;
            F.p(pair, "pair");
            List<HmDevice> f4 = AuracastFragment.this.z0().K0().f();
            Boolean bool = null;
            if (f4 != null) {
                str = com.harman.jbl.partybox.ui.party.b.f44881a.h(f4);
            } else {
                str = null;
            }
            com.harman.log.f.a(AuracastFragment.f44708u1, "auracastViewModel.deviceListEmpty mainViewModel.bleConnectStatusLiveData.observe >>> list = [" + str + "]");
            List<HmDevice> f5 = AuracastFragment.this.z0().K0().f();
            if (f5 != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : f5) {
                    if (((HmDevice) obj).R()) {
                        arrayList.add(obj);
                    }
                }
                V5 = D.V5(arrayList);
                if (V5 != null) {
                    bool = Boolean.valueOf(V5.isEmpty());
                }
            }
            com.harman.log.f.a(AuracastFragment.f44708u1, "auracastViewModel.deviceListEmpty mainViewModel.bleConnectStatusLiveData.observe >>> " + bool + "]");
            this.f44770G.r(bool);
        }
    }

    /* loaded from: classes2.dex */
    static final class r extends Lambda implements X2.a<AuracastQuitGuideDialog> {

        /* renamed from: F, reason: collision with root package name */
        public static final r f44771F = new r();

        r() {
            super(0);
        }

        @Override // X2.a
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final AuracastQuitGuideDialog n() {
            return new AuracastQuitGuideDialog();
        }
    }

    /* loaded from: classes2.dex */
    static final class s implements Q, kotlin.jvm.internal.A {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ X2.l f44772a;

        s(X2.l function) {
            F.p(function, "function");
            this.f44772a = function;
        }

        @Override // kotlin.jvm.internal.A
        @l3.d
        public final InterfaceC2229v<?> a() {
            return this.f44772a;
        }

        public final boolean equals(@l3.e Object obj) {
            if ((obj instanceof Q) && (obj instanceof kotlin.jvm.internal.A)) {
                return F.g(a(), ((kotlin.jvm.internal.A) obj).a());
            }
            return false;
        }

        @Override // androidx.lifecycle.Q
        public final /* synthetic */ void f(Object obj) {
            this.f44772a.C(obj);
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    /* loaded from: classes2.dex */
    static final class t extends Lambda implements X2.a<SelectDeviceTipDialog> {
        t() {
            super(0);
        }

        @Override // X2.a
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final SelectDeviceTipDialog n() {
            AuracastFragment auracastFragment = AuracastFragment.this;
            return new SelectDeviceTipDialog(auracastFragment, auracastFragment.y0());
        }
    }

    /* loaded from: classes2.dex */
    /* synthetic */ class u extends FunctionReferenceImpl implements X2.a<Boolean> {
        u(Object obj) {
            super(0, obj, com.harman.jbl.partybox.persistence.a.class, "getAuracastWelcome", "getAuracastWelcome()Z", 0);
        }

        @Override // X2.a
        @l3.d
        /* renamed from: C0, reason: merged with bridge method [inline-methods] */
        public final Boolean n() {
            return Boolean.valueOf(((com.harman.jbl.partybox.persistence.a) this.f52262F).e());
        }
    }

    /* loaded from: classes2.dex */
    /* synthetic */ class v extends FunctionReferenceImpl implements X2.l<Boolean, H0> {
        v(Object obj) {
            super(1, obj, com.harman.jbl.partybox.persistence.a.class, "setAuracastWelcome", "setAuracastWelcome(Z)V", 0);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Boolean bool) {
            C0(bool.booleanValue());
            return H0.f51801a;
        }

        public final void C0(boolean z3) {
            ((com.harman.jbl.partybox.persistence.a) this.f52262F).y(z3);
        }
    }

    /* loaded from: classes2.dex */
    static final class w extends Lambda implements X2.l<EnumPageStyle, String> {
        w() {
            super(1);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final String C(EnumPageStyle enumPageStyle) {
            String string = AuracastFragment.this.getString(a.i.f1341B);
            F.o(string, "getString(...)");
            return string;
        }
    }

    /* loaded from: classes2.dex */
    static final class x extends Lambda implements X2.a<AuracastWelcomeFragment> {

        /* renamed from: F, reason: collision with root package name */
        public static final x f44775F = new x();

        x() {
            super(0);
        }

        @Override // X2.a
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final AuracastWelcomeFragment n() {
            return new AuracastWelcomeFragment();
        }
    }

    public AuracastFragment() {
        A a4;
        A a5;
        A a6;
        final X2.a<Fragment> aVar = new X2.a<Fragment>() { // from class: com.harman.jbl.partybox.ui.party.auracast.AuracastFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // X2.a
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Fragment n() {
                return Fragment.this;
            }
        };
        this.f44709N0 = FragmentViewModelLazyKt.c(this, kotlin.jvm.internal.N.d(AuracastViewModel.class), new X2.a<p0>() { // from class: com.harman.jbl.partybox.ui.party.auracast.AuracastFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // X2.a
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final p0 n() {
                p0 viewModelStore = ((q0) X2.a.this.n()).getViewModelStore();
                F.o(viewModelStore, "ownerProducer().viewModelStore");
                return viewModelStore;
            }
        }, new X2.a<m0.b>() { // from class: com.harman.jbl.partybox.ui.party.auracast.AuracastFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // X2.a
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final m0.b n() {
                InterfaceC0919v interfaceC0919v;
                Object n4 = X2.a.this.n();
                m0.b bVar = null;
                if (n4 instanceof InterfaceC0919v) {
                    interfaceC0919v = (InterfaceC0919v) n4;
                } else {
                    interfaceC0919v = null;
                }
                if (interfaceC0919v != null) {
                    bVar = interfaceC0919v.getDefaultViewModelProviderFactory();
                }
                if (bVar == null) {
                    bVar = this.getDefaultViewModelProviderFactory();
                }
                F.o(bVar, "(ownerProducer() as? Has…tViewModelProviderFactory");
                return bVar;
            }
        });
        this.f44710O0 = ApplicationViewModelLazyKt.f(this, kotlin.jvm.internal.N.d(com.harman.jbl.partybox.ui.main.o.class), new ApplicationViewModelLazyKt$applicationViewModels$3(this), new ApplicationViewModelLazyKt$applicationViewModels$4(this));
        com.harman.jbl.partybox.persistence.a aVar2 = com.harman.jbl.partybox.persistence.a.f42065a;
        this.f44714S0 = new com.harman.jbl.partybox.persistence.c(new u(aVar2), new v(aVar2));
        a4 = C.a(x.f44775F);
        this.f44715T0 = a4;
        a5 = C.a(r.f44771F);
        this.f44716U0 = a5;
        a6 = C.a(new t());
        this.f44717V0 = a6;
        P<EnumPageStyle> p4 = new P<>(EnumPageStyle.NO_PRODUCT_CONNECTED);
        this.f44718W0 = p4;
        this.f44719X0 = h0.b(p4, new w());
        this.f44721Z0 = new P<>();
        this.f44722a1 = new Q() { // from class: com.harman.jbl.partybox.ui.party.auracast.a
            @Override // androidx.lifecycle.Q
            public final void f(Object obj) {
                AuracastFragment.t0(AuracastFragment.this, (HmDevice) obj);
            }
        };
        this.f44723b1 = new P<>();
        this.f44724c1 = new Q() { // from class: com.harman.jbl.partybox.ui.party.auracast.b
            @Override // androidx.lifecycle.Q
            public final void f(Object obj) {
                AuracastFragment.N0(AuracastFragment.this, (HmDevice) obj);
            }
        };
        this.f44725d1 = new P<>();
        this.f44726e1 = new Q() { // from class: com.harman.jbl.partybox.ui.party.auracast.c
            @Override // androidx.lifecycle.Q
            public final void f(Object obj) {
                AuracastFragment.P0(AuracastFragment.this, (HmDevice) obj);
            }
        };
        this.f44727f1 = new P<>();
        this.f44728g1 = new Q() { // from class: com.harman.jbl.partybox.ui.party.auracast.d
            @Override // androidx.lifecycle.Q
            public final void f(Object obj) {
                AuracastFragment.O0(AuracastFragment.this, (HmDevice) obj);
            }
        };
        this.f44729h1 = new P<>();
        this.f44730i1 = new Q() { // from class: com.harman.jbl.partybox.ui.party.auracast.e
            @Override // androidx.lifecycle.Q
            public final void f(Object obj) {
                AuracastFragment.M0(AuracastFragment.this, (HmDevice) obj);
            }
        };
        this.f44731j1 = new P<>();
        this.f44732k1 = new Q() { // from class: com.harman.jbl.partybox.ui.party.auracast.f
            @Override // androidx.lifecycle.Q
            public final void f(Object obj) {
                AuracastFragment.L0(AuracastFragment.this, (HmDevice) obj);
            }
        };
        this.f44733l1 = new P<>();
        this.f44734m1 = new Q() { // from class: com.harman.jbl.partybox.ui.party.auracast.g
            @Override // androidx.lifecycle.Q
            public final void f(Object obj) {
                AuracastFragment.F0(AuracastFragment.this, (EnumPanelStyle) obj);
            }
        };
        this.f44735n1 = new P<>();
        this.f44736o1 = new Q() { // from class: com.harman.jbl.partybox.ui.party.auracast.h
            @Override // androidx.lifecycle.Q
            public final void f(Object obj) {
                AuracastFragment.G0(AuracastFragment.this, (EnumPartyStyle) obj);
            }
        };
        this.f44737p1 = new N<>();
        this.f44738q1 = new P<>();
        this.f44739r1 = new N<>();
        this.f44740s1 = new N<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AuracastQuitGuideDialog A0() {
        return (AuracastQuitGuideDialog) this.f44716U0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SelectDeviceTipDialog B0() {
        return (SelectDeviceTipDialog) this.f44717V0.getValue();
    }

    private final boolean C0() {
        return ((Boolean) this.f44714S0.a(this, f44707t1[0])).booleanValue();
    }

    private final AuracastWelcomeFragment D0() {
        return (AuracastWelcomeFragment) this.f44715T0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E0(K2.g this_run, View view) {
        F.p(this_run, "$this_run");
        LinearLayout layoutNote = this_run.f1425F;
        F.o(layoutNote, "layoutNote");
        layoutNote.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F0(AuracastFragment this$0, EnumPanelStyle style) {
        F.p(this$0, "this$0");
        F.p(style, "style");
        this$0.f44733l1.r(style);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G0(AuracastFragment this$0, EnumPartyStyle style) {
        F.p(this$0, "this$0");
        F.p(style, "style");
        this$0.f44735n1.r(style);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H0(com.harman.jbl.partybox.ui.party.mode.c cVar) {
        com.harman.jbl.partybox.ui.party.mode.c cVar2 = this.f44720Y0;
        if (cVar2 != null) {
            cVar2.h().p(this.f44722a1);
            cVar2.e().p(this.f44724c1);
            cVar2.m().p(this.f44726e1);
            cVar2.j().p(this.f44728g1);
            cVar2.g().p(this.f44730i1);
            cVar2.l().p(this.f44732k1);
            cVar2.k().p(this.f44734m1);
            cVar2.i().p(this.f44736o1);
        }
        cVar.h().k(this, this.f44722a1);
        cVar.e().k(this, this.f44724c1);
        cVar.m().k(this, this.f44726e1);
        cVar.j().k(this, this.f44728g1);
        cVar.g().k(this, this.f44730i1);
        cVar.l().k(this, this.f44732k1);
        cVar.k().k(this, this.f44734m1);
        cVar.i().k(this, this.f44736o1);
        this.f44721Z0.r(cVar.h().f());
        this.f44723b1.r(cVar.e().f());
        this.f44725d1.r(cVar.m().f());
        this.f44727f1.r(cVar.j().f());
        this.f44729h1.r(cVar.g().f());
        this.f44731j1.r(cVar.l().f());
        this.f44733l1.r(cVar.k().f());
        this.f44735n1.r(cVar.i().f());
        this.f44720Y0 = cVar;
    }

    private final void I0(String str, HmDevice hmDevice) {
        if (this.f44720Y0 instanceof com.harman.jbl.partybox.ui.party.mode.b) {
            com.harman.jbl.partybox.ui.party.b.f44881a.i(str, hmDevice);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J0(DialogFragment dialogFragment) {
        Dialog dialog = dialogFragment.getDialog();
        if ((dialog != null && true == dialog.isShowing()) || dialogFragment.isAdded()) {
            return;
        }
        dialogFragment.show(getChildFragmentManager(), f44708u1);
    }

    private final void K0(boolean z3) {
        this.f44714S0.b(this, f44707t1[0], Boolean.valueOf(z3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L0(AuracastFragment this$0, HmDevice hmDevice) {
        F.p(this$0, "this$0");
        this$0.f44731j1.r(hmDevice);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M0(AuracastFragment this$0, HmDevice hmDevice) {
        F.p(this$0, "this$0");
        this$0.f44729h1.r(hmDevice);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N0(AuracastFragment this$0, HmDevice hmDevice) {
        F.p(this$0, "this$0");
        this$0.f44723b1.r(hmDevice);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O0(AuracastFragment this$0, HmDevice hmDevice) {
        F.p(this$0, "this$0");
        this$0.f44727f1.r(hmDevice);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P0(AuracastFragment this$0, HmDevice hmDevice) {
        F.p(this$0, "this$0");
        this$0.f44725d1.r(hmDevice);
    }

    private final EnumPageStyle Q0(HmDevice hmDevice, boolean z3, boolean z4) {
        if (z3 && z4) {
            List<HmDevice> f4 = z0().K0().f();
            if (f4 != null && !f4.isEmpty()) {
                com.harman.log.f.a(f44708u1, "updatePageStyle() >>> PARTY_TOGETHER");
                return EnumPageStyle.PARTY_TOGETHER;
            }
            com.harman.log.f.a(f44708u1, "updatePageStyle() >>> NO_PRODUCT_CONNECTED");
            return EnumPageStyle.NO_PRODUCT_CONNECTED;
        }
        com.harman.log.f.a(f44708u1, "updatePageStyle() >>> GRANT_PERMISSION");
        return EnumPageStyle.GRANT_PERMISSION;
    }

    static /* synthetic */ EnumPageStyle R0(AuracastFragment auracastFragment, HmDevice hmDevice, boolean z3, boolean z4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            hmDevice = auracastFragment.y0().f0().f();
        }
        if ((i4 & 2) != 0) {
            z3 = com.harman.sdk.b.f47608a.p();
        }
        if ((i4 & 4) != 0) {
            com.harman.sdk.b bVar = com.harman.sdk.b.f47608a;
            if (bVar.q() && bVar.s()) {
                z4 = true;
            } else {
                z4 = false;
            }
        }
        return auracastFragment.Q0(hmDevice, z3, z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t0(AuracastFragment this$0, HmDevice hmDevice) {
        F.p(this$0, "this$0");
        this$0.f44721Z0.r(hmDevice);
    }

    private final boolean u0(List<? extends HmDevice> list, EnumPanelStyle enumPanelStyle) {
        int i4;
        if (list == null || list.isEmpty()) {
            return false;
        }
        if (enumPanelStyle == null) {
            i4 = -1;
        } else {
            i4 = b.f44746b[enumPanelStyle.ordinal()];
        }
        if (i4 != 1 && i4 != 2 && i4 != 3) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ boolean v0(AuracastFragment auracastFragment, List list, EnumPanelStyle enumPanelStyle, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            list = (List) auracastFragment.y0().k0().f();
        }
        if ((i4 & 2) != 0) {
            enumPanelStyle = auracastFragment.f44733l1.f();
        }
        return auracastFragment.u0(list, enumPanelStyle);
    }

    private final EnumShowTip w0(HmDevice hmDevice, EnumPanelStyle enumPanelStyle, HmDevice hmDevice2) {
        if (hmDevice != null) {
            return EnumShowTip.NO_SHOW;
        }
        if (enumPanelStyle != EnumPanelStyle.NONE) {
            return EnumShowTip.NO_SHOW;
        }
        if (hmDevice2 == null) {
            return EnumShowTip.NO_SHOW;
        }
        return EnumShowTip.SHOW_PLAY_MUSIC;
    }

    static /* synthetic */ EnumShowTip x0(AuracastFragment auracastFragment, HmDevice hmDevice, EnumPanelStyle enumPanelStyle, HmDevice hmDevice2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            hmDevice = auracastFragment.f44721Z0.f();
        }
        if ((i4 & 2) != 0) {
            enumPanelStyle = auracastFragment.f44733l1.f();
        }
        if ((i4 & 4) != 0) {
            hmDevice2 = auracastFragment.f44725d1.f();
        }
        return auracastFragment.w0(hmDevice, enumPanelStyle, hmDevice2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AuracastViewModel y0() {
        return (AuracastViewModel) this.f44709N0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.harman.jbl.partybox.ui.main.o z0() {
        return (com.harman.jbl.partybox.ui.main.o) this.f44710O0.getValue();
    }

    @l3.d
    public final LiveData<com.harman.jbl.partybox.ui.party.auracast.w> getBeanSelectDeviceTip() {
        return this.f44738q1;
    }

    @l3.d
    public final P<HmDevice> getCenterDevice() {
        return this.f44721Z0;
    }

    @l3.d
    public final N<Boolean> getMoreDeviceIcVisible() {
        return this.f44737p1;
    }

    @l3.d
    public final P<EnumPageStyle> getPageStyle() {
        return this.f44718W0;
    }

    @l3.d
    public final P<EnumPanelStyle> getPanelStyle() {
        return this.f44733l1;
    }

    @l3.d
    public final P<EnumPartyStyle> getPartyLayoutStyle() {
        return this.f44735n1;
    }

    @l3.d
    public final N<Boolean> getShowNearByExpandMore() {
        return this.f44739r1;
    }

    @l3.d
    public final N<EnumShowTip> getShowPlayMusicTips() {
        return this.f44740s1;
    }

    @l3.d
    public final P<HmDevice> getSideDeviceFive() {
        return this.f44731j1;
    }

    @l3.d
    public final P<HmDevice> getSideDeviceFour() {
        return this.f44729h1;
    }

    @l3.d
    public final P<HmDevice> getSideDeviceOne() {
        return this.f44723b1;
    }

    @l3.d
    public final P<HmDevice> getSideDeviceThree() {
        return this.f44727f1;
    }

    @l3.d
    public final P<HmDevice> getSideDeviceTwo() {
        return this.f44725d1;
    }

    @l3.d
    public final LiveData<String> getTitleBarText() {
        return this.f44719X0;
    }

    @Override // com.harman.sdk.c
    public void onA2DPConnected(@l3.e String str, boolean z3) {
        y0().onA2DPConnected(str, z3);
    }

    @Override // com.harman.sdk.c
    @InterfaceC0561d
    public void onBtEnabled(boolean z3) {
        com.harman.log.f.a(f44708u1, "onBtEnabled() >>> isEnable[" + z3 + "]");
        this.f44718W0.o(R0(this, null, z3, false, 5, null));
    }

    public final void onBtnAddClick() {
        Intent intent = new Intent(getContext(), (Class<?>) InfoActivity.class);
        intent.putExtra("page", "ADD_PRODUCT");
        startActivity(intent);
    }

    public final void onBtnAddSpeakNarrowClick() {
        I0(L1.a.f1553Z0, null);
        this.f44733l1.r(EnumPanelStyle.SHARING_TIPS);
        y0().j0().u();
    }

    public final void onBtnGrantClick() {
        k.b b4 = com.harman.jbl.partybox.ui.party.auracast.k.b();
        b4.b(2);
        F.o(b4, "apply(...)");
        com.harman.jbl.partybox.utils.q.f(this, b4);
    }

    public final void onBtnNearbyDeviceClick() {
        I0(L1.a.f1549Y0, null);
        this.f44733l1.r(EnumPanelStyle.NONE);
        y0().j0().r(LiveEvent.Event.ON_CLICK);
    }

    public final void onBtnQuitPartyClick(@l3.e HmDevice hmDevice) {
        y0().D0(hmDevice);
        I0(L1.a.f1529T0, hmDevice);
    }

    public final void onCloseSelectDeviceTipClick() {
        this.f44738q1.r(null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@l3.e Bundle bundle) {
        super.onCreate(bundle);
        com.harman.log.f.d(f44708u1, "onCreate() >>> ");
        getLifecycle().a(y0());
        com.harman.sdk.b.f47608a.u(this);
        this.f44718W0.r(R0(this, null, false, false, 7, null));
        y0().n0().k(this, new s(new d()));
        y0().p0().k(this, new s(new e()));
        y0().o0().k(this, new s(new f()));
        N<Boolean> n4 = this.f44737p1;
        com.harman.jbl.partybox.ui.party.b bVar = com.harman.jbl.partybox.ui.party.b.f44881a;
        bVar.l(n4, y0().k0(), new s(new g(n4, this)));
        bVar.l(n4, this.f44733l1, new s(new h(n4, this)));
        this.f44738q1.k(this, new s(new i()));
        y0().f0().k(this, new s(new j()));
        N<Boolean> n5 = this.f44739r1;
        bVar.l(n5, y0().e0(), new s(new k(n5, this)));
        bVar.l(n5, y0().f0(), new s(new l(n5, this)));
        N<EnumShowTip> n6 = this.f44740s1;
        bVar.l(n6, this.f44721Z0, new s(new m(n6)));
        bVar.l(n6, this.f44733l1, new s(new n(n6)));
        bVar.l(n6, this.f44725d1, new s(new o(n6)));
        N<Boolean> i02 = y0().i0();
        bVar.l(i02, z0().K0(), new s(new p(i02)));
        bVar.l(i02, z0().V0(), new s(new q(i02)));
        this.f44740s1.k(this, new s(new c()));
    }

    @Override // androidx.fragment.app.Fragment
    @l3.d
    public View onCreateView(@l3.d LayoutInflater inflater, @l3.e ViewGroup viewGroup, @l3.e Bundle bundle) {
        boolean z3;
        F.p(inflater, "inflater");
        com.harman.log.f.d(f44708u1, "onCreateView() >>> ");
        com.harman.jbl.partybox.ui.party.auracast.ui.e eVar = new com.harman.jbl.partybox.ui.party.auracast.ui.e(this, y0());
        this.f44712Q0 = eVar;
        com.harman.jbl.partybox.ui.party.auracast.ui.c cVar = new com.harman.jbl.partybox.ui.party.auracast.ui.c(y0());
        this.f44713R0 = cVar;
        int i4 = 0;
        O v12 = O.v1(inflater, viewGroup, false);
        F.o(v12, "inflate(...)");
        v12.M0(this);
        v12.z1(this);
        v12.y1(y0());
        v12.B1(eVar);
        v12.A1(cVar);
        K1 k12 = v12.f38915l0;
        k12.f38826t0.f39124m0.n(new com.harman.jbl.partybox.ui.party.auracast.ui.f(eVar));
        k12.f38825s0.f38862l0.n(new com.harman.jbl.partybox.ui.party.auracast.ui.d(cVar));
        k12.f38824r0.setAnimation(j.l.f41595a);
        k12.f38824r0.B();
        final K2.g gVar = v12.f38918o0;
        LinearLayout layoutNote = gVar.f1425F;
        F.o(layoutNote, "layoutNote");
        if (this.f44740s1.f() == EnumShowTip.SHOW_PLAY_MUSIC) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            i4 = 8;
        }
        layoutNote.setVisibility(i4);
        gVar.f1426G.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.party.auracast.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AuracastFragment.E0(K2.g.this, view);
            }
        });
        this.f44711P0 = v12;
        View d4 = v12.d();
        F.o(d4, "getRoot(...)");
        return d4;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        com.harman.log.f.d(f44708u1, "onDestroy() >>> ");
        com.harman.sdk.b.f47608a.w(this);
        Dialog dialog = D0().getDialog();
        if (dialog != null && true == dialog.isShowing()) {
            D0().dismiss();
        }
        Dialog dialog2 = A0().getDialog();
        if (dialog2 != null && true == dialog2.isShowing()) {
            A0().dismiss();
        }
        Dialog dialog3 = B0().getDialog();
        if (dialog3 != null && true == dialog3.isShowing()) {
            B0().dismiss();
        }
    }

    public final void onDeviceCardBtnNarrowClick() {
        I0(L1.a.f1537V0, y0().s0().f());
        y0().E0();
    }

    public final void onInfoClicked() {
        String m4 = com.harman.sdk.utils.d.m();
        if (m4 != null) {
            k.a a4 = com.harman.jbl.partybox.ui.party.auracast.k.a(m4);
            F.o(a4, "actionToWebviewQAFragment(...)");
            com.harman.jbl.partybox.utils.q.f(this, a4);
        }
    }

    @Override // com.harman.sdk.c
    @InterfaceC0561d
    public void onLocationEnabled(boolean z3) {
        com.harman.log.f.a(f44708u1, "onLocationEnabled() >>> isEnable[" + z3 + "]");
        this.f44718W0.o(R0(this, null, false, z3, 3, null));
    }

    public final void onNearbyDeviceClick(@l3.e HmDevice hmDevice) {
        if (hmDevice == null) {
            return;
        }
        switch (b.f44745a[y0().M0(hmDevice).ordinal()]) {
            case 1:
                this.f44738q1.r(new com.harman.jbl.partybox.ui.party.auracast.w(EnumSelectDeviceTip.NOT_COMPATIBLE_PARTY, hmDevice));
                return;
            case 2:
                this.f44738q1.r(new com.harman.jbl.partybox.ui.party.auracast.w(EnumSelectDeviceTip.SPEAKER_IN_OTHER_PARTY, hmDevice));
                return;
            case 3:
                this.f44738q1.r(new com.harman.jbl.partybox.ui.party.auracast.w(EnumSelectDeviceTip.START_NEW_PARTY, hmDevice));
                return;
            case 4:
                this.f44738q1.r(new com.harman.jbl.partybox.ui.party.auracast.w(EnumSelectDeviceTip.SPEAKER_NOT_BT_CONNECTED, hmDevice));
                return;
            case 5:
                this.f44738q1.r(new com.harman.jbl.partybox.ui.party.auracast.w(EnumSelectDeviceTip.PARTY_ONLY_SUPPORT_TWO_SPEAKERS, hmDevice));
                return;
            case 6:
                this.f44738q1.r(new com.harman.jbl.partybox.ui.party.auracast.w(EnumSelectDeviceTip.DEVICE_IN_DAISY_CHAIN, hmDevice));
                return;
            default:
                return;
        }
    }

    @Override // com.harman.sdk.c
    public void onNetworkEnabled(boolean z3) {
    }

    public final void onPartyLayoutDeviceClick(@l3.e HmDevice hmDevice) {
        y0().N0(hmDevice);
        I0(L1.a.f1533U0, hmDevice);
    }

    public final void onPartyMoreDevicesClick() {
        y0().O0();
        I0(L1.a.f1541W0, null);
    }

    public final void onPartyMoreDevicesCloseClick() {
        y0().P0();
        I0(L1.a.f1545X0, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        com.harman.log.f.d(f44708u1, "onPause() >>> ");
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        com.harman.log.f.d(f44708u1, "onResume() >>> ");
        if (!C0()) {
            K0(true);
            J0(D0());
        }
        this.f44718W0.r(R0(this, null, false, false, 7, null));
        com.harman.jbl.partybox.ui.party.auracast.ui.e eVar = this.f44712Q0;
        if (eVar != null) {
            eVar.r();
        }
    }

    public final void onStartNewPartyConfirmClick(@l3.d HmDevice device) {
        F.p(device, "device");
        this.f44738q1.r(null);
        y0().R0(device);
    }
}
